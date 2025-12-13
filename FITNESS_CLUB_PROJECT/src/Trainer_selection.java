
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
/*import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;*/
import javax.swing.BorderFactory;

public class Trainer_selection extends JFrame {

    private JPanel contentPane;
    private String name; // variable to store the name of the user
    private String Password;
    private String username;
    private int age;

    /*public static void main(String[] args) {

    }*/

    public Trainer_selection(String username, String password, String name, int age, String address, String trainer, float bbb) {
        this.username = username;
        this.Password = password;
        this.name = name;
        this.age = age;
        setIconImage(Toolkit.getDefaultToolkit().getImage("IMAGES/logoSmall.jpg"));
        setResizable(true);
        setFont(new Font("Dialog", Font.BOLD, 13));
        setTitle("FITNESS CLUB");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setBounds(0, 0, 1580, 1080);
        setExtendedState(MAXIMIZED_BOTH);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        // fetch the name from the database based on the username and password
        /*Connection conn = DBConnection.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT name FROM users WHERE Username=? AND Password=?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);
            rs = stmt.executeQuery();
            if (rs.next()) {
                name = rs.getString("Name"); // store the name of the user
                username = rs.getString("Username");
                age = rs.getInt("Age");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }*/

        // create the welcome label with the name of the user
       JLabel welcomeLabel = new JLabel("<html>Name: " + name + "<br/>Age: " + age + "<br/>Address:"+address+"<br/>Trainer:"+trainer+"<br/>BMI:"+bbb+"</html>");
welcomeLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
welcomeLabel.setBounds(300, 129, 461, 474);
welcomeLabel.setForeground(Color.WHITE);
welcomeLabel.setVerticalAlignment(JLabel.TOP);
contentPane.add(welcomeLabel);


     //   welcomeLabel = new JLabel("Username: "+ username+","+age);
        welcomeLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
        welcomeLabel.setBounds(300, 180, 461, 474);
        welcomeLabel.setForeground(Color.white);
     //   contentPane.add(welcomeLabel);
        
        /*JButton Button1 = new JButton("PROFILE");
        Button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(true);
            }
        });
        Button1.setBounds(126, 66, 92, 37);
        contentPane.add(Button1);*/

        /*Button Button2 = new JButton("PAYMENT");
        Button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                    subspack pm = new subspack();
                pm.setVisible(true);
            }
        });
        Button2.setBounds(656, 66, 122, 37);
        contentPane.add(Button2);*/

        JButton Button6 = new JButton("LOG OUT");
        Button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        Button6.setBounds(1301, 66, 122, 37);
        contentPane.add(Button6);
        
         
        
 ImageIcon img = new ImageIcon("IMAGES/g.jpg");
Image image = img.getImage().getScaledInstance(1580, 1080, Image.SCALE_SMOOTH);
        JLabel NewLabel = new JLabel("New label");
        NewLabel.setIcon(new ImageIcon(image));
        NewLabel.setBounds(0, 0, 1580, 1080);
        contentPane.add(NewLabel);
        
       
        
//ScrollPane scrollPane = new JScrollPane();
//scrollPane.setBounds(10, 113, 1540, 688);
//contentPane.add(scrollPane);
    }
}
