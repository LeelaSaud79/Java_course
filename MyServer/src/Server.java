//Write client and server programs in which a server program accepts a radius of a circle from the client program. 
//Computes area, sends the computed area to the client program, and displays it by client program.
import java.io.*;
import java.net.*;
class Server
{
   public static void main(String args[]) throws IOException
   {

         ServerSocket ss=new ServerSocket(1666);
         System.out.println("Waiting for Client Request");
         Socket s=ss.accept();
         String str;
         BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
         str=br.readLine();
         System.out.println("Received radius");
         double r=Double.valueOf(str);
         double area=3.14*r*r;
         PrintStream ps=new PrintStream(s.getOutputStream());
         ps.println(String.valueOf(area));
         br.close();
         ps.close();
         s.close();
         ss.close();

    }

}

