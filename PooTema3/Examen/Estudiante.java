package TemploDelSaber;
public class Estudiante extends Personal {
private String Carrera;
private String Semestre;
public Estudiante() {}
public Estudiante(String Clave, String Nombre, String Apellidos, String Genero, byte Edad ,String Carrera, String Semestre) {
        super(Clave, Nombre, Apellidos, Genero, Edad);
        this.Carrera = Carrera;
        this.Semestre = Semestre;
    }
public String getCarrera(){return Carrera;}
public void setCarrera(String Carrera){this.Carrera=Carrera;}
public String getSemestre(){return Semestre;}
public void setSemestre(String Semestre){this.Semestre = Semestre;}
@Override
public String toString() {
        return "Estudiante:" + "\nClave=" + Clave + ", \nNombre=" + Nombre + 
               ", \nApellidos=" + Apellidos + ", \nGenero=" + Genero + 
               ", \nEdad=" + Edad + "\nCarrera=" + Carrera + ",\n Semestre=" + Semestre;
    }
    @Override
public boolean esTipo(byte tipo){return tipo == 0 || tipo == 4;}
}
