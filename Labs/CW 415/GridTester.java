
/**
 * GridTester
 *
 * @author (Noel Salmeron)
 * @version (415)
 */
public class GridTester
{
    // instance variables
    private Cell[][] cells;

    /**
     * Constructor for objects of class GridTester
     */
    public GridTester(int rows, int columns)
    {
        cells = new Cell[rows][columns];
    }

    public void loadOccupied()
    {
        int randInt = (int)(Math.random()*3);
        for (int r = 0; r < cells.length; r++){
            for (int c = 0; c < cells[r].length; c++){
                if (randInt == 1){
                    cells[r][c].setOccupation(true);
                }
            }
        }
    }
}
