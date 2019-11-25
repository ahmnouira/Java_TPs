
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class Drawlune extends JPanel  {

    public void paintComponent(Graphics g) {
        setBackground(Color.BLACK);
        g.setColor(Color.WHITE);
        g.fillOval(this.getWidth()/4, this.getHeight() / 4 ,  this.getWidth() / 2 ,  this.getHeight() / 2);
    }
    
    
}


class StateListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        System.out.println("getSource :  " + (JRadioButton)e.getSource());
        System.out.println("getActionC :" + e.getActionCommand()); // return the name of button
        System.out.println("getClass: " +  e.getClass());
    }

}


/**
 * SwingDemo
 */
public class SwingDemo extends JFrame {


    private JPanel top = new JPanel() ; 
    private JPanel container = new JPanel();


    public SwingDemo() {

        this.setTitle("Swing Demo");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        container.setLayout(new BorderLayout());
        setBackground(Color.BLACK);

        // create Radio Buttons 
        ButtonGroup bg = new ButtonGroup();
        JRadioButton lune = new JRadioButton("Lune");
        JRadioButton soleil = new JRadioButton("Soleil");
        JRadioButton croissant = new JRadioButton("Croisaant");

        lune.addActionListener(new StateListener());
        soleil.addActionListener(new StateListener());
        croissant.addActionListener(new StateListener());



        bg.add(lune);
        bg.add(soleil);
        bg.add(croissant);
        // add radioButtonst to top JPanle
        top.add(lune);
        top.add(soleil);
        top.add(croissant);

        // invoke Draw 


        // container.add(top, BorderLayout.NORTH);
        container.add(top, BorderLayout.NORTH);


        container.add(new Drawlune(), BorderLayout.CENTER);

        

        this.setContentPane(container);

        this.setVisible(true);
        
    }   

    public static void main(String[] args) {
        
        SwingDemo sd = new SwingDemo(); // without title
    
    }
}