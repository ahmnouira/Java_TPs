import java.awt.*;
import java.awt.event.*;



/**
 * ExempleForm
 */
public class Form extends Frame {

    private Panel tfPanel;
    private Panel chPanel;
    private Panel lstPanel;
    private Panel cbPanel;
    private Panel rbPanel;
    private Panel btPanel;

    Form(String s) {
        super(s);

        tfPanel = new Panel();
        chPanel = new Panel();
        lstPanel = new Panel();
        cbPanel = new Panel();
        rbPanel = new Panel();
        btPanel = new Panel();
        MenuBar mb = new MenuBar();
        
        Menu ml = new Menu("Langues");
        mb.add(ml);

        //set the menu Bar
        setMenuBar(mb);
        setLayout(new FlowLayout());
        tfPanel.add(new Label("TextField"));
        tfPanel.add(new TextField(8));

        chPanel.add(new Label("Choice"));
        Choice c = new Choice();
        c.add("Soloris");
        c.add("Linux");
        c.add("Aix");
        chPanel.add(c);

        // list 
        lstPanel.add(new Label("List"));
        List l = new List();
        l.add("Soloris");
        l.add("Linux");
        l.add("Aix");
        lstPanel.add(l);

        // checkBox
        cbPanel.add(new Checkbox("Soloris"));
        cbPanel.add(new Checkbox("Linux"));
        cbPanel.add(new Checkbox("Aix"));


        //radioBox
        CheckboxGroup cbg = new CheckboxGroup();
        rbPanel.add(new Checkbox("Soloris", false,  cbg));
        rbPanel.add(new Checkbox("Linux", false, cbg));
        rbPanel.add(new Checkbox("Aix", false, cbg));

        // buttons
        btPanel.add(new Button("Ok"));
        btPanel.add(new Button("Cancel"));

        add(tfPanel);
        add(chPanel);
        add(lstPanel);
        add(cbPanel);
        add(rbPanel);
        add(btPanel);

    }


    public static void main(String[] args) {

        Form ef = new Form("Exemple From");
        ef.setVisible(true);
        ef.setSize(200, 400);
        
        // close the window when clicking 'x'
        ef.addWindowListener(new WindowAdapter(){
             public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
         });
    }
}