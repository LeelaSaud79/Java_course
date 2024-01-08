import java.awt.Color;
import javax.swing.*;
import java.awt.Container;
import java.awt.Font;
class MyFrame extends JFrame
{ 
 Container c;
 JLabel l1;
 JTextField t1;
public MyFrame()
{
    setSize(600, 600);
    setLocationRelativeTo(null);
    setTitle("Unit-2");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    setResizable(false);
    c = this.getContentPane();
    c.setLayout(null);
    c.setBackground(Color.red);
    l1 = new JLabel ("Name");
    l1.setBounds(100, 150, 80, 30);
    Font f = new Font("Courier", Font.ITALIC,30);
    l1.setFont (f);
    c.add(l1);
    t1 = new JTextField();
    t1.setBounds(190, 150, 80, 30);
    t1.setEditable(false);
     c.add(t1);
    
    
    setVisible(true);
    }}
    public class Example{
        public static void main(String []args)
        {
            new MyFrame();
        }
    }
