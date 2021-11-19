import java.sql.*;

public class JDBC_1
{
	public static void main(String args[]) throws Exception
	{
		Connection con = null;
		//newInstance() throws java.lang.InstantiationException,java.lang.IllegalAccessException;
		//forName(java.lang.String)throws java.lang.ClassNotFoundException
		
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		//Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		//con = DriverManager.getConnection("jdbc:mysql://192.168.0.3:3306/bantei_mydb","bantei","bantei");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		Statement stmt = con.createStatement();
		
		String query = "Insert into test values(2,'Thomas')";
		stmt.executeUpdate(query);
				
		if(con != null){
			stmt.close();
			con.close();
		}
				
		
	}
}