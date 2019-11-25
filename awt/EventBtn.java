import java.awt.*;

import java.awt.event.*;




/**
 * EventBtn
 */
public class EventBtn implements ActionListener {

    public Frame jf;
    public Button buton1,buton2;
    public Label label;


    EventBtn() {


        jf = new Frame("New Frame");
        buton1 = new Button("button1");
        button2 = new Button("button2");
        label = new Label("lab1");
        
        jf.add(jf);
        jf.add(button1);
        jf.add(button2);

        
        
      
    }

    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("yes")) {
            
        }
    }       

    public static void main(String[] args) {
        EventBtn eb = new EventBtn();
        
    }
}