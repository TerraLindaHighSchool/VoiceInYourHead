
/**
 * Write a description of class OpeningScene here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OpeningScene extends Voice
{

    public OpeningScene(String name)
    {
        super(name);
        findWord("Hello, my name is #%^@#&");
        new Scene2(name);
    }
    
    public String findWord(String ui){
        System.out.println(eliminateInvalidCharacters(ui));
        return "";
    }


}
