import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 27.11.2025
 * @author 
 */

public class BaseP extends JFrame {
  // start attributes
  private JPanel jPanel1 = new JPanel(null, true);
  private JButton jButton1 = new JButton();
  private JLabel lGold = new JLabel();
  private JLabel lEisen = new JLabel();
  private JButton jButton2 = new JButton();
  // end attributes
  //Globale Variablen
  int Runde //Nummer der derzeitigen Runde
  // Ressourcen
  int Gold;
  int Stein;
  int Eisen;
  int Getreide;
  //Ressourcenzuwachs pro Runde
  int Goldz; 
  int Steinz;
  int Eisenz;
  int Getreide+;
  //Gebäude
  int Farm;
  int Villa;
  int Steinbruch;
  int Eisenmine;
  //KI Gebäude
  int KVilla;
  int KFarm;
  int KSteinbruch;
  int Eisenmine;
  
  public BaseP() { 
    // Frame init
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 1080; 
    int frameHeight = 720;
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
    
    jPanel1.setBounds(0, 448, 1064, 16);
    jPanel1.setOpaque(true);
    jPanel1.setBackground(Color.MAGENTA);
    cp.add(jPanel1);
    jButton1.setBounds(888, 624, 160, 40);
    jButton1.setFont(new Font("Dialog", Font.BOLD, 11));
    jButton1.setText("Button");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    lGold.setBounds(888, 472, 160, 40);
    lGold.setFont(new Font("Dialog", Font.BOLD, 11));
    lGold.setText("Gold");
    cp.add(lGold);
    lEisen.setBounds(880, 520, 80, 24);
    lEisen.setFont(new Font("Dialog", Font.BOLD, 11));
    lEisen.setText("Eisen");
    cp.add(lEisen);
    jButton2.setBounds(144, 544, 80, 24);
    jButton2.setFont(new Font("Dialog", Font.BOLD, 11));
    jButton2.setText("Button");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
      }
    });
    cp.add(jButton2);
    // end components
    
    setVisible(true);
  } // end of public BaseP
  
  // start methods
  
  public static void main(String[] args) {
    new BaseP();
  } // end of main
  
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    
  } // end of jButton1_ActionPerformed

  public void jButton2_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    
  } // end of jButton2_ActionPerformed
  void pause(int ms) {
    try {
       Thread.sleep(ms);
      } catch(InterruptedException e) {
        }   
    }//ende of pause

  // end methods
} // end of class BaseP
