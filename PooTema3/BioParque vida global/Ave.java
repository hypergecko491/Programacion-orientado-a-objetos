package Herenciaequipo;
public class Ave extends Animal {
    protected float EnvergaduraAlas;
    public Ave() {}
    public Ave(String Nombre, byte Edad, float Peso,
               String Dieta, String HorarioAlimentacion, String Sonido,
               float EnvergaduraAlas) {
        super(Nombre, Edad, Peso, Dieta, HorarioAlimentacion, Sonido);
        this.EnvergaduraAlas = EnvergaduraAlas;
    }
    public float getEnvergaduraAlas(){return EnvergaduraAlas;}
    public void setEnvergaduraAlas(float EnvergaduraAlas){this.EnvergaduraAlas = EnvergaduraAlas;}
    @Override
    public String toString() {
        return super.toString() +
               "\nEnvergaduraAlas=" + EnvergaduraAlas;
    }
}
