import java.awt.*;
import java.awt.event.*;
/**
 * Convertisor
 * @author "Ahmed Nouira"
 * @version "1.0.0"
 * @see "https://github.com/ahmnouira/Java_TPs/tree/master/awt/Convertisor"
 * 
 */
public class Convertisor extends Frame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Panel content = new Panel();
    private Panel submit = new Panel();

     Convertisor() {

        this.setTitle("Convertisor");
        this.setSize(200, 90);
        this.setLayout(new BorderLayout());
        this.setBackground(new Color(52, 73, 94));

        Panel r1 = new Panel();
        Panel r2 = new Panel();
        r1.setLayout(new GridLayout(1,2));
        r2.setLayout(new GridLayout(1,2));

        r1.add(new TextField("0", 8));
         // Choice list 
         Choice c = new Choice();
         c.add("Dinar");
         c.add("Euro");
         c.add("Dollar");
         r1.add(c);
         r2.add(new Label(""));
         // list 
         Choice c2 = new Choice();
         c2.add("Dinar");
         c2.add("Euro");
         c2.add("Dollar");
         r2.add(c2);

         submit.setLayout(new GridLayout(1,2));

         Button ok = new Button("Convert");

         TextField result = new TextField(8);

        ok.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // get action value from textField
                TextField tf = (TextField) r1.getComponent(0);
                System.out.println("input value: " + tf.getText());
                // get value from Choice 
                String from = c.getSelectedItem();
                String to = c2.getSelectedItem();
                String result_  = "";
                if( from == "Dinar" && to == "Dinar") {
                    result_ = tf.getText();
                    System.out.println(result_);
                    result.setText(result_ + " dt");
                }
                if(from == "Dinar" &&  to == "Euro") {
                    Double totale = Double.parseDouble(tf.getText()) * 0.32;
                    result.setText(totale.toString() + " €"); 
                }
                if(from == "Dinar" &&  to == "Dollar") {
                    Double totale = Double.parseDouble(tf.getText()) * 0.35;
                    result.setText(totale.toString() + "$"); 
                }
                // from "Euro" 
                if( from == "Euro" && to == "Dinar") {
                    Double totale = Double.parseDouble(tf.getText()) * 0.32;
                    result.setText(totale.toString() + " dt"); 
                }
                if(from == "Euro" &&  to == "Euro") {
                    result_ = tf.getText();
                    System.out.println(result_);
                    result.setText(result_ + " €");
                }
                if(from == "Euro" &&  to == "Dollar") {
                    Double totale = Double.parseDouble(tf.getText())  * 1.1;
                    result.setText(totale.toString() + "$"); 
                }
                 // from "Dollar" 
                 if( from == "Dollar" && to == "Dinar") {

                    Double totale = Double.parseDouble(tf.getText()) * 0.35;
                    result.setText(totale.toString() + " dt"); 

                }
                if(from == "Dollar" &&  to == "Euro") {
                   
                    Double totale = Double.parseDouble(tf.getText()) / 1.1;
                    result.setText(totale.toString() + "€"); 

                }
                if(from == "Dollar" &&  to == "Dollar") {
                    
                    result.setText(tf.getText() + "$"); 
                }                           
        }
    }); 
       
        content.setLayout(new BorderLayout());
        submit.add(ok);
        submit.add(result);
        content.add(r1,  BorderLayout.NORTH);
        content.add(r2,  BorderLayout.SOUTH);
        this.add(content,BorderLayout.NORTH );
        this.add(submit,BorderLayout.SOUTH);
        this.setVisible(true);
}
    public static void main(String[] args) {
        Convertisor convertisor = new Convertisor();
            // close the window when clicking 'x'
                convertisor.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e) {
                   System.exit(0);
               }
            });
    }
}