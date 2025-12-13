
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

public class Gallery extends JFrame {

    private JPanel contentPane;

    public Gallery() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("C://Users//hp//OneDrive//Documents//NetBeansProjects//FITNESS_CLUB_PROJECT//src//logoSmall.jpg"));
        setFont(new Font("Dialog", Font.BOLD, 14));
        setTitle("FITNESS CLUB");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1555, 838);
        setExtendedState(MAXIMIZED_BOTH);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(0, 0, 0));
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
                s.setVisible(true);
                s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                s.setBounds(0, 0, 1580, 1080);
                s.setTitle("Fitness Club");
            }
        });

        JLabel NewLabel = new JLabel("New label");
        NewLabel.setBackground(new Color(0, 0, 0));
        NewLabel.setForeground(new Color(255, 255, 255));
        NewLabel.setIcon(new ImageIcon("C://Users//hp//OneDrive//Documents//NetBeansProjects//FITNESS_CLUB_PROJECT//src//logoSmall.jpg"));
        NewLabel.setBounds(71, 643, 70, 75);
        NewLabel.setBackground(new Color(0, 0, 0, 0));
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

        JLabel lbNewLabel = new JLabel("New label");
        lbNewLabel.setIcon(new ImageIcon("IMAGES/Treadmill.jpeg"));
        lbNewLabel.setBounds(65, 149, 461, 474);
        contentPane.add(lbNewLabel);

        JLabel lbNewLabe2 = new JLabel("New label");
        lbNewLabe2.setIcon(new ImageIcon("IMAGES/Walking.jpeg"));
        lbNewLabe2.setBounds(543, 149, 476, 236);
        contentPane.add(lbNewLabe2);

        JLabel lbNewLabe3 = new JLabel("New label");
        lbNewLabe3.setIcon(new ImageIcon("IMAGES/Dumble-1024x768.png"));
        lbNewLabe3.setBounds(543, 399, 503, 224);
        contentPane.add(lbNewLabe3);

        JLabel lbNewLabe4 = new JLabel("New label");
        lbNewLabe4.setIcon(new ImageIcon("IMAGES/chest.jpg"));
        lbNewLabe4.setBounds(1059, 149, 401, 236);
        contentPane.add(lbNewLabe4);

        JLabel lbNewLabe5 = new JLabel("New label");
        lbNewLabe5.setIcon(new ImageIcon("IMAGES/cycle.jpg"));
        lbNewLabe5.setBounds(1070, 399, 390, 224);
        contentPane.add(lbNewLabe5);
    }

    public static void main(String[] args) {

        Gallery g = new Gallery();
        g.setVisible(true);
    }
}
