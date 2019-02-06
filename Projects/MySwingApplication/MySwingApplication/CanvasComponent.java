
/**
 * CanvasComponent
 *
 * @author (Noel Salmeron)
 * @version (131)
 */
import java.awt.*;
import javax.swing.*;
public class CanvasComponent extends JComponent
{
    int rX;
    int rY;
    int width;
    int height;
    
    public CanvasComponent(int width, int height){
        rX = 0;
        rY = 0;
        width = 100;
        height = 100;
        setSize(width, height);
    }
    
    protected void paintComponent(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(rX, rY, width, height);
    }
}
