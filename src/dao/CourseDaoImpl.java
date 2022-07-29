package dao;

import model.Course;
import org.junit.jupiter.api.Test;
import utility.DBUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CourseDaoImpl extends BaseDAO<Course> implements CourseDao{
    @Override
    public int addCourse(Connection conn, Course course) {
        String sql="insert into course (id, course_name, capacity, type, lecture) values (?,?,?,?,?)";
        return update(conn,sql,course.getID(),course.getCourseName(),course.getCapacity(),course.getType(),course.getLecture());
    }

    @Override
    public int deleteCourse(Connection conn, String id) {
        String sql="delete from course where id=?";
        return update(conn,sql,id);
    }

    @Override
    public int modifyCourse(Connection conn, Course course) {
        String sql="update course set course_name=?,capacity=?,type=?,lecture=? where id=?";
        return update(conn, sql, course.getCourseName(), course.getCapacity(), course.getType(), course.getLecture(), course.getID());
    }

    @Override
    public List<Course> getAllUnselectedCourses(Connection conn,String id) {
        String sql="select id ID,course_name courseName,capacity,type,lecture from course where id not in (select course_id from course_selection where stu_id=?)";
        List<Course> courseList = getForList(conn,sql, id);
        return courseList;
    }

    @Override
    public List<Course> getAllCourses(Connection conn) {
        String sql="select id ID,course_name courseName,capacity,type,lecture from course";
        List<Course> list = getForList(conn, sql);
        return list;
    }

    @Override
    public List<Object[]> getAllSelectedCoursesAndItsGrade(Connection conn,String id) {
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            String sql="select course.id ID,course_name courseName,lecture,grade from course_selection join course on course.id = course_selection.course_id join student on course_selection.stu_id = student.student_id where stu_id=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,id);
            rs = ps.executeQuery();
            List<Object[]> list=new ArrayList<>();
            int columnCount = rs.getMetaData().getColumnCount();
            while (rs.next()){
                Object[] arrObj=new Object[4];
                for (int i = 0; i < columnCount; i++) {
                    arrObj[i]=rs.getObject(i+1);
                }
                list.add(arrObj);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            DBUtil.closeResources(null,ps,rs);
        }
    }

    @Override
    public List<Object[]> getAllCourseSelectionsInfo(Connection conn) {
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            String sql="select student.student_id studentID, NAME name, course_id courseID, course_name courseName, lecture, type,capacity from course_selection join course on course.id = course_selection.course_id join student on course_selection.stu_id = student.student_id";
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            List<Object[]> list=new ArrayList<>();
            int columnCount = rs.getMetaData().getColumnCount();
            while (rs.next()){
                Object[] arrObj=new Object[7];
                for (int i = 0; i < columnCount; i++) {
                    arrObj[i]=rs.getObject(i+1);
                }
                list.add(arrObj);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        } finally {
            DBUtil.closeResources(null,ps,rs);
        }
    }

    @Override
    public Course getCourseByID(Connection conn,String ID) {
        String sql="select id ID,course_name courseName,capacity,type,lecture from course where id =?";
        return getInstance(conn,sql,ID);
    }

    public int batchAddData(){
        Connection conn=null;
        try {
            conn = DBUtil.getConnection();
            String sql = "insert into course (id, course_name, capacity, type, lecture) values (?,?,?,?,?);";
            String[] arrLectures=new String[]{"Avi","Hassan","Lochlan","Stanley","Dash","Kaiser","Benicio","Bryant","Talon","Rohan","Wesson","Joe","Noe","Melvin","Vihaan","Zayd","Darren","Enoch","Mitchell","Jedidiah","Brodie","Castiel","Ira","Lance","Guillermo","Thatcher","Ermias","Misael","Jakari","Emory","Mccoy","Rudy","Thaddeus","Valentin","Yehuda","Bode","Madden","Kase","Bear","Boden","Jiraiya","Maurice","Alvaro","Ameer","Demetrius","Eliseo","Kabir","Kellan","Allan","Azrael","Calum","Niklaus","Ray","Damari","Elio","Jon","Leighton","Axl","Dane","Eithan","Eugene","Kenji","Jakob","Colten","Eliel","Nova","Santos","Zahir","Idris","Ishaan","Kole","Korbin","Seven","Alaric","Kellen","Bronson","Franco","Wes","Larry","Mekhi","Jamal","Dilan","Elisha","Brennan","Kace","Van","Felipe","Fisher","Cal","Dior","Judson","Alfonso","Deandre","Rocky","Henrik","Reuben","Anders","Arian","Damir","Jacoby","Khalid","Kye","Mustafa","Jadiel","Stefan","Yousef","Aydin","Jericho","Robin","Wallace","Alistair","Davion"};
            String[] arrType=new String[]{"Public Compulsory Course", "Specialized Course", "Optional Course"};
            String[] arrCourseName=new String[]{"Foundation programmes","List of Popular Courses","Early Childhood Education","Master of Education","Teaching and Learning","Special Needs","Research","English Language Teaching","Computer Games Development","Web Media Technology","Media Informatics","Transport Design","Multimedia","Graphic Design","Interior Architecture and Design","Advertising Design","Furniture Design","Textile and Fashion Design","Animation and Visual Effects","Entertainment Arts","Digital Media Production","Visual Art","Jewellery Design","Fashion Design","Hair Design","Music Studies","Contemporary Music","Music Technology","Cinematic Arts","Performing Arts","Islamic Sciences","Aqidah and Islamic Thought","Islamic History and Civilisation","English Programmes","Communication and Media Studies","English Language and Literature","World Literature","Southeast Asian History","Malaysian History","Psychology of Child","Development","Psychology","Cultural Studies and Entrepreneurship","International Relations","Economics and Finance","Communication","Corporate Communication","Broadcasting","Journalism","International Communication","International Business","Business Strategy","Technopreneurship","Islamic Banking and Finance","Accounting","Real estate management","Branding and Advertising","Actuarial Science and Finance","Marketing","Real Estate Finance and Management","Business Administration","Industrial Management","Human Capital","eCommerce","Public Relations","Retail Management","Psychology","Law","Syariah Law","Actuarial Science","Biotechnology","Business Information Systems","Chemistry","Computer Forensic","Computer graphic and Virtuality","Electronic Commerce","Environmental Science","Geospatial Science","Information Technology","Mathematics","Medical Science","Mobile and Wireless","Petroleum Geoscience","Pharmaceutical Science","Physics","Science","Software Engineering","Statistics","Aerospace","Anial Nutrition","Applied Physics","Aquaculture and Marine","Architecture Design","Automotive","Biomedical Engineering","Biotechnology","Chemical Engineering","Civil Engineering","Computer Engineering","Crop Biotechnology","Electrical and Electronic","Engineering","Energy Engineering","Food Processing","Food Safety","Food Science and","Genetic Engineering and Molecular Biology","GIS and Geomatic Engineering","Green Engineering","HALAL Food Management","Highway and Transportation","Lanscape Architecture","Marine and Freshwater ecosystem","Mechanical Engineering","Mechatronics electrical"," mechanical"," robotics"," computer"," telecommunication system","Medical Biotechnology","Petroleum Engineering","Quantity Surveying","Structural Engineering and Constrution","Sustainability Science","Urban Planning and Design","Agribusiness","Animal Welfare","Aquacultre Genetics and Production","Aquatic Science","Environmental Soil Science","Forestry Science","Horticultural Science","Immunobiology","Integrated Agriculture Techonology","Plantatin Management","Poultry Production","Tropical Forest Resource Management","Veterinary Science Vaccine and Therapeutics","Virology HEALTHY AND WELFARE","Chinese Medicine","Chiropractic","Counselling and Guidence","Dentistry","Dietetics and Nutrition","Healthcare management","Leadership Studies","Medical Science","Nursing","Oncology","Ophthalmology","Paediatrics","Pharmacy","Physiotheraphy","Public Health","Radiology","Rhabilitation Medicine","Surgery","Youth Studies","Airline Services","Asian Cuisine","Bakery","Beautician and health","Beauty Management","Conservation Technology","Cruise Operation","Culinary Arts","Environmental Health","Events Management","Food Service Management","Forest Management and Ecosystem Science","Golf Resort Management","Heritage Cuisine","Hotel Management","International Hotel Management","Logistic and Supply Chain","Logistic Management","Marine and Fresh Water Ecosystem","Maritime Transportation","Nautical Studies","Occupational Health and Safety","Patisserie","Pollution Control and Air Quality","Sanitary and Environmental Engineering","Security Management","Shipping Management","Soil Conservation and Water Management","Sports Management","Sustainable Recreation and Ecotourism","Tourism Management","Wildlife Ecology Management"};
            for (int i = 0; i < arrCourseName.length; i++) {
                arrCourseName[i] = arrCourseName[i].trim();
            }
            Random random=new Random();
            for (int i = 2; i < 1001; i++) {
                update(conn, sql,"2022"+i, arrCourseName[random.nextInt(arrCourseName.length)],random.nextInt(500),arrType[random.nextInt(arrType.length)],arrLectures[random.nextInt(arrLectures.length)]);
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
        CourseDaoImpl courseDao=new CourseDaoImpl();
        batchAddData();
    }


}
