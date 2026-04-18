package Herenciaequipo;
public class Aguila extends Ave {
private float AgudezaVisual;
private float VelocidadVuelo;
public Aguila(){}
public Aguila(float AgudezaVisual, float VelocidadVuelo, float EnvergaduraAlas, String Nombre, byte Edad, float Peso, String Dieta, String HorarioAlimentacion, String Sonido) {
        super(EnvergaduraAlas, Nombre, Edad, Peso, Dieta, HorarioAlimentacion, Sonido);
        this.AgudezaVisual = AgudezaVisual;
        this.VelocidadVuelo = VelocidadVuelo;
    }
public float getAgudezaVisual() {return AgudezaVisual;}
public void setAgudezaVisual(float AgudezaVisual) {this.AgudezaVisual = AgudezaVisual;}
public float getVelocidadVuelo(){return VelocidadVuelo;}
public void setVelocidadVuelo(float VelocidadVuelo){this.VelocidadVuelo = VelocidadVuelo;}
    @Override
    public String toString() {
        return "Aguila{" +"Nombre=" + Nombre + ", \nEdad=" + Edad +
           ",\nPeso=" + Peso + ", \nDieta=" + Dieta + ", "+
           ",\nHorarioAlimentacion=" + HorarioAlimentacion + ",\nSonido:"+Sonido+
           ",\nEnvergaduraAlas=" + EnvergaduraAlas+ ",\nAgudezaVisual=" + AgudezaVisual +
           ",\nVelocidadVuelo=" + VelocidadVuelo + '}';
    }

}
