package Lab07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex4 {
    public static void main(String[] args) {

        // ── Main frame ──────────────────────────────────────────
        JFrame frame = new JFrame("Settings");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 420);

        CardLayout cardLayout = new CardLayout();
        JPanel mainPanel = new JPanel(cardLayout);
        frame.add(mainPanel);

        JPanel settingPanel = new JPanel();
        settingPanel.setLayout(new BoxLayout(settingPanel, BoxLayout.Y_AXIS));
        settingPanel.setBackground(new Color(235, 235, 235));
        settingPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JLabel settingTitle = new JLabel("Setting");
        settingTitle.setFont(new Font("SansSerif", Font.BOLD, 14));
        settingPanel.add(settingTitle);
        settingPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        JButton btnGeneral      = new JButton("1. General");
        JButton btnWifi         = new JButton("2. Wi-Fi");
        JButton btnBluetooth    = new JButton("3. Bluetooth");
        JButton btnMobileData   = new JButton("4. Mobile Data");
        JButton btnHotspot      = new JButton("5. Hotspot");
        JButton btnNotification = new JButton("6. Notification");
        JButton btnQuit         = new JButton("Quit");

        btnGeneral.setMaximumSize(new Dimension(Integer.MAX_VALUE, 38));
        btnWifi.setMaximumSize(new Dimension(Integer.MAX_VALUE, 38));
        btnBluetooth.setMaximumSize(new Dimension(Integer.MAX_VALUE, 38));
        btnMobileData.setMaximumSize(new Dimension(Integer.MAX_VALUE, 38));
        btnHotspot.setMaximumSize(new Dimension(Integer.MAX_VALUE, 38));
        btnNotification.setMaximumSize(new Dimension(Integer.MAX_VALUE, 38));
        btnQuit.setMaximumSize(new Dimension(Integer.MAX_VALUE, 38));

        settingPanel.add(btnGeneral);
        settingPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        settingPanel.add(btnWifi);
        settingPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        settingPanel.add(btnBluetooth);
        settingPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        settingPanel.add(btnMobileData);
        settingPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        settingPanel.add(btnHotspot);
        settingPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        settingPanel.add(btnNotification);
        settingPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        settingPanel.add(btnQuit);

        JPanel generalPanel = new JPanel();
        generalPanel.setLayout(new BoxLayout(generalPanel, BoxLayout.Y_AXIS));
        generalPanel.setBackground(new Color(235, 235, 235));
        generalPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JLabel generalTitle = new JLabel("Setting > General");
        generalTitle.setFont(new Font("SansSerif", Font.BOLD, 14));
        generalPanel.add(generalTitle);
        generalPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        JButton btnAbout    = new JButton("1. About");
        JButton btnSoftware = new JButton("2. Software Update");
        JButton btnStorage  = new JButton("3. Storage");
        JButton btnBackG    = new JButton("Back");

        btnAbout.setMaximumSize(new Dimension(Integer.MAX_VALUE, 38));
        btnSoftware.setMaximumSize(new Dimension(Integer.MAX_VALUE, 38));
        btnStorage.setMaximumSize(new Dimension(Integer.MAX_VALUE, 38));
        btnBackG.setMaximumSize(new Dimension(Integer.MAX_VALUE, 38));

        generalPanel.add(btnAbout);
        generalPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        generalPanel.add(btnSoftware);
        generalPanel.add(Box.createRigidArea(new Dimension(0, 5)));
        generalPanel.add(btnStorage);
        generalPanel.add(Box.createVerticalGlue());
        generalPanel.add(btnBackG);

        JPanel aboutPanel = new JPanel();
        aboutPanel.setLayout(new BoxLayout(aboutPanel, BoxLayout.Y_AXIS));
        aboutPanel.setBackground(new Color(235, 235, 235));
        aboutPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        JLabel aboutTitle = new JLabel("Setting > General > About");
        aboutTitle.setFont(new Font("SansSerif", Font.BOLD, 14));
        aboutPanel.add(aboutTitle);
        aboutPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        JLabel lblName    = new JLabel("Name:      iPhone");
        JLabel lblModel   = new JLabel("Model:     0is");
        JLabel lblVersion = new JLabel("Version:   18.5");
        JButton btnBackA  = new JButton("Back");
        btnBackA.setMaximumSize(new Dimension(Integer.MAX_VALUE, 38));

        aboutPanel.add(lblName);
        aboutPanel.add(Box.createRigidArea(new Dimension(0, 8)));
        aboutPanel.add(lblModel);
        aboutPanel.add(Box.createRigidArea(new Dimension(0, 8)));
        aboutPanel.add(lblVersion);
        aboutPanel.add(Box.createVerticalGlue());
        aboutPanel.add(btnBackA);

        mainPanel.add(settingPanel, "Setting");
        mainPanel.add(generalPanel, "General");
        mainPanel.add(aboutPanel,   "About");

        cardLayout.show(mainPanel, "Setting"); 
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        btnGeneral.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "General");
            }
        });

        btnAbout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "About");
            }
        });

        btnBackG.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "Setting");
            }
        });

        btnBackA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(mainPanel, "General");
            }
        });

        btnQuit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Wi-Fi, Bluetooth, etc. — just go back to Setting for now
        btnWifi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Wi-Fi screen (not implemented)");
            }
        });
        btnBluetooth.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Bluetooth screen (not implemented)");
            }
        });
        btnMobileData.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Mobile Data screen (not implemented)");
            }
        });
        btnHotspot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Hotspot screen (not implemented)");
            }
        });
        btnNotification.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Notification screen (not implemented)");
            }
        });
    }
}