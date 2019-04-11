
/**
 * ClimbRunner
 *
 * @author (Noel Salmeron)
 * @version (410)
 */
public class ClimbRunner
{
    public static void main(){
        ClimbingClub hikerClub = new ClimbingClub();
        hikerClub.addClimbA("Monadnock", 274);
        hikerClub.addClimbA("Whiteface", 301);
        hikerClub.addClimbA("Algonquin", 225);
        hikerClub.addClimbA("Monadnock", 344);
        System.out.println("addClimbA method test (added order):");
        hikerClub.printList();
        
        ClimbingClub hikerClub2 = new ClimbingClub();
        hikerClub2.addClimbB("Monadnock", 274);
        hikerClub2.addClimbB("Whiteface", 301);
        hikerClub2.addClimbB("Algonquin", 225);
        hikerClub2.addClimbB("Monadnock", 344);
        System.out.println("\naddClimbB method test (alphabetical order):");
        hikerClub2.printList();
    }
    
    /**
     * part c
     * (i): no
     * (ii): yes
     */
    
}
