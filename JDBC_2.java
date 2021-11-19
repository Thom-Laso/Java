import java.sql.*;


public class JDBC_2
{
	public static void main(String args[]) throws Exception
	{
		Connection con = null;
		//Class.forName("com.mysql.jdbc.Driver").newInstance();
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		//con = DriverManager.getConnection("jdbc:mysql://192.168.0.3:3306/bantei_mydb","bantei","bantei");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		Statement stmt = con.createStatement();
		
		String query = "select * from test";
		ResultSet rs= stmt.executeQuery(query);
		while(rs.next())
		{
			System.out.print("Roll no : " + rs.getInt("rollno"));
			System.out.println("          Name : " + rs.getString("name"));
		}				
		if(con != null){
			stmt.close();
			con.close();
		}
			
	}
}