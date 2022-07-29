package model;

public class CourseSelection {
    private String stuID;
    private String courseID;
    private String grade;

    public CourseSelection() {
    }

    public CourseSelection(String stuID, String courseID, String grade) {
        this.stuID = stuID;
        this.courseID = courseID;
        this.grade = grade;
    }

    public String getStuID() {
        return stuID;
    }

    public void setStuID(String stuID) {
        this.stuID = stuID;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "CourseSelection{" +
                "stuID='" + stuID + '\'' +
                ", courseID='" + courseID + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
