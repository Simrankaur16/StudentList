/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlist;

/**
 *
 * @author harry
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student[] studentList = new Student[3];
        Student s1 = new Student();
        s1.setName("Simran kaur");
        Student s2 = new Student();
        s2.setName("Rajvir");
        Student s3 = new Student();
        s3.setName("Anmoldeep kaur");
        Student s4 = new Student();
        s4.setName("Arshdeep kaur");
        studentList[0]= s1;
        studentList[1]= s2;
        studentList[2]= s3;
        studentList[3]=s4;
        
        //fill in 4 student names before running
        for(Student s: studentList){
        System.out.println(s.getName());
        }
    }
    
}
