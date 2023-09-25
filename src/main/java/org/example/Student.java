package org.example;

import java.util.List;
import java.util.Map;

public class Student {
   private int rollNo;
   private String name;
   private String dept;
   private int passedOutYear;
   private List<String> course;
   private Map<String,Integer> points;
   Student(){}
   public Student(int rollNo)
   {
       this.rollNo=rollNo;
   }
    public Student(int rollNo, String name, String dept, int passedOutYear) {
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
        this.passedOutYear = passedOutYear;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getPassedOutYear() {
        return passedOutYear;
    }

    public void setPassedOutYear(int passedOutYear) {
        this.passedOutYear = passedOutYear;
    }

    public List<String> getCourse() {
        return course;
    }

    public void setCourse(List<String> course) {
        this.course = course;
    }

    public Map<String, Integer> getPoints() {
        return points;
    }

    public void setPoints(Map<String, Integer> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", passedOutYear=" + passedOutYear +
                ",Course=" +course+
                ",Course with crdits= "+points+
                '}';
    }
}
