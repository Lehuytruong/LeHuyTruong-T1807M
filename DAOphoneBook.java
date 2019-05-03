package Assignment08;

import Assignment06.Connector;
import java.sql.ResultSet;

public class DAOphoneBook implements DAOInterface{
    public static DAOphoneBook instance;

    @Override
    public ResultSet getPhone(DAOUser user) {
        String sql = "SELECT * FROM user INNER JOIN phonebook ON user.id = phonebook.user_id WHERE username LIKE '"+user.username+"' AND password LIKE '"+user.password+"' ";

        Connector conn = Connector.getInstance();
        try {
            return conn.getQuery(sql);
        } catch (Exception e){}
        return null;
    }

    public DAOphoneBook() { }

    public static DAOphoneBook getInstance() {
        if(instance == null){
            instance = new DAOphoneBook();
        }
        return  instance;
    }
}
