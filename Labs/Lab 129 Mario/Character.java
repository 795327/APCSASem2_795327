
/**
 * Character
 *
 * @author (Noel Salmeron)
 * @version (129)
 */
public class Character
{
    // instance variables
    private String catchphrase;
    private int speed;

    /**
     * Constructor for objects of class Character
     */
    public Character(String c, int s)
    {
        catchphrase = c;
        speed = s;
    }
    
    public void setCatchphrase(String c){
        catchphrase = c;
    }
    
    public String getCatchphrase(){
        return catchphrase;
    }
    
    public void setSpeed(int s){
        speed = s;
    }
    
    public int getSpeed(){
        return speed;
    }
}
