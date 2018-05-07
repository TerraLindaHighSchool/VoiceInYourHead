
/**
 * Write a description of class MainActivity here.
 *
 * @author Bruce Gustin
 * @version 5/6/2018
 */

import java.util.Scanner;

public class MainActivity
{
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Before we start the game,what would you like us to call you?");
        String name = userInput.nextLine();
        System.out.println("What would you like your gender to be? M/F");
        String gender = userInput.nextLine();
        Voice player = new Gustinville(name, gender);
    }
}
