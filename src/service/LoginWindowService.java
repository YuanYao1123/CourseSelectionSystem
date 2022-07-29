package service;

import dao.AdminAccountDao;
import dao.AdminAccountDaoImpl;
import dao.UserAccountDao;
import dao.UserAccountDaoImpl;
import model.AdminAccount;
import model.UserAccount;
import utility.DBUtil;

import java.sql.Connection;

public class LoginWindowService {
    public static String userID;  //remember the user that is in the system now


    public boolean login(String userID, String password, int flag){
        Connection conn=null;
        try {
            conn = DBUtil.getConnection();
            if (flag==1){
                return studentLogin(conn,userID,password);
            } else if (flag==0) {
                return adminLogin(conn,userID,password);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeResources(conn,null,null);
        }
        return false;
    }

    private boolean studentLogin(Connection conn,String userID, String password){
        UserAccount userAccount=new UserAccount();
        userAccount.setUserID(userID);
        userAccount.setPassword(password);
        UserAccountDao userAccountDao=new UserAccountDaoImpl();
        UserAccount loggedInUser = userAccountDao.search(conn,userAccount);
        if (loggedInUser!=null){
            this.userID= loggedInUser.getUserID();
            return true;
        }else {
            return false;
        }
    }

    private boolean adminLogin(Connection conn,String userID, String password){
        AdminAccount adminAccount=new AdminAccount();
        adminAccount.setAdminID(userID);
        adminAccount.setPassword(password);
        AdminAccountDao adminAccountDao=new AdminAccountDaoImpl();
        AdminAccount loggedInUser = adminAccountDao.search(conn, adminAccount);
        if (loggedInUser!=null){
            this.userID= loggedInUser.getAdminID();
            return true;
        }else {
            return false;
        }
    }
}
