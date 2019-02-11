
/**
 * MySwingApplication
 *
 * @author (Noel Salmeron)
 * @version (131)
 */
import javax.swing.*;
public class MySwingApplication implements Runnable
{
    private JFrame jFrame;
    private CanvasComponent canvasComponent;
    
    public void run(){
        jFrame = new JFrame("Magic Window");
        jFrame.setSize(400, 400);
        canvasComponent = new CanvasComponent(100, 100);
        jFrame.add(canvasComponent);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.addKeyListener(canvasComponent);
    }
    
    public static void main() {
        MySwingApplication mySwingApplicationSwing = new MySwingApplication();
        javax.swing.SwingUtilities.invokeLater(mySwingApplicationSwing);
    }
    
    public CanvasComponent getCanvasComponent(){
        return canvasComponent;
    }
}
