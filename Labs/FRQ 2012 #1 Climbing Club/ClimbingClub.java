
/**
 * ClimbingClub
 *
 * @author (Noel Salmeron)
 * @version (410)
 */
import java.util.ArrayList;
public class ClimbingClub
{
    private ArrayList<ClimbInfo> climbList;

    /**
     * Constructor for objects of class ClimbingClub
     */
    public ClimbingClub(){
        climbList = new ArrayList<ClimbInfo>();
    }

    // ClimbInfo objects in the order they were added
    public void addClimbA(String peakName, int climbTime){
        climbList.add(new ClimbInfo(peakName, climbTime));
    }

    // ClimbInfo objects in alphabetical order
    public void addClimbB(String peakName, int climbTime){   
        for (int i = 0; i < climbList.size(); i++){
            if (peakName.compareTo(climbList.get(i).getName()) < 0){
                climbList.add(i, new ClimbInfo(peakName, climbTime)); return;
            }
        }
        climbList.add(new ClimbInfo(peakName, climbTime));
    }
    
    public void printList(){
        for (int i = 0; i < climbList.size(); i++)
            System.out.println(i+1 + ". " + climbList.get(i).getName() + ": " + climbList.get(i).getTime());
    }
}
