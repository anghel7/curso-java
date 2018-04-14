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
public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(20.0, "CIRCULO");
        Rectangle rectangle1 = new Rectangle(5.0, 4.0, "Rectangulo");
        
        Triangle triangle1 = new Triangle(4.0, 3.0);
        System.out.println("Area del triangulo :"+ triangle1.calculateArea());
        System.out.println("Perimetro del triangulo :"+ triangle1.caculatePerimeter());
        System.out.println("Default method del triangulo :"+ triangle1.getSomething());
        System.out.println("--------------------");
        Square square1 = new Square(5.0);
        System.out.println("Area del cudrado :"+ square1.calculateArea());
        System.out.println("Perimetro del cudrado :"+ square1.caculatePerimeter());
        System.out.println("Default method del cudrado :"+ square1.getSomething());
        System.out.println("--------------------");        
        System.out.println("Area del circulo :"+ circle1.calculateArea());
        System.out.println("Perimetro del circulo :"+ circle1.caculatePerimeter());
        System.out.println("Default method del circulo :"+ circle1.getSomething());
        System.out.println("Default method del circulo :"+ circle1.gretting());
        
        
        DoSomething triangelds = new Triangle(3.2, 2.2);
        ComputableShape trianglecs = new Triangle(4.3, 3.2);
        
    }
}
