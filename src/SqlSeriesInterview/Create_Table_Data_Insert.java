package SqlSeriesInterview;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Create_Table_Data_Insert {

// Already create table me data insert krna

        public static void main(String[] args) {
            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sql_Server","root","Rah&&950*/");


                // Insert Course
                String insertCourse = "INSERT INTO course(course_name) VALUES (?)";
                PreparedStatement ps1 = con.prepareStatement(insertCourse);
                ps1.setString(1, "Java");

                ps1.executeUpdate();

                // Insert Student
                String insertStudent = "INSERT INTO student(student_name, course_id) VALUES (?, ?)";
                PreparedStatement ps2 = con.prepareStatement(insertStudent);
                ps2.setString(1, "Rahul");
                ps2.setInt(2, 1); // course_id = 1
                ps2.executeUpdate();

                System.out.println("Data Inserted!");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

