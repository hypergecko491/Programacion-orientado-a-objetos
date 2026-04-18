package Herenciaequipo;
public class Pinguino extends Ave {
private float VelocidadNado;
private String Tipo;
    public Pinguino() {}
    public Pinguino(float VelocidadNado, String Tipo, float EnvergaduraAlas, String Nombre, byte Edad, float Peso, String Dieta, String HorarioAlimentacion, String Sonido) {
        super(EnvergaduraAlas, Nombre, Edad, Peso, Dieta, HorarioAlimentacion, Sonido);
        this.VelocidadNado = VelocidadNado;
        this.Tipo = Tipo;}
    public float getVelocidadNado(){return VelocidadNado;}
    public void setVelocidadNado(float VelocidadNado){this.VelocidadNado = VelocidadNado;}
    public String getTipo(){return Tipo;}
    public void setTipo(String Tipo) {this.Tipo = Tipo;}
    @Override
    public String toString() {
        return "Pinguino{" +"Nombre=" + Nombre + ", \nEdad=" + Edad +
           ",\nPeso=" + Peso + ", \nDieta=" + Dieta + ", "+
           ",\nHorarioAlimentacion=" + HorarioAlimentacion + ",\nSonido:"+Sonido+
           ",\nEnvergaduraAlas=" + EnvergaduraAlas+ 
           ",\nVelocidadNado=" + VelocidadNado + ",\nTipo=" + Tipo + '}';
    }
    
}
