import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class QueryFixtures {
	public  void queryStatement(Connection con) {
        try {
            Statement stmt = con.createStatement();
            String qryF = "select * from Fixtures";
            ResultSet rsF = stmt.executeQuery(qryF);
            System.out.println("Fixtures table");
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
            stmt.close();
       }catch (Exception io) {
                System.out.println("error"+io);
       };   
  
     }
}
