/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.temaierarhieclase;

import java.util.Objects;

/**
 *
 * @author di214
 */
public class Dispensar {
    Angajat marinar;
    
    Dispensar(){
    
    }
    Dispensar(Angajat marinar){
        this.marinar = marinar;
    }
    
    public void efecteazaControlPeriodic(Angajat angajat){
           System.out.println(  angajat +" efectueaza un control ");
        
    }
    
    public void efecteazaControlPeriodic(Programator programator){
        System.out.println("Programatorul efectueaza un control ");
    }
    public void efecteazaControlPeriodic(ProgramatorBackend programatorBackend){
        System.out.println("ProgramatorulBackend efectueaza un control ");
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.marinar);
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
        final Dispensar other = (Dispensar) obj;
        return Objects.equals(this.marinar, other.marinar);
    }
}
