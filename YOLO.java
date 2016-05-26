
import java.applet.Applet;
import java.awt.*;

/**
 * Class YOLO - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */
public class YOLO extends Applet
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Called by the browser or applet viewer to inform this JApplet that it
     * has been loaded into the system. It is always called before the first 
     * time that the start method is called.
     */
    public void paint(Graphics page)
    {
        Dimension appletSize = this.getSize();
        int windowHeight = appletSize.height; 
        int windowWidth = appletSize.width;
      
        final int MIDX = windowWidth / 2 ;
        final int MIDY = windowHeight/ 2;
        
        Color myFirstColor = new Color(201, 165, 46);
        
        setBackground (myFirstColor);
        
        Color mySecondColor = new Color(75, 26, 107);
        
        page.setColor(Color.black);
        
        page.fillRect(MIDX, MIDY, 28, 28);
        page.fillRect(140, 90, 28,28);
       /* page.fillRect(
        page.fillRect(
        page.fillRect(
        page.fillRect(
        page.fillRect(
        page.fillRect(
        page.fillRect(
        page.fillRect(
        page.fillRect(
        page.fillRect(
        page.fillRect(
        page.fillRect(
        page.fillRect(
        page.fillRect(
        page.fillRect(
        page.fillRect( */
        
        
    }
}

   