package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {
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
        receptionItem.addActionListener(this);

        addEmployeeItem = new JMenuItem("ADD EMPLOYEE");
        admin.add(addEmployeeItem);
        addEmployeeItem.addActionListener(this);

        addRoomsItem = new JMenuItem("ADD ROOMS");
        admin.add(addRoomsItem);
        addRoomsItem.addActionListener(this);

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

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (addEmployeeItem.equals(ae.getSource())) {
            new AddEmployee().setVisible(true);
        } else if (addRoomsItem.equals(ae.getSource())) {
            new AddRooms().setVisible(true);
        } else if (receptionItem.equals(ae.getSource())) {
            new Reception().setVisible(true);
        }

//        if (ae.getSource() == addEmployeeItem){
//            new AddEmployee().setVisible(true);
//        }else if (ae.getSource() == addRoomsItem){
//            new AddRooms().setVisible(true);
//        }
    }
}
