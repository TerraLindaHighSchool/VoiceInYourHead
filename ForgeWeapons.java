
/**
 * Players pick 3 out of several weapons to equip their army with.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ForgeWeapons implements Playable
{
    String hold = "PLACE HOLDER";
    boolean fake = true; 
    
    /*****************************
     * Overriden Methods
     *****************************/
     
     //describes area and materials, then weapons, lets player pick what weapons to use
     @Override
     public void activity()
     {
     }
     
     //describes the Forge and materials
     @Override
     public void entry()
     {
     }
     
     //determines if the weapon is an affective weapon or not
     @Override
     public boolean challenge(int choice)
     {
         return fake;
     }
     
     //allows player to pick a weapon
     @Override
     public int choice(boolean metchallenge)
     {
         return 0;
     }
     
     //allows player to move to another scene
     @Override
     public void exit(int choice)
     {
     }
    
     //tells player their weapon of choice is not available if they enter a weapon that is not an option
     @Override
     public String defaultResponse()
     {
         return hold;
     }
     
     
   
}
