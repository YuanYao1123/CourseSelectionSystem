package utility.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static String dbUrl="jdbc:mysql://127.0.0.1:3306/course_selection_db?characterEncoding=utf8";
    private static String dbUserName="root";
    private static String dbPassWord="root";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() throws  SQLException {
        Connection conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassWord);
        return conn;
    }

    public static void closeConnection(Connection con) throws SQLException {
        if(con!=null){
            con.close();
        }
    }

    /*
    test connection
     */
    public static void main(String[] args) throws SQLException {
        Connection con = DBUtil.getConnection();
        System.out.println(con);
        DBUtil.closeConnection(con);

    }
}
