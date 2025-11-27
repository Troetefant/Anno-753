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
  private JButton bNaechsteRunde = new JButton();
  private JLabel lGold201 = new JLabel();
  private JLabel lHolz101 = new JLabel();
  private JButton bFarm = new JButton();
 
  private JLabel lStein = new JLabel();
  private JLabel lGetreide = new JLabel();
  private JButton bHolzfaeller = new JButton();
  private JButton bSteinbruch = new JButton();
  private JButton bKaserne = new JButton();
  private JButton bAusbilden = new JButton();
  // end attributes
  //Globale Variablen
  int Runden;
  //Ressourcen
  int Gold;
  int Stein;
  int Holz;
  int Getreide;
  //Gebäude
  int Steinbruch;
  int Holzfäller;
  int Farm;
  int Kaserne;
  
  
  
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
    
    jPanel1.setBounds(0, 480, 1080, 200);
    jPanel1.setOpaque(true);
    jPanel1.setBackground(new Color(0xFFC800));
    cp.add(jPanel1);
    bNaechsteRunde.setBounds(888, 576, 184, 88);
    bNaechsteRunde.setFont(new Font("Dialog", Font.BOLD, 11));
    bNaechsteRunde.setText("Nächste Runde");
    bNaechsteRunde.setMargin(new Insets(2, 2, 2, 2));
    bNaechsteRunde.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bNaechsteRunde_ActionPerformed(evt);
      }
    });
    cp.add(bNaechsteRunde);
    lGold201.setBounds(896, 504, 80, 24);
    lGold201.setFont(new Font("Dialog", Font.BOLD, 11));
    lGold201.setText("Gold: 20");
    cp.add(lGold201);
    lHolz101.setBounds(896, 536, 80, 24);
    lHolz101.setFont(new Font("Dialog", Font.BOLD, 11));
    lHolz101.setText("Holz: 10");
    cp.add(lHolz101);
    bFarm.setBounds(16, 504, 96, 72);
    bFarm.setFont(new Font("Dialog", Font.BOLD, 11));
    bFarm.setText("Farm");
    bFarm.setMargin(new Insets(2, 2, 2, 2));
    bFarm.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bFarm_ActionPerformed(evt);
      }
    });
    cp.add(bFarm);
    
    
    lStein.setBounds(984, 536, 80, 24);
    lStein.setFont(new Font("Dialog", Font.BOLD, 11));
    lStein.setText("Stein: 5");
    cp.add(lStein);
    lGetreide.setBounds(984, 504, 80, 24);
    lGetreide.setFont(new Font("Dialog", Font.BOLD, 11));
    lGetreide.setText("Getreide: 15");
    cp.add(lGetreide);
    bHolzfaeller.setBounds(16, 592, 96, 72);
    bHolzfaeller.setFont(new Font("Dialog", Font.BOLD, 11));
    bHolzfaeller.setText("Holzfäller");
    bHolzfaeller.setMargin(new Insets(2, 2, 2, 2));
    bHolzfaeller.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bHolzfaeller_ActionPerformed(evt);
      }
    });
    cp.add(bHolzfaeller);
    bSteinbruch.setBounds(128, 504, 96, 72);
    bSteinbruch.setFont(new Font("Dialog", Font.BOLD, 11));
    bSteinbruch.setText("Steinbruch");
    bSteinbruch.setMargin(new Insets(2, 2, 2, 2));
    bSteinbruch.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bSteinbruch_ActionPerformed(evt);
      }
    });
    cp.add(bSteinbruch);
    bKaserne.setBounds(128, 592, 96, 72);
    bKaserne.setFont(new Font("Dialog", Font.BOLD, 11));
    bKaserne.setText("Kaserne");
    bKaserne.setMargin(new Insets(2, 2, 2, 2));
    bKaserne.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bKaserne_ActionPerformed(evt);
      }
    });
    cp.add(bKaserne);
    bAusbilden.setBounds(776, 504, 98, 160);
    bAusbilden.setFont(new Font("Dialog", Font.BOLD, 11));
    bAusbilden.setText("Ausbilden");
    bAusbilden.setMargin(new Insets(2, 2, 2, 2));
    bAusbilden.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bAusbilden_ActionPerformed(evt);
      }
    });
    cp.add(bAusbilden);
    // end components
    
    setVisible(true);
  } // end of public BaseP
  
  // start methods
  
  public static void main(String[] args) {
    new BaseP();
  } // end of main
  
  public void bNaechsteRunde_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    
  } // end of bNaechsteRunde_ActionPerformed

  public void bFarm_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    
  } // end of bFarm_ActionPerformed

  public void bHolzfaeller_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    
  } // end of bHolzfaeller_ActionPerformed

  public void bSteinbruch_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    
  } // end of bSteinbruch_ActionPerformed

  public void bKaserne_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    
  } // end of bKaserne_ActionPerformed

  public void bAusbilden_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    
  } // end of bAusbilden_ActionPerformed

  // end methods
} // end of class BaseP
