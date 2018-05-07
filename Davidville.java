
/**
 * This is where the character first lands when they enter the game.
 * Gustinville connects to ... 
 * Gustinville connects from ...
 *
 * @author Bruce Gustin
 * @version 5/7/2018 11:03AM
 */

import java.util.Scanner;

public class Davidville implements Playable
{
    private Scanner userInput;
    private String name, gender;
    
    public Davidville(String name, String gender)
    {
        userInput = new Scanner(System.in);
        activity();
    }
    
    public void activity(){
        entry();
        int choice = choice();
        challenge(choice);
        exit(1);
        
    }
    
    public void entry(){
        System.out.println("Welcome to Davidville, blah, blah, blah");
    }
    public int choice(){
        System.out.println("You did you read the letter yet?");
        String response = userInput.nextLine();
        int choice = 0;
        if(response.toUpperCase().contains("PICK")) choice = 1;
        return choice;
    }
    public boolean challenge(int choice){
        String challenge = defaultResponse();
        switch(choice){
            case 1: challenge = "Now you need to do this";
        }
        System.out.println(challenge);
        return false;
    }
    public void exit(int exitTo){
        System.out.println("Game over.");
    }
    
    public String defaultResponse(){
        return "";
    
    }

}
