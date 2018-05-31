
/**
 * Kelden Ben-Ora
 * May 31, 2018
 */
public class MysticalWeapon implements Playable
{
    /***
     * This scene will lead the player to a mystical weapon in a
     * dungeon below their own house.
     */
    
    //variables for this class
    String username = new String();
    @Override
    public void activity(){
        //entry, choice to enter dungeon, entry of first room,
        //choice of 3 doors, entry and challenge behind two of them,
        //6 doors behind the right door, clues and/or challenges 
        //behind 5 of the doors, 9 doors behind the correct door,
        //portals back to the start behind 3 of the doors,
        //clues and/or challenges behind 5 of the doors,
        //the mystical weapon behind the correct one and
        //a portal back to the house.
        //There are three corridors that introduce the doors.
        //The first has 3 doors, the second has 6, and the
        //third has 9.
    }
    
    @Override
    public void entry(){
        //The player wakes up at night by a wind blowing sound
        //and the voice in their head whispering. A crack in
        //the wall is discovered. Player goes through, enters dark,
        //gloomy gross dungeon. There's writings on the wall.
        //There's a torch and the 3 first doors.
        //There must be a switch here for the entries for each
        //door and each corridor.
    }
    
    @Override
    public boolean challenge(int choice){
        boolean b = false;
        //There are challenges behind each challenge door
        //so there is also a switch here for each.
        return b;
    }
    
    @Override
    public int choice(boolean metChallenge){
        int i = 0;
        //There will be different switches here, one for each
        //instance where choices arise.
        //Each corridor and door will have an array of choices.
        //Each puzzle or riddle will have choices.
        return i;
    }
    
    @Override
    public void exit(int choice){
        //Occurs after player uses portal to go back to
        //their house. Passes the user name and gender.
    }
    
    @Override
    public String defaultResponse(){
        String s = "That is not a valid option";
        //The default responses can be different for each
        //situation such as saying, "That's not a good idea"
        //or, "That doesn't work" or, "What are you playing at anyway?"
        return s;
    }
    
    /**
     * Constructor for objects of class MysticalWeapon
     */
    public MysticalWeapon(String name)
    {
        username = name;
    }
}
