
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

public class DietPlan extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		
		DietPlan frame = new DietPlan();
		frame.setVisible(true);
		
	}

	public DietPlan() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP\\Downloads\\logo.jpeg"));
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
		
		JButton Button1 = new JButton("Exit");
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		Button1.setBounds(1389, 44, 92, 37);
		contentPane.add(Button1);
		
		
		
		JLabel b = new JLabel("New label");
		b.setBackground(new Color(0, 0, 0));
		b.setForeground(new Color(255, 255, 255));
		b.setIcon(new ImageIcon("E:\\University\\project\\images\\logoSmall.jpg"));
		b.setBounds(71, 643, 70, 75);
		b.setBackground(new Color(0,0,0,0));
		contentPane.add(b);
		
		JTextArea txFC = new JTextArea();
		txFC.setForeground(new Color(255, 255, 255));
		txFC.setText("FITNESS CLUB");
		txFC.setTabSize(10);
		txFC.setLineWrap(true);
		txFC.setFont(new Font("Times New Roman", Font.BOLD, 30));
		txFC.setBounds(151, 679, 237, 39);
		txFC.setBackground(new Color(0,0,0,0));
		contentPane.add(txFC);
		
		JTextArea txA = new JTextArea();
		txA.setForeground(new Color(255, 255, 255));
		txA.setText("Address");
		txA.setTabSize(10);
		txA.setLineWrap(true);
		txA.setFont(new Font("Times New Roman", Font.BOLD, 30));
		txA.setBounds(759, 643, 176, 39);
		txA.setBackground(new Color(0,0,0,0));
		contentPane.add(txA);
		
		JTextArea txC = new JTextArea();
		txC.setForeground(new Color(255, 255, 255));
		txC.setText("Email. fitnessclub@gmail.com\r\nMobile. 01234567891");
		txC.setTabSize(10);
		txC.setLineWrap(true);
		txC.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txC.setBounds(1244, 679, 237, 39);
		txC.setBackground(new Color(0,0,0,0));
		contentPane.add(txC);
		
		JTextArea txCon = new JTextArea();
		txCon.setForeground(new Color(255, 255, 255));
		txCon.setText("Contact with us");
		txCon.setTabSize(10);
		txCon.setLineWrap(true);
		txCon.setFont(new Font("Times New Roman", Font.BOLD, 25));
		txCon.setBounds(1244, 643, 237, 39);
		txCon.setBackground(new Color(0,0,0,0));
		contentPane.add(txCon);
		
		JTextArea txJFP = new JTextArea();
		txJFP.setForeground(new Color(255, 255, 255));
		txJFP.setText("Jamuna Future Park\r\nBasundhara Area,Dhaka");
		txJFP.setTabSize(10);
		txJFP.setLineWrap(true);
		txJFP.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txJFP.setBounds(759, 679, 176, 39);
		txJFP.setBackground(new Color(0,0,0,0));
		contentPane.add(txJFP);
		
		JLabel a = new JLabel("New label");
		a.setIcon(new ImageIcon("IMAGES/foodplan.png"));
		a.setBounds(54, 46, 304, 264);
		contentPane.add(a);
		
		JLabel f = new JLabel("New label");
		f.setIcon(new ImageIcon("IMAGES/OIP.jpg"));
		f.setBounds(52, 349, 257, 246);
		contentPane.add(f);
		
		JLabel c = new JLabel("New label");
		c.setIcon(new ImageIcon("IMAGES/A.jpg"));
		c.setBounds(788, 136, 304, 438);
		contentPane.add(c);
		
		JLabel d = new JLabel("New label");
		d.setIcon(new ImageIcon("IMAGES/R.jpg"));
		d.setBounds(1127, 127, 298, 456);
		contentPane.add(d);
		
		JLabel e = new JLabel("New label");
		e.setIcon(new ImageIcon("IMAGES/J.png"));
		e.setBounds(398, 44, 351, 622);
		contentPane.add(e);
	}
}
