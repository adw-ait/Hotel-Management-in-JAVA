package hotel.management.system;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddRooms extends JFrame implements ActionListener {

    //room number, acailability, cleaning status, price, bed type
    JTextField addRoomNoTxt;
    JComboBox addRoomAvailableCombo;
    JComboBox addRoomCleanedCombo;
    JTextField addRoomPriceTxt;
    JComboBox addRoomBedTypeCombo;
    JButton addRoomBtn;

    AddRooms(){
        Border blackline = BorderFactory.createLineBorder(Color.black);

        JLabel addRoomNolbl = new JLabel("Room Number");
        addRoomNolbl.setBounds(50,50,100,30);

        add(addRoomNolbl);

        addRoomNoTxt = new JTextField();
        addRoomNoTxt.setBounds(180, 50, 150, 30);

        add(addRoomNoTxt);

        JLabel adddRoomAvailablelbl = new JLabel("Availability");
        adddRoomAvailablelbl.setBounds(50,100,100,30);

        add(adddRoomAvailablelbl);

        String Availability[] = {"Available", "Not Available"};
        addRoomAvailableCombo = new JComboBox(Availability);
        addRoomAvailableCombo.setBounds(180, 100, 150, 30);
        add(addRoomAvailableCombo);


        JLabel addRoomCleanedlbl = new JLabel("Cleaned");
        addRoomCleanedlbl.setBounds(50,150,100,30);

        add(addRoomCleanedlbl);

        String cleaningStatus[] = {"Cleaned", "Not Cleaned"};
        addRoomCleanedCombo = new JComboBox(cleaningStatus);
        addRoomCleanedCombo.setBounds(180, 150, 150, 30);
        add(addRoomCleanedCombo);

        JLabel addRoomPricelbl = new JLabel("Price");
        addRoomPricelbl.setBounds(50,200,100,30);

        add(addRoomPricelbl);

        addRoomPriceTxt = new JTextField("");
        addRoomPriceTxt.setBounds(180, 200, 150, 30);

        add(addRoomPriceTxt);

        JLabel addRoomBedTypelbl = new JLabel("Bed Type");
        addRoomBedTypelbl.setBounds(50,250,100,30);

        add(addRoomBedTypelbl);

        String bedType[] = {"Single", "Double"};
        addRoomBedTypeCombo = new JComboBox(bedType);
        addRoomBedTypeCombo.setBounds(180, 250, 150, 30);
        add(addRoomBedTypeCombo);

        addRoomBtn = new JButton("ADD ROOM");
        addRoomBtn.setBounds(180, 300, 150,30);
        add(addRoomBtn);
        addRoomBtn.addActionListener(this);

        int imageHeight = 300, imageWidth = 262;
        ImageIcon roomImg = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/rooms.png"));
        Image addRoomImg = roomImg.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_DEFAULT);
        ImageIcon addRoomImgFinal = new ImageIcon(addRoomImg);
        JLabel roomImgLbl = new JLabel(addRoomImgFinal);
        roomImgLbl.setBounds(430,30,imageWidth,imageHeight);
        add(roomImgLbl);


        setResizable(false);
        setTitle("ADD ROOM");
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setSize(800 ,400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AddRooms();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String roomNo = addRoomNoTxt.getText();
        String price = addRoomPriceTxt.getText();

        String availability = (String) addRoomAvailableCombo.getSelectedItem();
        String cleaned = (String) addRoomCleanedCombo.getSelectedItem();
        String bedType = (String) addRoomBedTypeCombo.getSelectedItem();

        conn c = new conn();

        String str = "insert into rooms values('"+roomNo+"', '"+availability+"', '"+cleaned+"', '"+price+"', '"+bedType+"')";

        try{
            c.st.executeUpdate(str);
            JOptionPane.showMessageDialog(null, "Room added");
            this.setVisible(false);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}



