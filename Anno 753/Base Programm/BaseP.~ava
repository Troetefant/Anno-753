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
  int YFeld = 0;
  int xcl;
  int ycl;
  boolean clicked;
  //tiles
  
  static final int C_ZEILEN = 12;
  static final int C_SPALTEN = 27;
  int[][] tile_score = new int[C_SPALTEN][C_ZEILEN];
  //tiles end
  //Icons
  private Icon tile_empty = new ImageIcon(getClass().getResource("images/utility/tile_empty.png"));
  private Icon tile_barrack = new ImageIcon(getClass().getResource("images/utility/tile_barrack.png"));
  private Icon tile_forest = new ImageIcon(getClass().getResource("images/utility/tile_forest.png"));
  private Icon tile_wheat = new ImageIcon(getClass().getResource("images/utility/tile_wheat.png"));
  private Icon tile_mountain = new ImageIcon(getClass().getResource("images/utility/tile_mountain.png"));
  private Icon tile_farmland = new ImageIcon(getClass().getResource("images/utility/tile_farmland.png"));
  private Icon tree = new ImageIcon(getClass().getResource("images/utility/wood.png"));
  private Icon wheat = new ImageIcon(getClass().getResource("images/utility/wheat.png"));
  private Icon coin = new ImageIcon(getClass().getResource("images/utility/coin.png"));
  private Icon stone = new ImageIcon(getClass().getResource("images/utility/stone.png"));
  private Icon tile_troop = new ImageIcon(getClass().getResource("images/utility/troop_overlay.png"));
  private Icon tile_town = new ImageIcon(getClass().getResource("images/utility/tile_town.png"));
  private Icon troop = new ImageIcon(getClass().getResource("images/utility/troop.png"));
  //Icons end
  // Intruduction Tiles
  JLabel[][] A = new JLabel[C_SPALTEN][C_ZEILEN];

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
    
    for (i = 0;i < 324 ;i++) {
      A[XFeld][YFeld] = new JLabel(tile_empty,SwingConstants.LEFT);
      A[XFeld][YFeld].setBounds(40*XFeld,YFeld*40 ,40, 40);
      cp.add(A[XFeld][YFeld]);
      XFeld++;
      if (XFeld >= (C_SPALTEN)) {
        XFeld = 0;
        YFeld++;
      } // end of if
      
      
    } // end of for
    
    /*
    for (XFeld = 0; XFeld < C_ZEILEN; XFeld++ ) {
      for (YFeld = 0; YFeld < C_SPALTEN; YFeld++ ) {
          A[XFeld][YFeld] = new JLabel(tile_empty,SwingConstants.LEFT);
          A[XFeld][YFeld].setBounds(40*XFeld,YFeld*40 ,40, 40);
          cp.add(A[XFeld][YFeld]);
      } // end of for
      
    } // end of for
    
    */
    
    YFeld = 0;
    XFeld = 0;
    bPlay.setBounds(264, 496, 529, 217);
    bPlay.setFont(new Font("Dialog", Font.BOLD, 11));
    bPlay.setText("Spiel Starten!");
    bPlay.setMargin(new Insets(2, 2, 2, 2));
    bPlay.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bPlay_ActionPerformed(evt);
      }
    });
    cp.add(bPlay);
    cp.addMouseListener(new MouseAdapter() { 
      public void mouseClicked(MouseEvent evt) { 
        cp_MouseClicked(evt);
      }
    });
    // end components
    
    setVisible(true);
  } // end of public BaseP
  
  // start methods
  
  public static void main(String[] args) {
    new BaseP();
  } // end of main
  
  public void bPlay_ActionPerformed(ActionEvent evt) {
    bPlay.setVisible(false);
    //randomizer für zeilen und spalten
    Random random = new Random();
    
    for (i = 0;i <= 324 ;i++ ) {
      int Seed = (int)(Math.random()*8);
      if (Seed == 0) {
        A[XFeld][YFeld].setIcon(tile_forest);
        tile_score[XFeld][YFeld] = 0;
      } // end of if
      if (Seed == 1) {
        A[XFeld][YFeld].setIcon(tile_mountain);
        tile_score[XFeld][YFeld] = 1;
      } // end of if
      if (Seed >= 2) {
        A[XFeld][YFeld].setIcon(tile_empty);
        tile_score[XFeld][YFeld] = 2;
      } // end of if
      
      //Koorditnaten Festlegen
      XFeld++;
      if (XFeld >= (C_SPALTEN)) {
        XFeld = 0;
        YFeld++;
      } // end of if
    } // end of for
    XFeld = 0;
    YFeld = 0;
    //randomizer für zeilen und spalten ende
  } // end of bPlay_ActionPerformed

  public void cp_MouseClicked(MouseEvent evt) {
    // TODO add your code here
    int xcl = evt.getX()/40;
;   int ycl = evt.getY()/40;
    if (xcl < 27 && ycl < 12){
      A[xcl][ycl].setIcon(tile_barrack);
     
     } 
  } // end of cp_MouseClicked

  // end methods
  
} // end of class BaseP
