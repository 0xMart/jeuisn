/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.ins;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

/**
 *
 * @author malom
 */
public class notification extends JFrame 
{

 
       public notification () 
       {
               // nom de la notification
                String header = "Arbre :";
              //message a mettre dans la notification 
               String message = "pour planter un arbre il faut de l'argent"; 
              // parametre de la fenetre de notification 
                JFrame frame = new JFrame();
                frame.setSize(300,125);
                frame.setUndecorated(true);
             // pour positionner la nitification , le texte dessus et enlever la bordure 
                frame.setLayout(new GridBagLayout());
                GridBagConstraints constraints = new GridBagConstraints();
                constraints.gridx = 0;
                constraints.gridy = 0;
                constraints.weightx = 1.0f;
                constraints.weighty = 1.0f;
                constraints.insets = new Insets(5, 5, 5, 5);
                constraints.fill = GridBagConstraints.BOTH;
                JLabel headingLabel = new JLabel(header);
                frame.add(headingLabel, constraints);
                //place et taille de la croix
                constraints.gridx++;
                constraints.weightx = 0f;
                constraints.weighty = 0f;
                constraints.fill = GridBagConstraints.NONE;
                constraints.anchor = GridBagConstraints.NORTH;
                JButton cloesButton = new JButton("X");
                cloesButton.setMargin(new Insets(1, 4, 1, 4));
                cloesButton.setFocusable(false);
                cloesButton = new JButton(new AbstractActionImpl("X", frame));
                frame.add(cloesButton, constraints);
                //place et taille du message
                constraints.gridx = 0;
                constraints.gridy++;
                constraints.weightx = 1.0f;
                constraints.weighty = 1.0f;
                constraints.insets = new Insets(5, 5, 5, 5);
                constraints.fill = GridBagConstraints.BOTH;
                JLabel messageLabel = new JLabel("<HtMl>"+message);
                frame.add(messageLabel, constraints);
                frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                Dimension scrSize = Toolkit.getDefaultToolkit().getScreenSize();// taille de l'écran
                Insets toolHeight = Toolkit.getDefaultToolkit().getScreenInsets(frame.getGraphicsConfiguration());// hauteur de la barre des taches
                frame.setLocation(scrSize.width - frame.getWidth(), scrSize.height - toolHeight.bottom - frame.getHeight());
                frame.setVisible(true);
       
 //fermeture automatique au bout d'un certain temps      
new Thread()
{
      @Override
      public void run()
      {
           try
           {
                  Thread.sleep(5000); 
                  frame.dispose();
           }
            catch (InterruptedException e)
           {
                  e.printStackTrace();
           }
      };
}
.start();
        } 

    class AbstractActionImpl extends AbstractAction
    {

        private final JFrame frame;

        public AbstractActionImpl(String name, JFrame frame) 
        {
            super(name);
            this.frame = frame;
        }

        @Override
        public void actionPerformed(final ActionEvent e)
        {
            frame.dispose();
        }
    }
    
    
}
