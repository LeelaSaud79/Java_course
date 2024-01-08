import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OddEvenChecker extends JFrame {
    private JTextField textField;
    private JLabel resultLabel;

    public OddEvenChecker() {
        setTitle("Odd-Even Checker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textField = new JTextField(10);
        resultLabel = new JLabel();

        textField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                checkOddEven();
            }
        });

        add(new JLabel("Enter a number: "));
        add(textField);
        add(resultLabel);

        pack();
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    private void checkOddEven() {
        try {
            int number = Integer.parseInt(textField.getText());
            if (number % 2 == 0) {
                resultLabel.setText("Even");
            } else {
                resultLabel.setText("Odd");
            }
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new OddEvenChecker());
    }
}
