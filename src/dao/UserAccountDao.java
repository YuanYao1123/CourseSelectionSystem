package dao;

import model.Student;
import model.UserAccount;

import java.sql.Connection;

public interface UserAccountDao {
    /**
     *
     * @param conn
     * @param userAccount
     * @return UserAccount
     */
    UserAccount search(Connection conn, UserAccount userAccount);
}
