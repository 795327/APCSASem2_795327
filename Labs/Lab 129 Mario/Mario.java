
/**
 * Mario
 *
 * @author (Noel Salmeron)
 * @version (129)
 */
public class Mario extends Character
{
    // instance variables
    private String catchphrase;
    private int speed;

    /**
     * Constructor for objects of class Mario
     */
    public Mario(String catchphrase, int speed)
    {
        // initialise instance variables
        super(catchphrase, speed);
    }

    public void setSpeed(int s){
        super.setSpeed(s * 2);
    }
}
