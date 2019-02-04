
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
        setSize(width, height);
        rX = 100;
        rY = 100;
        width = 200;
        height = 200;
    }
    
    public void paintComponent(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(rX, rY, width, height);
    }
}
