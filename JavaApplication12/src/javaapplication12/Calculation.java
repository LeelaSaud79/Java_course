import javax.swing.*;
import java.awt.event.*;

public class Calculation extends JFrame {
    private JTextField numField1, numField2;
    private JLabel resultLabel;

    public Calculation() {
        setTitle("Calculation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        // Create text fields
        numField1 = new JTextField(10);
        numField2 = new JTextField(10);

        // Create result label
        resultLabel = new JLabel("");

        // Add mouse listener to text fields
        numField1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                calculateSum();
            }
        });

        numField2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                calculateDifference();
            }
        });

        // Add components to the frame
        JPanel panel = new JPanel();
        panel.add(numField1);
        panel.add(numField2);
        panel.add(resultLabel);
        add(panel);

        setVisible(true);
    }

    private void calculateSum() {
        try {
            double num1 = Double.parseDouble(numField1.getText());
            double num2 = Double.parseDouble(numField2.getText());
            resultLabel.setText("Sum: " + (num1 + num2));
        } catch (NumberFormatException ex) {
            resultLabel.setText("Please enter valid numbers");
        }
    }

    private void calculateDifference() {
        try {
            double num1 = Double.parseDouble(numField1.getText());
            double num2 = Double.parseDouble(numField2.getText());
            resultLabel.setText("Difference: " + (num1 - num2));
        } catch (NumberFormatException ex) {
            resultLabel.setText("Please enter valid numbers");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculation());
    }
}
