import javax.swing.*;
import java.awt.*;

public class AddBookForm extends JFrame {
    public AddBookForm() {
        setTitle("Add Book");
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Add components
        panel.add(new JLabel("Title:"));
        JTextField titleField = new JTextField();
        panel.add(titleField);

        panel.add(new JLabel("Author:"));
        JTextField authorField = new JTextField();
        panel.add(authorField);

        panel.add(new JLabel("ISBN:"));
        JTextField isbnField = new JTextField();
        panel.add(isbnField);

        panel.add(new JLabel("Quantity:"));
        JTextField quantityField = new JTextField();
        panel.add(quantityField);

        JButton addButton = new JButton("Add Book");
        panel.add(addButton);

        add(panel);
    }
}