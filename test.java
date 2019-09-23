
public class test {
	static String f = "France";
	static String w = "Wales";
	static String s = "Scotland";
	static String i = "Italy";
	static String ir = "Ireland";
	static String e = "England";
	static String sdf = "Stade de France";
	static String bt = "BT Murrayfeild";
	static String a = "Aviva Stadium";
	static String st = "Stadio Olympico";
	static String tw = "Twickenham Stadium";
	static String p = "Pricipality Stadium";
	static String r1 = "Round 1";
	static String r2 = "Round 2";
	static String r3 = "Round 3";
	static String r4 = "Round 4";
	static String r5 = "Round 5";
	
	public static void print() {
		System.out.println("INSERT INTO Fixtures VALUES(\'" + f + "\', \'" + w + "\', 01/02/19, \'21:00\', \'" + sdf + "\', \'" + r1 + "\');");
		System.out.println("INSERT INTO Fixtures VALUES(\'" + s + "\', \'" + i + "\', 02/02/19, \'14:15\', \'" + bt + "\', \'" + r1 + "\');");
		System.out.println("INSERT INTO Fixtures VALUES(\'" + ir + "\', \'" + e + "\', 02/02/19, \'16:45\', \'" + a + "\', \'" + r1 + "\');");
		System.out.println("INSERT INTO Fixtures VALUES(\'" + s + "\', \'" + ir + "\', 09/02/19, \'14:15\', \'" + bt + "\', \'" + r2 + "\');");
		System.out.println("INSERT INTO Fixtures VALUES(\'" + i + "\', \'" + w + "\', 09/02/19, \'17:45\', \'" + st + "\', \'" + r2 + "\');");
		System.out.println("INSERT INTO Fixtures VALUES(\'" + e + "\', \'" + f + "\', 10/02/19, \'15:00\', \'" + tw + "\', \'" + r2 + "\');");
		System.out.println("INSERT INTO Fixtures VALUES(\'" + f + "\', \'" + s + "\', 23/02/19, \'15:15\', \'" + sdf + "\', \'" + r3 + "\');");
		System.out.println("INSERT INTO Fixtures VALUES(\'" + w + "\', \'" + e + "\', 23/02/19, \'16:45\', \'" + p + "\', \'" + r3 + "\');");
		System.out.println("INSERT INTO Fixtures VALUES(\'" + i + "\', \'" + ir + "\', 24/02/19, \'16:00\', \'" + st + "\', \'" + r3 + "\');");
		System.out.println("INSERT INTO Fixtures VALUES(\'" + s + "\', \'" + w + "\', 09/03/19, \'14:15\', \'" + bt + "\', \'" + r4 + "\');");
		System.out.println("INSERT INTO Fixtures VALUES(\'" + e + "\', \'" + i + "\', 09/03/19, \'16:45\', \'" + tw + "\', \'" + r4 + "\');");
		System.out.println("INSERT INTO Fixtures VALUES(\'" + ir + "\', \'" + f + "\', 10/03/19, \'15:00\', \'" + a + "\', \'" + r4 + "\');");
		System.out.println("INSERT INTO Fixtures VALUES(\'" + i + "\', \'" + f + "\', 16/03/19, \'13:30\', \'" + st + "\', \'" + r5 + "\');");
		System.out.println("INSERT INTO Fixtures VALUES(\'" + w + "\', \'" + ir + "\', 16/03/19, \'14:45\', \'" + p + "\', \'" + r5 + "\');");
		System.out.println("INSERT INTO Fixtures VALUES(\'" + e + "\', \'" + s + "\', 16/03/19, \'17:00\', \'" + tw + "\', \'" + r5 + "\');");
	}
	
	public static void main(String[] args) {
		print();
		
		
	}

}
