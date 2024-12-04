// Hints:
// DONE - Use a JTextfield for the input fields.
// DONE - Use a JButton for the "Calculate" button.
// DONE - Use a JLabel to display the result or error messages.
// DONE - Use the ActionListener interface to handle button clicks.
// DONE - Use Integer.parseInt() to convert text input to integers.
// DONE - Use a try-catch block to handle invalid input (NumberFormatException).
// DONE - Use FlowLayout to arrange the components in the window.

// Challenge Extensions (Optional):
// DONE - 1. Add more operations like subtraction, multiplication, and division.
// DONE - 2. Use a JComboBox to select the operation (e.g., +,  -, *, /).
// DONE - 3. Validate input to ensure both fields are not empty before performing calculations.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Lab24 {
    public static void main(String[] args) {
        // 1. Create a GUI with:
        JFrame jFrame = new JFrame("Simple Calculator");
        jFrame.setSize(500, 400);
        jFrame.setLayout(new FlowLayout());

        // - Two text fields for the user to input numbers
        JTextField jTextField1 = new JTextField(10);
        JTextField jTextField2 = new JTextField(10);

        // CHALLENGE EXTENSION #2: Use a JComboBox to select the operation (e.g., +,  -, *, /).
        String[] operations = {"+", "-", "*", "/"};
        JComboBox<String> operationBox = new JComboBox<>(operations);

        // - A button labeled "Calculate" to trigger the addition.
        JButton calculateButton = new JButton("Calculate");

        // - A label that displays the result or an error message.
        JLabel resultLabel = new JLabel("Result: ");

        // Add the components to the frame
        jFrame.add(jTextField1);
        jFrame.add(jTextField2);
        jFrame.add(operationBox);
        jFrame.add(calculateButton);
        jFrame.add(resultLabel);
        jFrame.setVisible(true);

        // 2. When the user enters two numbers and clicks the "Calculate" button:
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // CHALLENGE EXTENSION #3: Validate that the inputs are not empty before computing.
                String input1 = jTextField1.getText();
                String input2 = jTextField2.getText();

                if (input1.isEmpty() || input2.isEmpty()) {
                    resultLabel.setText("You cannot have empty boxes!");
                    return; // return so the code stops running at this point if there are empty boxes
                }

                try {
                    // - Compute the sum of the numbers.
                    int number1 = Integer.parseInt(input1);
                    int number2 = Integer.parseInt(input2);
                    int result = 0;

                    // PART OF CHALLENGE EXTENSION #2: Get the user's chosen operation
                    String operation = (String) operationBox.getSelectedItem();

                    if (operation.equals("+")) {
                        result = number1 + number2;
                    } else if (operation.equals("-")) {
                        result = number1 - number2;
                    } else if (operation.equals("*")) {
                        result = number1 * number2;
                    } else if (operation.equals("/")) {
                        if (number2 == 0) {
                            resultLabel.setText("You cannot divide by zero!");
                            return;
                        }
                        result = number1 / number2;
                    } // end else if

                    resultLabel.setText("Result: " + result);

                } catch (NumberFormatException exception) {
                    // 3. If the user enters invalid input (non-numeric values):
                    // - Display an error message in the label: "Invalid input".
                    resultLabel.setText("Invalid input");
                } // end catch
            }
        }); // calculateButton.addActionListener
    } // main()
} // Lab24