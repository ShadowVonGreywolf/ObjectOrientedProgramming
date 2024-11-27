/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.temaierarhieclase;

import java.io.IOException;

/**
 *
 * @author denia
 */
public class CustomException extends IOException{
    
    
    public CustomException(String message){
         System.out.println("Exception : " + message);
    }
}
