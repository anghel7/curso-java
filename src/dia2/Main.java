/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia2;

/**
 *
 * @author skypper
 */
public class Main {
    public static void main(String args[]){
        Person person1 = new Person("Juan", "Perez", "May 26, 1991", "6758493");
        Person person2 = new Person("Pedro", "Perez", "June 12, 1989", "56574646");
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println("herencia");
        Teacher teacher1 = new Teacher("Julio", "Salvatierra", "Jan 21, 1981", "485478475", "Sistem Enginer");
        System.out.println(teacher1.getName());
    }
}
