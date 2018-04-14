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
public class Triangle implements ComputableShape, DoSomething{

    private double b;
    private double h;

    public Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }
    
    public double calculateArea(){
        return b*h;
    }
    
    public double caculatePerimeter(){
        return 2*(b-h);
    }
}
