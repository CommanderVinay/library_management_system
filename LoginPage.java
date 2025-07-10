import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Login Page");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());

        // Create components
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField(15);

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(15);

        JButton loginButton = new JButton("Login");
        JLabel messageLabel = new JLabel("", JLabel.CENTER);

        // Set layout constraints
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.insets = new Insets(10, 10, 10, 10);

        // Add username label and field
        constraints.gridx = 0;
        constraints.gridy = 0;
        frame.add(usernameLabel, constraints);

        constraints.gridx = 1;
        frame.add(usernameField, constraints);

        // Add password label and field
        constraints.gridx = 0;
        constraints.gridy = 1;
        frame.add(passwordLabel, constraints);

        constraints.gridx = 1;
        frame.add(passwordField, constraints);

        // Add login button
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        frame.add(loginButton, constraints);

        // Add message label
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 2;
        frame.add(messageLabel, constraints);

        // Add action listener to login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Simulate login validation
                if (username.equals("Vinay") && password.equals("1234")) {
                    messageLabel.setText("Login successful!");
                    messageLabel.setForeground(Color.GREEN);
                } else {
                    messageLabel.setText("Invalid username or password.");
                    messageLabel.setForeground(Color.RED);
                }
            }
        });

        // Center the frame and make it visible
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
