
/**
 * Abstract class Voice - write a description of the class here
 *
 * @author Bruce Gustin
 * @version 5/6/2018
 */



public interface Playable
{
    void activity(); // Linear path through the class 
    void entry(); // This is where you describe the region
    int choice(); // This is where you present the user with a choice
    void challenge(int choice);  // The choice can lead to a challenge or not
    void exit(); // This is where you say the user is leaving the region
    String defaultResponse();
    

}
