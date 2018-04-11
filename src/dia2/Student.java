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
public class Student extends Person{

    private String codsis;

    public Student(String name, String lastname, String dateOfBirthday, String dni, String codsis) {
        super(name, lastname, dateOfBirthday, dni);
        this.codsis = codsis;
    }
        
}
