import java.sql.*;
public class JDBC {

   
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/student","root","");
            Statement stmt = conn.createStatement();
            System.out.println("Connection Successful");
        }catch(Exception e){
            System.out.println(e.toString());
        }
    
}
}