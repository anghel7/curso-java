/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia5;

import dia2.Person;
import dia2.Student;
import dia2.Teacher;

/**
 *
 * @author skypper
 */
public class Main {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Juan", "Perez", "Jun 23, 199a", "678475", "Sistem enginneering");
        Student student1 = new Student("Pedro", "Peres", "July 12, 1992", "85566", "201003434");
        Person person1 = new Person("rodrigo", "Peres", "Jun 11, 1991", "453422") {
            @Override
            public String gretting() {
                return "test abstract class iam an abstract class";
            }
        };
        
        School school1 = new School("Pedro poveda");
        school1.addPerson(teacher1);
        school1.addPerson(student1);
        //school1.showPersons();
        //school1.showStudents();
        System.out.println(person1.toString());
    }
}
