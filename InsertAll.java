import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertAll {
	public void Insert(Connection con) {
	    String Fixtures = "INSERT INTO Fixtures VALUES('France', 'Wales', '01/02/2019', '21:00', 'Stade de France', 'Round 1');\n" + 
	    		"INSERT INTO Fixtures VALUES('Scotland', 'Italy', '02/02/2019', '14:15', 'BT Murrayfeild', 'Round 1');\n" + 
	    		"INSERT INTO Fixtures VALUES('Ireland', 'England', '02/02/2019', '16:45', 'Aviva Stadium', 'Round 1');\n" + 
	    		"INSERT INTO Fixtures VALUES('Scotland', 'Ireland', '09/02/2019', '14:15', 'BT Murrayfeild', 'Round 2');\n" + 
	    		"INSERT INTO Fixtures VALUES('Italy', 'Wales', '09/02/2019', '17:45', 'Stadio Olympico', 'Round 2');\n" + 
	    		"INSERT INTO Fixtures VALUES('England', 'France', '10/02/2019', '15:00', 'Twickenham Stadium', 'Round 2');\n" + 
	    		"INSERT INTO Fixtures VALUES('France', 'Scotland', '23/02/2019', '15:15', 'Stade de France', 'Round 3');\n" + 
	    		"INSERT INTO Fixtures VALUES('Wales', 'England', '23/02/2019', '16:45', 'Pricipality Stadium', 'Round 3');\n" + 
	    		"INSERT INTO Fixtures VALUES('Italy', 'Ireland', '24/02/2019', '16:00', 'Stadio Olympico', 'Round 3');\n" + 
	    		"INSERT INTO Fixtures VALUES('Scotland', 'Wales', '09/03/2019', '14:15', 'BT Murrayfeild', 'Round 4');\n" + 
	    		"INSERT INTO Fixtures VALUES('England', 'Italy', '09/03/2019', '16:45', 'Twickenham Stadium', 'Round 4');\n" + 
	    		"INSERT INTO Fixtures VALUES('Ireland', 'France', '10/03/2019', '15:00', 'Aviva Stadium', 'Round 4');\n" + 
	    		"INSERT INTO Fixtures VALUES('Italy', 'France', '16/03/2019', '13:30', 'Stadio Olympico', 'Round 5');\n" + 
	    		"INSERT INTO Fixtures VALUES('Wales', 'Ireland', '16/03/2019', '14:45', 'Pricipality Stadium', 'Round 5');\n" + 
	    		"INSERT INTO Fixtures VALUES('England', 'Scotland', '16/03/2019', '17:00', 'Twickenham Stadium', 'Round 5');\n" + 
	    		"";  
	    
	    String Players = "INSERT INTO Players VALUES('Rory', 'Best', 'Hooker', 'Ireland', 112);\n" + 
	    		"INSERT INTO Players VALUES('Cian', 'Healy', 'Prop', 'Ireland', 82);\n" + 
	    		"INSERT INTO Players VALUES('Jack', 'McGrath', 'Prop', 'Ireland', 52);\n" + 
	    		"INSERT INTO Players VALUES('Devin', 'Toner', 'Lock', 'Ireland', 62);\n" + 
	    		"INSERT INTO Players VALUES('CJ', 'Stander', 'number 8', 'Ireland', 27);\n" + 
	    		"INSERT INTO Players VALUES('Johnathan', 'Sexton', 'Fly-half', 'Ireland', 77);\n" + 
	    		"INSERT INTO Players VALUES('Garry', 'Ringrose', 'Centre', 'Ireland', 15);\n" + 
	    		"INSERT INTO Players VALUES('Keith', 'Earls', 'Wing', 'Ireland', 71);\n" + 
	    		"INSERT INTO Players VALUES('Rob', 'Kearney', 'Fullback', 'Ireland', 86);\n" + 
	    		"\n" + 
	    		"INSERT INTO Players VALUES('Guilhem', 'Guirado', 'Hooker', 'France', 62);\n" + 
	    		"INSERT INTO Players VALUES('Rabah', 'Slimani', 'Peop', 'France', 49);\n" + 
	    		"INSERT INTO Players VALUES('Yoann', 'Maestri', 'Lock', 'France', 64);\n" + 
	    		"INSERT INTO Players VALUES('Louis', 'Picamoles', 'Back row', 'France', 71);\n" + 
	    		"INSERT INTO Players VALUES('Baptiste', 'Serin', 'Scrum-half', 'France', 22);\n" + 
	    		"INSERT INTO Players VALUES('Mathieu', 'Bastareaud', 'Centre', 'France', 49);\n" + 
	    		"INSERT INTO Players VALUES('Yoann', 'Huget', 'Wing', 'France', 52);\n" + 
	    		"INSERT INTO Players VALUES('Maxime', 'Médard', 'Fullback', 'France', 52);\n" + 
	    		"\n" + 
	    		"INSERT INTO Players VALUES('Dylan', 'Hartley', 'Hooker', 'England', 95);\n" + 
	    		"INSERT INTO Players VALUES('Courtney', 'Lawes', 'Lock', 'England', 66);\n" + 
	    		"INSERT INTO Players VALUES('Ben', 'Morgan', 'Number 8', 'England', 31);\n" + 
	    		"INSERT INTO Players VALUES('Danny', 'Care', 'Scrum-half', 'England', 83);\n" + 
	    		"INSERT INTO Players VALUES('George', 'Ford', 'Fly-half', 'England', 49);\n" + 
	    		"INSERT INTO Players VALUES('Owen', 'Farrell', 'Centre', 'England', 63);\n" + 
	    		"INSERT INTO Players VALUES('Mike', 'Brown', 'Fullback', 'England', 72);\n" + 
	    		"\n" + 
	    		"INSERT INTO Players VALUES('Ken', 'Owens', 'Hooker', 'Wales', 59);\n" + 
	    		"INSERT INTO Players VALUES('Rob', 'Evans', 'Prop', 'Wales', 30); \n" + 
	    		"INSERT INTO Players VALUES('Alun', 'Wyn Jones', 'Lock', 'Wales', 119);\n" + 
	    		"INSERT INTO Players VALUES('Dan', 'Lydiate', 'Back row', 'Wales', 64);\n" + 
	    		"INSERT INTO Players VALUES('Dan', 'Biggar', 'Fly-half', 'Wales', 64);\n" + 
	    		"INSERT INTO Players VALUES('Jonathan', 'Davies', 'Centre', 'Wales', 67);\n" + 
	    		"INSERT INTO Players VALUES('George', 'North', 'Wing', 'Wales', 78);\n" + 
	    		"INSERT INTO Players VALUES('Leigh', 'Halfpenny', 'Fullback', 'Wales', 80);\n" + 
	    		"\n" + 
	    		"INSERT INTO Players VALUES('Ross', 'Ford', 'Hooker', 'Scotland', 110);\n" + 
	    		"INSERT INTO Players VALUES('Gordon', 'Reid', 'Prop', 'Scotland', 32);\n" + 
	    		"INSERT INTO Players VALUES('Jonny', 'Gray', 'Lock', 'Scotland', 45);\n" + 
	    		"INSERT INTO Players VALUES('David', 'Denton', 'Back row', 'Scotland', 42);\n" + 
	    		"INSERT INTO Players VALUES('Greig', 'Laidlaw', 'Scrum-half', 'Scotland', 64);\n" + 
	    		"INSERT INTO Players VALUES('Finn', 'Russell', 'Fly-half', 'Scotland', 38);\n" + 
	    		"INSERT INTO Players VALUES('Tommy', 'Seymour', 'Wing', 'Scotland', 45);\n" + 
	    		"INSERT INTO Players VALUES('Stuart', 'Hogg', 'Fullback', 'Scotland', 63);\n" + 
	    		" \n" + 
	    		"INSERT INTO Players VALUES('Leonardo', 'Ghiraldini', 'Hooker', 'Italy', 97);\n" + 
	    		"INSERT INTO Players VALUES('Andrea', 'Lovotti', 'Prop', 'Italy', 28);\n" + 
	    		"INSERT INTO Players VALUES('Alessandro', 'Zanni', 'Lock', 'Italy', 107);\n" + 
	    		"INSERT INTO Players VALUES('Sergio', 'Parisse', 'Number 8', 'Italy', 134);\n" + 
	    		"INSERT INTO Players VALUES('Tito', 'Tebaldi', 'Scrum-half', 'Italy', 27);\n" + 
	    		"INSERT INTO Players VALUES('Tommaso', 'Allan', 'Fly-half', 'Italy', 41);\n" + 
	    		"INSERT INTO Players VALUES('Michele', 'Campagnaro', 'Centre', 'Italy', 36);\n" + 
	    		"INSERT INTO Players VALUES('Tommaso', 'Benvenuti', 'Wing', 'Italy', 53);";
	    
	    String Teams = "INSERT INTO Teams VALUES('Ireland', 'Aviva Stadium', 0);\n" + 
	    		"INSERT INTO Teams VALUES('Italy', 'Stadio Olympico', 0);\n" + 
	    		"INSERT INTO Teams VALUES('England', 'Twickenham Stadium', 0);\n" + 
	    		"INSERT INTO Teams VALUES('Scotland', 'BT Murrayfeild', 0);\n" + 
	    		"INSERT INTO Teams VALUES('France', 'Stade de France', 0);\n" + 
	    		"INSERT INTO Teams VALUES('Wales', 'Pricipality Stadium', 0);";
	    try {
	        Statement s = con.createStatement();
	        s.executeUpdate(Fixtures);
	        s.executeUpdate(Players);
	        s.executeUpdate(Teams);
	        System.out.println("Tables now have data");
	    }
	    catch (SQLException e ) {
	        System.out.println("An error has occured on data insertion");
	        e.printStackTrace();
	    }
	}
}
