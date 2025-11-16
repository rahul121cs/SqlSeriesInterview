package SqlSeriesInterview;



    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.Statement;

    // java code se table create karna
public class SqlMeTableCreate {

    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sql_Server","root","Rah&&950*/");

           //  Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            String courseTable = "CREATE TABLE course ("
                    + "course_id INT PRIMARY KEY AUTO_INCREMENT,"
                    + "course_name VARCHAR(100))";

            String studentTable = "CREATE TABLE student ("
                    + "student_id INT PRIMARY KEY AUTO_INCREMENT,"
                    + "student_name VARCHAR(100),"
                    + "course_id INT,"
                    + "FOREIGN KEY (course_id) REFERENCES course(course_id))";

            st.execute(courseTable);
            st.execute(studentTable);

            System.out.println("Tables Created Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
