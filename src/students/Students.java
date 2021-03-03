/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Comparator;
/**
 *
 * @author Abdul
 */
public class Students {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Student [] student = {
          new ItStudent("Ali" , 101 , "IT-Computer systems" , 13.5 , 24 , 29),
          new ItStudent("Mohammed" , 102 , "Sciences" , 22 , 26 , 33),
          new ItStudent("Mahmood" , 103 , "IT-computer science" , 28 , 30 , 37.5),
          new ArtStudent ("Abdallah" , 104 , "sport" , 6 , 29 , 38.5),
          new ArtStudent ("Essam" , 105 , "IT-Software development" , 9 , 37 , 42),
          new ArtStudent ("Ahmed" , 106 , "Sciences" , 9 , 33.5 , 42)
        };
        sort(student);
        for (Student students : student) {
            System.out.println(students);
        }
        
        
        
        try {
	           FileOutputStream f = new FileOutputStream(new File("F:\\Student.txt"));
	           ObjectOutputStream o = new ObjectOutputStream(f);
                   o.writeObject(student);
                   f.close();
                   o.close();
                   System.out.println("---------------------------------------");
                   System.out.println("The file was created successfully .... ");
                  } catch (FileNotFoundException e) {
			System.out.println("File not found ... ");
		} catch (IOException e) {
			System.out.println("Error initializing stream ... ");
		}
      }    
    // sort
           public static void sort(Student [] student) {
               Arrays.sort(student, 0, student.length, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.compareTo(s2) ;
            }
        });
    }
    
}
