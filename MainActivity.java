
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
        System.out.println("Please choose a starting scene.");
        System.out.println("1. Tangerine\n" + 
                           "2. Forge Weapon\n" +
                           "3. To be determined\n" +
                           "4. To be determined\n");           
        Playable player;
            switch(userInput.nextInt()) {
            case 1: player = new OpeningScene(name);
                    break;
            case 2: player = new OpeningScene(name);
                    break;
            case 3: player = new OpeningScene(name);
                    break;
            case 4: player = new OpeningScene(name);
                    break;
            default: System.out.println("No such choice.");
        }
    }
}
