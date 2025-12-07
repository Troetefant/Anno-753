import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
//importe(plugins)
  
  import java.util.Random;
  
  //importe end
/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 28.11.2025
 * @author 
 */

public class BaseP extends JFrame {
  // start attributes
  // Hilfsvariablen
  int i = 0;
  int XFeld = 0;
  
  //tiles
  
  int zeilen = 12;
  int spalten = 27;
  int[][] tile_score = new int[zeilen][spalten];
  //tiles end
  //Icons
  private Icon tile_empty = new ImageIcon(getClass().getResource("images/utility/tile_empty.png"));
  private Icon tile_barrack = new ImageIcon(getClass().getResource("images/utility/tile_barrack.png"));
  private Icon tile_forest = new ImageIcon(getClass().getResource("images/utility/tile_forest.png"));
  private Icon tile_wheat = new ImageIcon(getClass().getResource("images/utility/tile_wheat.png"));
  private Icon tile_mountain = new ImageIcon(getClass().getResource("images/utility/tile_mountain.png"));
  private Icon tile_farmland = new ImageIcon(getClass().getResource("images/utility/tile_farmland.png"));
  private Icon tree = new ImageIcon(getClass().getResource("images/utility/tree.png"));
  private Icon wheat = new ImageIcon(getClass().getResource("images/utility/wheat.png"));
  private Icon coin = new ImageIcon(getClass().getResource("images/utility/coin.png"));
  private Icon stone = new ImageIcon(getClass().getResource("images/utility/stone.png"));
  //Icons end
  // Intruduction Tiles
  JLabel[] A = new JLabel[324];


  private JButton bPlay = new JButton();
  
  
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
    for (i = 0;i < 12 ;i++) {
      for (XFeld = 0; XFeld < 27;XFeld++ ) {
        A[i*XFeld] = new JLabel(tile_empty,SwingConstants.LEFT);
        A[i*XFeld].setBounds(40*XFeld,i*40 ,40, 40);
        cp.add(A[i*XFeld]);
      } // end of for
      
      
    } // end of for
    
    
    bPlay.setBounds(432, 576, 185, 57);
    bPlay.setFont(new Font("Dialog", Font.BOLD, 11));
    bPlay.setText("Spiel Starten!");
    bPlay.setMargin(new Insets(2, 2, 2, 2));
    bPlay.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bPlay_ActionPerformed(evt);
      }
    });
    cp.add(bPlay);
    // end components
    
    setVisible(true);
  } // end of public BaseP
  
  // start methods
  
  public static void main(String[] args) {
    new BaseP();
  } // end of main
  
  public void bPlay_ActionPerformed(ActionEvent evt) {
  
    //randomizer für zeilen und spalten
    Random random = new Random();
    
    i = 0;
    for (i = 0;i <= 324 ;i++ ) {
      int Seed = (int)(Math.random()*5);
      if (Seed == 0) {
        A[i].setIcon(tile_mountain);
      } // end of if
      if (Seed == 1) {
        A[i].setIcon(tile_mountain);
      } // end of if
      if (Seed == 2) {
        A[i].setIcon(tile_mountain);
      } // end of if
      if (Seed == 3) {
        A[i].setIcon(tile_mountain);
      } // end of if
      if (Seed == 4) {
        A[i].setIcon(tile_mountain);
      } // end of if
    } // end of for
    
    //randomizer für zeilen und spalten ende
    bPlay.setVisible(false);
  } // end of bPlay_ActionPerformed

  // end methods
  
} // end of class BaseP
