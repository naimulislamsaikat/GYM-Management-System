
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import static java.awt.Color.black;
import static java.awt.Color.white;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;

public class Registration extends JFrame {

    private JTextField T1, T2, T3, T4, T5,T7;
    private JPasswordField T6;
    private JLabel L1, L2, L3, L4, L5, L6, jl,L8,L7;
    private Container C;
    private Font F;
    private JButton Reg, Back;
    private Cursor M;
    // Declare a class-level variable
    private String registeredUsername;


    Registration() {
        components();
    }

    public void components() {

        C = this.getContentPane();
        C.setLayout(null);
        C.setBackground(white);
        Color customcolor = new Color(255, 185, 93);
        Color ash = new Color(255, 255, 240);
        F = new Font("Lato", Font.BOLD, 22);
        M = new Cursor(Cursor.HAND_CURSOR);
        JRadioButton maleRadio = new JRadioButton("Male");
        JRadioButton femaleRadio = new JRadioButton("Female");

// Add the radio buttons to a button group
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        T1 = new JTextField();
        T1.setBounds(900, 150, 350, 50);
        T1.setFont(F);
        T1.setBackground(ash);
        C.add(T1);
        T6 = new JPasswordField();
        T6.setBackground(ash);
        T6.setBounds(900, 480, 350, 50);
        T6.setEchoChar('*');
        T6.setFont(F);

        C.add(T6);

        T2 = new JTextField();
        T2.setBounds(900, 210, 350, 50);
        T2.setBackground(ash);
        T2.setFont(F);
        C.add(T2);
        T3 = new JTextField();
        T3.setBounds(900, 270, 350, 50);
        T3.setBackground(ash);
        T3.setFont(F);
        C.add(T3);
        
        maleRadio.setBounds(900, 345, 250, 30);
        maleRadio.setBorder(BorderFactory.createEmptyBorder());
        maleRadio.setContentAreaFilled(false);
        maleRadio.setForeground(customcolor);
        maleRadio.setFont(F);
        femaleRadio.setContentAreaFilled(false);
        femaleRadio.setBounds(1020, 345, 300, 30);
        femaleRadio.setBorder(BorderFactory.createEmptyBorder());
        femaleRadio.setForeground(customcolor);
        femaleRadio.setFont(F);
        femaleRadio.setContentAreaFilled(false);
        
        C.add(maleRadio);
        C.add(femaleRadio);
        T5 = new JTextField();
        T5.setBounds(900, 400, 350, 50);
        T5.setBackground(ash);
        T5.setFont(F);
        C.add(T5);

        T4 = new JTextField();
        T4.setBounds(900, 540, 350, 50);
        T4.setBackground(ash);
        T4.setFont(F);
        C.add(T4);

        T7 = new JTextField();
        T7.setBounds(900, 600, 350, 50);
        T7.setBackground(ash);
        T7.setFont(F);
        C.add(T7);






        L1 = new JLabel("Name :");

        L1.setForeground(white);
        L1.setBounds(800, 140, 300, 80);
        L1.setFont(F);
        C.add(L1);
        L2 = new JLabel("Username :");
        L2.setForeground(white);
        L2.setBounds(750, 200, 280, 80);
        L2.setFont(F);
        C.add(L2);
        L3 = new JLabel("Age   :");
        L3.setForeground(white);
        L3.setBounds(800, 250, 300, 80);
        L3.setFont(F);
        C.add(L3);
        L4 = new JLabel("Gender :");
        L4.setBounds(800, 320, 300, 80);
        L4.setForeground(white);
        L4.setFont(F);
        C.add(L4);
        L5 = new JLabel("Address :");
        L5.setBounds(790, 390, 300, 80);
        L5.setForeground(white);
        L5.setFont(F);
        C.add(L5);
        L6 = new JLabel("Password :");
        L6.setForeground(white);
        L6.setBounds(770, 470, 300, 80);
        L6.setFont(F);
        C.add(L6);
          L7 = new JLabel("Card Number :");
        L7.setForeground(white);
        L7.setBounds(730, 520, 300, 80);
        L7.setFont(F);
        C.add(L7);
          L8 = new JLabel("CVC/CVV :");
        L8.setForeground(white);
        L8.setBounds(750, 585, 300, 80);
        L8.setFont(F);
        C.add(L8);
        Back = new JButton("BACK");
        Back.setBounds(920, 700, 250, 50);
        Back.setBackground(customcolor);
        Back.setForeground(black);
        Back.setFont(F);
        Back.setCursor(M);
        Back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent l) {
                // dispose();
                PRACTICE s = new PRACTICE();
                s.setVisible(true);
                s.setTitle("Fitness Club");
                s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                s.setBounds(0, 0, 1580, 1080);
                s.setExtendedState(MAXIMIZED_BOTH);

            }
        });
        C.add(Back);

        Reg = new JButton("Register");
        Reg.setBounds(700, 700, 210, 50);
        Reg.setBackground(customcolor);
        Reg.setForeground(Color.black);
        Reg.setFont(F);
        Reg.setCursor(M);
      Reg.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        String Name = T1.getText();
        String Username = T2.getText();
        String Password = T6.getText();
        String AgeStr = T3.getText();
        String Address = T5.getText();
        String CardStr=T7.getText();
        String CcStr=T4.getText();

        // Get the selected gender radio button
        String Gender = "";
        if (maleRadio.isSelected()) {
            Gender = "Male";
        } else if (femaleRadio.isSelected()) {
            Gender = "Female";
        }

        // check if fields are empty
        if (Username.equals("")) {
            JOptionPane.showMessageDialog(null, "Add a username");
        } else if (Name.equals("")) {
            JOptionPane.showMessageDialog(null, "Enter name");
        } else if (Password.equals("")) {
            JOptionPane.showMessageDialog(null, "Add a password");
        } else if (AgeStr.equals("")) {
            JOptionPane.showMessageDialog(null, "Enter age");
        } else if (Gender.equals("")) {
            JOptionPane.showMessageDialog(null, "Select your gender");
        } else if (Address.equals("")) {
            JOptionPane.showMessageDialog(null, "Enter your Address");
        }  
        
        else if(CcStr.equals("")){
                    JOptionPane.showMessageDialog(null, "Enter your CVC/CCV");
                    }
        else if(CcStr.equals("")){
                    JOptionPane.showMessageDialog(null, "Enter your CVC/CCV");
                    }
           else {
            // convert age to integer
            int Age = Integer.parseInt(AgeStr);
             int Cc = Integer.parseInt(CcStr);
             long Card = Long.parseLong(CardStr);

                    

            // store the registered username
            registeredUsername = Username;

            // establish database connection
            Connection conn = DBConnection.getConnection();

            try {
                String query = "INSERT INTO users (Name, Username, Age, Gender, Address, Password, Cardnumber,CVC,BMI) "
                        + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, NULL)"; // NULL for initial BMI value
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, Name);
                ps.setString(2, Username);
                ps.setInt(3, Age);
                ps.setString(4, Gender);
                ps.setString(5, Address);
                ps.setString(6, Password);
                  ps.setLong(7, Card);
                ps.setInt(8, Cc);

                int rowsInserted = ps.executeUpdate();
                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(null, "Registration Successful!");

                    // open UserPage if registration successful
                    UserPage userPage = new UserPage(Username, Password, Name, Age);
                    userPage.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Error inserting data!");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Try another Username");
                ex.printStackTrace();
            }
        }
    }
});


        ImageIcon img = new ImageIcon("IMAGES/pexels.jpg");
        Image image = img.getImage().getScaledInstance(1580, 800, Image.SCALE_SMOOTH);

        jl = new JLabel();
        jl.setIcon(new ImageIcon(image));
        jl.setPreferredSize(new Dimension(image.getWidth(null), image.getHeight(null)));
        jl.setBounds(0, 0, 1580, 800);
        jl.setHorizontalAlignment(JLabel.LEADING);
        jl.setVerticalAlignment(JLabel.CENTER);
        C.add(jl);
        C.add(Reg);
        C.setComponentZOrder(Reg, 0);

    }
}
