
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
    
    /***************************************
     * Getters and Setters
     ***************************************/
     
     public void setName(String name) {
         this.name = name;
     }
     
     public String getName(){
         return name;
     }
     
     public void setGender(char gender) {
         this.gender = gender;
     }
     
     public char getGender(){
         return gender;
     }


}
