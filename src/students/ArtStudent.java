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
public class ArtStudent extends Student {
     protected double report ;
    protected double mid ; 
    protected double final_ ;
    
     public ArtStudent(String name , int id , String major , double report , double mid , double final_ ) {
        this.name = name ;
        this.id = id ; 
        this.major = major ; 
        this.report = report ; 
        this.mid = mid ; 
        this.final_ = final_ ; 
        this.grade = (report) + (final_) + (mid) ; 
        
    }

    public double getReport() {
        return report;
    }

    public void setReport(double report) {
        this.report = report;
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

