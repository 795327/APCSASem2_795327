
/**
 * CanvasComponent
 *
 * @author (Noel Salmeron)
 * @version (131)
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CanvasComponent extends JComponent implements MouseListener, MouseMotionListener, ActionListener, KeyListener
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
    Timer animationTimer;
    int motionSpeed;

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
        animationTimer = new Timer(20, this);
        animationTimer.start();
        motionSpeed = 1;
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
            // right side
            if (rX + width + animationDeltaX + gutterX > componentSizeDimension.getWidth()){
                animationDeltaX = 0;
                animationDeltaY = 1;
                rX = ((int)componentSizeDimension.getWidth() - width - gutterX);
                rY += animationDeltaY * motionSpeed;
            }
            // bottom side
            else if (rY + height + animationDeltaY + gutterY > componentSizeDimension.getHeight()){
                animationDeltaX = -1;
                animationDeltaY = 0;
                rY = ((int)componentSizeDimension.getHeight() - height - gutterY);
                rX += animationDeltaX * motionSpeed;
            }
            // left side
            else if (rX + animationDeltaX < gutterX){
                animationDeltaX = 0;
                animationDeltaY = -1;
                rX = gutterX;
                rY += animationDeltaY * motionSpeed;
            }
            // bottom side 2
            else if (rY + animationDeltaY < gutterY){
                animationDeltaX = 1;
                animationDeltaY = 0;
                rY = gutterY;
                rX += animationDeltaX * motionSpeed;
            } else {
                rX += animationDeltaX * motionSpeed;
                rY += animationDeltaY * motionSpeed;
            }
        }
        repaint();
    }

    public void keyTyped(KeyEvent e){
        char keyChar = e.getKeyChar();
        if (keyChar == '+')
            motionSpeed += 1;
        if (keyChar == '-' && motionSpeed > 0)
            motionSpeed -= 1;
    }

    public void keyPressed(KeyEvent e){}
    public void keyReleased(KeyEvent e){}
    public void mouseClicked(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mouseMoved(MouseEvent e){}
}
