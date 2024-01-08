import java.net.*;
public class Networkingexample{
public static void main(String[] args) throws UnknownHostException {
//    InetAddress ip=InetAddress.getByName("www.pkmc.tu.edu.np");
//    System.out.println("ip:" +ip);
     InetAddress ip=InetAddress.getLocalHost();
    System.out.println("localhost:" +ip);
}}