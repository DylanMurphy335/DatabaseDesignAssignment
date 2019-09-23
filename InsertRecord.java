import java.sql.*;
public class InsertRecord {
    public InsertRecord() {
    }
    
     public  void insert(Connection con) {
        try {
            Statement insertStmt = con.createStatement();
            String insertSQL = " Insert into Players values ('Dylan', 'Murphy', 'Prop', 'Ireland', 0)";
            int res = insertStmt.executeUpdate(insertSQL);
            System.out.println("The Number or records inserted is " +res);
            insertStmt.close();
       }catch (Exception io) {
                System.out.println("error"+io);
       };   
  
     }
}
