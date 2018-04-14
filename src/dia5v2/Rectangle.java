/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia5v2;

/**
 *
 * @author skypper
 */
public class Rectangle extends Shape {

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB, String name) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
    }    
    
    @Override
    public String gretting() {
        return "Hello i am Rectangle";
    }
}
