import java.lang.*;
import java.io.*;
import java.net.*;
class Client
{
	 public static void main(String args[])
	 {
		Socket sock=null;
		DataInputStream dis=null;
		PrintStream ps=null;
		System.out.println(" Trying to connect");
					   
		 try 
		 {
		
			 sock= new Socket(InetAddress.getLocalHost(),1099);
			  ps= new PrintStream(sock.getOutputStream());
			  ps.println(" Hello ... this is the client \\n");
			  DataInputStream is = new 
			  DataInputStream(sock.getInputStream());
			  System.out.println(is.readLine());

		 }
		 catch(SocketException e)
		 {
			System.out.println("SocketException " + e);
		}
		catch(IOException e)
		{
			System.out.println("IOException " + e);
		}

	  
		finally
		{
			try
			{
				sock.close();
			}
			catch(IOException ie)
			{
				System.out.println(" Close Error   :" + ie.getMessage());
			}               
		 }  // finally 
					
	} // main 
}   // Class Client