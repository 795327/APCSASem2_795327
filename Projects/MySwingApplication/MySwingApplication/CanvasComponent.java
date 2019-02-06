
/**
 * CanvasComponent
 *
 * @author (Noel Salmeron)
 * @version (131)
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CanvasComponent extends JComponent
{
    int rX;
    int rY;
    int width;
    int height;
    int mouseFromX;
    int mouseFromY;
    int mouseToX;
    int mouseToY;
    boolean shapeSelected;
    
    public CanvasComponent(int w, int h){
        setSize(w, h);
        rX = 0;
        rY = 0;
        width = 200;
        height = 200;
    }
    
    public void paintComponent(Graphics g){
        g.setColor(Color.cyan);
        g.fillRect(rX, rY, width, height);
    }
    
    public void mouseClicked(){
        
    }
    
    public void mousePressed(MouseEvent e){
        mouseFromX = e.getX();
        mouseFromY = e.getY();
        
        if (shapeSelected){
            
        }
    }
    
    public void mouseReleased(){
        
    }
    
    public void mouseEntered(){
        
    }
    
    public void mouseExited(){
        
    }
    
    public void mouseDragged(MouseEvent e){
        mouseToX = e.getX();
        mouseToY = e.getY();
        rX += (mouseToX - mouseFromX);
        rY += (mouseToY - mouseFromY);
    }
    
    public void mouseMoved(){
        
    }
}
