package service;

import dao.UserAccountDao;
import model.UserAccount;

import javax.swing.*;
import java.sql.SQLException;

public class UserAccountService {
    private String username;  //remember the user that is in the system now
    public boolean login(String username,String password) throws SQLException {
        UserAccount userAccount=new UserAccount();
        userAccount.setUser_id(username);
        userAccount.setPassword(password);
        UserAccountDao userAccountDao=new UserAccountDao();
        UserAccount loggedInUser = userAccountDao.search(userAccount);
        if (loggedInUser!=null){
            username= loggedInUser.getUser_id();
            return true;
        }else {
            return false;
        }
    }
}
