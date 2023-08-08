package com.springlearn;

/**
 * Student
 */
public class Student {

    private int studentId;

    public Student(int studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public String toString() {
        return studentId + " " + studentName + " " + studentAddress;
    }

    public Student() {
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    private String studentName;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    private String studentAddress;

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

}