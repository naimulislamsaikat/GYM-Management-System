
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class Courses extends JFrame {

    private JPanel contentPane;

    public Courses() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("IMAGES/logoSmall.jpg"));
        setFont(new Font("Dialog", Font.BOLD, 14));
        setTitle("FITNESS CLUB");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1555, 838);
        setExtendedState(MAXIMIZED_BOTH);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton Button1 = new JButton("HOME");
        Button1.setBounds(126, 66, 92, 37);
        contentPane.add(Button1);

        Button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                setVisible(true);
                new Home().setVisible(true);
            }
        });

        JButton Button2 = new JButton("ABOUT");
        Button2.setBounds(343, 66, 98, 37);
        contentPane.add(Button2);

        Button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                setVisible(true);
                new About().setVisible(true);
            }
        });

        JButton Button3 = new JButton("COURSES");
        Button3.setBounds(572, 66, 103, 37);
        contentPane.add(Button3);

        Button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                setVisible(true);
                new Courses().setVisible(true);
            }
        });

        JButton Button4 = new JButton("GALLERY");
        Button4.setBounds(830, 66, 113, 37);
        contentPane.add(Button4);

        Button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                setVisible(true);
                new Gallery().setVisible(true);
            }
        });

        JButton Button5 = new JButton("CONTACT");
        Button5.setBounds(1070, 66, 122, 37);
        contentPane.add(Button5);

        Button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                setVisible(true);
                new Contact().setVisible(true);
            }
        });

        JButton Button6 = new JButton("LOGIN");
        Button6.setBounds(1301, 66, 122, 37);
        contentPane.add(Button6);

        Button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                setVisible(true);
                PRACTICE s = new PRACTICE();
                s.setIconImage(Toolkit.getDefaultToolkit().getImage("IMAGES/logoSmall.jpg"));
                s.setVisible(true);
                s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                s.setBounds(0, 0, 1580, 1080);
                s.setTitle("Fitness Club");
            }
        });

        JLabel NewLabel = new JLabel("New label");
        NewLabel.setForeground(new Color(255, 255, 255));
        NewLabel.setIcon(new ImageIcon("IMAGES/logoSmall.jpg"));
        NewLabel.setBounds(71, 643, 70, 75);
        contentPane.add(NewLabel);

        JTextArea txFC = new JTextArea();
        txFC.setForeground(new Color(255, 255, 255));
        txFC.setText("FITNESS CLUB");
        txFC.setTabSize(10);
        txFC.setLineWrap(true);
        txFC.setFont(new Font("Times New Roman", Font.BOLD, 30));
        txFC.setBounds(151, 679, 237, 39);
        txFC.setBackground(new Color(0, 0, 0, 0));
        contentPane.add(txFC);

        JTextArea txA = new JTextArea();
        txA.setForeground(new Color(255, 255, 255));
        txA.setText("Address");
        txA.setTabSize(10);
        txA.setLineWrap(true);
        txA.setFont(new Font("Times New Roman", Font.BOLD, 30));
        txA.setBounds(650, 643, 176, 39);
        txA.setBackground(new Color(0, 0, 0, 0));
        contentPane.add(txA);

        JTextArea txC = new JTextArea();
        txC.setForeground(new Color(255, 255, 255));
        txC.setText("Email. fitnessclub@gmail.com\r\nMobile. 01234567891");
        txC.setTabSize(10);
        txC.setLineWrap(true);
        txC.setFont(new Font("Times New Roman", Font.BOLD, 14));
        txC.setBounds(1244, 679, 237, 39);
        txC.setBackground(new Color(0, 0, 0, 0));
        contentPane.add(txC);

        JTextArea txCon = new JTextArea();
        txCon.setForeground(new Color(255, 255, 255));
        txCon.setText("Contact with us");
        txCon.setTabSize(10);
        txCon.setLineWrap(true);
        txCon.setFont(new Font("Times New Roman", Font.BOLD, 25));
        txCon.setBounds(1244, 643, 237, 39);
        txCon.setBackground(new Color(0, 0, 0, 0));
        contentPane.add(txCon);

        JTextArea txJFP = new JTextArea();
        txJFP.setForeground(new Color(255, 255, 255));
        txJFP.setText("Jamuna Future Park\r\nBasundhara Area,Dhaka");
        txJFP.setTabSize(10);
        txJFP.setLineWrap(true);
        txJFP.setFont(new Font("Times New Roman", Font.BOLD, 14));
        txJFP.setBounds(650, 679, 176, 39);
        txJFP.setBackground(new Color(0, 0, 0, 0));
        contentPane.add(txJFP);

        JTextArea txtrAddress_1 = new JTextArea();
        txtrAddress_1.setForeground(new Color(255, 255, 255));
        txtrAddress_1.setText("Monthly \r\nMembership");
        txtrAddress_1.setTabSize(10);
        txtrAddress_1.setLineWrap(true);
        txtrAddress_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
        txtrAddress_1.setBounds(71, 251, 265, 80);
        txtrAddress_1.setBackground(new Color(0, 0, 0, 0));
        contentPane.add(txtrAddress_1);

        JTextArea txtrAddress_1_1 = new JTextArea();
        txtrAddress_1_1.setForeground(new Color(255, 255, 255));
        txtrAddress_1_1.setText("Quarterly \r\nMembership");
        txtrAddress_1_1.setTabSize(10);
        txtrAddress_1_1.setLineWrap(true);
        txtrAddress_1_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
        txtrAddress_1_1.setBounds(444, 251, 265, 80);
        txtrAddress_1_1.setBackground(new Color(0, 0, 0, 0));
        contentPane.add(txtrAddress_1_1);

        JTextArea txtrAddress_1_2 = new JTextArea();
        txtrAddress_1_2.setForeground(new Color(255, 255, 255));
        txtrAddress_1_2.setText("Half-Yearly \r\nMembership");
        txtrAddress_1_2.setTabSize(10);
        txtrAddress_1_2.setLineWrap(true);
        txtrAddress_1_2.setFont(new Font("Times New Roman", Font.BOLD, 30));
        txtrAddress_1_2.setBounds(807, 251, 265, 80);
        txtrAddress_1_2.setBackground(new Color(0, 0, 0, 0));
        contentPane.add(txtrAddress_1_2);

        JTextArea txtrAddress_1_3 = new JTextArea();
        txtrAddress_1_3.setForeground(new Color(255, 255, 255));
        txtrAddress_1_3.setText("Yearly \r\nMembership");
        txtrAddress_1_3.setTabSize(10);
        txtrAddress_1_3.setLineWrap(true);
        txtrAddress_1_3.setFont(new Font("Times New Roman", Font.BOLD, 30));
        txtrAddress_1_3.setBounds(1196, 251, 265, 80);
        txtrAddress_1_3.setBackground(new Color(0, 0, 0, 0));
        contentPane.add(txtrAddress_1_3);

        JTextArea txtrAddress_1_4 = new JTextArea();
        txtrAddress_1_4.setForeground(new Color(255, 255, 255));
        txtrAddress_1_4.setText("ANYTIME | 6 AM TO 12 AM\r\nBDT 6,000\r\nTIMEZONE | 6 AM TO 4 PM\r\nBDT 4,000");
        txtrAddress_1_4.setTabSize(10);
        txtrAddress_1_4.setLineWrap(true);
        txtrAddress_1_4.setFont(new Font("Times New Roman", Font.BOLD, 13));
        txtrAddress_1_4.setBounds(71, 330, 265, 80);
        txtrAddress_1_4.setBackground(new Color(0, 0, 0, 0));
        contentPane.add(txtrAddress_1_4);

        JTextArea txtrAddress_1_5 = new JTextArea();
        txtrAddress_1_5.setForeground(new Color(255, 255, 255));
        txtrAddress_1_5.setText("ANYTIME | 6 AM TO 12 AM\r\nBDT 15,000\r\nTIMEZONE | 6 AM TO 4 PM\r\nBDT 11,000");
        txtrAddress_1_5.setTabSize(10);
        txtrAddress_1_5.setLineWrap(true);
        txtrAddress_1_5.setFont(new Font("Times New Roman", Font.BOLD, 13));
        txtrAddress_1_5.setBounds(444, 330, 265, 80);
        txtrAddress_1_5.setBackground(new Color(0, 0, 0, 0));
        contentPane.add(txtrAddress_1_5);

        JTextArea txtrAddress_1_6 = new JTextArea();
        txtrAddress_1_6.setForeground(new Color(255, 255, 255));
        txtrAddress_1_6.setText("ANYTIME | 6 AM TO 12 AM\r\nBDT 27,000\r\nTIMEZONE | 6 AM TO 4 PM\r\nBDT 22,000");
        txtrAddress_1_6.setTabSize(10);
        txtrAddress_1_6.setLineWrap(true);
        txtrAddress_1_6.setFont(new Font("Times New Roman", Font.BOLD, 13));
        txtrAddress_1_6.setBounds(807, 330, 265, 80);
        txtrAddress_1_6.setBackground(new Color(0, 0, 0, 0));
        contentPane.add(txtrAddress_1_6);

        JTextArea txtrAddress_1_7 = new JTextArea();
        txtrAddress_1_7.setForeground(new Color(255, 255, 255));
        txtrAddress_1_7.setText("ANYTIME | 6 AM TO 12 AM\r\nBDT 50,000\r\nTIMEZONE | 6 AM TO 4 PM\r\nBDT 35,000");
        txtrAddress_1_7.setTabSize(10);
        txtrAddress_1_7.setLineWrap(true);
        txtrAddress_1_7.setFont(new Font("Times New Roman", Font.BOLD, 13));
        txtrAddress_1_7.setBounds(1196, 330, 265, 80);
        txtrAddress_1_7.setBackground(new Color(0, 0, 0, 0));
        contentPane.add(txtrAddress_1_7);

        JLabel lbNewLabel = new JLabel("New label");
        lbNewLabel.setIcon(new ImageIcon("IMAGES/homepagephoto.jpg"));
        lbNewLabel.setBounds(0, 0, 1550, 801);
        contentPane.add(lbNewLabel);
    }

    public static void main(String[] args) {

        Courses c = new Courses();
        c.setVisible(true);
    }
}
