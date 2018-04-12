/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia3;

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
        
    }
}
