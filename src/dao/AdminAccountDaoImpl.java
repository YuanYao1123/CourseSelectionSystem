package dao;

import model.AdminAccount;

import java.sql.Connection;

public class AdminAccountDaoImpl extends BaseDAO<AdminAccount> implements AdminAccountDao{
    @Override
    public AdminAccount search(Connection conn, AdminAccount adminAccount) {
        String sql="select admin_id adminID, PASSWORD password from admin_account where admin_id=? and password=?";
        return getInstance(conn,sql,adminAccount.getAdminID(),adminAccount.getPassword());
    }
}
