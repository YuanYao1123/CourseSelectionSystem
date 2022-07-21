package dao;

import model.UserAccount;
import utility.dbutil.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserAccountDao {
    /**
     *
     * @param  userAccount
     * @return UserAccount
     * @throws SQLException
     */
    public UserAccount search(UserAccount userAccount) throws SQLException {
        Connection conn = DBUtil.getConnection();
        String sql="select * from user_account where user_id=? and password= ?";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1,userAccount.getUser_id());
        preparedStatement.setString(2,userAccount.getPassword());
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()){
            return new UserAccount(rs.getString(1),rs.getString(2));
        }else {
            return null;
        }
    }
}
