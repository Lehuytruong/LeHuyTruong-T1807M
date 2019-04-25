package Assignment06;

import java.sql.*;

public class Connector {
    public Connection conn;
    public Connector(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String URL = "jdbc:mysql://localhost:3306/t1807m";
            this.conn = DriverManager.getConnection(URL, "t1807m","11121992Khon");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    public ResultSet getQuery(String sql) throws Exception{
        Statement statement = this.conn.createStatement();
        return statement.executeQuery(sql);
    }
    public int updateQuery(String sql) throws Exception{
        Statement statement = this.conn.createStatement();
        return statement.executeUpdate(sql);
    }
    public boolean close() throws Exception{
        this.conn.close();
        return Boolean.parseBoolean(null);
    }
}
