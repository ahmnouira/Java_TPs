import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/** 
 * @author "Ahmed Nouira"
 * @version "1.0.0"
 * @see "https://github.com/ahmnouira/Java_TPs/tree/master/awt/Caculator"
 */
public class Caculator  extends Frame {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    // Les parametres de la connection
    private String url="jdbc:mysql://localhost:3306/Calculator?useSSL=false";
    private String login ="bobL";
    private String pwd ="secret";
    private Panel inputPanel = new Panel();
    private Panel keysPanel = new Panel();
    private Panel opsPanel = new Panel();
    private Panel validation = new Panel();
    private  String operation = ""; 

    Caculator() {
        this.setTitle("Caculator");
        this.setSize(300, 300);
        this.setLayout(new BorderLayout());
        this.setBackground(new Color(212, 212, 212));
        // keys Btns 
        Button [][] keysBtns = new Button[][] {

            { new Button("7"), new Button("8"), new Button("9") },
            { new Button("6"), new Button("5"), new Button("4") },
            { new Button("3"), new Button("2"), new Button("1") },
            { new Button("0"), new Button("All Ops ?"), new Button("ClearAll") } 
        };

        //declare opsBtn
        Button[][] opsBtns = new Button [][] {
                    { new Button("+") },
                    { new Button("-") },
                    { new Button("*") },
                    { new Button("/") },
        };

        // inputPanel
        inputPanel.setLayout(new BorderLayout());
        // "0" value by default 
        inputPanel.add(new TextField(operation), BorderLayout.NORTH);

        // set keysButtons 
        keysPanel.setLayout(new GridLayout(4, 3));
        for(int row = 0; row < 4; row ++ ) {
            for(int col = 0; col < 3; col ++) {
                keysBtns[row][col].addActionListener(new ActionListener(){
                   public void actionPerformed(ActionEvent e) {
                        // get action value from button
                        TextField tf = (TextField) inputPanel.getComponent(0);
                        operation += e.getActionCommand();
                        if(e.getActionCommand().equals("ClearAll")) {
                            operation="";
                        }
                        if(e.getActionCommand().equals("All Ops ?")) {
                            // display log
                            operation = "See Your Terminal/CMD";
                            Read();
                        }
                        // System.out.println(e.getActionCommand());
                        tf.setText(operation);
                    }
                });

                keysBtns[row][col].setForeground(Color.BLUE); 
                // set ClearAll btn to rose Color
                if(keysBtns[row][col].getLabel().equals("ClearAll")) {
                    keysBtns[row][col].setForeground(new Color(255, 170, 170)); // light rose
                }

                keysPanel.add(keysBtns[row][col]);
             }
        }

        opsPanel.setLayout(new GridLayout(4,1)); 
        for(int row = 0; row < 4; row ++ ) {
            opsBtns[row][0].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                   // get action value from button
                   TextField tf = (TextField) inputPanel.getComponent(0);
                   operation += e.getActionCommand();
                    // System.out.println(e.getActionCommand());
                   tf.setText(operation);
                }}); 
            
            opsBtns[row][0].setForeground(Color.RED); 
            opsPanel.add(opsBtns[row][0]);
        }
        
        // validation button
        validation.setLayout(new BorderLayout());
        Button Enter = new Button("Enter");
        Enter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // get action value from button
                TextField tf = (TextField) inputPanel.getComponent(0);
                if(e.getActionCommand().equals("Enter")) {
                    // System.out.println("operation before :" + operation);
                    tf.setText(calule(operation));
                } 
                // System.out.println(e.getActionCommand());
                operation = "";
            }
        });
        validation.setForeground(Color.GREEN);
        validation.add(Enter, BorderLayout.SOUTH);
        // add all Panel to Layout
        this.add(inputPanel, BorderLayout.NORTH);
        this.add(keysPanel, BorderLayout.CENTER);
        this.add(opsPanel, BorderLayout.EAST);
        this.add(validation, BorderLayout.SOUTH);
        this.setVisible(true);

    }
    public String calule(String ops) {
        // .slpit() : https://stackoverflow.com/questions/3481828/how-to-split-a-string-in-java
   
       String[] operatinsArray; 
       Double res = 0.;
       for(int i= 0; i < ops.length(); ) {
     
        if (ops.contains("+")) {
            operatinsArray  =  ops.split("[+]");
            for (String n : operatinsArray) {
                 // System.out.println("res: " +  res);
                res += Double.parseDouble(n);
            }
            Insert(operatinsArray[0].toString(), '+',  operatinsArray[1].toString(), res.toString());
            return res.toString();

        } else if (ops.contains("-")) {
            operatinsArray  = ops.split("[-]");
            res =  Double.parseDouble(operatinsArray[0]) - Double.parseDouble(operatinsArray[1]);
            Insert(operatinsArray[0], '-', operatinsArray[1], res.toString());
            return res.toString();
        } else if (ops.contains("*")) {
            operatinsArray = ops.split("[*]");
            res =  Double.parseDouble(operatinsArray[0]) * Double.parseDouble(operatinsArray[1]);
            Insert(operatinsArray[0], '*', operatinsArray[1], res.toString());
            return res.toString();
        } else if (ops.contains("/")) {
            operatinsArray = ops.split("/");
            res =  Double.parseDouble(operatinsArray[0]) / Double.parseDouble(operatinsArray[1]);
            Insert(operatinsArray[0], '/', operatinsArray[1], res.toString());
            return res.toString();
        }
       return "I Cant do that SORRY !";
    }
    return "Error";
}   

public void Insert(String firstEl, Character opt, String secondEl, String result) {
    try {
        
        // load driver
        Class.forName("com.mysql.jdbc.Driver");
        // connect to DB
        Connection conn = DriverManager.getConnection(url, login, pwd);
        // prepare statement 
        Statement stInsert = conn.createStatement();
        String insertSQL = "INSERT INTO operations(firstEl, opt, secondEl, result) VALUES ('"+firstEl+"','"+opt+"','"+secondEl+"','"+result+"');";
        // excute 
        stInsert.executeUpdate(insertSQL);    // executeUpdate return int
         //Fermeture de la connection
         conn.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Caculator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Caculator.class.getName()).log(Level.SEVERE, null, ex);
        }        
}

    public void Read(){  
     
    try {
        // chargement du driver
        Class.forName("com.mysql.jdbc.Driver");
        //Se connecter au SGBD et BD
        Connection conn = DriverManager.getConnection(url,login,pwd);

        // preparer le statement
        Statement St = conn.createStatement();

        // Creation de la requete
        String requete= "SELECT * FROM Calculator.operations;";
       //Execution de la requete SELECT
        ResultSet rs= St.executeQuery(requete);
        System.out.println("\n*** ALL Ops ? ***");
        System.out.println("***firstEl***operation***secondEl***result***datetime***");
        while (rs.next()){
            System.out.println("     " + rs.getString(2) +  "          "  + rs.getString(3) + "          " + rs.getString(4) + "          " + rs.getString(5)  +"    "+ rs.getString(6));
        }
        //Fermeture de la connection
        conn.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Caculator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Caculator.class.getName()).log(Level.SEVERE, null, ex);
        }        
}
    public static void main(String[] args) {
       Caculator caculator = new Caculator();

        // close the window when clicking 'x'
        caculator.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
               System.exit(0);
           }
        });

    }
}
