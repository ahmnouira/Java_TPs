/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TP_JDBC {

        // Les parametres de la connection
        public String url="jdbc:mysql://localhost:3306/db1?useSSL=false";
        public String login ="bobL";
        public String pwd ="secret";
 
    public void Read(){  
     
        try {
            // chargement du driver
            Class.forName("com.mysql.jdbc.Driver");
            //Se connecter au SGBD et BD
            Connection conn = DriverManager.getConnection(url,login,pwd);

            // preparer le statement
            Statement St = conn.createStatement();

            // Creation de la requete
            String requete= "select * from db1.PERS;";
           //Execution de la requete SELECT
            ResultSet rs= St.executeQuery(requete);
            System.out.println("\n*** SELECT ***");
            while (rs.next()){
                System.out.println("id: "+ rs.getInt(1));
                System.out.println("Login: "+ rs.getString(2));
                System.out.println("Pwd: "+ rs.getString(3));
            }
            
            //Fermeture de la connection
            conn.close();

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TP_JDBC.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(TP_JDBC.class.getName()).log(Level.SEVERE, null, ex);
            }        
    }


    public void Insert(String login_, String pwd_) {
        try {
            
            // load driver
            Class.forName("com.mysql.jdbc.Driver");
            // connect to DB
            Connection conn = DriverManager.getConnection(url, login, pwd);
            // prepare statement 
            Statement stInsert = conn.createStatement();
            String insertSQL = "INSERT INTO PERS(login, pwd) VALUES ('"+login_+"', '"+pwd_+"');";
            // excute 
            stInsert.executeUpdate(insertSQL);    // executeUpdate return int
            System.out.println("\n***INSERT****");
             //Fermeture de la connection
             conn.close();

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TP_JDBC.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(TP_JDBC.class.getName()).log(Level.SEVERE, null, ex);
            }        
    }


    public void Delete(int id){  

        
        try {
            // chargement du driver
            Class.forName("com.mysql.jdbc.Driver");
            //Se connecter au SGBD et BD
            Connection conn = DriverManager.getConnection(url,login,pwd);

            // preparer le statement
            Statement St = conn.createStatement();

            // Creation de la requete
            String requete= "DELETE FROM PERS WHERE id="+id+";";
           //Execution de la requete DELETE
            St.executeUpdate(requete);
            System.out.println("\n*** DELETE ***");
            //Fermeture de la connection
            conn.close();

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TP_JDBC.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(TP_JDBC.class.getName()).log(Level.SEVERE, null, ex);
            }        
    }



    // https://stackoverflow.com/questions/965690/java-optional-parameters
    public void Update(int id, String login_, String pwd_){  

        
        try {
            // chargement du driver
            Class.forName("com.mysql.jdbc.Driver");
            //Se connecter au SGBD et BD
            Connection conn = DriverManager.getConnection(url,login,pwd);

            // preparer le statement
            Statement St = conn.createStatement();

            // Creation de la requete
            String requete= "UPDATE PERS SET login='"+login_+"', pwd='"+pwd_+"' WHERE id=3;";
           //Execution de la requete UPDATE
            St.executeUpdate(requete);
            System.out.println("\n*** UPDATE ***");
            //Fermeture de la connection
            conn.close();

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TP_JDBC.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(TP_JDBC.class.getName()).log(Level.SEVERE, null, ex);
            }        
    }

  
    public static void main(String[] args)  {
        // Select form Databse
        new TP_JDBC().Read();

        new TP_JDBC().Insert("Nahla", "123456789");

        new TP_JDBC().Delete(1);


        
        
        }
    
    
}
