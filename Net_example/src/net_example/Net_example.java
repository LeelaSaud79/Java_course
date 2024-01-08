import java.net.*;
public class Net_example{
public static void main(String[] args) throws UnknownHostException {
    InetAddress ip=InetAddress.getByName("192.168.1.22");
    System.out.println("ip:" +ip.getHostName());
   
}}