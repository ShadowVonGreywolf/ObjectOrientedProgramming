/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.temaierarhieclase;

/**
 *
 * @author denia
 */
public class MarinarFluvial extends Marinar {
    String numeVapor;
    String port;

    
    
    public MarinarFluvial(String numeVapor, String port, String nume ) {
        this.numeVapor = numeVapor;
        this.port = port;
    }
    

    public MarinarFluvial() {
    }

    public String getNumeVapor() {
        return numeVapor;
    }

    public void setNumeVapor(String numeVapor) {
        this.numeVapor = numeVapor;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
// this is an overloaded method
    public void description(String nume , int varsta , String numeVapor , String port){
        System.out.println("Marinarul " + this.nume + " are varsta de "+ this.varsta + " si lucreaza pe vaporul " + this.numeVapor + " si a plecat din portul "+ this.port);
    }
// this is an overloaded method
    public void greeting (String nume , String numeVapor){
        System.out.println("Hello , my name is " + this.nume + ". I am the captain of the " + this.numeVapor + " ship");
    }
    
    @Override
    public String toString() {
        return "MarinarFluvial{" + "numeVapor=" + numeVapor + ", port=" + port + ", nume= " + getNume() + '}';
    }
    
    @Override 
    public void lucreaza(){
    System.out.println("Lucreaza la Napa");
    }
    @Override 
    public void setNume(String nume) {
        this.nume = nume;
    }

}
