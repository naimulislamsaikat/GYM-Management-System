
import java.awt.Color;
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

public class Contact extends JFrame {

    private JPanel contentPane;

    public Contact() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("IMAGES/logoSmall.jpg"));
        setResizable(true);
        setFont(new Font("Dialog", Font.BOLD, 13));
        setTitle("FITNESS CLUB");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1555, 838);
        setExtendedState(MAXIMIZED_BOTH);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton Button1 = new JButton("HOME");
        Button1.setForeground(new Color(0, 0, 0));
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
        Button6.setForeground(new Color(0, 0, 0));
        Button6.setBounds(1301, 66, 122, 37);
        contentPane.add(Button6);

        Button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                PRACTICE s = new PRACTICE();
                s.setVisible(true);
                s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                s.setBounds(0, 0, 1580, 1080);
                s.setTitle("Fitness Club");
            }
        });

        /*
		 * JScrollPane scrollPane = new JScrollPane(); scrollPane.setBounds(0, 113,
		 * 1540, 688); contentPane.add(scrollPane);
         */
        JLabel NewLabel = new JLabel("New label");
        NewLabel.setForeground(new Color(255, 255, 255));
        NewLabel.setIcon(new ImageIcon("IMAGES/logosmall.jpg"));
        NewLabel.setBounds(71, 643, 70, 75);
        NewLabel.setBackground(new Color(0, 0, 0));
        contentPane.add(NewLabel);

        JTextArea txFC = new JTextArea();
        txFC.setForeground(new Color(255, 255, 255));
        txFC.setText("FITNESS CLUB");
        txFC.setTabSize(10);
        txFC.setLineWrap(true);
        txFC.setFont(new Font("Times New Roman", Font.BOLD, 30));
        txFC.setBounds(151, 679, 237, 39);
        txFC.setBackground(new Color(0, 0, 0, 0)); // setting background to transparent
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

        JTextArea txAddress_1 = new JTextArea();
        txAddress_1.setForeground(new Color(255, 255, 255));
        txAddress_1.setText("Get in touch");
        txAddress_1.setTabSize(10);
        txAddress_1.setLineWrap(true);
        txAddress_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
        txAddress_1.setBounds(151, 209, 265, 50);
        txAddress_1.setBackground(new Color(0, 0, 0, 0));
        contentPane.add(txAddress_1);

        JTextArea txtrAddress_1_7 = new JTextArea();
        txtrAddress_1_7.setForeground(new Color(255, 255, 255));
        txtrAddress_1_7.setText(
                "We're here to help you with anything you need\r\nfor a fit & Healthy life! \r\n\r\nMessage us on Facebook for membership rates.");
        txtrAddress_1_7.setTabSize(10);
        txtrAddress_1_7.setLineWrap(true);
        txtrAddress_1_7.setFont(new Font("Times New Roman", Font.BOLD, 17));
        txtrAddress_1_7.setBounds(151, 256, 349, 108);
        txtrAddress_1_7.setBackground(new Color(0, 0, 0, 0));
        contentPane.add(txtrAddress_1_7);

        JTextArea txtrAddress_1_8 = new JTextArea();

        txtrAddress_1_8.setForeground(new Color(255, 255, 255));
        txtrAddress_1_8.setText(
                "Email: fitnessclub@gmail.com\r\nMobile: 01234567891\r\nOwner: 01255364789\r\nManagment: 08859328631");
        txtrAddress_1_8.setTabSize(10);
        txtrAddress_1_8.setLineWrap(true);
        txtrAddress_1_8.setFont(new Font("Times New Roman", Font.BOLD, 23));
        txtrAddress_1_8.setBounds(1034, 308, 349, 132);
        txtrAddress_1_8.setBackground(new Color(0, 0, 0, 0));
        contentPane.add(txtrAddress_1_8);

        JLabel lbNewLabel = new JLabel("New label");
        lbNewLabel.setIcon(new ImageIcon("IMAGES/homepagephoto.jpg"));
        lbNewLabel.setBounds(0, 0, 1550, 801);
        contentPane.add(lbNewLabel);
    }

    public static void main(String[] args) {

        Contact co = new Contact();
        co.setVisible(true);

    }
}
