package dao;

import model.Student;

import java.sql.Connection;
import java.util.List;

public interface StudentDao {
    Student SearchById(Connection conn,String id);
}
