package service;
import dao.StudentDao;
import dao.StudentDaoImpl;
import model.Student;
import utility.DBUtil;

import java.sql.Connection;
import java.util.ArrayList;

public class ProfileService {
    public ArrayList<String[]> searchStudentAsPairs(String id){
        Connection conn=null;
        try {
            conn = DBUtil.getConnection();
            StudentDao studentDao=new StudentDaoImpl();
            Student student = studentDao.SearchById(conn, id);
            ArrayList<String[]> arrayList=new ArrayList<String[]>();

            arrayList.add(new String[]{"Student ID",student.getStudentID()});
            arrayList.add(new String[]{"Name",student.getName()});
            arrayList.add(new String[]{"Gender",student.getGender()});
            arrayList.add(new String[]{"Age",Integer.toString( student.getAge())});
            arrayList.add(new String[]{"Country",student.getCountry()});
            arrayList.add(new String[]{"Major",student.getMajor()});
            arrayList.add(new String[]{"Intake",student.getIntake()});
            arrayList.add(new String[]{"Semester",student.getSemester()});
            arrayList.add(new String[]{"Graduate Year",Integer.toString(student.getGraduateYear())});

            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            DBUtil.closeResources(conn,null,null);
        }

    }
}
