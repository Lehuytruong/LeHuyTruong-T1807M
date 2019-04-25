package Assignment06;

import java.sql.*;
import java.util.Scanner;

public class Main {
    private static final Object ACTIVE = 1 ;
    private static final Object DEACTIVE = 0 ;


    public static void main(String args[]){
        try {
            Connector connector = new Connector();
            boolean start = true;
            Scanner scanner = new Scanner(System.in);
            while (start){
                System.out.println("Nhap vao lua chon:");
                System.out.println("1. Login");
                System.out.println("2. Register");
                System.out.println("3. Listing");
                System.out.println("4. Delete");
                System.out.println("5. Exit");
                int menu = scanner.hasNextInt()?scanner.nextInt():0;
                switch (menu){
                    case 1: login(connector); break;
                    case 2: register(connector);break;
                    case 3: listing(connector);break;
                    case 4: delete(connector);break;
                    case 5: start = false;break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void login(Connector connector) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap username:");
        String username = scanner.nextLine();
        System.out.println("Nhap password:");
        String password =  scanner.nextLine();

        String sql = "SELECT * FROM user WHERE password LIKE '"+password
                + "' AND username LIKE '"+username+"'";
        ResultSet rs = connector.getQuery(sql);
        if(rs.next()){
            System.out.println("Dang nhap thanh cong");
            return;
        }
        System.out.println("sai usrename of password.");
    }
    public static void register(Connector connector) throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap user name:");
        String username = scanner.nextLine();
        System.out.println("Nhap email:");
        String email = scanner.nextLine();
        System.out.println("Nhap password :");
        String password = scanner.nextLine();

        String sql = "INSERT INTO user (username,email,password) VALUES ('"+username+"','"+email+"','"+password+"''"+ACTIVE+"')";
        if(connector.updateQuery(sql)>0){
            System.out.println("Dang ky thanh cong");
            return;
        }
        System.out.println("Chua dang ky duoc tai khoan");
    }
    public static void listing(Connector connector)throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Danh sách nguoi dung:");

        String sql = "SELECT * FROM user";
        ResultSet rs = connector.getQuery(sql);
        while (rs.next()){
            System.out.println("ID: "+rs.getInt("id"));
            System.out.println("User Name: "+rs.getString("username"));
            System.out.println("Email: "+rs.getString("email"));
            System.out.println("------------------------------------");
        }
    }
    public static void delete(Connector connector) {
        int id;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ID muon xoa :");
        id = sc.nextInt();
        System.out.println("Nhan phim 1 de xoa khoi DB");
        System.out.println("Nhan phim 2 de  thay đoi status về 0");
        try {
            int dl = sc.nextInt();
            switch (dl) {
                case 1:
                    String delete = "DELETE FROM user WHERE id='" + id + "' ";
                    connector.updateQuery(delete);
                    System.out.println("Da xoa thanh cong !!");
                    return;
                case 2:
                    String edit = "UPDATE user SET status=0 WHERE id='" + id + "'";
                    connector.updateQuery(edit);
                    System.out.println("thay doi status thanh cong !!");
                    break;
                case 3:
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
