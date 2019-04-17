
/**
 * Cell
 *
 * @author (Noel Salmeron)
 * @version (415)
 */
import java.util.ArrayList;
public class Cell
{
    // instance variables
    private boolean occupied;
    private int id;
    private ArrayList<Cell> neighbors;

    /**
     * Constructor for objects of class Cell
     */
    public Cell()
    {
        neighbors = new ArrayList<Cell>();
    }

    public void loadNeighbors(Cell[][] cells)
    {
        for (int r = 0; r < cells.length; r++){
            for (int c = 0; c < cells[r].length; c++){
                if (r > 0 && cells[r-1][c].getOccupation() == false){
                    neighbors.add(cells[r-1][c]);
                }
                if (c > 0 && cells[r][c-1].getOccupation() == false){
                    neighbors.add(cells[r][c-1]);
                }
                if (r < cells.length - 1 && cells[r+1][c].getOccupation() == false){
                    neighbors.add(cells[r+1][c]);
                }
                if (c < cells[0].length - 1 && cells[r][c+1].getOccupation() == false){
                    neighbors.add(cells[r][c+1]);
                }
            }
        }
    }
    
    public boolean getOccupation(){
        return occupied;
    }
    
    public void setOccupation(boolean x){
        occupied = x;
    }
}
