package service;

import dao.UserAccountDao;
import model.UserAccount;

import java.sql.SQLException;

public class LoginWindowService {
    private String username;  //remember the user that is in the system now

    public String getUsername() {
        return username;
    }

    public boolean login(String username, String password) throws SQLException {
        UserAccount userAccount=new UserAccount();
        userAccount.setUserID(username);
        userAccount.setPassword(password);
        UserAccountDao userAccountDao=new UserAccountDao();
        UserAccount loggedInUser = userAccountDao.search(userAccount);
        if (loggedInUser!=null){
            this.username= loggedInUser.getUserID();
            return true;
        }else {
            return false;
        }
    }
}
