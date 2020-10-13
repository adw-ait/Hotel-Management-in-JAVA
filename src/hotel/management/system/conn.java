package hotel.management.system;

import java.sql.*;

public class conn {
    Connection c;
    Statement st;

    public conn(){
        try{
//            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///hotelManagement","root", "1234");
            st = c.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
