import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class QueryPlayers {
	public  void queryStatement(Connection con) {
        try {
            Statement stmt = con.createStatement();
            String qryP = "select * from Players";
            ResultSet rsP = stmt.executeQuery(qryP);
            System.out.println("Players table");
            while( rsP.next()) { 
                System.out.print( rsP.getString(1));     
                System.out.print("    " + rsP.getString(2));          
                System.out.print("    " + rsP.getString(3));    
                System.out.print("    " + rsP.getString(4));
                System.out.print("    " + rsP.getString(5));
                System.out.println("");      
            }
            rsP.close();
            stmt.close();
       }catch (Exception io) {
                System.out.println("error"+io);
       };   
  
     }
}
