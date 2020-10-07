package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JLabel userNameLabel, pwdLabel;
    JTextField userNameTxt;
    JPasswordField pwdTxt;
    JButton loginBtn, cancelBtn;
    JLabel imgContainer;

    Login(){
        userNameLabel = new JLabel("Username");
        userNameLabel.setBounds(60, 190, 100, 30);
        add(userNameLabel);

        userNameTxt = new JTextField();
        userNameTxt.setBounds(150, 190, 150, 30);
        add(userNameTxt);


        pwdLabel = new JLabel("Password");
        pwdLabel.setBounds(60, 240, 100, 30);
        add(pwdLabel);

        pwdTxt = new JPasswordField();
        pwdTxt.setBounds(150, 240, 150, 30);
        add(pwdTxt);

        loginBtn = new JButton("Login");
        loginBtn.setBackground(Color.BLACK);
        loginBtn.setForeground(Color.WHITE);
        loginBtn.setBounds(60, 300, 110,30);
        loginBtn.addActionListener(this);
        add(loginBtn);

        cancelBtn = new JButton("Cancel");
        cancelBtn.setBackground(Color.BLACK);
        cancelBtn.setForeground(Color.WHITE);
        cancelBtn.setBounds(190, 300, 110,30);
        cancelBtn.addActionListener(this);
        add(cancelBtn);

        ImageIcon profileImg = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/profile.png"));
        imgContainer = new JLabel(profileImg);
        imgContainer.setBounds(130,20,128,128);
        add(imgContainer);

        setLayout(null);
        setBounds(500, 300, 400, 450);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == loginBtn){
            String usrNam = userNameTxt.getText();
            String password = pwdTxt.getText();
            conn c = new conn();
            String str = "select * from login where username = '"+usrNam+"' and password = '"+password+"'";

            try{
                ResultSet rs= c.st.executeQuery(str);
                if (rs.next()){
                    JOptionPane.showMessageDialog(null, "Logged in successfully");
                    new Dashboard().setVisible(true);
                    this.setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect username and password");
                    this.setVisible(false);
                }
            }catch (Exception e){
                System.out.println("galat code hain");
            }

        }else if (ae.getSource() == cancelBtn){
            System.exit(0);
        }

    }
}
