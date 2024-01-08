import java.awt.Color;
import java.awt.Container;
import javax.swing.*;

public class Regform extends JFrame {
    Container c;
    JLabel l1, l2, l3, l4, dob, l5;
    JRadioButton b1, b2;
    JTextField t1, t2, t3, t4;
    JComboBox<String> cbDay, cbMonth, cbYear, cbCountry;
    JCheckBox acceptConditions;
    JButton submitButton;

    public Regform() {
        setSize(700, 700);
        setTitle("Registration Form Example");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);

        l1 = new JLabel("Name");
        l1.setBounds(20, 20, 80, 30);
        c.add(l1);
        t1 = new JTextField();
        t1.setBounds(100, 20, 150, 30);
        c.add(t1);

        l2 = new JLabel("Mobile");
        l2.setBounds(20, 60, 80, 30);
        c.add(l2);
        t2 = new JTextField();
        t2.setBounds(100, 60, 150, 30);
        c.add(t2);

        l3 = new JLabel("Gender");
        l3.setBounds(20, 100, 80, 30);
        c.add(l3);
        b1 = new JRadioButton("Male");
        b2 = new JRadioButton("Female");
        b1.setBounds(100, 100, 80, 30);
        b2.setBounds(180, 100, 80, 30);
        c.add(b1);
        c.add(b2);
        ButtonGroup bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);

        dob = new JLabel("DOB");
        dob.setBounds(20, 140, 80, 30);
        c.add(dob);
        String[] days = {"1", "2"}; // Example values, replace with actual days
        String[] months = {"Jan", "Feb"}; // Example values, replace with actual months
        String[] years = {"1990", "2001"}; // Example values, replace with actual years
        cbDay = new JComboBox<>(days);
        cbMonth = new JComboBox<>(months);
        cbYear = new JComboBox<>(years);
        cbDay.setBounds(100, 140, 60, 30);
        cbMonth.setBounds(170, 140, 60, 30);
        cbYear.setBounds(240, 140, 80, 30);
        c.add(cbDay);
        c.add(cbMonth);
        c.add(cbYear);

        l4 = new JLabel("Address");
        l4.setBounds(20, 180, 80, 30);
        c.add(l4);
        t4 = new JTextField();
        t4.setBounds(100, 180, 250, 30);
        c.add(t4);

        l5 = new JLabel("Country");
        l5.setBounds(20, 220, 80, 30);
        c.add(l5);
        String[] countries = {"Nepal", "UK", "USA"}; // Example values, replace with actual countries
        cbCountry = new JComboBox<>(countries);
        cbCountry.setBounds(100, 220, 150, 30);
        c.add(cbCountry);

        acceptConditions = new JCheckBox("I accept the conditions");
        acceptConditions.setBounds(20, 260, 200, 30);
        c.add(acceptConditions);

        submitButton = new JButton("Submit");
        submitButton.setBounds(20, 300, 100, 30);
        c.add(submitButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Regform();
    }
}
