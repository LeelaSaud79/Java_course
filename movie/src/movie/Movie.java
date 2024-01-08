import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
public class Movie extends JFrame implements ActionListener {
JFrame jf;
JTextField t1, t2, t3, t4;
JLabel l1, l2, l3, l4;
JButton b1;

public Movie(){
 jf = new JFrame("Movie System");
l1 = new JLabel("Title");
l2 = new JLabel("Genre");
l3 = new JLabel("Length");
l4 = new JLabel("Langauge");
t1 = new JTextField(10);
t2 = new JTextField(10);
t3 = new JTextField(10);
t4 = new JTextField(10);
b1=new JButton("ADD");
jf.add(t1);
jf.add(l1);
jf.add(t2);
jf.add(l2);
jf.add(t3);
jf.add(l3);
jf.add(t4);
jf.add(l4);
jf.add(b1);
jf.setSize(500, 700);
jf.setLayout(new FlowLayout());
b1.addActionListener(this);
jf.setVisible(true);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




}

public void actionPerformed(ActionEvent ae){
try{
 Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/movie","root","");
            Statement stmt = conn.createStatement();
            System.out.println("Connection Successful");
            String sql = "insert into movies(Title, Genre, Langauge, Length) Values(?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, t1.getText());
            ps.setString(2, t2.getText());
            ps.setString(3, t3.getText());
            ps.setString(4, t4.getText());
            ps.executeUpdate();
            conn.close();
            System.out.println("Insertes Successful");

}
catch(Exception e){
            System.out.println(e.toString());
        }



}
 public static void main(String[] args) {
        new Movie();
    }
        }