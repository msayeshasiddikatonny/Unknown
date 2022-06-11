
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class NewClass {
     public static void main (String [] args) throws ClassNotFoundException, SQLException{
        String url="jdbc:mysql://127.0.0.1/shop";//jdbc:mysql://127.0.0.1/ this part will remain same
        String user="root";
        String password="";
      Class.forName("com.mysql.jdbc.Driver") ;
      Connection connection= (Connection) DriverManager.getConnection(url, user, password);
       
      String query ="SELECT name ,amountofsale from salesman";//mysql query
      Statement statement=connection.createStatement();
      ResultSet result;
      result=statement.executeQuery(query);
      while(result.next()){
          String n=result.getString("name");
          int a=result.getInt("amountofsale");
          System.out.println("NAME = "+n+", Amount_of_sale = "+a);
      }
      
      //String name=result.getString("name");//as we r looking 4  name we hv to wr8 col name
     // System.out.println(name);
      connection.close();
       statement.close();
    }
    
}
