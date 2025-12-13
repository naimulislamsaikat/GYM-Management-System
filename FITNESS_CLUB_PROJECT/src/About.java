


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
import static java.awt.Frame.MAXIMIZED_BOTH;

public class About extends JFrame {

	private JPanel contentPane;

	public About () {
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
      s.setVisible(true);
      s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      s.setBounds(0, 0, 1580, 1080);
     s.setTitle("Fitness Club");
			}
		});

		JTextArea txtrGetInThe = new JTextArea();
		txtrGetInThe.setForeground(new Color(255, 255, 255));
		txtrGetInThe.setTabSize(12);
		txtrGetInThe.setFont(new Font("Times New Roman", Font.BOLD, 17));
		txtrGetInThe.setLineWrap(true);
		txtrGetInThe.setWrapStyleWord(true);
		txtrGetInThe.setText(
				"At Fitness Plus Gym & Health Club Uttara, our approach is what makes us the best Fitness Center in the Uttara area; with all the latest equipments, certified instructors and trainers, separate gym area for male & Female without any specific hours, we are here to help you reach your fitness goals. Our services include; Personalized fitness analysis, fitness diet plans, One-on-One fitness consultations with our certified Medical Consultant, etc. It doesn’t matter if you’re just starting, or you're getting in to the next level. At Fitness Plus Gym & Health Club Uttara, we are with you in every step.");
		txtrGetInThe.setBounds(71, 248, 426, 259);
		txtrGetInThe.setBackground(new Color(0, 0, 0, 0));
		contentPane.add(txtrGetInThe);

		JLabel NewLabel = new JLabel("New label");
		NewLabel.setForeground(new Color(255, 255, 255));
		NewLabel.setIcon(new ImageIcon("IMAGES/logoSmall.jpg"));
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

		JTextArea txtrAboutUs = new JTextArea();
		txtrAboutUs.setForeground(new Color(255, 255, 255));
		txtrAboutUs.setText("About Us.");
		txtrAboutUs.setTabSize(10);
		txtrAboutUs.setLineWrap(true);
		txtrAboutUs.setFont(new Font("Times New Roman", Font.BOLD, 30));
		txtrAboutUs.setBounds(71, 199, 176, 39);
		txtrAboutUs.setBackground(new Color(0, 0, 0, 0));
		contentPane.add(txtrAboutUs);

		JLabel lbNewLabel = new JLabel("New label");
		lbNewLabel.setIcon(new ImageIcon("IMAGES/homepagephoto.jpg"));
		lbNewLabel.setBounds(0, 0, 1550, 801);
		contentPane.add(lbNewLabel);
	}

	public static void main(String[] args) {

		About a = new About();
		a.setVisible(true);

	}
}