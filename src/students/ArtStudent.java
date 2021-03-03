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
     private  double report ;
     private  double mid ; 
     private  double final_ ;
    
     public ArtStudent(String name , int id , String major , double report , double mid , double final_ ) {
         this.setName(name);
        this.setId(id); 
        this.setMajor(major); 
        this.report = report ; 
        this.mid = mid ; 
        this.final_ = final_ ;
        double d = (report * 0.10) + (final_ * 0.50) + (mid *0.40 );
        this.setGrade(d);  
        
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

