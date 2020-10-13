package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class AddEmployee extends JFrame implements ActionListener {

    JTextField empNameTxt, empAgeTxt, empJobTxt,empSalaryTxt,empPhoneTxt,empAadharTxt, empEmailTxt;
    JRadioButton empMale, empFemale;
    JComboBox jobCombo;
    JButton addEmployeeBtn, cancelBtn;


    AddEmployee(){

        //TITLE
//        JLabel addEmpTitle = new JLabel("ADD EMPLOYEES");
//        addEmpTitle.setFont(new Font("", Font.PLAIN, 20));
//        addEmpTitle.setBounds(0, 0, 150, 50);
//        add(addEmpTitle);

        //Name Label
        JLabel empName = new JLabel("NAME");
        empName.setBounds(10,15,50,20);
        add(empName);

        //Name textfield
        empNameTxt = new JTextField();
        empNameTxt.setBounds(100, 15, 130, 20);
        add(empNameTxt);

        //Age Label
        JLabel empAge = new JLabel("AGE");
        empAge.setBounds(10,50,50,20);
        add(empAge);

        //Age textfield
        empAgeTxt = new JTextField();
        empAgeTxt.setBounds(100, 50, 130, 20);
        add(empAgeTxt);

        //Gender Label
        JLabel empGender = new JLabel("GENDER");
        empGender.setBounds(10,85,50,20);
        add(empGender);

        //radio button male
        empMale = new JRadioButton("Male");
        empMale.setBounds(100, 85, 60,20);
        empMale.setBackground(Color.WHITE);
        add(empMale);

        //radio button female
        empFemale = new JRadioButton("Female");
        empFemale.setBounds(160, 85, 70,20);
        empFemale.setBackground(Color.WHITE);
        add(empFemale);
//
//
        //Job label
        JLabel empJob = new JLabel("JOB");
        empJob.setBounds(10,120,50,10);
        add(empJob);
//
        //jobs combobox
        String jobTitles[] = {"Front Desk clerks", "House Keeping", "Waiter", "Room service", "Chef", "Accountant"};
        jobCombo = new JComboBox(jobTitles);
        jobCombo.setBounds(100, 120, 130, 20);
        add(jobCombo);
//
        //Salary label
        JLabel empSalary = new JLabel("SALARY");
        empSalary.setBounds(10,155,50,20);
        add(empSalary);

        //salary textfield
        empSalaryTxt = new JTextField();
        empSalaryTxt.setBounds(100, 155, 130, 20);
        add(empSalaryTxt);
//
        //Phone label
        JLabel empPhone = new JLabel("PHONE");
        empPhone.setBounds(10,190,50,20);
        add(empPhone);

        //phone textfield
        empPhoneTxt = new JTextField();
        empPhoneTxt.setBounds(100, 190, 130, 20);
        add(empPhoneTxt);
//
        //aadhar label
        JLabel empAadhar = new JLabel("AADHAR ID");
        empAadhar.setBounds(10,225,50,10);
        add(empAadhar);

        //aadhar textfield
        empAadharTxt = new JTextField();
        empAadharTxt.setBounds(100, 225, 130, 20);
        add(empAadharTxt);
//
        //email label
        JLabel empEmail = new JLabel("EMAIL");
        empEmail.setBounds(10,260,50,10);
        add(empEmail);

        //email textfield
        empEmailTxt = new JTextField();
        empEmailTxt.setBounds(100, 260, 130, 20);
        add(empEmailTxt);
//
        addEmployeeBtn = new JButton("ADD EMPLOYEE");
        addEmployeeBtn.setBounds(100, 300, 130,30);
        add(addEmployeeBtn);
        addEmployeeBtn.addActionListener(this);

//        cancelBtn = new JButton("CANCEL");
//        cancelBtn.setBounds(120, 300, 100,30);
//        add(cancelBtn);



        int imageHeight = 300, imageWidth = 500;
        ImageIcon employeeImg = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/employee.jpg"));
        Image employeeImgChangeSize = employeeImg.getImage().getScaledInstance(imageWidth,imageHeight,Image.SCALE_DEFAULT);
        ImageIcon employeeImgFinal = new ImageIcon(employeeImgChangeSize);
        JLabel employeeImgLabel = new JLabel(employeeImgFinal);
        employeeImgLabel.setBounds(250, 10, imageWidth, imageHeight);
        add(employeeImgLabel);

//        setUndecorated(true);
        setResizable(false);
        setTitle("ADD EMPLOYEE");
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setSize(800 ,400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AddEmployee();
    }

//    @Override
    public void actionPerformed(ActionEvent ae) {
        String name = empNameTxt.getText();
        String age = empAgeTxt.getText();
        String salary = empSalaryTxt.getText();
        String phone = empPhoneTxt.getText();
        String aadhar = empAadharTxt.getText();
        String email = empEmailTxt.getText();
        String gender = null;

        //getSelection
        if (empMale.isSelected()){
            gender = empMale.getText();
        }else if (empFemale.isSelected()){
            gender = empFemale.getText();
        }

        String jobSelected = (String) jobCombo.getSelectedItem();

        conn c = new conn();
        String str = "insert into employee values('"+name+"','"+age+"','"+gender+"','"+jobSelected+"','"+salary+"','"+phone+"','"+aadhar+"','"+email+"')";
        try{
            c.st.executeUpdate(str);
            JOptionPane.showMessageDialog(null, "Employee added");
            this.setVisible(false);

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
