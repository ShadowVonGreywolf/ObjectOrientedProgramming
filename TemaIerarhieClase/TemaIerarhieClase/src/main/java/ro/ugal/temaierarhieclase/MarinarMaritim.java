/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.temaierarhieclase;

/**
 *
 * @author denia
 */
public class MarinarMaritim extends Marinar{
    String numeVapor;
    int salariu;

    @Override
    public void setNume(String nume) {
        this.nume = nume;
    }
    
    @Override
    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }
    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public int getVarsta() {
        return varsta;
    }
    
    public MarinarMaritim(String numeVapor, int salariu) {
        this.numeVapor = numeVapor;
        this.salariu = salariu;
    }

    public MarinarMaritim() {
    }

    public String getNumeVapor() {
        return numeVapor;
    }

    public void setNumeVapor(String numeVapor) {
        this.numeVapor = numeVapor;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    @Override
    public String toString() {
        return "MarinarMaritim{" + "numeVapor=" + numeVapor + ", salariu=" + salariu + '}';
    }
 
    @Override 
    public void lucreaza(){
    System.out.println("Lucreaza la Napa");
    }
    
}
