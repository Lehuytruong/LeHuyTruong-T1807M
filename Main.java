package JV2_Session06;
//buoc 1: import packet
import java.sql.*;

import static java.lang.String.*;

public class Main {
    public static void main(String args[]){
        try {
            //Buoc 2: dang ky driver -- nap driver nao neu chua co
            Class.forName("com.mysql.jdbc.Driver");

            //Buoc3: tao ket noi DB

            String URL = "jdbc:mysql://localhost:3306/t1807m";
            Connection conn = DriverManager.getConnection(URL,"t1807m","11121992Khon");
            //Buoc 4: truy van du lieu
            Statement statement = conn.createStatement();
            // them du lieu
            String insert_sql = "INSERT INTO Student (Name,Age,Mark) VALUE('Le Van A',20,6)";
            statement.executeUpdate(insert_sql);
            //sua du lieu
            String edit_sql = "UPDATE Student SET Name ='Nguyen Nhu Ly'"+ "where ID = 1";
            statement.executeUpdate(edit_sql);
            //xoa du lieu
            String delete_sql = "DELETE FROM Student where ID = 6";
            statement.executeUpdate(delete_sql);


            String sql = "SELECT * FROM Student";

            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()){
                System.out.println("ID: "+rs.getInt("ID"));
                System.out.println("Name: "+rs.getString("Name"));
                System.out.println("Age: "+rs.getInt("Age"));
                System.out.println("Mark: "+rs.getInt("Mark"));
                System.out.println("------------------------------------");
            }
            //END
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
