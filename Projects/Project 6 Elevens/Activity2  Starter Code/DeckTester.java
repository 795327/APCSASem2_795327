/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
        String[] ranks = {"A", "B", "C"};
        String[] suits = {"Cats", "Dogs"};
        int[] values = {2, 1, 6};
        
        Deck a = new Deck(ranks, suits, values);
        
        System.out.println(a.isEmpty());
        
        System.out.println(a.size());
        
        System.out.println(a.deal());
        System.out.println(a.deal());
        System.out.println(a.deal());
    }
}
