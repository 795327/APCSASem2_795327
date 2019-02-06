
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
    
    public static void main() {
        MySwingApplication mySwingApplicationSwing = new MySwingApplication();
        javax.swing.SwingUtilities.invokeLater(mySwingApplicationSwing);
    }
    
    public void run(){
        jFrame = new JFrame("Magic Window");
        jFrame.setSize(400, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvasComponent = new CanvasComponent(200, 200);
        canvasComponent.setSize(200, 200);
        // paint component?
        jFrame.add(canvasComponent);
        jFrame.setVisible(true);
    }
}
