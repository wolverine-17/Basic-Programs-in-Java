package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp {
    private JFrame frame;
    private JTextField display;

    private String currentInput;
    private double result;
    private String operator;

    public CalculatorApp() {
        frame = new JFrame("Calculator");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);

        // Panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        // Digits 1-9
        for (int i = 1; i <= 9; i++) {
            addButton(buttonPanel, String.valueOf(i));
        }

        // Digits 0, +, -, *, /
        addButton(buttonPanel, "0");
        addButton(buttonPanel, "+");
        addButton(buttonPanel, "-");
        addButton(buttonPanel, "*");
        addButton(buttonPanel, "/");

        // Equal and Clear buttons
        addButton(buttonPanel, "=");
        addButton(buttonPanel, "C");

        // Adding components to the frame
        frame.add(display, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);

        // Initialize variables
        currentInput = "";
        result = 0;
        operator = "";

        frame.setVisible(true);
    }

    private void addButton(Container container, String label) {
        JButton button = new JButton(label);
        button.addActionListener(new ButtonClickListener());
        container.add(button);
    }

    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();
            String buttonText = source.getText();

            if (buttonText.matches("[0-9]")) {
                // Digit button clicked
                currentInput += buttonText;
            } else if (buttonText.matches("[+\\-*/]")) {
                // Operator button clicked
                if (!currentInput.isEmpty()) {
                    performOperation();
                }
                operator = buttonText;
            } else if (buttonText.equals("=")) {
                // Equal button clicked
                performOperation();
                operator = "";
            } else if (buttonText.equals("C")) {
                // Clear button clicked
                currentInput = "";
                result = 0;
                operator = "";
            }

            // Update display
            display.setText(currentInput.isEmpty() ? String.valueOf(result) : currentInput);
        }

        private void performOperation() {
            double inputNumber = Double.parseDouble(currentInput);
            switch (operator) {
                case "+":
                    result += inputNumber;
                    break;
                case "-":
                    result -= inputNumber;
                    break;
                case "*":
                    result *= inputNumber;
                    break;
                case "/":
                    if (inputNumber != 0) {
                        result /= inputNumber;
                    } else {
                        JOptionPane.showMessageDialog(frame, "Cannot divide by zero", "Error", JOptionPane.ERROR_MESSAGE);
                        currentInput = "";
                        result = 0;
                        operator = "";
                        return;
                    }
                    break;
                default:
                    result = inputNumber;
                    break;
            }
            currentInput = "";
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CalculatorApp();
            }
        });
    }
}

