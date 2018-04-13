/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia4;

import dia2.Person;

/**
 *
 * @author skypper
 */
public class University {

    private String name;
    private static int limit = 5;
    private int count = 0;
    private Person[] persons;

    //{[0],[1],[2],[3],[4]}
    //{[{juan, perez}],[{carlo, meneces}],[nul],[nul],[null]}
    public University(String name) {
        this.name = name;
        this.persons = new Person[limit];
    }

    /*  
    public void addPerson(Person newPerson) {        
        int i = 0;
        while (i < persons.length) {
            this.persons[i] = newPerson;   
            i = i + 1;
        }
    }
     */
 /*
    public void addPerson(Person newPerson) {
        int i = 0;
        boolean filled = false;
        while (i < persons.length && !filled) {
            if (persons[i] == null) {
                this.persons[i] = newPerson;
                filled = true;
            }            
            i = i + 1;
        }
    }
     */
    public void addPerson(Person newPerson) {
        if (count < persons.length) {
            persons[count] = newPerson;
            count = count + 1;
        }
    }

    public void showListPerson() {
        System.out.println("Person list");
        //f (int i = 0; i <= 5; i++) {
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
    }
}
