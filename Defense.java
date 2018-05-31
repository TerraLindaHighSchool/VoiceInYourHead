
/**
 * Write a description of class Defence here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Defense implements Playable
{
    
    @Override
    public void activity(){
        //set bombs 
        //make wall stronger
        //cross bows
        //rocks
        //gate 
        //moat with water
        //put oil in
        //spikes on wall
        //torches
        //catapult
        //acid 
        
    }
    
    //tells you what your suroundings are
    @Override
    public void entry(){
        System.out.println( "The wall right now is quite a light"
    + "wall because it's only purpose was to keep out vermin." 
    + "/n" + "You see gun powder and shells, crossbows, stone, rocks"
    + "/n" + "gate, shovels, barrels of oil and acid, spikes, catupults"
    + "/n" + " matches nad sharp metal spikes");
    }
    
    //the challenge you have to overcome
    @Override
    public boolean challenge(int choice){
         String msg = "How would you like" +
         "to prepare" + "/n" + "for the barrbarian raid?"
         + "(only three activities)";
         System.out.println(msg);
         return true;
    }
    
    //
    @Override
    public int choice(boolean metChallenge){
    
    }
     
    @Override
    public void exit(int choice){
    }
    
    // default message if more than 3 activities
    @Override
    public String defaultResponse(){
        
           int choices = (int) (2 * Math.random());
           String reply = " ";
            switch (choices){
                case 0: reply = "That's alot to do in 3 days";
                  break;
                case 1: reply = "People are lazy and only will do" +
                "one activity a day even when thier lives are at risk.";
                  break;
           }
           return reply;
    }
}
