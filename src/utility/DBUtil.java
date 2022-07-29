package utility;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class DBUtil {

    public static Connection getConnection() throws IOException, ClassNotFoundException, SQLException {
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
        Properties pros=new Properties();
        pros.load(is);
        String username = pros.getProperty("username");
        String password = pros.getProperty("password");
        String driverClassName = pros.getProperty("driverClassName");
        String url = pros.getProperty("url");

        Class.forName(driverClassName);
        return DriverManager.getConnection(url, username, password);
    }

    public static void closeResources(Connection conn,Statement stmt,ResultSet rs){
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        if(stmt!=null){
            try {
                stmt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Test
    public void testDBUtil(){
        Connection conn=null;
        try {
            conn = DBUtil.getConnection();
            System.out.println(conn);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            DBUtil.closeResources(conn,null,null);
        }
    }

}
