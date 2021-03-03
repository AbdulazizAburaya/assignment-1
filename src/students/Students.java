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
          new ItStudent("abdulaziz" , 1 , "Software development" , 26.5 , 30.5 , 20),
          new ItStudent("Ahmed" , 2 , "Computer science" , 23 , 20.5 , 18.5),
          new ItStudent("Mahmood" , 3 , "IT" , 19 , 30 , 31),
          new ArtStudent("Ibrahim" , 4 , "Graphic design" , 20, 25 , 30),
          new ArtStudent("Hassan" , 5 , "Film making" , 17 , 16 , 22),
          new ArtStudent("youssef" , 6 , "Fashion design" , 33 , 27, 19)
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
