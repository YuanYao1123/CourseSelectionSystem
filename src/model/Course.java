package model;

import java.util.Comparator;

public class Course {
    private String ID;
    private String courseName;
    private int capacity;
    private String type;
    private String lecture;

    public Course() {
    }

    public Course(String ID, String courseName, int capacity, String type, String lecture) {
        this.ID = ID;
        this.courseName = courseName;
        this.capacity = capacity;
        this.type = type;
        this.lecture = lecture;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLecture() {
        return lecture;
    }

    public void setLecture(String lecture) {
        this.lecture = lecture;
    }

    @Override
    public String toString() {
        return "Course{" +
                "ID='" + ID + '\'' +
                ", courseName='" + courseName + '\'' +
                ", capacity=" + capacity +
                ", type='" + type + '\'' +
                ", lecture='" + lecture + '\'' +
                '}';
    }

}
