/**
 * This is scene one, where the character enters the game.
 * Opening scene connects this or that scene ... 
 * Opening scene came from MainActivity ...
 *
 * @author Bruce Gustin
 * @version 5/27/2018 4:03AM
 */

import java.util.Scanner;

public class OpeningScene implements Playable
{
    private Scanner userInput;
    String name, gender;
    
    public OpeningScene(String name)
    {
        this.name = name;
        this.gender = gender;
        activity();
    }
    
    public void activity(){
        entry();
        boolean metChallenge = challenge(0);
        int choice = choice(metChallenge);
        exit(choice);
        
    }
    
    public void entry(){
        System.out.println("Blah, Blah, Blah");   //Opening dialog with the voice in your head"
        userInput = new Scanner(System.in);  
    }

    public boolean challenge(int choice){
        // in this example, challenge came before choice so the input parameter is not used.
        String challenge = defaultResponse();
        boolean metChallenge = false;
        // works on challenge here
        return metChallenge;
    }
    
    public int choice(boolean metChallenge){
        int choice = 0;
        // Based on if challenge was met, user given choices which could
        // lead to another challenge attempt or an exit.
        return choice;
    }
    
    public void exit(int choice){
        // choice could determine which scene is next, winning, or losing.
        switch(choice){
            case 1: System.out.println("You are moving to scene 2.");
                //Playable player = new Scene2(name, gender);
                break;
            case 2: System.out.println("Game over.");
                break;
            default: System.out.println("Sorry, you lost the game.");
        }
    }
    
    public String defaultResponse(){
        return "What kind of choice is that?";
    }

}

