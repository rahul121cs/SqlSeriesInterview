package SqlSeriesInterview;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SqlQueryUbdate_Dele {
    public static void main(String[] args) throws Exception
    {
        // update row

        String email = "Mohan@gmail.com";

        // delete row
        String ee = "monika@gmil.com";
        String desti = "java";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","Rah&&950*/");

       //  update Query

        PreparedStatement ps =con.prepareStatement("update db2 set Desti =? where Em=?");

        ps.setString(1,desti);
        ps.setString(2,email);

      int count =  ps.executeUpdate();
        if (count>0){
            System.out.println("success full update");
    }
        else {
            System.out.println("failed");
        }

        // delete Query

        PreparedStatement psd =con.prepareStatement("delete from db2 where Em=?");
        psd.setString(1,ee);

        int count2 = psd.executeUpdate();
        if(count2>0){
            System.out.println("success full delete a row ");
        }

        else {
            System.out.println("faild already deleted");
        }
    }
}
