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
public class Circle extends Shape{

    private double radius;

    public Circle(double radius, String name) {
        super(name);
        this.radius = radius;
    }

    
    
    @Override
    public String gretting() {
        return "Hello i am Crircle";
    }

    @Override
    public double calculateArea() {
        return 5.0;
    }

    @Override
    public double caculatePerimeter() {
        return 10.0;
    }

    @Override
    public String getSomething() {
        return "Overrinding defualt methon in circle classs";
    }
    
    
}
