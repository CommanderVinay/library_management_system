
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LibraryDashboard extends JFrame {
    public LibraryDashboard() {
        setTitle("Library Management System - Dashboard");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        // Create a panel for the dashboard
        JPanel dashboardPanel = new JPanel();
        dashboardPanel.setLayout(new GridLayout(4, 1, 10, 10)); // 4 rows, 1 column, with spacing

        // Create buttons for different functionalities
        JButton addBookButton = new JButton("Add Book");
        JButton viewBooksButton = new JButton("View Books");
        JButton issueBookButton = new JButton("Issue Book");
        JButton returnBookButton = new JButton("Return Book");

        // Style buttons
        Font buttonFont = new Font("Arial", Font.BOLD, 16);
        addBookButton.setFont(buttonFont);
        viewBooksButton.setFont(buttonFont);
        issueBookButton.setFont(buttonFont);
        returnBookButton.setFont(buttonFont);

        // Add action listeners to buttons
        addBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new AddBookForm().setVisible(true); // Open the "Add Book" form
            }
        });

        viewBooksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // new ViewBooksForm().setVisible(true); // Open the "View Books" form
            }
        });

        issueBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // new IssueBookForm().setVisible(true); // Open the "Issue Book" form
            }
        });

        returnBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // new ReturnBookForm().setVisible(true); // Open the "Return Book" form
            }
        });

        // Add buttons to the dashboard panel
        dashboardPanel.add(addBookButton);
        dashboardPanel.add(viewBooksButton);
        dashboardPanel.add(issueBookButton);
        dashboardPanel.add(returnBookButton);

        // Add the dashboard panel to the frame
        add(dashboardPanel, BorderLayout.CENTER);

        // Add a title label at the top
        JLabel titleLabel = new JLabel("Library Management System", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(titleLabel, BorderLayout.NORTH);

        // Add some padding around the dashboard panel
        dashboardPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    }

    public static void main(String[] args) {
        // Run the dashboard
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LibraryDashboard().setVisible(true);
            }
        });
    }
}