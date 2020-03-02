 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gaara
 */
public class ConnectDAO {
     public static Connection getSQLServerConnection()
     {
         Connection connection = null;
         try {
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
             String url = "jdbc:sqlserver://localhost:1433;databaseName=QLTHUVIEN";
             String user = "sa";
             String pass = "sa";
             connection = DriverManager.getConnection(url , user, pass);
         } catch (Exception e) {
             e.printStackTrace();
         }
         return connection;
     }    
     
     public static void closeConnection(Connection con)  
     {
         if (con!= null){
             try {
                 con.close();
             } catch (SQLException e) {
                 e.printStackTrace();
             }
         }             
     }
     
     public static void main(String[] args)
     {
         System.out.println(getSQLServerConnection());
     }
   
}
