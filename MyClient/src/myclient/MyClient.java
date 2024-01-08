/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclient;

import java.io.*;
import java.net.*;
public class MyClient {

    public static void main(String[] args)
    {try
    {
       Socket s =new Socket("localhost",1111);
       System.out.println("successful");
       DataOutputStream dout = new DataOutputStream (s.getOutputStream());
       dout.writeUTF("Hello Server");
       
       
       }
       catch (Exception e) 
       {System.out.println(e);}
    }
    
}
    

