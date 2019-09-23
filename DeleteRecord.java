import java.sql.*;
public class DeleteRecord {
    
    public DeleteRecord() {
    }
    
     public  void delete(Connection con) {
        try {
            Statement deleteStmt = con.createStatement();
            String deleteSQL = " Delete from Players where fName ='Dylan' and lName = 'Murphy'";
            int res = deleteStmt.executeUpdate(deleteSQL);
            System.out.println("The Number or records deleted is " +res);
            deleteStmt.close();
       }catch (Exception io) {
                System.out.println("error"+io);
       };   
  
     }
    
}
