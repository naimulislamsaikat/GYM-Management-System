//import com.mycompany.java_project.DBConnection;
//import com.mycompany.oop_project.DBConnection;
//import FITCLUB.Registration;
//import com.mycompany.mavenproject2.Registration;
//import com.mycompany.oop_project.DBConnection;
//import com.mycompany.oop_project.Registration;
//import com.mysql.cj.xdevapi.Statement;
import java.awt.Color;
import java.sql.ResultSet;
import static java.awt.Color.black;
import static java.awt.Color.white;
//import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javax.imageio.*;
//import java.awt.event.FocusEvent;
//import java.awt.event.FocusListener;
import java.sql.Connection;
//import java.sql.DriverManager;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.sql.SQLException;
import java.sql.PreparedStatement;





public class PRACTICE extends JFrame
        
{
    private Container c;
    private JTextField F1;
    private JPasswordField F2;
    private Font  k;
    private Cursor C,C1;
    private JButton jb1,jb2,R,Dev;
    private ImageIcon img;
    private JLabel JL1,JL2,JL3;
    DBConnection conn;
    
    PRACTICE()
    {
        components();
        conn=new DBConnection();
        if(conn==null)
        {
             JOptionPane.showMessageDialog(this, "DB connection not available at this moment", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
     
 public void components() {
    c = this.getContentPane();
    c.setLayout(null);
    //c.setBackground(Color.red);
    C = new Cursor(Cursor.HAND_CURSOR);
    C1=new Cursor(Cursor.TEXT_CURSOR);
    Color ash=new Color(255,255,240);
    k = new Font("Lato", Font.HANGING_BASELINE, 22);
    Dev=new JButton("Developer");
    Dev.setBounds(1200, 720, 200, 50);
   
    
    Dev.setBackground(Color.green);
    Dev.setForeground(Color.black);
    Dev.setFont(k);
    Dev.setCursor(C);
    Dev.addActionListener(new ActionListener() 
    {
        public void actionPerformed(ActionEvent o)
        {
         // dispose();
             Developer RR=new Developer();
             RR.setVisible(true);
             
             RR.setExtendedState(MAXIMIZED_BOTH);
             dispose();
             
        }
    }
   );
    c.add(Dev);
    c.setComponentZOrder(Dev, 0);
  

    jb1 = new JButton("Log in");
    jb1.setBounds(900, 300, 300, 50);
    jb1.setFont(k);
    jb1.setBackground(new Color(66,103,178));
    jb1.setForeground(Color.white);
    jb1.setCursor(C);
    jb1.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        buttonloginactionperformed(e);
    }
});
    JL2 =new JLabel("Username :");

JL2.setBounds(760, 160, 300, 150);
JL2.setFont(k);
JL2.setForeground(white);
c.add(JL2);
JL3 =new JLabel("Password :");
JL3.setFont(k);
JL3.setBounds(760, 200, 300, 150);
JL3.setForeground(white);
c.add(JL3);

    c.add(jb1);
    ImageIcon img = new ImageIcon("IMAGES/pexels.jpg");
Image image = img.getImage().getScaledInstance(1580, 800, Image.SCALE_SMOOTH);

JLabel JL1 = new JLabel();
JL1.setIcon(new ImageIcon(image));
JL1.setPreferredSize(new Dimension(image.getWidth(null), image.getHeight(null)));
JL1.setBounds(0, 0, 1580, 800);
JL1.setHorizontalAlignment(JLabel.LEADING);
JL1.setVerticalAlignment(JLabel.CENTER);
c.add(JL1);

    R=new JButton("REGISTER");
    R.setBounds(900, 350, 300, 50);
    R.setBackground(Color.green);
    R.setForeground(Color.black);
    R.setFont(k);
    R.setCursor(C);
    R.addActionListener(new ActionListener() 
    {
        public void actionPerformed(ActionEvent o)
        {
         // dispose();
             Registration RR=new Registration();
             RR.setVisible(true);
             RR.setTitle("Fitness Club");
             RR.setBounds(0, 0, 1580, 1080);
             RR.setIconImage(Toolkit.getDefaultToolkit().getImage("IMAGES/logoSmall.jpg"));
             RR.setExtendedState(MAXIMIZED_BOTH);
             dispose();
             
        }
    }
   );
    c.add(R);
    c.setComponentZOrder(R, 0);
    
F1= new JTextField();
F1.setBounds(900, 200, 300, 50);
F1.setFont(k);
F1.setBackground(ash); 




c.add(F1);


F2 = new JPasswordField();
F2.setBounds(900, 250, 300, 50);
F2.setFont(k);
F2.setBackground(ash);
     F2.setEchoChar('*');



c.add(F2);
c.setComponentZOrder(F1, 0);
c.setComponentZOrder(F2, 0);
}

public void buttonloginactionperformed(java.awt.event.ActionEvent evt) {
    String username = F1.getText();
    String password = F2.getText();

    if (username.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Username or password should not be empty", "Error", JOptionPane.ERROR_MESSAGE);
    } 
    else if(username.equals("ADMIN") && password.equals("ADMIN"))
    {
                                  AdminPage frame = new AdminPage();
		frame.setVisible(true);
    }
    
    
    
    
    else {
        Connection conn = DBConnection.getConnection();
        try {
            String query = "SELECT * FROM users WHERE Username=? AND Password=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String name = rs.getString("Name"); // store the name of the user
                //String username=rs.getString("Username");
                int age=rs.getInt("Age");
                String address=rs.getString("Address");
                String trainer=rs.getString("Trainer");
                float bbb=rs.getFloat("BMI");
              
                Trainer_selection userPage = new Trainer_selection(username, password, name,age,address,trainer,bbb); // pass the name to the constructor
                userPage.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            System.out.println("Error executing login query!");
            ex.printStackTrace();
        }
    }
}



}
 
//This code checks if the username or password fields are empty. If they are, it displays an error message using a JOptionPane. If they are not empty, it proceeds with the login authentication.
  
