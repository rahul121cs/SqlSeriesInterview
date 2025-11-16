package SqlSeriesInterview;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SqlDataRetriveQ1 {
    // sql se data ko retrive wo bhi java code se

    public static void main(String[] args) throws Exception
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/partice","root","Rah&&950*/");
        PreparedStatement ps= con.prepareStatement("select * from store");
        ResultSet rs = ps.executeQuery();

        while (rs.next()){
            System.out.println("Srno: "+rs.getInt("Sr_no"));
            System.out.println("Product_name: "+rs.getString("Product_name"));
            System.out.println("amount: "+rs.getInt("amount"));
            System.out.println("Qty: "+rs.getInt("Qty"));
            System.out.println("Pdate: "+rs.getDate("Pdate"));
            System.out.println("---------------");
        }
        con.close();
    }
}
