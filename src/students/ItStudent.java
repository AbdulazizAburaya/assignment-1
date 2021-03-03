/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;

/**
 *
 * @author Abdul
 */
public class ItStudent extends Student{
    private double project ;
    private double mid ; 
    private double final_ ;
    
    public ItStudent(String name , int id , String major , double project , double mid , double final_ ) {
        this.setName(name);
        this.setId(id); 
        this.setMajor(major); 
        this.project = project ; 
        this.mid = mid ; 
        this.final_ = final_ ;
        double d = (project) + (final_) + (mid);
        this.setGrade(d);  
        
    }

    public double getProject() {
        return project;
    }

    public void setProject(double project) {
        this.project = project;
    }

    public double getMid() {
        return mid;
    }

    public void setMid(double mid) {
        this.mid = mid;
    }

    public double getFinal_() {
        return final_;
    }

    public void setFinal_(double final_) {
        this.final_ = final_;
    }
}
    
    
