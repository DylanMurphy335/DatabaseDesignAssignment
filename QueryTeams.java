import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class QueryTeams {
	public  void queryStatement(Connection con) {
        try {
            Statement stmt = con.createStatement();
            String qryT = "select * from Teams";
            ResultSet rsT = stmt.executeQuery(qryT);
            System.out.println("Team tables");
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
