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
        /*
        Person person1 = new Person("Juan", "Perez", "May 26, 1991", "6758493");
        Person person2 = new Person("Pedro", "Perez", "June 12, 1989", "56574646");
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println("herencia");
        */
        Teacher teacher1 = new Teacher("Julio", "Salvatierra", "Jan 21, 1981", "485478475", "Sistem Enginer");
        Student student1 = new Student("Luis", "Aviles", "Jan 22, 1970", "73467364", "201005678");
        //System.out.println(teacher1.getName());
        
        
        //teacher1 es una instancia de la clase Teacher
        //Objeto es una isntancia de una clase
        //Un Objeto vive solo en memoria
        //Una clase abstracta declara la existencia de metodos pero no la implementacion
        //Una clase abstracta no se puede instanciar
        //Una clase abstracta tiene metodos sin definir
        //Las clases que extiendan de una clase abstracta tienen que implementar los metodos abstractos de la clase abstracta
        System.out.println(teacher1.gretting());
        System.out.println(student1.gretting());
        //Interfaces
        //Arraylist
        //Lambdas
        //Clases genericas
        
    }
}
