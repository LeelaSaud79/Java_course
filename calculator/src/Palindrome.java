import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Palindrome extends JFrame {
    
    +

    public static void main(String[] args) {
        Palindrome frame = new Palindrome();
        frame.setVisible(true);
    }

    public Palindrome() {
        setLayout(new GridLayout(4, 1, 10, 20));

        JLabel inputLabel = new JLabel("Input any String: ");
        JTextField inputTextField = new JTextField(20);
        add(inputLabel);
        add(inputTextField);

        JLabel outputLabel = new JLabel("Output: ");
        JTextField outputTextField = new JTextField(20);
        add(outputLabel);
        add(outputTextField);
        outputTextField.setEditable(false);

        JButton checkPalindromeButton = new JButton("Check Palindrome");
        add(checkPalindromeButton);

        JButton reverseButton = new JButton("Reverse");
        add(reverseButton);

        JButton findVowelButton = new JButton("Find Vowel");
        add(findVowelButton);

        checkPalindromeButton.addActionListener(e -> {
            String userInput = inputTextField.getText();
            String reversedInput = new StringBuilder(userInput).reverse().toString();

            if (reversedInput.equalsIgnoreCase(userInput)) {
                outputTextField.setText("String is palindrome.");
            } else {
                outputTextField.setText("String isn't a palindrome.");
            }
        });

        reverseButton.addActionListener(e -> {
            String userInput = inputTextField.getText();
            String reversedInput = new StringBuilder(userInput).reverse().toString();
            outputTextField.setText("Reverse String is: " + reversedInput);
        });

        findVowelButton.addActionListener(e -> {
            String userInput = inputTextField.getText();
            String vowels = userInput.replaceAll("[^aeiouAEIOU]", "");
            outputTextField.setText("Vowels: " + vowels);
        });

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
