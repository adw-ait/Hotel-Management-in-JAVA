package hotel.management.system;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {
    JMenuBar mb;
    JMenu hm, admin;
    JMenuItem receptionItem, addEmployeeItem, addRoomsItem, addDriversItem;
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int width = (int)screenSize.getWidth();
    int height = (int)screenSize.getHeight();

    Dashboard(){

        mb = new JMenuBar();
        add(mb);

        hm = new JMenu("Hotel Management");
        mb.add(hm);

        admin = new JMenu("ADMIN");
        mb.add(admin);

        receptionItem = new JMenuItem("RECEPTION");
        hm.add(receptionItem);

        addEmployeeItem = new JMenuItem("ADD EMPLOYEE");
        admin.add(addEmployeeItem);

        addRoomsItem = new JMenuItem("ADD ROOMS");
        admin.add(addRoomsItem);

        addDriversItem = new JMenuItem("ADD DRIVERS");
        admin.add(addDriversItem);

        mb.setBounds(0,0, width,30);

        ImageIcon dashImage = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/dashboard2.jpg"));
//        Image dashChangeSize = dashImage.getImage().getScaledInstance(width,height, Image.SCALE_DEFAULT);
//        ImageIcon changedImg = new ImageIcon(dashChangeSize);
        JLabel dashImageLabel = new JLabel(dashImage);
        dashImageLabel.setBounds(0,0, width, height);
        add(dashImageLabel);


        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setBounds(0,0,width, height);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Dashboard().setVisible(true);
    }
}
