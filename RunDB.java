import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class RunDB {
    public RunDB() {
    }
    
    public static void main(String[] args) {
        try {
	
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/DBassignment?user=root&password=BingoWasHisName0" );
        System.out.println ("Database connection established");
        Statement s = con.createStatement ();
        ResultSet rs = s.executeQuery ("SELECT * FROM Fixtures");
        while (rs.next ()) {
            String hometeam = rs.getString ("hometeam");
            System.out.println("Home team is : "+ hometeam);
        }
        
        System.out.print("\n\n\n");
        
        QueryFixtures f = new QueryFixtures();
        f.queryStatement(con);
        
        System.out.print("\n\n\n");
        
        QueryPlayers p = new QueryPlayers();
        p.queryStatement(con);
        
        System.out.print("\n\n\n");
        
        QueryTeams t = new QueryTeams();
        t.queryStatement(con);
        
        System.out.print("\n\n\n");
        
        InsertRecord ir = new InsertRecord();
        ir.insert(con);
        
        System.out.print("\n\n\n");
        p.queryStatement(con);
        
        UpdateRecord ur = new UpdateRecord();
        ur.update(con);
        
        System.out.print("\n\n\n");
        p.queryStatement(con);
        
        DeleteRecord dr = new DeleteRecord();
        dr.delete(con);
        
        System.out.print("\n\n\n");
        p.queryStatement(con);
        
        }catch (Exception ex) {
            System.out.println("SQLException: " + ex.getMessage());
            
        };
    
    }
    
}
