/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia3;
import dia2.Person;
import dia2.Student;
import dia2.Teacher;
/**
 *
 * @author skypper
 */
public class Main {
    public static void main(String args[]){
        Bicycle bicycle1;
        Bicycle bicycle2;        
        Bicycle bicycle3;
        bicycle1 = new Bicycle(2500, "Trueno");
        bicycle2 = new Bicycle(3000, "Rayovack", 3);
        bicycle3 = new Bicycle(4000, "Toshiba");
                
        
        System.out.println("Bicycle1");
        System.out.println(bicycle1.getStates());
        System.out.println(bicycle1.getBrand());
        System.out.println(bicycle1.getPrice());
        
        System.out.println("Bicycle2");
        System.out.println(bicycle2.getStates());
        
        System.out.println("Bicycle3");
        System.out.println("testing states changes:");
        System.out.println(bicycle3.getStates());
        bicycle3.incrementSpeed();
        bicycle3.incrementSpeed();
        bicycle3.incrementSpeed(7);
        bicycle3.incrementSpeed(9);
        bicycle3.applyBrakes(17);
        System.out.println(bicycle3.getStates());
        
        System.out.println("iNTERACTUANDO CON OTROS OBJETOS");
        
        Person person4;
        
        Student student4;
        student4 = new Student("Jorge", "Meneces", "jun 23, 1994", "5647456", "2010978");
        
        person4 = new Teacher("Marco", "Nogales", "jun 11, 1992", "666", "Ing sistem");
        
        Bicycle bicycle4;
        bicycle4 = new Bicycle(6000, "Dell", person4);
        
        
    }
}
