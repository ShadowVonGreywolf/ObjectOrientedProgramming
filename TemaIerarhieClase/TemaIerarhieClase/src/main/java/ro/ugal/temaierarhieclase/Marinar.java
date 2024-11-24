/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.temaierarhieclase;

/**
 *
 * @author denia
 */
public class Marinar implements Angajat{
    String nume;
    int varsta;
    
    public Marinar() {
        
    }
    
    public Marinar(String nume, int  varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }
    
    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
    
    public void description(String nume , int varsta ){
        System.out.println("Marinarul " + this.nume + " are varsta de "+ this.varsta);
    }
   
    public void greeting(String nume ){
            System.out.println("Hello , my name is " + this.nume + ". Nice to meet you!");
    } 

    @Override
    public String toString() {
        return "Marinar{" + "nume=" + nume + ", varsta=" + varsta + '}';
    }

    @Override
    public void lucreaza() {
       System.out.println("Lucreaza");
    }

    @Override
    public void primesteSalariu() {
        System.out.println("Marinarul " + this.nume + "primeste salariu pe ziua de 6");
    }

    @Override
    public void esteInPauza() {
        System.out.println("Marinarul" + this.nume + "mai are 15 minute de pauza ");
    }
    
    
    
}
