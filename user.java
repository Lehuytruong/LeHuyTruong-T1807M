package Assignment08;

import java.sql.*;
import java.util.Scanner;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import  javafx.scene.control.Alert;
import Assignment06.Connector;

public class user {
    static Button button;
    public TextField User;
    public TextField passwordd;
    static Statement statement;
    static  ResultSet resultSet;
    static String username;
    static  String password;
    static  String email;

    public static final int ACTIVE = 1;
    public static final int DEACTIVE = 0;

    public static void main(String args[]){

        try {
            Connector connector = new Connector();
            boolean start =  true;
            Scanner scanner = new Scanner(System.in);
            while (start){
                System.out.println("Nhập vào lựa chọn:");
                System.out.println("1. Login");
                System.out.println("2. Register");
                System.out.println("3. Listing");
                System.out.println("4. Delete");
                System.out.println("5. Exit");

                int menu = scanner.hasNextInt()?scanner.nextInt():0;
                switch (menu){
                    case 1: login(connector); break;
                    case 2: register(connector);break;
                    case 3: Listing(connector);break;
                    case 4: Delete(connector);break;
                    case 5: start= false;connector.close();break;
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void login(Connector connector) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("UserName:");
        username = scanner.nextLine();
        System.out.println("Password:");
        password =  scanner.nextLine();
        String sql = "SELECT * FROM userr WHERE password LIKE '"+password
                + "' AND username LIKE '"+username+"'";
        ResultSet rs = connector.getQuery(sql);
        if(rs.next()){
            System.out.println("Đăng nhập thành công !!!");
            return;
        }
        System.out.println("Sai username hoặc password.");
    }

    public static void register(Connector connector) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        username = scanner.nextLine();
        System.out.println("Email: ");
        email = scanner.nextLine();
        System.out.println("Password: ");
        password = scanner.nextLine();
        String sql = "INSERT INTO userr(username,email,password,status) VALUES('"+username+"','"+
                email+"','"+password+"',"+ACTIVE+")";
        if(connector.updateQuery(sql)>0){
            System.out.println("Đăng kí thành công !!!");
            return;
        }
        System.out.println("Chưa tạo được tài khoản");
    }
    public  static  void Listing(Connector connector) throws  Exception{
        String sql = "SELECT * FROM userr";
        System.out.println("Danh sách người dùng: ");
        resultSet = connector.getQuery(sql);
        while (resultSet.next()) {
            String statuss = "";
            if (resultSet.getInt("status") == 0) {
                statuss = "disable";
            } else
                statuss = "enable";
            System.out.println("ID: " + resultSet.getInt("id"));
            System.out.println("Username: " + resultSet.getString("username"));
            System.out.println("Email: " + resultSet.getString("email"));
            System.out.println("Password: " + resultSet.getString("password"));
            System.out.println("Status: " + statuss);
        }
    }
    public  static  void Delete(Connector connector){
        int id;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập ID bạn muốn xóa :");
        id = sc.nextInt();
        System.out.println("bạn muốn xóa khỏi db hãy nhấn phím 1, thay đổi status về 0 nhấn phím 2");
        try {
            int dl = sc.nextInt();
            switch (dl) {
                case 1:
                    String delete = "DELETE FROM userr WHERE id='"+id+"' ";
                    connector.updateQuery(delete);
                    System.out.println("đã xóa thành công !!");
                    return;
                case 2:
                    String edit = "UPDATE userr SET status=0 WHERE id='"+id+"'";
                    connector.updateQuery(edit);
                    System.out.println("thay đổi status thành công !!");
                    break;
                case 3:
                    break;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public  void  login() throws SQLException {
        String s = "SELECT * FROM userr";
        resultSet = statement.executeQuery(s);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Test Connection");
        alert.setContentText("đăng nhập thành công !!!");
//            alert.showAndWait()
        try {
            while (User.getText().equals(resultSet.getString("username")) && passwordd.getText().equals(resultSet.getString("password"))){
                alert.showAndWait();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
