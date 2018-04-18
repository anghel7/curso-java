/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia6;

import dia2.Student;
import dia5v2.ComputableShape;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author skypper
 */
public class Main {

    public static void main(String args[]) {
        Student student1 = new Student("Carlos", "Meneces", "13 jun, 1991", "67584767", "201067863");
        Student student2 = new Student("Jorge", "Beltran", "12, jun 1990", "34873847", "2010043");

        HashMap<Integer, String> hashmap1;
        hashmap1 = new HashMap<>();
        //hashmap.put(key, value);
        hashmap1.put(641, "Carlos");
        hashmap1.put(446, "Jorge");
        hashmap1.put(649, "Angel");
        hashmap1.put(649, "Angel2");

        HashMap<String, Student> hashMap2;
        hashMap2 = new HashMap<>();
        hashMap2.put("kenshin", student1);
        hashMap2.put("chato", student2);

        ArrayList<Student> studentList;
        studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);

        Iterator<Student> studentIterator;
        studentIterator = studentList.iterator();
        //[ {carlos},{Jorge},{angel},{rosa},{marcos}]
        //                                      *
        while (studentIterator.hasNext()) {
            System.out.println(studentIterator.next());
        }
        //hashmap1
        //              map
        // hashmap          hashset         has....
        Iterator<Map.Entry<Integer, String>> iterator1;
        iterator1 = hashmap1.entrySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry<Integer, String> element = iterator1.next();
            System.out.println("key: " + element.getKey() + " value:" + element.getValue());

        }
        
        //iterando lista
        System.out.println("lambda");
        studentList.forEach((studentToIterate) -> {
            System.out.println("using lambda expresion: "+ studentToIterate.getName());
        });
        
        /*
        ComputableShape cs = new ComputableShape() {
            double x = 23.4;
            @Override
            public double calculateArea() {
                return x;
            }

            @Override
            public double caculatePerimeter() {
                return 7.0;
            }
        };
         */
    }
}
