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
public class Persona {
    //Atributos
  //Modificadores de acceso
  //Restringir informacion
  //public, private, protected
  private String nombre;
  private String apellido;
  //private int nroCuenta:

  //Constructor por defecto Java
  public Persona() {
    this.nombre = "Default nombre";
    this.apellido = "Defaul apellido";
  }

  public Persona(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }

  //modificador, tipo de retorno, nombre del metodo, parametros de entrada
  public String getNombreComplete() {
    return this.nombre + " " + this.apellido;
  }

  //Metodos get y set son publicos
  //Get es para pedir
  //Set para cambiar, modificar
  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }
  //My ejemplo
  /*
  @Override
  public String toString() {
    return "Nombre:" + this.nombre + ", Apellido: " + this.apellido;
  }
  */

  @Override
  public String toString() {
    return "Persona{" +
      "nombre='" + nombre + '\'' +
      ", apellido='" + apellido + '\'' +
      '}';
  }
}
