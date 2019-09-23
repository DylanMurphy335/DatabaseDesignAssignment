import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DropTable {
	public void Drop(Connection con) {
	    String DropF = "DROP TABLE Fixtures;";
	    String DropP = "DROP TABLE Players;"; 
	    String DropT = "DROP TABLE Teams;";  
	    
	    try {
	        Statement s = con.createStatement();
	        s.executeUpdate(DropF);
	        s.executeUpdate(DropP);
	        s.executeUpdate(DropT);
	        System.out.println("Tables Dropped");
	    }
	    catch (SQLException e ) {
	        System.out.println("An error has occured on Table Dropping");
	        e.printStackTrace();
	    }
	}
}