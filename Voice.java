
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
     
    public abstract String entry();
    public abstract String choice();
    public abstract String challenge();
    public abstract String exit();
    public abstract String toString(String ui);
    
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
    
        public String defaultRandom()
	{
		String reply = "Your questions are very thoughtful.";
		int rint = (int) (Math.random() * 6);
		
		switch(rint)
		{
		    case 0: reply = "That is a very interesting question.";
			    break;
		    case 1: reply = "I will need to think about that.";
		            break;
		    case 2: reply = "Is that really the question that you want to ask?";
		            break;
		    case 3: reply = "That is a very complicated question.";
		            break;    
		    case 4: reply = "I'm sorry, I do not understand the question.";
		            break;  
		}
		return reply;
	}
}
