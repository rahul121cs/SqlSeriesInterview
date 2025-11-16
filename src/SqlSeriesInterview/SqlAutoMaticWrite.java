package SqlSeriesInterview;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SqlAutoMaticWrite {
    public static void main(String[] args) {

       // System.out.println("Sql Query Automatic Inject Sql Data-Base ");
        try {

            Class.forName("com.mysql.jdbc.Driver");

           // System.out.println("success");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","Rah&&950*/");

        // PreparedStatement ps = con.prepareStatement("insert into db2 values( 4,'Sahil','Sahil32@gmail.com','Security') ");

            // 2 way data insert into table

            PreparedStatement ps = con.prepareStatement("insert into db2 values(?,?,?,?)");
            ps.setInt(1,7);
            ps.setString(2,"Monika");
            ps.setString(3,"monika@gmil.com");
            ps.setString(4,"Mathmetic");
         int i = ps.executeUpdate();
         if(i>0){
             System.out.println("success");
         }
         else {
             System.out.println("fail");
         }

        }
        catch (ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
