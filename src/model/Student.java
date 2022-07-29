package model;

public class Student {
    private String studentID;
    private String name;
    private String gender;
    private int age;
    private String country;
    private String major;
    private String intake;
    private String semester;
    private int graduateYear;

    public Student() {
    }

    public Student(String studentID, String name, String gender, int age, String country, String major, String intake, String semester, int graduateYear) {
        this.studentID = studentID;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.country = country;
        this.major = major;
        this.intake = intake;
        this.semester = semester;
        this.graduateYear = graduateYear;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getIntake() {
        return intake;
    }

    public void setIntake(String intake) {
        this.intake = intake;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public int getGraduateYear() {
        return graduateYear;
    }

    public void setGraduateYear(int graduateYear) {
        this.graduateYear = graduateYear;
    }
}
