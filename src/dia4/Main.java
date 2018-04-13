/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia4;

import dia2.Student;
import dia2.Teacher;

/**
 *
 * @author skypper
 */
public class Main {
    public static void main(String[] args){
        University university1;
        university1 = new University("UMSS");
        
        Teacher teacher1 = new Teacher("Alex", "Mamani", "Jan 15, 1991", "5633434", "Sistem engenniren");
        Student student2 = new Student("Juan", "Perez", "May 17, 1970", "4358374", "201004556");
        
        university1.addPerson(teacher1);
        university1.addPerson(student2);       
        
        university1.showListPerson();
    }
}
