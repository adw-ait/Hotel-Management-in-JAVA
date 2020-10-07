package hotel.management.system;

import javax.swing.*;

public class AddEmployee extends JFrame {

    JTextField empNameTxt, empAgeTxt;
    JRadioButton empGenderRadio;


    AddEmployee(){

        JLabel empName = new JLabel("NAME");
        empName.setBounds(10,0,50,50);
        add(empName);

        empNameTxt = new JTextField();
        empNameTxt.setBounds(100, 15, 120, 20);
        add(empNameTxt);

        JLabel empAge = new JLabel("AGE");
        empAge.setBounds(10,35,50,50);
        add(empAge);

        empAgeTxt = new JTextField();
        empAgeTxt.setBounds(100, 50, 120, 20);
        add(empAgeTxt);

        JLabel empGender = new JLabel("GENDER");
        empGender.setBounds(10,70,50,50);
        add(empGender);

        JLabel empJob = new JLabel("JOB");
        empJob.setBounds(10,105,50,50);
        add(empJob);

        JLabel empSalary = new JLabel("SALARY");
        empSalary.setBounds(10,140,50,50);
        add(empSalary);

        JLabel empPhone = new JLabel("PHONE");
        empPhone.setBounds(10,175,50,50);
        add(empPhone);

        JLabel empAadhar = new JLabel("AADHAR ID");
        empAadhar.setBounds(10,210,50,50);
        add(empAadhar);

        JLabel empEmail = new JLabel("EMAIL");
        empEmail.setBounds(10,245,50,50);
        add(empEmail);


        setLayout(null);
        setBounds(0,0, 400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AddEmployee();
    }
}
