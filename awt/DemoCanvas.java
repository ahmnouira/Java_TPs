import java.awt.*;

import java.awt.event.*;


class CreateCanvas extends Canvas {

    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(10, 10, 50, 50);

        g.setColor(Color.RED);
        g.fillRect(100, 100, 50, 50);


        g.setColor(Color.CYAN);
        g.draw3DRect(200, 200, 50, 50, true);
    }

}


/**
 * DemoCanvas
 */
public class DemoCanvas extends Frame {

    DemoCanvas(String s) {
        super(s);

        CreateCanvas cc = new CreateCanvas();
        add(cc);
    }  

    public static void main(String[] args) {
        

        DemoCanvas dc = new DemoCanvas("Demo Canvas");

        dc.setVisible(true);
        dc.setSize(360, 300);

        // close the window when clicking 'x'
        dc.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
               System.exit(0);
           }
        });
    }

    
}
