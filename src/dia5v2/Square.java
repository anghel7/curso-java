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
public class Square implements ComputableShape, DoSomething {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double caculatePerimeter() {
        return 4 * side;
    }

    @Override
    public String getSomething() {

        return "Overrading defulta method of DoSomething interface";
    }

}
