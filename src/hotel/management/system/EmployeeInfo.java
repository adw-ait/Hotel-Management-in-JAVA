package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import net.proteanit.sql.*;

public class EmployeeInfo extends JFrame implements ActionListener {

    JTable empInfoTable;
    JButton loadBtn;
    JButton backBtn;

    EmployeeInfo(){
        empInfoTable = new JTable();
        empInfoTable.setBounds(0, 40, 1000, 500);
        add(empInfoTable);

        loadBtn = new JButton("Load Data");
        loadBtn.setBounds(350, 560, 120, 30);
        loadBtn.setBackground(Color.BLACK);
        loadBtn.setForeground(Color.WHITE);
        loadBtn.addActionListener(this);
        add(loadBtn);

        backBtn = new JButton("Back");
        backBtn.setBounds(530, 560, 120, 30);
        backBtn.setForeground(Color.white);
        backBtn.setBackground(Color.BLACK);
        backBtn.addActionListener(this);
        add(backBtn);


//        setResizable(false);
        setTitle("EMPLOYEE INFORMATION");
        setLayout(null);
//        getContentPane().setBackground(Color.WHITE);
        setSize(1000 ,650);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EmployeeInfo();


    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == loadBtn){
            try{
                conn c = new conn();
                String str  = "select * from employee";
                ResultSet rs = c.st.executeQuery(str);
                empInfoTable.setModel(DbUtils.resultSetToTableModel(rs));
            }catch (Exception e){
                System.out.println(e);
            }
        }else if (ae.getSource() == backBtn){
            this.setVisible(false);
            new Reception().setVisible(true);
        }
    }
}
