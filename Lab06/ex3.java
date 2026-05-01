package Lab06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        JLabel l1 = new JLabel("Count number of Vowel, Consonant and Space"); 
        JLabel l2 = new JLabel("Text:"); 
        JTextField textField = new JTextField("Hello classmate", 20);
        textField.setMaximumSize(new Dimension(400,25));

        JButton button = new JButton("Find");

        JLabel vowelLabel     = new JLabel("Count of vowel is: ");
        JLabel consonantLabel = new JLabel("Count of consonant is: ");
        JLabel spaceLabel     = new JLabel("Count of space is: ");

        frame.add(l1);
        frame.add(l2);
        frame.add(textField);
        frame.add(button);
        frame.add(vowelLabel);
        frame.add(consonantLabel);
        frame.add(spaceLabel);

        frame.setVisible(true); // moved to AFTER adding all components

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                int vowelCount = 0, consonantCount = 0, spaceCount = 0;

                for (char c : text.toCharArray()) {
                    if (c == ' ') {
                        spaceCount++;
                    } else if ("AEIOUaeiou".indexOf(c) != -1) {
                        vowelCount++;
                    } else if (Character.isLetter(c)) {
                        consonantCount++;
                    }
                }

                vowelLabel.setText("Count of vowel is: " + vowelCount);
                consonantLabel.setText("Count of consonant is: " + consonantCount);
                spaceLabel.setText("Count of space is: " + spaceCount);
            }
        });
    }
}