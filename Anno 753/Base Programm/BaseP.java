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
  int xcl;   // X Click
  int ycl;   // Y Click
  int bslc = 1; //Building selected Wert zu Testzwecken
  //Ressourcen
  int Gold;
  int Stone;
  int Wood;
  int Wheat;
  //Ressourcen end
  int Bcnt; // Barrack Counter
  int Fcnt; // Farm Counter
  int Mcnt; // Minen Counter
  int Lcnt; //Lumberjack Counter
  int Tcnt; // Town Counter
  
  
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
  private Icon wood = new ImageIcon(getClass().getResource("images/utility/wood.png"));
  private Icon wheat = new ImageIcon(getClass().getResource("images/utility/wheat.png"));
  private Icon coin = new ImageIcon(getClass().getResource("images/utility/coin.png"));
  private Icon stone = new ImageIcon(getClass().getResource("images/utility/stone.png"));
  private Icon tile_troop = new ImageIcon(getClass().getResource("images/utility/troop_overlay.png"));
  private Icon tile_town = new ImageIcon(getClass().getResource("images/utility/tile_town.png"));
  private Icon troop = new ImageIcon(getClass().getResource("images/utility/troop.png"));
  private Icon tile_lumberjack = new ImageIcon(getClass().getResource("images/utility/tile_lumberjack.png"));
  //Icons end
  // Intruduction Tiles
  JLabel[][] A = new JLabel[C_SPALTEN][C_ZEILEN];

  private JButton bPlay = new JButton();
  
  
  private JButton bNaechsterTag = new JButton();
  private JLabel jStone = new JLabel();
    private Icon jStoneIcon = stone;
  private JLabel jGold = new JLabel();
    private Icon jGoldIcon = coin;
  private JLabel jWheat = new JLabel();
    private Icon jWheatIcon = wheat;
  private JLabel jWood = new JLabel();
    private Icon jWoodIcon = wood;
  private JButton bTown = new JButton();
  private JButton bLumber = new JButton();
  private JButton bFarm = new JButton();
  private JButton bVillage = new JButton();
  private JButton bMine = new JButton();
  private JButton bBarrack = new JButton();
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
    setUndecorated(true);
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
    
    /*   Funktioniert nd
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
    bNaechsterTag.setBounds(904, 544, 168, 168);
    bNaechsterTag.setFont(new Font("Dialog", Font.BOLD, 11));
    bNaechsterTag.setText("Nächster Tag");
    bNaechsterTag.setMargin(new Insets(2, 2, 2, 2));
    bNaechsterTag.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bNaechsterTag_ActionPerformed(evt);
      }
    });
    cp.add(bNaechsterTag);
    jStone.setBounds(904, 512, 88, 24);
    jStone.setFont(new Font("Dialog", Font.BOLD, 11));
    jStone.setIcon(jStoneIcon);
    cp.add(jStone);
    jGold.setBounds(904, 488, 88, 24);
    jGold.setFont(new Font("Dialog", Font.BOLD, 11));
    jGold.setIcon(jGoldIcon);
    cp.add(jGold);
    jWheat.setBounds(992, 512, 80, 24);
    jWheat.setFont(new Font("Dialog", Font.BOLD, 11));
    jWheat.setIcon(jWheatIcon);
    cp.add(jWheat);
    jWood.setBounds(992, 488, 80, 24);
    jWood.setFont(new Font("Dialog", Font.BOLD, 11));
    jWood.setIcon(jWoodIcon);
    cp.add(jWood);
    bTown.setBounds(16, 496, 64, 64);
    bTown.setFont(new Font("Dialog", Font.BOLD, 11));
    bTown.setMargin(new Insets(2, 2, 2, 2));
    bTown.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bTown_ActionPerformed(evt);
      }
    });
    bTown.setIcon(tile_town);
    bTown.setBackground(new Color(0x404040));
    cp.add(bTown);
    bLumber.setBounds(16, 568, 64, 64);
    bLumber.setFont(new Font("Dialog", Font.BOLD, 11));
    bLumber.setMargin(new Insets(2, 2, 2, 2));
    bLumber.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bLumber_ActionPerformed(evt);
      }
    });
    bLumber.setIcon(tile_lumberjack);
    bLumber.setBackground(new Color(0x404040));
    cp.add(bLumber);
    bFarm.setBounds(16, 640, 64, 64);
    bFarm.setFont(new Font("Dialog", Font.BOLD, 11));
    bFarm.setMargin(new Insets(2, 2, 2, 2));
    bFarm.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bFarm_ActionPerformed(evt);
      }
    });
    bFarm.setIcon(tile_farmland);
    bFarm.setBackground(new Color(0x404040));
    cp.add(bFarm);
    bVillage.setBounds(88, 496, 64, 64);
    bVillage.setFont(new Font("Dialog", Font.BOLD, 11));
    bVillage.setMargin(new Insets(2, 2, 2, 2));
    bVillage.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bVillage_ActionPerformed(evt);
      }
    });
    bVillage.setIcon(tile_empty);
    bVillage.setBackground(new Color(0x404040));
    cp.add(bVillage);
    bMine.setBounds(88, 568, 64, 64);
    bMine.setFont(new Font("Dialog", Font.BOLD, 11));
    bMine.setMargin(new Insets(2, 2, 2, 2));
    bMine.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bMine_ActionPerformed(evt);
      }
    });
    bMine.setIcon(tile_empty);
    bMine.setBackground(new Color(0x404040));
    cp.add(bMine);
    bBarrack.setBounds(88, 640, 64, 64);
    bBarrack.setFont(new Font("Dialog", Font.BOLD, 11));
    bBarrack.setMargin(new Insets(2, 2, 2, 2));
    bBarrack.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bBarrack_ActionPerformed(evt);
      }
    });
    bBarrack.setIcon(tile_barrack);
    bBarrack.setBackground(new Color(0x404040));
    cp.add(bBarrack);
    // end components
    
    setVisible(true);
  } // end of public BaseP
  
  // start methods
  
  public static void main(String[] args) {
    new BaseP();
  } // end of main
  
  public void bPlay_ActionPerformed(ActionEvent evt) {
    bPlay.setVisible(false);
    //Startguthaben
    Gold = 20000;
    Stone = 20;
    Wood = 40;
    Wheat = 5000;
    //Startguthaben end
    Aktualisierung();
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
      switch (bslc) {
        case 0 : 
          
          break;
        case  1:
          if (Gold >= 10 && Wheat >= 5 ) {
            A[xcl][ycl].setIcon(tile_barrack);
            Gold = Gold-10;
            Wheat = Wheat-5;
            tile_score[xcl][ycl] = 3;
            Bcnt++;
          } else {
            
          } // end of if-else
          break;
        case 2 : 
          if (Gold >= 10) {
            A[xcl][ycl].setIcon(tile_lumberjack);
            Gold = Gold-10;
            tile_score[xcl][ycl] = 4;
            Lcnt++;
          } else {
            
          } // end of if-else
          break;  
        case 3 : 
          if (Gold >= 10 && Wood >= 5 ) {
            A[xcl][ycl].setIcon(tile_farmland);
            Gold = Gold-10;
            Wood = Wood-5;
            tile_score[xcl][ycl] = 5;
            Fcnt++;
          } else {
            
          } // end of if-else
          break;  
        case 4 : 
          if (Gold >= 50 && Wheat >= 5 && Stone >=20 && Wood >= 30 ) {
            A[xcl][ycl].setIcon(tile_town);
            Gold = Gold-50;
            Wheat = Wheat-5;
            Stone = Stone-20;
            Wood = Wood-30;
            tile_score[xcl][ycl] = 6;
            
            Tcnt++;
          } else {
            
          } // end of if-else
          break;
          case 5 : 
          if (Gold >= 20 && Wood >= 15 && Wheat >= 5) {
            A[xcl][ycl].setIcon(tile_empty);
            Gold = Gold-20;
            Wood = Wood-15;
            Wheat = Wheat-5;
            tile_score[xcl][ycl] = 7;
            
            Tcnt++;
          } else {
            
          } // end of if-else
          break;
          case 6 : 
          if (Gold >= 10 && Wood >= 30 ) {
            A[xcl][ycl].setIcon(tile_forest);
            Gold = Gold-20;
            Wood = Wood-30;
            tile_score[xcl][ycl] = 8;
            
            Tcnt++;
          } else {
            
          } // end of if-else
          break;
        } // end of switch
      
      
     } 
    Aktualisierung();
  } // end of cp_MouseClicked
  
  public void Aktualisierung() {
    jGold.setText(""+ Gold);
    jStone.setText(""+ Stone);
    jWood.setText(""+ Wood);
    jWheat.setText(""+ Wheat);
  }
  
  public void bNaechsterTag_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    
  } // end of bNaechsterTag_ActionPerformed

  public void bTown_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    bslc = 4;
    bTown.setBackground(Color.GREEN);
  } // end of bTown_ActionPerformed

  public void bLumber_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    bslc = 2;
    bTown.setBackground(Color.GREEN);
  } // end of bLumber_ActionPerformed

  public void bFarm_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    bslc = 3;
    bTown.setBackground(Color.GREEN);
  } // end of bFarm_ActionPerformed

  public void bVillage_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    bslc = 5;
    bTown.setBackground(Color.GREEN);
  } // end of bVillage_ActionPerformed

  public void bMine_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    bslc = 6;
    bTown.setBackground(Color.GREEN);
  } // end of bMine_ActionPerformed

  public void bBarrack_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    bslc = 1;
    bTown.setBackground(Color.GREEN);
  } // end of bBarrack_ActionPerformed

  // end methods
  
} // end of class BaseP
