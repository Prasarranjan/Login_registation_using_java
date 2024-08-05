import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static java.sql.DriverManager.getConnection;

public class jdbc {
    public static Connection getconnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = getConnection("jdbc:mysql:// localhost:3306/webdetails", "root", "prasar123");
            if (con != null) {
                System.out.println("Connected");
            } else {
                System.out.println("Not Connected");
            }
        } catch (Exception e) {
            System.out.println("Driver not found in catch method");
        }
        return con;
    }
    public static int loginUser(String email, String name, String password){
        int result=0;
        Connection con =getconnection();


        try {
            String query="insert into detaal(email,name,password) values (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1,email);
            ps.setString(2,name);
            ps.setString(3,password);

            result=ps.executeUpdate();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
    public static boolean getEmployeebyid(String name,String password){
        boolean result=false;
        Connection con = getconnection();
        try{
            String query ="select * from detaal where name = ? and password =?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1,name);
            ps.setString(2,password);
            ResultSet rs =ps.executeQuery();
            return rs.next();
        }
        catch (Exception e ){
            e.printStackTrace();
            return false;
        }
    }

}
