import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 28.11.2025
 * @author 
 */

public class BaseP extends JFrame {
  // start attributes
  // end attributes
  
  public BaseP() { 
    // Frame init
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300;
    int frameHeight = 300;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("BaseP");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // start components
    
    // end components
    
    setVisible(true);
  } // end of public BaseP
  
  // start methods
  
  public static void main(String[] args) {
    new BaseP();
  } // end of main
  
  // end methods
} // end of class BaseP
