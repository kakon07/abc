import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class My_SQLCon {

	public static void main(String[] args) {

		try{ 
			Connection con = DriverManager.getConnection(
			//"host or url/DataBaseName","userName","Password");
					"jdbc:mysql://localhost", "root","root");
			
			String query = "SELECT * FROM world.city";
			Statement stmt = con.createStatement();  
			ResultSet rs=stmt.executeQuery(query);  
			while(rs.next())  {
				System.out.println("Name : " + rs.getString("Name"));
			}
			 
			}catch(Exception e){ 
				System.out.println(e);}  
			}  

	}


