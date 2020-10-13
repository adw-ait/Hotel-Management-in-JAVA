package hotel.management.system;

import javax.swing.*;
import java.awt.*;

public class EmployeeInfo extends JFrame {

    JTable empInfoTable;

    EmployeeInfo(){
        empInfoTable = new JTable();
        empInfoTable.setBounds(0, 40, 1000, 500);
        add(empInfoTable);

//        setResizable(false);
        setTitle("EMPLOYEE INFORMATION");
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setSize(800 ,400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EmployeeInfo();


    }

}
