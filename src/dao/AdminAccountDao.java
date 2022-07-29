package dao;

import model.AdminAccount;
import java.sql.Connection;

public interface AdminAccountDao {
    AdminAccount search(Connection conn, AdminAccount adminAccount);
}
