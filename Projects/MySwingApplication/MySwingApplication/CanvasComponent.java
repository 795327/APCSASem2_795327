
/**
 * CanvasComponent
 *
 * @author (Noel Salmeron)
 * @version (131)
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CanvasComponent extends JComponent implements MouseListener, MouseMotionListener, ActionListener
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
    int animationDeltaX;
    int animationDeltaY;
    int gutterX;
    int gutterY;

    public CanvasComponent(int w, int h){
        setSize(w, h);
        rX = 150;
        rY = 150;
        width = 100;
        height = 100;
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        animationDeltaX = 1;
        animationDeltaY = 0;
        gutterX = 10;
        gutterY = 10;
    }

    public void paintComponent(Graphics g){
        g.setColor(Color.cyan);
        g.fillRect(rX, rY, width, height);
    }

    public void mousePressed(MouseEvent e){
        mouseFromX = e.getX();
        mouseFromY = e.getY();
        if (mouseFromX > rX && mouseFromY > rY && rX + width >= mouseFromX && rY + height >= mouseFromY){
            shapeSelected = true;
        } else {shapeSelected = false;}
    }

    public void mouseDragged(MouseEvent e){
        if (shapeSelected == true){
            mouseToX = e.getX();
            mouseToY = e.getY();
            rX += (mouseToX - mouseFromX);
            rY += (mouseToY - mouseFromY);
            mouseFromX = mouseToX;
            mouseFromY = mouseToY;
            repaint();
        }
    }
    
    public void actionPerformed(ActionEvent e){
        if (shapeSelected == false){
            Dimension componentSizeDimension = new Dimension(getSize());
            if (rX + width + gutterX > componentSizeDimension.getWidth()){
                rX = ((int)componentSizeDimension.getWidth() - width - gutterX);
                rY += animationDeltaY;
            }
            if (rY + height + gutterY > 400){
                
            }
        }
    }

    public void mouseClicked(MouseEvent e){

    }

    public void mouseReleased(MouseEvent e){

    }

    public void mouseEntered(MouseEvent e){

    }

    public void mouseExited(MouseEvent e){

    }

    public void mouseMoved(MouseEvent e){

    }
}
