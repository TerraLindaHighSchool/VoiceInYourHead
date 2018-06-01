
/**
 * Opening activity that allows the user to pick their opening scene.
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
        System.out.println("1. Introduction to Game\n" + 
                           "2. Forge Weapons\n" +
                           "3. Tangerine\n" +
                           "4. Nobility Rallying\n" + 
                           "5. Talk to the People\n" +
                           "6. Defense\n" +
                           "7. Peasent Rallying\n" + 
                           "8. Cipher Note\n" +
                           "9. Sinking Ship\n" +
                           "10. Escape the Bear\n" + 
                           "11. Puzzle Castle\n" +
                           "12. Find Help\n" +
                           "13. Know the Weather\n" +
                           "14. Riddle\n" + 
                           "15. Bar Fight\n" +
                           "16. Mystical Weapon\n" +
                           "17. Dialog\n" + 
                           "18. Solve Riddle\n");  
                           
        Playable player;
            switch(userInput.nextInt()) {
            case 1: player = new OpeningScene(name);
                    break;
            case 2: player = new ForgeWeapons();
                    break;
            case 3: player = new OpeningScene(name);
                    break;
            case 4: player = new OpeningScene(name);
                    break;
            case 6: player = new OpeningScene(name);
                    break;
            case 7: player = new OpeningScene(name);
                    break;
            case 8: player = new OpeningScene(name);
                    break;
            case 9: player = new OpeningScene(name);
                    break;
            case 10: player = new OpeningScene(name);
                    break;
            case 11: player = new OpeningScene(name);
                    break;
            case 12: player = new OpeningScene(name);
                    break;
            case 13: player = new OpeningScene(name);
                    break;
            default: System.out.println("No such choice.");
        }
    }
}
