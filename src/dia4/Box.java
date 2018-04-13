/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia4;

import dia2.Person;
import dia3.Bicycle;

/**
 *
 * @author skypper
 */
public class Box<T> {

    private T firstSubBox;

    /*
    E - Element (used extensively by the Java Collections Framework)
    K - Key
    N - Number
    T - Type
    V - Value
    S,U,V etc. - 2nd, 3rd, 4th types
     */

    public Box(T firstSubBox) {
        this.firstSubBox = firstSubBox;
    }

  

}
