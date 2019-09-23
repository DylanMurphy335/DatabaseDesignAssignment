/*
 * SQLQueryPrepared.java
 *
 * 
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author ingres
 */
public class SQLQueryPrepared {
    
    /** Creates a new instance of SQLQueryPrepared */
    public SQLQueryPrepared() {
    }
    
    public  void queryStatement(Connection con) {
        try {
            String query = "Select * From Players where fName = Rory and lName = Best";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setString(1,"RORY");
            pstmt.setString(2,"BEST");
           
            ResultSet rs = pstmt.executeQuery();
        
        
            System.out.println("Results of a PreparedStatement Object");
            while( rs.next()) { 
                System.out.print(rs.getString("fName"));     
                System.out.print("    " + rs.getString(2));          
                System.out.print("    " + rs.getString(3));
                System.out.print("    " + rs.getString(3));
                System.out.print("    " + rs.getString(3));        
                System.out.println("");      
            }
           rs.close();
           pstmt.close();
       }catch (Exception io) {
                System.out.println("error"+io);
       };   
  
     }//query
    
}
