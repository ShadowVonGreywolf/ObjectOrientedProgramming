/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ro.ugal.temaierarhieclase;
import java.io.IOException;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author di214
 */

public class TemaIerarhieClase {

    public static void main(String[] args) throws IOException {
                
        //Programator angajat = new Programator();

        /*ProgramatorBackend p1 = new ProgramatorBackend("Java","Intermediar","Smith");
        ProgramatorBackend p2 = new ProgramatorBackend("Java","Intermediar","Smith");
        

        Programator listaAngajati = new Programator();
        listaAngajati.setAngajati(p1);
        listaAngajati.setAngajati(p2);        
        listaAngajati.setAngajati(new ProgramatorBackend("Java","Junior","John"));     
        listaAngajati.setAngajati(new ProgramatorBackend("Python","Avansat","James Bond"));
        System.out.println(listaAngajati);
        
        for(Programator persoana : listaAngajati.getAngajati())
           System.out.println("Nume : " + persoana.nume + " ; HashCode : " + persoana.hashCode());
            
         Marinar marinar = new Marinar("Gigi", 34);
         Dispensar control = new Dispensar(marinar);
         control.efecteazaControlPeriodic(marinar);*/
        
        
         
         

        
        /*System.out.println(p1.equals(p2));
        //ArrayList
        ArrayList<Angajat> listaMarinarFluvial = new ArrayList<>();
        listaMarinarFluvial.add(new MarinarFluvial("HMS Conqueror" , "Constanta","Albert"));
        listaMarinarFluvial.add(new MarinarFluvial("Bismarck" , "Hamburg","Hans"));
        listaMarinarFluvial.add(new MarinarFluvial("USS Dreadnaught" , "New York","Sam"));
        System.out.println("Lista marinari fluviali de tip ArrayList" + listaMarinarFluvial);
        System.out.println("Marinarul pe pozitia 1 = " + listaMarinarFluvial.get(1));
        
        System.out.println(listaMarinarFluvial);
        
        
        
          for(int i=0;i<listaMarinarFluvial.size();i++){
                Angajat angajat = listaMarinarFluvial.get(i);
                System.out.println(listaMarinarFluvial.get(i));
                angajat.lucreaza();
                
        }
        */
        
        /*Programator p1 = new Programator("Florin");
        Programator p2 = new Programator("Andrei");
        Programator p3 = new Programator("Catalina");
        Programator p4 = new Programator("Robert");
        //ARRAYLIST
        ArrayList<Programator> arrayProgramatori = new ArrayList<>();
        arrayProgramatori.add(p1);
        arrayProgramatori.add(p2);
        arrayProgramatori.add(p3);
        arrayProgramatori.add(p4);
        System.out.println("Afisare continut : ");
        for(Programator item : arrayProgramatori)
            System.out.println(item);
        
        System.out.println("Cautare programator ARRAYLIST  = ");
        if(arrayProgramatori.contains(p2)==true){
            int index = arrayProgramatori.indexOf(p2);
            System.out.println(arrayProgramatori.get(index));
        }
        else 
            System.out.println("Nu contine elementul introdus");
        
        
       
        //HASHSET
        HashSet<Programator> setProgramatori = new HashSet<>();
        setProgramatori.add(p1);
        setProgramatori.add(p2);
        setProgramatori.add(p3);
        setProgramatori.add(p4);
        System.out.println("Afisare continut : ");
        for(Programator item :setProgramatori)
            System.out.println(item);
        
        System.out.println("Cautare programator HASHSET  = ");
        if(setProgramatori.contains(p4))
        {
            for(Programator item : setProgramatori)
                if(item.equals(p4))
                    System.out.println(item);
        }
        
        
        //MAPS
        Map<String,Programator> mapProgramatori = new HashMap<>();
        mapProgramatori.put("Dontu Glontu", p1);
        mapProgramatori.put("Ghita Rosu", p2);
        mapProgramatori.put("Genovela", p3);
        mapProgramatori.put("Cory", p4);
        System.out.println("Afisare continut : ");
        for (Map.Entry<String,Programator> entry : mapProgramatori.entrySet())
            System.out.println(entry.getKey() + "/" + entry.getValue());
        System.out.println("Cautare programator MAPS  = ");
        System.out.println(mapProgramatori.get("Dontu Glontu"));*/
        
        TryCatch tryCatch = new TryCatch();
        //- de scris o metoda care acceseaza un fisier si afiseaza prima linie din fisier
        try{
        tryCatch.citirePrimaLinie("TestFile.txt");
        }catch(IOException exceptie){
           System.out.println("Eroare la citirea fisierului: " + exceptie.getMessage());
        }
        //- de scris metoda1 care arunca o exceptie si o trateaza
        tryCatch.tratareVarstaExceptie(-3);
        //- de scris metoda2 care arunca o exceptie si o arunca mai departe
        tryCatch.aruncareExceptie();
        //- de scris metoda3 care apeleaza metoda2
        tryCatch.apelareAruncareExceptie();
        //- de propagat exceptia pana in main si aruncata mai departe din main
        try{
            tryCatch.aruncareExceptie();
        }catch (IOException exception){
            System.out.println("Exceptie in aruncareExceptie in main:" + exception.getMessage());
        }
        //- de prins o exceptie si aruncata o noua exceptie avand ca si cauza exceptia initiala
        tryCatch.aruncareaUneiNoiExceptii();
        //- de verificat executia blocului finally in ambele situatii (exceptie aruncata sau fara exceptie)
        tryCatch.executiaBloculuiFinally(false);
        tryCatch.executiaBloculuiFinally(true);
        //- de scris un catch care prinde mai multe tipuri de exceptii
    }
}
