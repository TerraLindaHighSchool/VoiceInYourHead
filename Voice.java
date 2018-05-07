
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
    * Abstract Methods
    ***************************************/
     
    public abstract String findWord(String ui);
    
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
     
    /***************************************
    * Concrete Methods
    ***************************************/
    
    public String eliminateInvalidCharacters(String ui)
    {
         int charUnicode;
         String uiAlphaOnly = "";
         ui = ui.toUpperCase(); 
         for(int i = 0; i < ui.length();i++)
         {
              charUnicode = (int) ui.charAt(i);
              if((charUnicode >= 65) && (charUnicode <= 90)) 
                  uiAlphaOnly += ui.charAt(i);
         }
         return uiAlphaOnly;
    } 
}
