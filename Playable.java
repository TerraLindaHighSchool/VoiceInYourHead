
/**
 * A blueprint of all scenes in Voice in Your Head
 *
 * @author Bruce Gustin
 * @version 5/27/2018
 */



public interface Playable
{
    void activity();                    // Called by view constructor, The activity determines the sequence
                                        // of events for the region.  It would generally go straight to an 
                                        // entry and then a challenge or choice.  This could lead 
                                        // to other challenges, choices, or an exit.
    
    void entry();                       // 1st method called by activity. Designed to describe the region.
                                                                
    boolean challenge(int choice);      // Designed to present the user with challenges, either personal 
                                        // or from the antagonist.  Challenge could also be the result of a choice.
    
    int choice(boolean metChallenge);   // Designed to present user with choices.  
    
    void exit(int choice);              // Uses polymorphism to convert the palyable object to the next scene.  
                                        //Passes user name and gender.
    
    String defaultResponse();           // Used for default responses.
}
