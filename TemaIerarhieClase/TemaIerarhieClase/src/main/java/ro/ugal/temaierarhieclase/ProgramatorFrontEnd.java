/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.temaierarhieclase;

/**
 *
 * @author denia
 */
public class ProgramatorFrontEnd extends Programator{
    String language ;
    String skill; 
    
    @Override
    public String toString() {
        return "ProgramatorFrontEnd{" + "language=" + language + ", skill=" + skill + '}';
    }
    
    @Override
    public void lucreaza(){
        System.out.println("Angajat de 3 ani la NAPA");
    }
    public ProgramatorFrontEnd(){
    
    }
    
    public ProgramatorFrontEnd(String language , String skill){
              this.language = language ;
              this.skill=skill;
    }
    
    public void setSkill(String skill){
    this.skill = skill;
    }
    public String getSkill(){
     return skill;
    }
    public String getLanguage(){
     return language;
    }
}
