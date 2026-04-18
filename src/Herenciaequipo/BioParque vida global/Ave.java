package Herenciaequipo;
public class Ave extends Animal {
protected float EnvergaduraAlas;
    public Ave() {
    }
    public Ave(float EnvergaduraAlas, String Nombre, byte Edad, float Peso, String Dieta, String HorarioAlimentacion, String Sonido) {
        super(Nombre, Edad, Peso, Dieta, HorarioAlimentacion, Sonido);
        this.EnvergaduraAlas = EnvergaduraAlas;
    }
public float getEnvergaduraAlas(){return EnvergaduraAlas;}
public void setEnvergaduraAlas(float EnvergaduraAlas){this.EnvergaduraAlas = EnvergaduraAlas;}
@Override
public String toString() {
    return "Ave{" +"Nombre=" + Nombre + ", \nEdad=" + Edad +
           ",\nPeso=" + Peso + ", \nDieta=" + Dieta + ", "+
           ",\nHorarioAlimentacion=" + HorarioAlimentacion + ",\nSonido:"+Sonido+
           ",\nEnvergaduraAlas=" + EnvergaduraAlas + '}';
    }
}
