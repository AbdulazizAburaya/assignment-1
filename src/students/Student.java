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
    protected int id ; 
    protected String name ;
    protected String major ;
    protected double grade ; 

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
    
    @Override
    public String toString() {
        return  "{ name : " + name + ", id : " + id + ", major : " + major + " , grade : " + grade + " }";
    }
    @Override
    public int compareTo(Student s) {
        return this.grade > s.grade ? -1 : 1 ;
    }
    
}

