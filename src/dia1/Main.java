package dia1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author skypper
 */
public class Main {
     public static void main(String args[]) {
    //Declaracion
    Persona personajuan;
    //Instaciacion o construccion
    //personajuan = new Persona();
    personajuan = new Persona("Juan", "Perez");
    //Accediendo a los atributos publicos
    //Esto no se debe hacer
    /*
    personajuan.nombre = "Juan";
    personajuan.apellido = "Perez";
    System.out.println("Mostrando el apellido: ");
    System.out.println(personajuan.apellido);
    */
    //Metodo dinamico
    System.out.println("Nombre completo:");
    System.out.println(personajuan.getNombreComplete());
    System.out.println("Accediendo al nombre con el get");
    System.out.println(personajuan.getNombre());
    //Probando el metodo set
    System.out.println("Cambiando el nombre a pedro");
    personajuan.setNombre("Pedro");
    System.out.println(personajuan.getNombreComplete());
    //Metodo toString
    System.out.println("Probando el metodo toString");
    System.out.println(personajuan.toString());
    /*
    * Tipos de datos([int, Integer][double, Double][char, Character],[String, que es?],[boolean, Boolean])
    * Hacer Ejemploes de metodos cons distintos tipos de retorno
    * Hacer Ejemploes de metodos cons distintos tipos de parametros de entrada
    * Arreglos staticos(Que son?, como se unsan?, ejemplos)
    * Como rrecorrer arreglos estaticos usando un for
    * Como se hace un get y un set para un valor boolean
    * */
  }
}
