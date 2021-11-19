import java.net.*;
import java.lang.*;
import java.io.*;

public class server{
    public static final int PORT=1099;
    public static void main(String args[]){
        ServerSocket sersock=null;
        Socket sock=null;
        System.out.println("Wait !!");

        try{
            //initialising the ServerSocket
            sersock=new ServerSocket(PORT);
            System.out.println("Server Started: "+sersock);

            try{
                sock = sersock.accept();
                System.out.println("Client Connected: "+sock);
                DataInputStream ins =new DataInputStream(sock.getInputStream());
                // Send message to the client i.e Response
                System.out.println(ins.readLine());
                PrintStream ios =new PrintStream(sock.getOutputStream());
                ios.println("Hello from Server");
                ios.close();
                sock.close();
            }catch(SocketException se){
                System.out.println("Server Socket problem "+se.getMessage());
            }
        }catch(Exception e){
            System.out.println("Couldn't Start"+e.getMessage());
        }
    }//main
}//server class