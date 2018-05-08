
/**
 * Abstract class Voice - write a description of the class here
 *
 * @author Bruce Gustin
 * @version 5/6/2018
 */



public interface Playable
{
    void activity();            // Called by region constructor, this method is call each of the next 4 methods in sequence
    
    void entry();               // 1st method called by activity. Designed to describe the region.
    
    int choice();               // 2nd method called by activity.  Designed to present user with choices.  
                                // Each choice is given a numeric value which gets passed to the challenge method. 
    int challenge(int choice);  // The challenges.  Successful challenges lead to the exit choices
    
    void exit(int exitTo);      // Passes user to next region
    
    String defaultResponse();   // Used for default responses
}
