/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.temaierarhieclase;

/**
 *
 * @author di214
 */
public class ProgramatorBackend extends Programator {
    String skill;
    String language;
    
    @Override
    public String toString() {
        return "ProgramatorBackend{" + "skill=" + skill + ", language=" + language + " , nume= "+ getNume() + '}';
        
    }
    @Override
    public void lucreaza(){
    System.out.println("Angajat ca Backend developer rangul de " + this.skill );
    }
    
    @Override
     public String getNume() {
        return nume;
    }
    ProgramatorBackend(){
    
    }

    
    ProgramatorBackend(String skill, String language , String nume ){
        this.skill = skill;
        this.language = language;
        setNume(nume);
    }
    
    
    public void setskill(String skill ){
        this.skill = skill;
    }
    
    public String getSkill(){
        return skill;
    }
    
    public String getLanguage(){
        return language;
    }
    
    public void displayAttributes(){
         System.out.println(language + "Talent : " + skill + " ; Limbaj : " + " ; " );
    }
    
    
}
