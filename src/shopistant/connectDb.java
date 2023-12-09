/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopistant;
import java.awt.HeadlessException;
import org.sqlite.*;
import java.sql.*;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import static javax.swing.JOptionPane.showMessageDialog;
/**
 *
 * @author 91995
 */
public class connectDb {
        public static Connection liteConnect(){
            try{
                Class.forName("org.sqlite.JDBC");
                Connection c = null;
                try {
                    c = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\91995\\Documents\\NetBeansProjects\\Shopistant\\Master.sqlite");
                } catch (SQLException ex) {
                    Logger.getLogger(connectDb.class.getName()).log(Level.SEVERE, null, ex);
                    showMessageDialog(null, String.valueOf(ex));
                }
//                showMessageDialog(null, "Connection established successfully!");
                return c;
            }catch(HeadlessException | ClassNotFoundException e){
                showMessageDialog(null, e);
                return null;
            }
        }
}
