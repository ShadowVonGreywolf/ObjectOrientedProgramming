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
        throw new CustomException("Exceptie");//- de creat o exceptie proprie, de aruncat si tratat
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
    public void maiMulteExceptii(){

         try{   
            // IndexOutOfBoundsException
            // String myString = "Hello";
            // System.out.println(myString.charAt(10)); 
            
            //  ClassCastException
            Object obj = "Hello";
            Integer num = (Integer) obj;

        } catch (IndexOutOfBoundsException | ClassCastException exception) {
            System.out.println("Exceptie in maiMulteExceptii ");
        }
    }
    //de scris un bloc cu mai multe catchuri care prind exceptii de tip diferit si le trateaza in mod diferit
    public void maiMulteCatchuri(){
        try{   
            // IndexOutOfBoundsException
            // String myString = "Hello";
            // System.out.println(myString.charAt(10)); 
            
            //  ClassCastException
            Object obj = "Hello";
            Integer num = (Integer) obj;

        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Exceptie de tipul IndexOutOfBoundsException in maiMulteCatchuri");
        }catch(ClassCastException exception){
            System.out.println("Exceptie de tipul ClassCastException in maiMulteCatchuri");
        }
    }
    //- de create o exceptie unchecked, de aruncat si tratat
    
    public void exceptieUnchecked(){
        try {
            int rezultat = 10 / 0;  // Dividing by zero causes ArithmeticException
            System.out.println("Rezultat : " + rezultat);
        } catch (RuntimeException eexception) {
            System.out.println("Exceptie unchecked in exceptieUnchecked");
        }
    }
}
