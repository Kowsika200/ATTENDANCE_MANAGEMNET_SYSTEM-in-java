import java.awt.Color;
import java.awt.Cursor;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class StudLin extends JFrame {
    
    StudLin() {
        JPanel p0 = new JPanel();
        JPanel p1 = new JPanel(new GridLayout(6, 1, 10, 5));
        JLabel n1 = new JLabel();
        JButton m2 = new JButton("Home");
        m2.setForeground(Color.BLUE.darker());
        m2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        m2.setHorizontalAlignment(JLabel.CENTER);
        m2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == m2) {
                    System.out.println("Home button clicked"); // Debug statement
                    Home ad = new Home();
                    ad.setSize(600, 400);
                    ad.setLocationRelativeTo(null);
                    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    ad.setVisible(true);
                    ad.setResizable(false);
                    dispose();
                }
            }
        });
        JButton m3 = new JButton("View Attendance");
        m3.setForeground(Color.BLUE.darker());
        m3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        m3.setHorizontalAlignment(JLabel.CENTER);
        m3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == m3) {
                    System.out.println("View Attendance button clicked"); // Debug statement
                    VAttend1 ad = new VAttend1();
                    ad.setSize(600, 400);
                    ad.setLocationRelativeTo(null);
                    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    ad.setVisible(true);
                    ad.setResizable(false);
                    dispose();
                }
            }
        });
        JButton m4 = new JButton("Average");
        m4.setForeground(Color.BLUE.darker());
        m4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        m4.setHorizontalAlignment(JLabel.CENTER);
        m4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Average button clicked"); // Debug statement
                // Calculate attendance and display
                double attendance = calculateAttendance();
                String formattedAttendance = String.format("%.2f", attendance);
                JOptionPane.showMessageDialog(null, "Average: " + formattedAttendance + "%");
            }
        });
        JButton m5 = new JButton("Logout");
        m5.setForeground(Color.BLUE.darker());
        m5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        m5.setHorizontalAlignment(JLabel.CENTER);
        m5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == m5) {
                    System.out.println("Logout button clicked"); // Debug statement
                    JOptionPane.showMessageDialog(null, "You have successfully been logged out !");
                    Home ad = new Home();
                    ad.setSize(600, 400);
                    ad.setLocationRelativeTo(null);
                    ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    ad.setVisible(true);
                    ad.setResizable(false);
                    dispose();
                }
            }
        });

        p1.add(n1);
        p1.add(m2);
        p1.add(m3);
        p1.add(m4);
        p1.add(m5);

        setLayout(new GridLayout(1, 2));
        add(p0);
        add(p1);
    }

    // Method to calculate attendance
    private double calculateAttendance() {
        // Placeholder values for demonstration, replace with actual logic
        int totalClasses = 30;
        int attendedClasses = 25;
        return (double) attendedClasses / totalClasses * 100;
    }

    public static void main(String[] args) {
        StudLin studLin = new StudLin();
        studLin.setSize(800, 600);
        studLin.setLocationRelativeTo(null);
        studLin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        studLin.setVisible(true);
    }
}
