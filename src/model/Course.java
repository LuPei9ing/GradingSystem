package model;

import java.util.List;

public class Course {
    protected String className;
    protected int classId;
    protected List<Category> categories;
    protected List<Assignment> assignments;
    protected String semester;
    protected List<Student> students;

    //no-arg constructor
    public Course() {
        className = "CS591";

    }


    //constructor
    public Course(String className, int classId, List<Category> categories, List<Assignment> assignments, String semester, List<Student> students) {
        this.className = className;
        this.classId = classId;
        this.categories = categories;
        this.assignments = assignments;
        this.semester = semester;
        this.students = students;
    }

    public int getClassId() {
        return classId;
    }
}