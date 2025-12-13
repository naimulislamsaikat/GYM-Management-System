
import java.sql.Connection;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Features extends JFrame {

	private JLabel V1, V2, V3, V4;
	private JButton resultButton;
	private JPanel JP1;
	private Container B;
	private Cursor C;
                  private Font FF;
	private String registeredUsername;
	private JRadioButton Abdur_Rahman, Abdur_Rahim, Abdul_Jabbar, Abdul_Wahhab;
	private JTextArea t;
	private JTextArea txtrBmiCategoriesUnderweight;

	Features(String registeredUsername) {
		this.registeredUsername = registeredUsername;
		components();

	}

	public void components() {
		B = getContentPane();
		B.setLayout(null);
		B.setBackground(Color.black);
		C = new Cursor(Cursor.HAND_CURSOR);
                                     Color customcolor = new Color(255, 185, 93);
                                       FF = new Font("Lato", Font.BOLD, 22);
		JP1 = new JPanel();
		JP1.setBackground(Color.white);
		JP1.setBounds(860, 100, 450, 350);
		JP1.setLayout(null);

		V2 = new JLabel("Height(M):");
		V2.setBounds(20, 100, 100, 40);
		V2.setFont(new Font("Arial", Font.BOLD, 16));
		JTextField heightTextField = new JTextField();
		heightTextField.setFont(new Font("Arial", Font.BOLD, 16));
		heightTextField.setBounds(130, 100, 200, 35);

		V3 = new JLabel("Weight(Kg):");
		V3.setBounds(20, 150, 100, 40);
		V3.setFont(new Font("Arial", Font.BOLD, 16));
		JTextField weightTextField = new JTextField();
		weightTextField.setBounds(130, 150, 200, 35);
		weightTextField.setFont(new Font("Arial", Font.BOLD, 16));
		JTextField resultTextField = new JTextField();
		resultTextField.setBounds(200, 200, 130, 40);
		resultTextField.setFont(new Font("Arial", Font.BOLD, 25));

		resultButton = new JButton("CALCULATE");
		resultButton.setCursor(C);
		resultButton.setForeground(Color.blue);
		resultButton.setBorder(BorderFactory.createEmptyBorder());
		resultButton.setContentAreaFilled(false);
		resultButton.setFont(new Font("Arial", Font.BOLD, 16));
		resultButton.setBounds(40, 200, 120, 50);
		resultButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Calculate BMI
				double height = Double.parseDouble(heightTextField.getText());
				double weight = Double.parseDouble(weightTextField.getText());
				double bmi = weight / (height * height);

				// Display the result in the resultTextField
				resultTextField.setText(String.format("%.2f", bmi));

				// Insert BMI into the database
				Connection conn = DBConnection.getConnection();
				try {
					String updateQuery = "UPDATE users SET BMI = ? WHERE Username = ?";
					PreparedStatement updatePs = conn.prepareStatement(updateQuery);
					updatePs.setDouble(1, bmi);
					updatePs.setString(2, registeredUsername); // Use the registered username

					int rowsUpdated = updatePs.executeUpdate();
					if (rowsUpdated > 0) {
						JOptionPane.showMessageDialog(null, "BMI inserted into the database!");
					} else {
						JOptionPane.showMessageDialog(null, "Error inserting BMI into the database!");
					}
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
		});

		V4 = new JLabel("BMI");
		V4.setBounds(20, 10, 100, 40);
		V4.setFont(new Font("Arial", Font.BOLD, 25));
		
		Abdur_Rahman = new JRadioButton("Abdur Rahman");
		Abdur_Rahman.setFont(new Font("Tahoma", Font.BOLD, 12));
		Abdur_Rahman.setBounds(400, 200, 250, 35);
                Abdur_Rahman.setFont(FF);
                                     Abdur_Rahman.setForeground(customcolor);
                                     Abdur_Rahman.setBorder(BorderFactory.createEmptyBorder());
                                  Abdur_Rahman.setContentAreaFilled(false);
		Abdur_Rahman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateTrainerInDatabase("Abdur Rahman");
			}
		});
		B.add(Abdur_Rahman);

		Abdur_Rahim = new JRadioButton("Abdur Rahim");
		Abdur_Rahim.setFont(new Font("Tahoma", Font.BOLD, 12));
		Abdur_Rahim.setBounds(400, 237, 250, 33);
                Abdur_Rahim.setFont(FF);
                                     Abdur_Rahim.setForeground(customcolor);
                                     Abdur_Rahim.setBorder(BorderFactory.createEmptyBorder());
                                  Abdur_Rahim.setContentAreaFilled(false);
		Abdur_Rahim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateTrainerInDatabase("Abdur Rahim");
			}
		});
		B.add(Abdur_Rahim);

		Abdul_Jabbar = new JRadioButton("Abdul Jabbar");
		Abdul_Jabbar.setFont(new Font("Tahoma", Font.BOLD, 12));
		Abdul_Jabbar.setBounds(400, 272, 250, 33);
                Abdul_Jabbar.setFont(FF);
                                     Abdul_Jabbar.setForeground(customcolor);
                                     Abdul_Jabbar.setBorder(BorderFactory.createEmptyBorder());
                                  Abdul_Jabbar.setContentAreaFilled(false);
		Abdul_Jabbar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateTrainerInDatabase("Abdul Jabbar");
			}
		});
		B.add(Abdul_Jabbar);

		Abdul_Wahhab = new JRadioButton("Abdul Wahhab");
		Abdul_Wahhab.setFont(new Font("Tahoma", Font.BOLD, 12));
		Abdul_Wahhab.setBounds(400, 307, 250, 33);
                                     Abdul_Wahhab.setFont(FF);
                                     Abdul_Wahhab.setForeground(customcolor);
                                     Abdul_Wahhab.setBorder(BorderFactory.createEmptyBorder());
                                  Abdul_Wahhab.setContentAreaFilled(false);
		Abdul_Wahhab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateTrainerInDatabase("Abdul Wahhab");
			}
		});
		B.add(Abdul_Wahhab);

		JP1.add(V4);
		JP1.add(resultTextField);
		JP1.add(V2);
		JP1.add(heightTextField);
		JP1.add(V3);
		JP1.add(weightTextField);
		JP1.add(resultButton);
		B.add(JP1);
                
                
                t = new JTextArea();
		t.setText("Trainers Are:");
		t.setTabSize(12);
		t.setLineWrap(true);
		t.setForeground(Color.WHITE);
		t.setFont(new Font("Times New Roman", Font.BOLD, 40));
		t.setBackground(new Color(0, 0, 0, 0));
		t.setBounds(340, 133, 288, 61);
		B.add(t);
                txtrBmiCategoriesUnderweight = new JTextArea();
		txtrBmiCategoriesUnderweight.setText("BMI Categories:\r\nUnderweight = <18.5\r\nNormal weight = 18.5–24.9\r\nOverweight = 25–29.9\r\nObesity = BMI of 30 or greater");
		txtrBmiCategoriesUnderweight.setTabSize(12);
		txtrBmiCategoriesUnderweight.setLineWrap(true);
		txtrBmiCategoriesUnderweight.setForeground(Color.WHITE);
		txtrBmiCategoriesUnderweight.setFont(new Font("Times New Roman", Font.BOLD, 17));
		txtrBmiCategoriesUnderweight.setBackground(new Color(0, 0, 0, 0));
		txtrBmiCategoriesUnderweight.setBounds(80, 503, 288, 109);
		B.add(txtrBmiCategoriesUnderweight);
                JButton b = new JButton("For Diet Chart");
		b.setFont(new Font("Times New Roman", Font.BOLD, 15));
		b.setBounds(1004, 548, 144, 70);
                b.setBackground(customcolor);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				setVisible(true);
				new DietPlan().setVisible(true);
			}
		});
		B.add(b);
                 JButton BC = new JButton("Back");
		BC.setFont(new Font("Times New Roman", Font.BOLD, 15));
		BC.setBounds(600, 548, 144, 70);
                BC.setBackground(customcolor);
		BC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  PRACTICE s = new PRACTICE();
                s.setVisible(true);
                s.setIconImage(Toolkit.getDefaultToolkit().getImage("IMAGES/logoSmall.jpg"));
                s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                s.setBounds(0, 0, 1580, 1080);
                s.setTitle("Fitness Club");
               dispose();
			}
		});
		B.add(BC);

		ImageIcon img = new ImageIcon("IMAGES/pexels.jpg");
		Image image = img.getImage().getScaledInstance(1580, 850, Image.SCALE_SMOOTH);
		V1 = new JLabel();
		V1.setIcon(new ImageIcon(image));
		V1.setBounds(0, 0, 1580, 850);
		V1.setHorizontalAlignment(JLabel.LEADING);
		V1.setVerticalAlignment(JLabel.CENTER);
		B.add(V1);
                
		
		
		
		
		
		
	}

	private void updateTrainerInDatabase(String trainerName) {
		Connection conn = DBConnection.getConnection();
		try {
			String updateQuery = "UPDATE users SET Trainer = ? WHERE Username = ?";
			PreparedStatement updatePs = conn.prepareStatement(updateQuery);
			updatePs.setString(1, trainerName);
			updatePs.setString(2, registeredUsername); // Use the registered username

			int rowsUpdated = updatePs.executeUpdate();
			if (rowsUpdated > 0) {
				JOptionPane.showMessageDialog(null, "Trainer updated in the database!");
			} else {
				JOptionPane.showMessageDialog(null, "Error updating Trainer in the database!");
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
        
}
