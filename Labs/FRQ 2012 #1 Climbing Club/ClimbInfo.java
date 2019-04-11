
/**
 * ClimbInfo
 *
 * @author (Noel Salmeron)
 * @version (410)
 */
public class ClimbInfo
{
    private String name;
    private int time;

    /**
     * Constructor for objects of class ClimbInfo
     */
    public ClimbInfo(String peakName, int climbTime){
        name = peakName;
        time = climbTime;
    }

    public String getName(){
        return name;
    }
    
    public int getTime(){
        return time;
    }
}
