package Herenciaequipo;

public class Animal {
    protected String Nombre;
    protected byte Edad;
    protected float Peso;
    protected String Dieta;
    protected String HorarioAlimentacion;
    protected String Sonido;

    public Animal() {}

    public Animal(String Nombre, byte Edad, float Peso,
                  String Dieta, String HorarioAlimentacion, String Sonido) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Peso = Peso;
        this.Dieta = Dieta;
        this.HorarioAlimentacion = HorarioAlimentacion;
        this.Sonido = Sonido;
    }

    public String getNombre(){return Nombre;}
    public void setNombre(String Nombre){this.Nombre = Nombre;}

    public byte getEdad(){return Edad;}
    public void setEdad(byte Edad){this.Edad = Edad;}

    public float getPeso(){return Peso;}
    public void setPeso(float Peso){this.Peso = Peso;}

    public String getDieta(){return Dieta;}
    public void setDieta(String Dieta){this.Dieta = Dieta;}

    public String getHorarioAlimentacion(){return HorarioAlimentacion;}
    public void setHorarioAlimentacion(String HorarioAlimentacion){this.HorarioAlimentacion = HorarioAlimentacion;}

    public String getSonido(){return Sonido;}
    public void setSonido(String Sonido){this.Sonido = Sonido;}

    @Override
    public String toString() {
        return "Nombre=" + Nombre +
               "\nEdad=" + Edad +
               "\nPeso=" + Peso +
               "\nDieta=" + Dieta +
               "\nHorarioAlimentacion=" + HorarioAlimentacion +
               "\nSonido=" + Sonido;
    }
}
