/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.temaierarhieclase;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author di214
 */
class Programator implements Angajat{
    public String nume ;
    protected Date dataNasterii;
    protected Date dataPrimaAngajare;
    protected List<String> skilluri;
    public Set<Programator> angajat = new HashSet();

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nume);
        hash = 67 * hash + Objects.hashCode(this.dataNasterii);
        hash = 67 * hash + Objects.hashCode(this.dataPrimaAngajare);
        hash = 67 * hash + Objects.hashCode(this.skilluri);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Programator other = (Programator) obj;
        if (!Objects.equals(this.nume, other.nume)) {
            return false;
        }
        if (!Objects.equals(this.dataNasterii, other.dataNasterii)) {
            return false;
        }
        if (!Objects.equals(this.dataPrimaAngajare, other.dataPrimaAngajare)) {
            return false;
        }
        return Objects.equals(this.skilluri, other.skilluri);
    }
    
    //sety angajati
    public void setAngajati(Programator angajat){
        this.angajat.add(angajat);
    }
    
    // getAngajati method

    public Set<Programator> getAngajati(){
        return angajat;
    }
    
    public Date getDataNasterii() {
        return dataNasterii;
    }

    public void setDataNasterii(Date dataNasterii) {
        this.dataNasterii = dataNasterii;
    }

    public Date getDataPrimaAngajare() {
        return dataPrimaAngajare;
    }

    public void setDataPrimaAngajare(Date dataPrimaAngajare) {
        this.dataPrimaAngajare = dataPrimaAngajare;
    }

    public List<String> getSkilluri() {
        return skilluri;
    }

    public void setSkilluri(List<String> skilluri) {
        this.skilluri = skilluri;
    }
    
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "Programator{" + "nume=" + nume + '}';
        
    }
    
    Programator(){
        
    }
    
    Programator( String nume){
    this.nume = nume;
    }

    @Override
    public void lucreaza() {
        System.out.println("Lucreaza la Selir");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Programatorul " + this.nume + "primeste salariu pe ziua de 15");

    }

    @Override
    public void esteInPauza() {
        System.out.println("Programatorul" + this.nume + "mai are 5 minute de pauza ");
    }
    
    
   // TRY AND CATCH METHOD 
    public static void citireFisier(String numeFisier) throws IOException{
        try {
            BufferedReader reader = new BufferedReader(new FileReader(numeFisier));
            String linie = reader.readLine();
                System.out.println(linie);
            reader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Eroare");
        }
      
    }
}
