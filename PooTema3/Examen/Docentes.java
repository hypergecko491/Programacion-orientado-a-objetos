package TemploDelSaber;
public class Docentes extends Personal {
private String Asignatura;
public Docentes() {}
public Docentes( String Clave, String Nombre, String Apellidos, String Genero, byte Edad, String Asignatura) {
super(Clave, Nombre, Apellidos, Genero, Edad);
this.Asignatura = Asignatura;
}
public String getAsignatura() {return Asignatura;}
public void setAsignatura(String Asignatura){this.Asignatura = Asignatura;}
@Override
public String toString() {
        return "Docentes:\nClave=" + Clave + ", \nNombre=" + Nombre + 
               ",\nApellidos=" + Apellidos + ",\nGenero=" + Genero +
               ",\nEdad=" + Edad + "\nAsignatura=" + Asignatura;
    }
@Override
public boolean esTipo(byte tipo){return tipo == 1 || tipo == 4;}
}
