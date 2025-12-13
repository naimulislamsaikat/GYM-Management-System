
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

public class Developer extends JFrame {

    private JPanel contentPane;

    public static void main(String[] args) {

        Developer frame = new Developer();
        frame.setVisible(true);

    }

    public Developer() {
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

        /*JButton Button1 = new JButton("PROFILE");
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				setVisible(true);
				//new UserPage().setVisible(true);
			}
		});
		Button1.setBounds(142, 66, 112, 37);
		contentPane.add(Button1);
		
		JButton Button2 = new JButton("PAYMENT");
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				setVisible(true);
				//new Payment().setVisible(true);
			}
		});
		Button2.setBounds(477, 66, 130, 37);
		contentPane.add(Button2);
		
		JButton Button3 = new JButton("DEVELOPER");
		Button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				setVisible(true);
				new Developer().setVisible(true);
			}
		});
		Button3.setBounds(899, 66, 130, 37);
		contentPane.add(Button3);*/
        JButton Button6 = new JButton("Back");
        Button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                PRACTICE s = new PRACTICE();
                s.setVisible(true);
                s.setTitle("Fitness Club");
                s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                s.setBounds(0, 0, 1580, 1080);
                s.setExtendedState(MAXIMIZED_BOTH);
                dispose();

            }
        });
        Button6.setBounds(1275, 66, 122, 37);
        contentPane.add(Button6);

        JLabel lbNewLabel = new JLabel("New label");
        lbNewLabel.setIcon(new ImageIcon("images/faculty.png"));
        lbNewLabel.setBounds(30, 165, 461, 277);
        contentPane.add(lbNewLabel);

        JLabel lbNewLabe2 = new JLabel("New label");
        lbNewLabe2.setIcon(new ImageIcon("images/tahsin.png"));
        lbNewLabe2.setBounds(526, 165, 503, 277);
        contentPane.add(lbNewLabe2);

        JLabel lbNewLabe3 = new JLabel("New label");
        lbNewLabe3.setIcon(new ImageIcon("images/saikat.png"));
        lbNewLabe3.setBounds(526, 455, 503, 288);
        contentPane.add(lbNewLabe3);

        JLabel lbNewLabe4 = new JLabel("New label");
        lbNewLabe4.setIcon(new ImageIcon("images/mridul.png"));
        lbNewLabe4.setBounds(1056, 165, 460, 277);
        contentPane.add(lbNewLabe4);

        JLabel lbNewLabe5 = new JLabel("New label");
        lbNewLabe5.setIcon(new ImageIcon("images/akib.png"));
        lbNewLabe5.setBounds(30, 455, 460, 288);
        contentPane.add(lbNewLabe5);

        JLabel lbNewLabe6 = new JLabel("New label");
        lbNewLabe6.setIcon(new ImageIcon("images/arfin.png"));
        lbNewLabe6.setBounds(1056, 455, 460, 288);
        contentPane.add(lbNewLabe6);
    }
}
