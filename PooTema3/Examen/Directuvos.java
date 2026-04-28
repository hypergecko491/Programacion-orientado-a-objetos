package TemploDelSaber;
public class Directivos extends Personal {
private String Cargo;
private float Sueldo;
public Directivos(){}
public Directivos(String Clave, String Nombre, String Apellidos, String Genero, byte Edad,String Cargo, float Sueldo) {
        super(Clave, Nombre, Apellidos, Genero, Edad);
        this.Cargo = Cargo;
        this.Sueldo = Sueldo;
    }
public String getCargo(){return Cargo;}
public void setCargo(String Cargo){this.Cargo = Cargo;}
public float getSueldo(){return Sueldo;}
public void setSueldo(float Sueldo) {this.Sueldo = Sueldo;}
@Override
public String toString() {
        return "Directivos:\nClave=" + Clave + 
               ", \nNombre=" + Nombre + ", \nApellidos=" + Apellidos + 
               ", \nGenero=" + Genero + ", \nEdad=" + Edad + 
               ", \nCargo=" + Cargo + ", \nSueldo=" + Sueldo;
}
@Override
public boolean esTipo(byte tipo){return tipo == 2 || tipo == 4;}
}
