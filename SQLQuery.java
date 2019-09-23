import java.sql.*;
public class SQLQuery {
    
    public SQLQuery() {
    }
    
    public  void queryStatement(Connection con) {
        try {
            Statement stmt = con.createStatement();
            String qryF = "select * from Fixtures";
            String qryP = "select * from Players";
            String qryT = "select * from Teams";
            ResultSet rsF = stmt.executeQuery(qryF);
            ResultSet rsP = stmt.executeQuery(qryP);
            ResultSet rsT = stmt.executeQuery(qryT);
        
            System.out.println("Results of a Statement Object Query");
            while( rsF.next()) { 
                System.out.print( rsF.getString(1));     
                System.out.print("    " + rsF.getString(2));          
                System.out.print("    " + rsF.getString(3));    
                System.out.print("    " + rsF.getString(4));
                System.out.print("    " + rsF.getString(5));
                System.out.print("    " + rsF.getString(6));
                System.out.println("");      
            }
            rsF.close();
            while( rsP.next()) { 
                System.out.print( rsP.getString(1));     
                System.out.print("    " + rsP.getString(2));          
                System.out.print("    " + rsP.getString(3));    
                System.out.print("    " + rsP.getString(4));
                System.out.print("    " + rsP.getString(5));
                System.out.println("");      
            }
            rsP.close();
            while( rsT.next()) { 
                System.out.print( rsT.getString(1));     
                System.out.print("    " + rsT.getString(2));          
                System.out.print("    " + rsT.getString(3));
                System.out.println("");      
            }
            rsT.close();
            stmt.close();
       }catch (Exception io) {
                System.out.println("error"+io);
       };   
  
     }
    
}
