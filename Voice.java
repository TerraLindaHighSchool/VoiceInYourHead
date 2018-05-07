
/**
 * Abstract class Voice - write a description of the class here
 *
 * @author Bruce Gustin
 * @version 5/6/2018
 */

import java.util.Scanner;

public abstract class Voice
{
    private String name;
    private char gender;
    
    public Voice(String name){
        this.name = name;
    }
    /***************************************
     * Getters and Setters
     ***************************************/
     
     public void setName(String n) {
         name = n;
     }
     
     public String getName(){
         return name;
     }
     
     public void setGender(char g) {
         gender = g;
     }
     
     public char getGender(){
         return gender;
     }


}
