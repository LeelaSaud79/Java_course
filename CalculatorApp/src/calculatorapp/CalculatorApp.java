import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CalculatorApp extends JFrame {

    private JTextField num1Field, num2Field, resultField;

    public CalculatorApp() {
        setTitle("Sum and Difference Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        add(panel);

        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        resultField = new JTextField(10);
        resultField.setEditable(false);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addMouseListener(new CustomMouseListener());

        panel.add(new JLabel("Enter Number 1:"));
        panel.add(num1Field);
        panel.add(new JLabel("Enter Number 2:"));
        panel.add(num2Field);
        panel.add(new JLabel("Result:"));
        panel.add(resultField);
        panel.add(calculateButton);

        setLocationRelativeTo(null);
    }

    private class CustomMouseListener extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
            calculateSum();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            calculateDifference();
        }
    }

    private void calculateSum() {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double sum = num1 + num2;
            resultField.setText(String.valueOf(sum));
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid input");
        }
    }

    private void calculateDifference() {
        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double difference = num1 - num2;
            resultField.setText(String.valueOf(difference));
        } catch (NumberFormatException ex) {
            resultField.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorApp calculator = new CalculatorApp();
            calculator.setVisible(true);
        });
    }
}
