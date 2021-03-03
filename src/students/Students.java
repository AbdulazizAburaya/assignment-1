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
          new ItStudent("abdulaziz" , 1 , "Software development" , 90 , 85 , 61),
          new ItStudent("Ahmed" , 2 , "Computer science" , 82 , 80.5 , 68.5),
          new ItStudent("Mahmood" , 3 , "IT" , 70 , 70.5 , 80 ),
          new ArtStudent("Ibrahim" , 4 , "Graphic design" , 100 , 84 , 68),
          new ArtStudent("Hassan" , 5 , "Film making" , 98 , 80 , 75),
          new ArtStudent("youssef" , 6 , "Fashion design" , 97 , 59 , 84.5)
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
                   System.out.println("*******************************************");
                   System.out.println("The file was created successfully");
                  } catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("Error initializing stream");
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
