package TemploDelSaber;
public class Mantenimiento extends Personal {    
private String AreaAsignada;
public Mantenimiento() {}
public Mantenimiento(String Clave, String Nombre, String Apellidos, String Genero, byte Edad,String AreaAsignada) {
        super(Clave, Nombre, Apellidos, Genero, Edad);
        this.AreaAsignada = AreaAsignada;}
public String getAreaAsignada(){return AreaAsignada;}
public void setAreaAsignada(String AreaAsignada){this.AreaAsignada = AreaAsignada;}
@Override
public String toString() {
        return "Mantenimiento:\nClave=" + Clave + ", \nNombre=" + Nombre + 
               ", \nApellidos=" + Apellidos + ", \nGenero=" + Genero + 
               ", \nEdad=" + Edad + "\nAreaAsignada=" + AreaAsignada;}
@Override
public boolean esTipo(byte tipo){return tipo == 3 || tipo == 4;}
}
