/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.ins;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.text.Text;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;





class fenetre extends JFrame implements ActionListener
{
    //FonctionsTP essai = new  FonctionsTP();
    
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private int compteur1=0;
    
    private int PrixArbre = 10;
    private int NbArbre = 0;
    private int PrixPoubelle = 50;
    private int NbPoubelle = 0;
    private int PrixCentreTri = 250;
    private int NbCentreTri = 0;
    private int PrixEolienne = 1250;
    private int NbEolienne = 0;
    private int PrixBarrage = 6250;
    private int NbBarrage = 0;
    private int PrixTranspCom = 31250;
    private int NbTranspCom = 0;
    private int PrixEnvNat = 156250;
    private int NbEnvNat = 0;
    private int PrixEnvPla = 781250;
    private int NbEnvPla = 0;
    private int PrixRobotsOc = 3906250;
    private int NbRobotsOc = 0;
    private int PrixRobotsEsp = 19531250;
    private int NbRobotsEsp = 0;
    
    //Bonus d'achats
    private int BonusArbre = 0;
    private int BonusPoubelle = 0;
    private int BonusCentreTri = 0;
    private int BonusEolienne = 0;
    private int BonusBarrage = 0;
    private int BonusTranspCom = 0;
    private int BonusEnvNat = 0;
    private int BonusEnvPlat = 0;
    private int BonusRobotsOc = 0;
    private int BonusRobotsEsp = 0;
    
    //Difficulté
    private int Difficult;
    //Textes
    private JLabel texte1;
    private JLabel texte2;
    private JLabel texte3;
    private JLabel texte4;
    private JLabel texte5;
    private JLabel texte6;
    private JLabel texte7;
    private JLabel texte8;
    private JLabel texte9;
    private JLabel texte10;
    private JLabel texte11;
    private JLabel texte12;
    private JLabel texte13;
    private JLabel texte14;
    private JLabel texte15;
    private JLabel texte16;
    private JLabel texte17;
    private JLabel texte18;
    private JLabel texte19;
    private JLabel texte20;
    private JLabel texte21;
    
    
    public fenetre () 
    {
        //image sur le bouton
        ImageIcon photo= new ImageIcon(getClass().getResource("/image/ImageFaite.png"));
        //Container contenant =getContentPane();
        JPanel panel = new JPanel();
        
        //Prix et nombres d'objets
        
        
        //Boutton
        button1= new JButton ();
        button2= new JButton ("Arbre");
        button3= new JButton ("Poubelle");
        button4= new JButton ("Triage");
        button5= new JButton ("Eolienne");
        button6= new JButton ("Barrage");
        button7= new JButton ("Transport");
        button8= new JButton ("Projet N");
        button9= new JButton ("Projet P");
        button10= new JButton ("Robots O");
        button11= new JButton ("Robots E");
        button12= new JButton ("Facile");
        button13= new JButton ("Moyen");
        button14= new JButton ("Difficile");
        button15= new JButton ("Divin");
        texte1=new JLabel();
        texte2=new JLabel();
        texte3=new JLabel();
        texte4=new JLabel();
        texte5=new JLabel();
        texte6=new JLabel();
        texte7=new JLabel();
        texte8=new JLabel();
        texte9=new JLabel();
        texte10=new JLabel();
        texte11=new JLabel();
        texte12=new JLabel();
        texte13=new JLabel();
        texte14=new JLabel();
        texte15=new JLabel();
        texte16=new JLabel();
        texte17=new JLabel();
        texte18=new JLabel();
        texte19=new JLabel();
        texte20=new JLabel();
        texte21=new JLabel();
         
        //getContentPane().setLayout( new GridLayout());
        //parametre de la fenetre
        setTitle("ekko-cliker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize (800,900);
        setResizable(false);
        panel.setPreferredSize(new Dimension(800, 800));
        panel.setBackground(Color.yellow);
        panel.setLayout(null);
        
        //Bouton Principal
        button1.setBounds(250, 100, 300, 279);
        button1.setIcon(photo);
        panel.add(button1);
        
        //Bouton Fonction n°1
        button2.setBounds(100, 650, 90, 30);
        panel.add(button2);
        //Bouton Fonction n°2
        button3.setBounds(220, 650, 90, 30);
        panel.add(button3);
        //Bouton Fonction n°3
        button4.setBounds(340, 650, 90, 30);
        panel.add(button4);
        //Bouton Fonction n°4
        button5.setBounds(460, 650, 90, 30);
        panel.add(button5);
        //Bouton Fonction n°5
        button6.setBounds(580, 650, 90, 30);
        panel.add(button6);
        //Bouton Fonction n°6
        button7.setBounds(100, 750, 90, 30);
        panel.add(button7);
        //Bouton Fonction n°7
        button8.setBounds(220, 750, 90, 30);
        panel.add(button8);
        //Bouton Fonction n°8
        button9.setBounds(340, 750, 90, 30);
        panel.add(button9);
        //Bouton Fonction n°9
        button10.setBounds(460, 750, 90, 30);
        panel.add(button10);
        //Bouton Fonction n°10
         button11.setBounds(580, 750, 90, 30);
        panel.add(button11);
        /*
        //Bouton Mode Facile
        button12.setBounds(100, 300, 90, 30);
        panel.add(button12);
        
        //Bouton Mode Moyen
        button13.setBounds(100, 350, 90, 30);
        panel.add(button13);
        
        //Bouton Mode Difficile
        button14.setBounds(100, 400, 90, 30);
        panel.add(button14);
        
        //Bouton Mode Divin
        button15.setBounds(100, 450, 90, 30);
        panel.add(button15);*/
        
        //getContentPane().add(panel);
        
        //Texte pour le compteur
        texte1.setBounds(200,400, 600, 279);
        panel.add(texte1);
        
        //texte pour les achats
        texte2.setBounds(100,500, 300, 279);
        panel.add(texte2);
        
        texte3.setBounds(220,500, 300, 279);
        panel.add(texte3);
        
        texte4.setBounds(340,500, 300, 279);
        panel.add(texte4);
        
        texte5.setBounds(460,500, 300, 279);
        panel.add(texte5);
        
        texte6.setBounds(580,500, 300, 279);
        panel.add(texte6);
        
        texte7.setBounds(100,600, 300, 279);
        panel.add(texte7);
        
        texte8.setBounds(220,600, 300, 279);
        panel.add(texte8);
        
        texte9.setBounds(340,600, 300, 279);
        panel.add(texte9);
        
        texte10.setBounds(460,600, 300, 279);
        panel.add(texte10);
        
        texte11.setBounds(580,600, 300, 279);
        panel.add(texte11);
        
        //Textes pour les prix
        texte12.setBounds(100,550, 300, 279);
        panel.add(texte12);
        
        texte13.setBounds(220,550, 300, 279);
        panel.add(texte13);
        
        texte14.setBounds(340,550, 300, 279);
        panel.add(texte14);
        
        texte15.setBounds(460,550, 300, 279);
        panel.add(texte15);
        
        texte16.setBounds(580,550, 300, 279);
        panel.add(texte16);
        
        texte17.setBounds(100,650, 300, 279);
        panel.add(texte17);
        
        texte18.setBounds(220,650, 300, 279);
        panel.add(texte18);
        
        texte19.setBounds(340,650, 300, 279);
        panel.add(texte19);
        
        texte20.setBounds(460,650, 300, 279);
        panel.add(texte20);
        
        texte21.setBounds(580,650, 300, 279);
        panel.add(texte21);
        
        
        
        
        
        //Création des Textes telles que le compteur, le prix et le nombre d'objets
        //Texte pour le compteur
        texte1.setText("score: ");
        Font font = new Font("Comics sans ms",Font.BOLD,50);
        
        //Textes pour les nombres d'objets
        texte1.setFont(font);
        button1.addActionListener(this);
        getContentPane().add(panel);
        
        texte2.setText("Nb Arbre : ");
        Font font2 = new Font("Comics sans ms",Font.BOLD,10);
        texte2.setFont(font2);
        button2.addActionListener(this);
        
        texte3.setText("Nb Poubelle : ");
        texte3.setFont(font2);
        button3.addActionListener(this);
        
        texte4.setText("Nb Centre de Tri : ");
        texte4.setFont(font2);
        button4.addActionListener(this);
        
        texte5.setText("Nb Eolienne : ");
        texte5.setFont(font2);
        button5.addActionListener(this);
        
        texte6.setText("Nb Barrage : ");
        texte6.setFont(font2);
        button6.addActionListener(this);
        
        texte7.setText("Nb Transport : ");
        texte7.setFont(font2);
        button7.addActionListener(this);
        
        texte8.setText("Nb Projet Nat : ");
        texte8.setFont(font2);
        button8.addActionListener(this);
        
        texte9.setText("Nb Projet Planet : ");
        texte9.setFont(font2);
        button9.addActionListener(this);
        
        texte10.setText("Nb Robots Oc : ");
        texte10.setFont(font2);
        button10.addActionListener(this);
        
        texte11.setText("Nb Robots Espc : ");
        texte11.setFont(font2);
        button11.addActionListener(this);
        
        //Textes pour les prix
        texte12.setText("Prix : "+PrixArbre);
        texte12.setFont(font2);
        button2.addActionListener(this);
        
        texte13.setText("Prix : "+PrixPoubelle);
        texte13.setFont(font2);
        button3.addActionListener(this);
        
        texte14.setText("Prix : "+PrixCentreTri);
        texte14.setFont(font2);
        button4.addActionListener(this);
        
        texte15.setText("Prix : "+PrixEolienne);
        texte15.setFont(font2);
        button5.addActionListener(this);
        
        texte16.setText("Prix : "+PrixBarrage);
        texte16.setFont(font2);
        button6.addActionListener(this);
        
        texte17.setText("Prix : "+PrixTranspCom);
        texte17.setFont(font2);
        button7.addActionListener(this);
        
        texte18.setText("Prix : "+PrixEnvNat);
        texte18.setFont(font2);
        button8.addActionListener(this);
        
        texte19.setText("Prix : "+PrixEnvPla);
        texte19.setFont(font2);
        button9.addActionListener(this);
        
        texte20.setText("Prix : "+PrixRobotsOc);
        texte20.setFont(font2);
        button10.addActionListener(this);
        
        texte21.setText("Prix : "+PrixRobotsEsp);
        texte21.setFont(font2);
        button11.addActionListener(this);
        
        
        
        
        setVisible (true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ev)
    {
        
        
            /*if (ev.getSource()== button12)
            {
                Difficult = 1;
            }
            if (ev.getSource()== button13)
            {
                Difficult = 2;
            }
            if (ev.getSource()== button14)
            {
                Difficult = 5;
            }
            if (ev.getSource()== button15)
            {
                Difficult = 10;
            }*/
        
        if (ev.getSource()== button1)
        {
            //Calcul des Bonus
            if(NbArbre >= 1)
            {
                BonusArbre = NbArbre/3;
            }
            if(NbPoubelle >= 1)
            {
                BonusPoubelle = (NbPoubelle/3)*2;
            }
            if(NbCentreTri >= 1)
            {
                BonusCentreTri = (NbCentreTri/3)*4;
            }
            if(NbEolienne >= 1)
            {
                BonusEolienne = (NbEolienne/3)*8;
            }
            if(NbBarrage >= 1)
            {
                BonusBarrage = (NbBarrage/3)*16;
            }
            if(NbTranspCom >= 1)
            {
                BonusTranspCom = (NbTranspCom/3)*32;
            }
            if(NbEnvPla >= 1)
            {
                BonusEnvPlat = (NbEnvPla/3)*128;
            }
            if(NbEnvNat >= 1)
            {
                BonusEnvNat = (NbEnvNat/3)*64;
            }
            if(NbRobotsOc >= 1)
            {
                BonusRobotsOc = (NbRobotsOc/3)*256;
            }
            if(NbRobotsEsp >= 1)
            {
                BonusRobotsEsp = (NbRobotsEsp/3)*512;
            }
            compteur1 = compteur1 + 1 + BonusArbre + BonusEolienne + BonusBarrage + BonusPoubelle + BonusCentreTri + BonusTranspCom + BonusRobotsOc + BonusRobotsEsp + BonusEnvNat + BonusEnvPlat;
            texte1.setText("scores : "+compteur1);
        }
        if (ev.getSource()== button2)
        {
            //compteur1 = essai.PlanterUnArbre(compteur1);
            if(PrixArbre <= compteur1)
            {
                compteur1 = compteur1 - PrixArbre;
                NbArbre++;
                System.out.println("Vous avez planter un arbre");
                System.out.println("Il vous reste de l'argent");
            }
            if(PrixArbre > compteur1)
            {
                System.out.println("Aha! Vous avez même pas d'argent pour faire planter un Arbre");
                System.out.println("par un petit Népalais...");
                System.out.println("A plus !");
            }
            PrixArbre = 10 + NbArbre;
            texte2.setText("Nb Arbre : "+NbArbre);
            texte12.setText("Prix : "+PrixArbre);
            texte1.setText("scores : "+compteur1);
        }
        if (ev.getSource()== button3)
        {

            if(PrixPoubelle <= compteur1)
            {
                compteur1 = compteur1 - PrixPoubelle;
                NbPoubelle++;
                System.out.println("Vous avez acheter une poubelle");
                System.out.println("Il vous reste de l'argent");
            }
            if(PrixPoubelle > compteur1)
            {
                System.out.println("Aha! Vous avez même pas d'argent pour acheter une poubelle");
                System.out.println("crée par un petit Chinois");
                System.out.println("A plus !");
            }
            PrixPoubelle = 50 + 2*NbPoubelle;
            texte3.setText("Nb Poubelles : "+NbPoubelle);
            texte13.setText("Prix : "+PrixPoubelle);
            texte1.setText("scores : "+compteur1);
        }
        if (ev.getSource()== button4)
        {
            if(PrixCentreTri <= compteur1)
            {
                compteur1 = compteur1 - PrixCentreTri;
                NbCentreTri++;
                System.out.println("Vous avez construit un Centre de tri !");
                System.out.println("C'est plutot un gros investissement, bravo !");
            }
            if(PrixCentreTri > compteur1)
            {
                System.out.println("Et non ! vous n'avez pas encore assez d'argent pour ");
                System.out.println("consruire un centre de tri Indien");
                System.out.println("A plus !");
            }
            PrixCentreTri = 250 + 2*NbCentreTri;
            texte4.setText("Nb Centre de Tri : "+NbCentreTri);
            texte14.setText("Prix : "+PrixCentreTri);
            texte1.setText("scores : "+compteur1);
        }
        if (ev.getSource()== button5)
        {
            if(PrixEolienne <= compteur1)
            {
                compteur1 = compteur1 - PrixEolienne;
                NbEolienne++;
                System.out.println("Vous avez construit une éolienne !");
                System.out.println("Grâce à vous, il y a des chinois qui ont accès à l'électricité");
            }
            if(PrixEolienne > compteur1)
            {
                System.out.println("Et non ! vous n'avez pas encore assez d'argent pour ");
                System.out.println("consruire une éolienne.");
                System.out.println("A plus !");
            }
            PrixEolienne = 1250 + 2*NbEolienne;
            texte5.setText("Nb Eolienne : "+NbEolienne);
            texte15.setText("Prix : "+PrixEolienne);
            texte1.setText("scores : "+compteur1);
        }
        if (ev.getSource()== button6)
        {
            if(PrixBarrage <= compteur1)
            {
                compteur1 = compteur1 - PrixBarrage;
                NbBarrage++;
                System.out.println("Vous avez construit un barrage !");
                System.out.println("Grâce à vous, il y a des Egyptiens qui ont accès à l'électricité");
            }
            if(PrixBarrage > compteur1)
            {
                System.out.println("Et non ! vous n'avez pas encore assez d'argent pour ");
                System.out.println("consruire un barrage.");
                System.out.println("A plus !");
            }
            PrixBarrage = 6250 + 2*NbBarrage;
            texte6.setText("Nb Barrage : "+NbBarrage);
            texte16.setText("Prix : "+PrixBarrage);
            texte1.setText("scores : "+compteur1);
        }
        if (ev.getSource()== button7)
        {
            //compteur1 = essai.PlanterUnArbre(compteur1);
            
            if(PrixTranspCom <= compteur1)
            {
                compteur1 = compteur1 - PrixTranspCom;
                NbTranspCom++;
                System.out.println("Vous avez planter un arbre");
                System.out.println("Il vous reste de l'argent");
            }
            if(PrixTranspCom > compteur1)
            {
                System.out.println("Aha! Vous avez même pas d'argent pour faire planter un Arbre");
                System.out.println("par un petit Népalais...");
                System.out.println("A plus !");
            }
            PrixTranspCom = 31250 + NbTranspCom*2;
            texte7.setText("Nb Transports : "+NbTranspCom);
            texte17.setText("Prix : "+PrixTranspCom);
            texte1.setText("scores : "+compteur1);
        }
        if (ev.getSource()== button8)
        {
            if(PrixEnvNat <= compteur1)
            {
                compteur1 = compteur1 - NbEnvNat;
                NbEnvNat++;
                System.out.println("Vous avez planter un arbre");
                System.out.println("Il vous reste de l'argent");
            }
            if(PrixEnvNat > compteur1)
            {
                System.out.println("Aha! Vous avez même pas d'argent pour faire planter un Arbre");
                System.out.println("par un petit Népalais...");
                System.out.println("A plus !");
            }
            PrixEnvNat = 2*NbEnvNat + 156250;
            texte8.setText("Nb Projet Nat : "+NbEnvNat);
            texte18.setText("Prix : "+PrixEnvNat);
            texte1.setText("scores : "+compteur1);
        }
        if (ev.getSource()== button9)
        {
            if(PrixEnvPla <= compteur1)
            {
                compteur1 = compteur1 - PrixEnvPla;
                NbEnvPla++;
                System.out.println("Vous avez planter un arbre");
                System.out.println("Il vous reste de l'argent");
            }
            if(PrixEnvPla > compteur1)
            {
                System.out.println("Aha! Vous avez même pas d'argent pour faire planter un Arbre");
                System.out.println("par un petit Népalais...");
                System.out.println("A plus !");
            }
            PrixEnvPla = NbEnvPla*2 + 781250;
            texte9.setText("Nb Projet Planet : "+NbEnvPla);
            texte19.setText("Prix : "+PrixEnvPla);
            texte1.setText("scores : "+compteur1);
        }
        if (ev.getSource()== button10)
        {
            if(PrixRobotsOc <= compteur1)
            {
                compteur1 = compteur1 - PrixRobotsOc;
                NbRobotsOc++;
                System.out.println("Vous avez planter un arbre");
                System.out.println("Il vous reste de l'argent");
            }
            if(PrixRobotsOc > compteur1)
            {
                System.out.println("Aha! Vous avez même pas d'argent pour faire planter un Arbre");
                System.out.println("par un petit Népalais...");
                System.out.println("A plus !");
            }
            PrixRobotsOc = NbRobotsOc*2 + 3906250;
            texte10.setText("Nb Robots Oc : "+NbRobotsOc);
            texte20.setText("Prix : "+PrixRobotsOc);
            texte1.setText("scores : "+compteur1);
        }
        if (ev.getSource()== button11)
        {
            if(PrixRobotsEsp <= compteur1)
            {
                compteur1 = compteur1 - PrixRobotsEsp;
                NbRobotsEsp++;
                System.out.println("Vous avez planter un arbre");
                System.out.println("Il vous reste de l'argent");
            }
            if(PrixRobotsEsp > compteur1)
            {
                System.out.println("Aha! Vous avez même pas d'argent pour faire planter un Arbre");
                System.out.println("par un petit Népalais...");
                System.out.println("A plus !");
            }
            PrixRobotsEsp = 2*NbRobotsEsp + 19531250;
            texte11.setText("Nb Robots Espc : "+NbRobotsEsp);
            texte21.setText("Prix : "+PrixRobotsEsp);
            texte1.setText("scores : "+compteur1);
        }
    }
        
}  

