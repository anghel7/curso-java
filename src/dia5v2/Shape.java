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
public abstract class Shape implements ComputableShape, DoSomething{
    protected String name;

    public Shape(String name) {
        this.name = name;
    }
    
    public abstract String gretting();
}
