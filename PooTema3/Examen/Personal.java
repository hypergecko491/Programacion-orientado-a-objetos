package TemploDelSaber;
public class Personal {
protected String Clave;
protected String Nombre;
protected String Apellidos;
protected String Genero;
protected byte Edad;

    public Personal() {
    }

    public Personal(String Clave, String Nombre, String Apellidos, String Genero, byte Edad) {
        this.Clave = Clave;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Genero = Genero;
        this.Edad = Edad;
    }

    public String getClave() {
        return Clave;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public byte getEdad() {
        return Edad;
    }

    public void setEdad(byte Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Personal{" + "Clave=" + Clave + ", Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Genero=" + Genero + ", Edad=" + Edad + '}';
    }
public boolean esTipo(byte tipo){
    return tipo == 4;
}
}
