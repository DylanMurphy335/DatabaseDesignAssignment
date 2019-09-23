import java.sql.*;
public class CreateTable {
	public void Create(Connection con) {
	    String Fixtures = "CREATE TABLE Fixtures\n" + 
	    		"\n" + 
	    		"             (hometeam  VARCHAR(8),\n" + 
	    		"              awayteam	VARCHAR(8),\n" + 
	    		"              gamedate	VARCHAR(10),\n" + 
	    		"			  gametime  VARCHAR(5),\n" + 
	    		"			  stadium  VARCHAR(19),\n" + 
	    		"              round  VARCHAR(7),\n" + 
	    		"PRIMARY KEY (hometeam, awayteam, round));";  
	    
	    String Players = "CREATE TABLE Players\n" + 
	    		"\n" + 
	    		"             (fName	VARCHAR(12),\n" + 
	    		"			  lName	VARCHAR(12),\n" + 
	    		"              position	VARCHAR(25),\n" + 
	    		"              countryPlayedFor	VARCHAR(8),\n" + 
	    		"              caps VARCHAR(3),\n" + 
	    		"PRIMARY KEY (fname,lname,countryPlayedFor),\n" + 
	    		"FOREIGN KEY (countryPlayedFor) REFERENCES Teams(country));";
	    
	    String Teams = "CREATE TABLE Teams\n" + 
	    		"\n" + 
	    		"             (country   VARCHAR(8),\n" + 
	    		"	      stadium	VARCHAR(30),\n" + 
	    		"	      gamesPlayed	VARCHAR(1),\n" + 
	    		"PRIMARY KEY (country));";
	    try {
	        Statement s = con.createStatement();
	        s.executeUpdate(Fixtures);
	        s.executeUpdate(Players);
	        s.executeUpdate(Teams);
	        System.out.println("Tables Created");
	    }
	    catch (SQLException e ) {
	        System.out.println("An error has occured on Table Creation");
	        e.printStackTrace();
	    }
	}
}
