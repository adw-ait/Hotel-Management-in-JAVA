package hotel.management.system;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame implements ActionListener {
    JButton rcpRoom;
    JButton rcpDepartment;
    JButton rcpEmpInfo;
    JButton rcpCustInfo;
    JButton rcpMgrInfo;
    JButton rcpCheckOut;
    JButton rcpUpdeCheck;
    JButton rcpUpdRoomStatus;
    JButton rcpNewCustomer;
    JButton rcpPickUp;
    JButton rcpSearchRooms;
    JButton rcpLogout;

    Reception(){


        int xAxis = 20, yAxis = 30;
        int lblWidth = 150, lblHeight = 30;
        Border blackline = BorderFactory.createLineBorder(Color.black);

        rcpNewCustomer = new JButton("New Customer");
        rcpNewCustomer.setBounds(xAxis,yAxis,lblWidth,lblHeight );
        rcpNewCustomer.setBackground(Color.BLACK);
        rcpNewCustomer.setForeground(Color.WHITE);
        rcpNewCustomer.addActionListener(this);
        add(rcpNewCustomer);

        rcpRoom = new JButton("Room");
        rcpRoom.setBounds(xAxis,yAxis + 40,lblWidth,lblHeight);
        rcpRoom.setBackground(Color.BLACK);
        rcpRoom.setForeground(Color.white);
        rcpRoom.addActionListener(this);
        add(rcpRoom);

        rcpDepartment = new JButton("Department");
        rcpDepartment.setBounds(xAxis,yAxis + 80,lblWidth,lblHeight);
        rcpDepartment.setBackground(Color.BLACK);
        rcpDepartment.setForeground(Color.white);
        rcpDepartment.addActionListener(this);
        add(rcpDepartment);

        rcpEmpInfo = new JButton("All Employee Info");
        rcpEmpInfo.setBounds(xAxis,yAxis + 120,lblWidth,lblHeight);
        rcpEmpInfo.setBackground(Color.BLACK);
        rcpEmpInfo.setForeground(Color.white);
        rcpEmpInfo.addActionListener(this);
        add(rcpEmpInfo);

        rcpCustInfo = new JButton("Customer Info");
        rcpCustInfo.setBounds(xAxis,yAxis + 160,lblWidth,lblHeight);
        rcpCustInfo.setBackground(Color.BLACK);
        rcpCustInfo.setForeground(Color.white);
        rcpCustInfo.addActionListener(this);
        add(rcpCustInfo);

        rcpMgrInfo = new JButton("Manager Info");
        rcpMgrInfo.setBounds(xAxis,yAxis + 200,lblWidth,lblHeight);
        rcpMgrInfo.setBackground(Color.BLACK);
        rcpMgrInfo.setForeground(Color.white);
        rcpMgrInfo.addActionListener(this);
        add(rcpMgrInfo);

        rcpCheckOut = new JButton("Check Out");
        rcpCheckOut.setBounds(xAxis,yAxis + 240,lblWidth,lblHeight);
        rcpCheckOut.setBackground(Color.BLACK);
        rcpCheckOut.setForeground(Color.white);
        rcpCheckOut.addActionListener(this);
        add(rcpCheckOut);

        rcpUpdeCheck = new JButton("Update Check Status");
        rcpUpdeCheck.setBounds(xAxis,yAxis + 280,lblWidth,lblHeight);
        rcpUpdeCheck.setBackground(Color.BLACK);
        rcpUpdeCheck.setForeground(Color.white);
        rcpUpdeCheck.addActionListener(this);
        add(rcpUpdeCheck);

        rcpUpdRoomStatus = new JButton("Update Room Status");
        rcpUpdRoomStatus.setBounds(xAxis,yAxis + 320,lblWidth,lblHeight);
        rcpUpdRoomStatus.setBackground(Color.BLACK);
        rcpUpdRoomStatus.setForeground(Color.white);
        rcpUpdRoomStatus.addActionListener(this);
        add(rcpUpdRoomStatus);

        rcpPickUp = new JButton("Pick Up Service");
        rcpPickUp.setBounds(xAxis,yAxis + 360,lblWidth,lblHeight);
        rcpPickUp.setBackground(Color.BLACK);
        rcpPickUp.setForeground(Color.white);
        rcpPickUp.addActionListener(this);
        add(rcpPickUp);

        rcpSearchRooms = new JButton("Search Rooms");
        rcpSearchRooms.setBounds(xAxis,yAxis + 400,lblWidth,lblHeight);
        rcpSearchRooms.setBackground(Color.BLACK);
        rcpSearchRooms.setForeground(Color.white);
        rcpSearchRooms.addActionListener(this);
        add(rcpSearchRooms);

        rcpLogout = new JButton("Logout");
        rcpLogout.setBounds(xAxis,yAxis + 440,lblWidth,lblHeight);
        rcpLogout.setBackground(Color.BLACK);
        rcpLogout.setForeground(Color.white);
        rcpLogout.addActionListener(this);
        add(rcpLogout);



        int imageHeight = 300, imageWidth = 500;
        ImageIcon reception = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/reception.jpg"));
        Image receptionSizeChange = reception.getImage().getScaledInstance(imageWidth,imageHeight,Image.SCALE_DEFAULT);
        ImageIcon rcpImg = new ImageIcon(receptionSizeChange);
        JLabel rcpImgLbl = new JLabel(rcpImg);
        rcpImgLbl.setBounds(xAxis + 150, yAxis + 80, imageWidth, imageHeight);
        add(rcpImgLbl);

        setResizable(false);
        setTitle("RECEPTION");
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setSize(700 ,560);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Reception();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == rcpRoom ){

        }else if(ae.getSource() == rcpNewCustomer ){


        }else if(ae.getSource() == rcpDepartment ){

        }if(ae.getSource() == rcpEmpInfo ){

        }else if(ae.getSource() == rcpCustInfo ){

        }else if(ae.getSource() == rcpMgrInfo ){

        }else if(ae.getSource() == rcpCheckOut ){

        }else if(ae.getSource() == rcpUpdeCheck ){

        }else if(ae.getSource() == rcpUpdRoomStatus ){

        }else if(ae.getSource() == rcpPickUp ){

        }else if(ae.getSource() == rcpSearchRooms ){

        }else if(ae.getSource() == rcpLogout ){
            setVisible(false);
        }
    }
}
