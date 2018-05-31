
/**
 * This is where the payer will have to predict the weather in order to properly prepare for a defense
 *
 * Wil Bauer
 * 5-31-18
 */
public class Salamander implements Playable
{
    @Override
    public void activity(){
        // Called by view constructor, The activity determines the sequence
        // of events for the region.  It would generally go straight to an 
        // entry and then a challenge or choice.  This could lead 
        // to other challenges, choices, or an exit.
    }                                   
    @Override
    public void entry(){
        // 1st method called by activity. Designed to describe the region.
        // Describes the top of a barn and states the four directions the user can look.
    }                                   
    
    @Override                                                            
    public boolean challenge(int choice){
        // Says why the user must predict the weather and will then make them do so
        // Describes the weather conditions of the selected direction
        return true;
    }                                   
    @Override
    public int choice(boolean metChallenge){
         // Gives the user a list of possible weather forecasts of which the user will choose
         return 0;
    }                                    
    
    @Override
    public void exit(int choice){
         // Uses polymorphism to convert the palyable object to the next scene.  
         // Passes user name and gender.
    }                                  
    @Override
    public String defaultResponse(){
        // Displays a default response if the user inputs an incorrect command
        return "null";
    }
}
