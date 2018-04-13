/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia4;

import dia2.Student;
import dia2.Teacher;
import dia3.Bicycle;
import java.util.ArrayList;

/**
 *
 * @author skypper
 */
public class Main {

    public static void main(String[] args) {
        University university1;
        university1 = new University("UMSS");

        Teacher teacher1 = new Teacher("Alex", "Mamani", "Jan 15, 1991", "5633434", "Sistem engenniren");
        Student student2 = new Student("Juan", "Perez", "May 17, 1970", "4358374", "201004556");

        university1.addPerson(teacher1);
        university1.addPerson(student2);

        university1.showListPerson();

        System.out.println("Generic class");
        Bicycle bicycleBox = new Bicycle(2500, "trueno");
        Student studentBox = new Student("Marc", "aguilar", "juna 23, 1970", "32674627", "201107685");
        University universityBox= new University("Ccatolica");
        /*
        Box box1;
        box1 = new Box(bicycleBox, studentBox);
        */
        
        Box<Student> box2 = new Box<>(studentBox);
        
        Box<University> box3 = new Box<>(universityBox);
        
        ArrayList<University> universitiesList;
        
        universitiesList = new ArrayList<>();
        universitiesList.add(university1);
        universitiesList.add(universityBox);
        
        for (int i = 0; i < universitiesList.size(); i++) {
            System.out.println(universitiesList.get(i));
        }
        
        ArrayList<Bicycle> bicyclesList;
    }
}
