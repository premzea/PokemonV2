// User.java
package model;

public class User{
    private String nomCompleto;
    private String nomUsuario;
    private int edad;

    public User(String nomCompleto, String nomUsuario, int edad){
        this.nomCompleto = nomCompleto;
        this.nomUsuario = nomUsuario;
        this.edad = edad;
    }
    

    public String getNomCompleto() {
      return this.nomCompleto;
    }
    public void setNomCompleto(String value) {
      this.nomCompleto = value;
    }

    public String getNomUsuario() {
      return this.nomUsuario;
    }
    public void setNomUsuario(String value) {
      this.nomUsuario = value;
    }

    public int getEdad() {
      return this.edad;
    }
    public void setEdad(int value) {
      this.edad = value;
    }

    public String toString(){
      return "Nombre Completo: " + nomCompleto + "\nNombre de Usuario: " + nomUsuario + "\nEdad: " + edad;
    }
}