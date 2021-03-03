/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;

import java.io.Serializable;

/**
 *
 * @author Abdul
 */
public abstract class Student implements Comparable<Student>  , Serializable{
    private int id ; 
    private String name ;
    private String major ;
    private double grade ; 

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public double getGrade() {
        return grade;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    
      
    @Override
    public String toString() {
        return  "{ name : " + name + ", id : " + id + ", major : " + major + " , grade : " + grade + " }";
    }
    @Override
    public int compareTo(Student s) {
        return this.grade > s.grade ? -1 : 1 ;
    }
    
}

