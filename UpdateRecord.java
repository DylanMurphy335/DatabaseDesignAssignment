import java.sql.*;
public class UpdateRecord {
    
    public UpdateRecord() {
    }
    
    
     public  void update(Connection con) {
        try {
            Statement updateStmt = con.createStatement();
            String updateSQL = " Update Players set caps = 1 where fname ='Dylan' and lName = 'Murphy'";
            int res = updateStmt.executeUpdate(updateSQL);
            System.out.println("The Number or records updated is " +res);
            updateStmt.close();
       }catch (Exception io) {
                System.out.println("error"+io);
       };   
  
     }
    
}
