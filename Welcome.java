import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Welcome extends JFrame {

    private Container c;
    private ImageIcon icon, logo, welcome,image;
    private JLabel imgLabel,background,label1,label2;
    private Font f1,f2;
    private JButton btn1, btn2, btn3, nBtn;
    private Cursor cursor;

    Welcome() {
        // Frame Layout
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Tarvel Agency");
        this.setSize(1100, 800);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#F2F2F2"));

        // Icon
        icon = new ImageIcon(getClass().getResource("/images/Icon.png"));
        this.setIconImage(icon.getImage());

        // Logo and Images
        // logo = new ImageIcon(getClass().getResource("/images/LogoBlue.png"));
        // imgLabel = new JLabel(logo);
        // imgLabel.setBounds(30, 50, logo.getIconWidth(), logo.getIconHeight());
        // c.add(imgLabel);

        // welcome = new ImageIcon(getClass().getResource("/images/Welcome.png"));
        // imgLabel = new JLabel(welcome);
        // imgLabel.setBounds(500, 70, welcome.getIconWidth(), welcome.getIconHeight());
        // c.add(imgLabel);

        // Fonts
        f1 = new Font("Segoe UI Black", Font.BOLD, 40);
        f2 = new Font("Segoe UI Black", Font.BOLD, 25);

        // Cursor for JButtons
        cursor = new Cursor(Cursor.HAND_CURSOR);

        //labels
        label1 = new JLabel("Travel Agency Management System");
        label1.setBounds(190, 50, 900, 100);
        label1.setFont(f1);
        label1.setForeground(Color.BLACK);
        c.add(label1);

        // JButtons
        btn1 = new JButton("Exit");
        btn1.setBounds(240, 600, 200, 50);
        btn1.setFont(f2);
        btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#C00000"));
        c.add(btn1);

        // btn2 = new JButton("Contribution");
        // btn2.setBounds(460, 600, 245, 50);
        // btn2.setFont(f2);
        // btn2.setCursor(cursor);
        // btn2.setForeground(Color.WHITE);
        // btn2.setBackground(Color.decode("#2E75B6"));
        // c.add(btn2);

        btn3 = new JButton("Next");
        btn3.setBounds(560, 600, 200, 50);
        btn3.setFont(f2);
        btn3.setCursor(cursor);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#2E75B6"));
        c.add(btn3);
        
        nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);

        image = new ImageIcon("./images/6990-removebg-preview.png");
		background = new JLabel();
		background.setBounds(250,100,500,500);
		background.setIcon(image);
		// this.add(background);
        c.add(background);

        // Action Listener for JButtons
        // Exit Button
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });

        // // Contribution Button
        // btn2.addActionListener(new ActionListener() {
        //     public void actionPerformed(ActionEvent ae) {

        //         Contribution frame = new Contribution();
        //         frame.setVisible(true);
        //     }
        // });

        // Next Button
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                setVisible(false);
                Home frame = new Home();
                frame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {

        Welcome frame = new Welcome();
        frame.setVisible(true);
    }
}
