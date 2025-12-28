Name: Nicholas Kyalo 
Reg: S08-8425-2024

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingAssinment3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Java Swing Exercise");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        // Panel for name and submit
        JPanel topPanel = new JPanel();
        topPanel.add(new JLabel("Name:"));
        JTextField nameField = new JTextField(10);
        topPanel.add(nameField);
        JButton submitButton = new JButton("Submit");
        topPanel.add(submitButton);

        // Panel for username and login
        JPanel loginPanel = new JPanel();
        loginPanel.add(new JLabel("Username:"));
        JTextField userField = new JTextField(10);
        loginPanel.add(userField);
        JButton loginButton = new JButton("Login");
        loginPanel.add(loginButton);

        // CheckBox and RadioButton
        JPanel optionPanel = new JPanel();
        JCheckBox checkBox = new JCheckBox("Accept Terms");
        JRadioButton radio1 = new JRadioButton("Male");
        JRadioButton radio2 = new JRadioButton("Female");
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        optionPanel.add(checkBox);
        optionPanel.add(radio1);
        optionPanel.add(radio2);

        // ComboBox
        JPanel comboPanel = new JPanel();
        String[] languages = {"Java", "Python", "C++"};
        JComboBox<String> comboBox = new JComboBox<>(languages);
        comboPanel.add(comboBox);

        // Calculator grid
        JPanel calcPanel = new JPanel(new GridLayout(4, 4));
        String[] buttons = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};
        for (String text : buttons) {
            JButton button = new JButton(text);
            calcPanel.add(button);
            button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button Clicked: " + text));
        }

        // Menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        exitItem.addActionListener(e -> System.exit(0));

        // Add components to frame
        frame.setJMenuBar(menuBar);
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(loginPanel, BorderLayout.CENTER);
        frame.add(optionPanel, BorderLayout.SOUTH);
        frame.add(comboPanel, BorderLayout.EAST);
        frame.add(calcPanel, BorderLayout.WEST);

        frame.setVisible(true);
    }
}