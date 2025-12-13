import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class AdminPage extends JFrame {

    private JPanel contentPane;
    private JLabel nameLabel;
    

    public static void main(String[] args) {
        AdminPage frame = new AdminPage();
        frame.setVisible(true);
    }

    public AdminPage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage("images/logoSmall.jpg"));
        setFont(new Font("Dialog", Font.BOLD, 14));
        setTitle("FITNESS CLUB");
          Color CUSTOM = new Color(255, 185, 93);
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
                new Trainner().setVisible(true);
            }
        });
        Button1.setBounds(259, 66, 112, 37);
        contentPane.add(Button1);*/

        JButton Button3 = new JButton("TRAINER INFO");
        Button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                setVisible(true);
                new Trainner().setVisible(true);
            }
        });
        Button3.setBounds(740, 66, 130, 37);
        contentPane.add(Button3);

        JButton Button6 = new JButton("Back ");
        Button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                setVisible(false);
            }
        });
        Button6.setBounds(1257, 66, 122, 37);
        contentPane.add(Button6);

        JLabel userCountLabel = new JLabel();
        userCountLabel.setFont(new Font("Arial", Font.BOLD, 30));
        userCountLabel.setForeground(CUSTOM);
        userCountLabel.setBounds(100, 200, 500, 30);
        
        contentPane.add(userCountLabel);
         nameLabel = new JLabel();
        nameLabel.setFont(new Font("Lato", Font.PLAIN, 14));
        nameLabel.setForeground(Color.WHITE);
        nameLabel.setBounds(100, 240, 1050, 30);
        contentPane.add(nameLabel);

        // Get the count of users with non-null Cardnumber and CVC
          Connection conn = DBConnection.getConnection();
        try {
            String query = "SELECT COUNT(*) AS userCount, GROUP_CONCAT(Name SEPARATOR ', ') AS names FROM users WHERE Cardnumber IS NOT NULL AND CVC IS NOT NULL";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                int userCount = rs.getInt("userCount");
                String names = rs.getString("names");
                userCountLabel.setText("Active Users: " + userCount);
                 nameLabel.setFont(new Font("Lato", Font.BOLD, 20));
        nameLabel.setForeground(CUSTOM);
                nameLabel.setText("<html>Name: " + names+"</html>");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        JLabel NewLabel = new JLabel("New label");
        NewLabel.setIcon(new ImageIcon("IMAGES/GYM.jpg"));
        NewLabel.setBounds(0, 0, 1550, 801);
        contentPane.add(NewLabel);
    }
}
