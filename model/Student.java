package com.Aman.SpringSecurityEx.model;

public class Student {

    private int Id;
    private String name;
    private int marks;

    public Student(int id, String name, int marks) {
        this.Id = id;
        this.marks = marks;
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
