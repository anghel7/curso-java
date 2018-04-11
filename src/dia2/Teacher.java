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
public class Teacher extends Person{
  
    private String profession;

    public Teacher(String name, String lastname, String dateOfBirthday, String dni, String profession) {
        super(name, lastname, dateOfBirthday, dni);
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
    

}
