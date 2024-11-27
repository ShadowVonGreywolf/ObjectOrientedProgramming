/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.temaierarhieclase;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author denia
 */
public class TryCatch {
    
    TryCatch(){
    
    }
    //- de scris o metoda care acceseaza un fisier si afiseaza prima linie din fisier
    public void citirePrimaLinie(String numeFisier) throws FileNotFoundException, IOException{

            BufferedReader reader = new BufferedReader(new FileReader(numeFisier));
            String linie = reader.readLine();
                System.out.println(linie);
            reader.close();

    }
    //- de scris metoda1 care arunca o exceptie si o trateaza
    public void tratareVarstaExceptie(int integer) throws CustomException{
        if(integer < 0 )
            try {
                throw new CustomException("Varsta nu poate fi negativa");
            }catch (IOException exception){
                System.out.println("Exceptie in tratareVarstaExceptie");
            throw exception;
            }
    }
    //- de scris metoda2 care arunca o exceptie si o arunca mai departe
    public void aruncareExceptie()throws CustomException{
          try {
              throw new CustomException("Aruncare de exceptie");
          }catch (IOException exception){
              System.out.println("Exceptie in aruncareExceptie ");
             //- de prins o exceptie si aruncata aceeasi exceptie mai departe
            throw exception; 
          }
    }
    //- de scris metoda3 care apeleaza metoda2
    public void apelareAruncareExceptie() throws CustomException{
            aruncareExceptie();
    }
    public void exceptie()throws CustomException{
        throw new CustomException("Exceptie");
    }
    //- de prins o exceptie si aruncata o noua exceptie avand ca si cauza exceptia initiala
    public void aruncareaUneiNoiExceptii(){
        try{
            exceptie();
        }catch(IOException exception){
            System.out.println("Exceptie in aruncareaUneiNoiExceptii");
            throw new RuntimeException(exception);
        }
    }
    //- de verificat executia blocului finally in ambele situatii (exceptie aruncata sau fara exceptie)
    public void executiaBloculuiFinally( boolean value) throws CustomException{
        try{
            if(value == true)
                System.out.println("Executie fara exceptii");
            else
                throw new CustomException("Executie cu exceptie!");
        }finally{
            System.out.println("Executia blocului finally a luat sfarsit");
        }           
    }
    //- de scris un catch care prinde mai multe tipuri de exceptii
    
}
