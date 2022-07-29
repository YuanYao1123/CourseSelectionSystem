package dao;

import model.UserAccount;
import org.junit.jupiter.api.Test;
import utility.DBUtil;

import java.sql.Connection;
import java.util.Random;

public class UserAccountDaoImpl extends BaseDAO<UserAccount> implements UserAccountDao{

    @Override
    public UserAccount search(Connection conn, UserAccount userAccount) {
        String sql="select user_id userID,password from user_account where user_id=? and password=?";
        return getInstance(conn, sql, userAccount.getUserID(), userAccount.getPassword());
    }

    public int batchAddData(){
        Connection conn=null;
        try {
            conn = DBUtil.getConnection();
            String sql = "insert into user_account (user_id, password) values (?,?)";
            Random random=new Random();
            for (int i = 3; i <= 999; i++) {
                update(conn, sql,"10021"+i,"123456");
            }
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            DBUtil.closeResources(conn,null,null);
        }
    }

    @Test
    public void testBatchAddData(){
        batchAddData();
    }
}
