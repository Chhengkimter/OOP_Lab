package Lab06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ex5 {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        ((JPanel) frame.getContentPane()).setBorder(BorderFactory.createEmptyBorder(10, 15, 10, 15));

        JLabel l1 = new JLabel("Calcutator");
        JLabel l2 = new JLabel("A:");
        JTextField aField = new JTextField("0", 10);
        aField.setMaximumSize(new Dimension(200,25));
        JLabel l3 = new JLabel("B:");
        JTextField bField = new JTextField("0", 10);
        bField.setMaximumSize(new Dimension(200,25));

        JButton sumButton = new JButton("A + B");
        JLabel resultSum = new JLabel("= ?");
        JButton minusButton = new JButton("A - B");
        JLabel resultMinus = new JLabel("= ?");
        JButton multiplyButton = new JButton("A * B");
        JLabel resultMultiply = new JLabel("= ?");  
        JButton divideButton = new JButton("A / B");
        JLabel resultDivide = new JLabel("= ?");

        l1.setAlignmentX(Component.LEFT_ALIGNMENT);
        l2.setAlignmentX(Component.LEFT_ALIGNMENT);
        aField.setAlignmentX(Component.LEFT_ALIGNMENT);
        l3.setAlignmentX(Component.LEFT_ALIGNMENT);
        bField.setAlignmentX(Component.LEFT_ALIGNMENT);
        sumButton.setAlignmentX(Component.LEFT_ALIGNMENT);
        minusButton.setAlignmentX(Component.LEFT_ALIGNMENT);
        multiplyButton.setAlignmentX(Component.LEFT_ALIGNMENT);
        divideButton.setAlignmentX(Component.LEFT_ALIGNMENT);

        frame.add(l1);
        frame.add(l2);  
        frame.add(aField);
        frame.add(l3);
        frame.add(bField);
        frame.add(sumButton);
        frame.add(resultSum);
        frame.add(minusButton);
        frame.add(resultMinus);
        frame.add(multiplyButton);
        frame.add(resultMultiply);
        frame.add(divideButton);
        frame.add(resultDivide);
        frame.setVisible(true);

        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(aField.getText());
                double b = Double.parseDouble(bField.getText());
                resultSum.setText("= " + (a + b));
            }
        });

        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(aField.getText());
                double b = Double.parseDouble(bField.getText());
                resultMinus.setText("= " + (a - b));
            }
        });

        multiplyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(aField.getText());
                double b = Double.parseDouble(bField.getText());
                resultMultiply.setText("= " + (a * b));
            }
        });

        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(aField.getText());
                double b = Double.parseDouble(bField.getText());
                resultDivide.setText("= " + (a / b));
            }
        });

    }
}
