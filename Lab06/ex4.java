package Lab06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex4 {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        JLabel l1 = new JLabel("Find roots of quadratic equation ax^2 + bx + c = 0");
        JLabel l2 = new JLabel("a:");
        JTextField aField = new JTextField("1", 10);
        aField.setMaximumSize(new Dimension(200,25));
        JLabel l3 = new JLabel("b:");
        JTextField bField = new JTextField("2", 10);
        bField.setMaximumSize(new Dimension(200,25));
        JLabel l4 = new JLabel("c:");
        JTextField cField = new JTextField("1", 10);
        cField.setMaximumSize(new Dimension(200,25));
        JButton button = new JButton("Find");
        JLabel resultLabel = new JLabel("x1 = ?, x2 = ?");

        frame.add(l1);
        frame.add(l2);  
        frame.add(aField);
        frame.add(l3);
        frame.add(bField);
        frame.add(l4);
        frame.add(cField);
        frame.add(button);
        frame.add(resultLabel);
        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(aField.getText());
                double b = Double.parseDouble(bField.getText());
                double c = Double.parseDouble(cField.getText());

                double discriminant = b * b - 4 * a * c;
                if (discriminant < 0) {
                    resultLabel.setText("No real roots");
                } else {
                    double sqrtDisc = java.lang.Math.sqrt(discriminant);
                    double x1 = (-b + sqrtDisc) / (2 * a);
                    double x2 = (-b - sqrtDisc) / (2 * a);
                    resultLabel.setText(String.format("x1 = %.2f, x2 = %.2f", x1, x2));
                }
            }
        });
    }
}
