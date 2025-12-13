
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;

public class Trainner extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		
		AdminPage frame = new AdminPage();
		frame.setVisible(true);
		
	}

	public Trainner() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("images/logoSmall.jpg"));
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
		
		/*JButton Button1 = new JButton("USER LIST");
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				setVisible(true);
				new AdminPage().setVisible(true);
			}
		});
		Button1.setBounds(259, 66, 112, 37);
		contentPane.add(Button1);*/
		
		JButton Button3 = new JButton("TRAINNER INFO");
		Button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				setVisible(true);
				new Trainner().setVisible(true);
			}
		});
		Button3.setBounds(740, 66, 130, 37);
		contentPane.add(Button3);
		
		JButton Button6 = new JButton("LOG OUT");
		Button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  Home h = new Home();
                                                                             h.setVisible(true);
                                                                                h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                h.setBounds(0, 0, 1580, 1080);
                h.setTitle("Fitness Club");
               dispose();
  
                                                                             
                                                                             
                                                                             
				
			}
		});
		Button6.setBounds(1257, 66, 122, 37);
		contentPane.add(Button6);
		JTextArea t = new JTextArea();
		t.setText("Trainners Are:");
		t.setTabSize(12);
		t.setLineWrap(true);
		t.setForeground(Color.WHITE);
		t.setFont(new Font("Times New Roman", Font.BOLD, 40));
		t.setBackground(new Color(0, 0, 0, 0));
		t.setBounds(206, 199, 288, 61);
		contentPane.add(t);
		
		JTextArea tx = new JTextArea();
		tx.setText("Abdur Rahman\r\nAbdur Rahim\r\nAbdur Jabbar\r\nAbdur Wahhab ");
		tx.setTabSize(12);
		tx.setLineWrap(true);
		tx.setForeground(Color.WHITE);
		tx.setFont(new Font("Bodoni MT", Font.BOLD | Font.ITALIC, 29));
		tx.setBackground(new Color(0, 0, 0, 0));
		tx.setBounds(206, 270, 288, 184);
		contentPane.add(tx);
		
		JLabel NewLabel = new JLabel("New label");
		NewLabel.setIcon(new ImageIcon("images/pexels.jpg"));
		NewLabel.setBounds(0, 0, 1550, 801);
		contentPane.add(NewLabel);
		
		
		
		
	}
}
