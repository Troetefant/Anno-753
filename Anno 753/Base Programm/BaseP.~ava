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
  private JLabel jLabelA1 = new JLabel();
    private ImageIcon jLabelA1Icon = new ImageIcon(getClass().getResource("images/tile_empty.png"));
  private JLabel jLabelB1 = new JLabel();
    private ImageIcon jLabelB1Icon = new ImageIcon(getClass().getResource("images/tile_empty.png"));
  private JLabel jLabelC1 = new JLabel();
    private ImageIcon jLabelC1Icon = new ImageIcon(getClass().getResource("images/tile_empty.png"));
  // end attributes
  
  public BaseP() { 
    // Frame init
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 1096; 
    int frameHeight = 759;
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
    
    jLabelA1.setBounds(0, 0, 40, 40);
    jLabelA1.setFont(new Font("Dialog", Font.BOLD, 11));
    jLabelA1.setText("Text");
    jLabelA1.setIcon(jLabelA1Icon);
    cp.add(jLabelA1);
    jLabelB1.setBounds(0, 40, 40, 40);
    jLabelB1.setFont(new Font("Dialog", Font.BOLD, 11));
    jLabelB1.setText("Text");
    jLabelB1.setIcon(jLabelB1Icon);
    cp.add(jLabelB1);
    jLabelC1.setBounds(0, 88, 40, 40);
    jLabelC1.setFont(new Font("Dialog", Font.BOLD, 11));
    jLabelC1.setText("Text");
    jLabelC1.setIcon(jLabelC1Icon);
    cp.add(jLabelC1);
    // end components
    
    setVisible(true);
  } // end of public BaseP
  
  // start methods
  
  public static void main(String[] args) {
    new BaseP();
  } // end of main
  
  // end methods
} // end of class BaseP
