package Herenciaequipo;
public class Aguila extends Ave {
    private float AgudezaVisual;
    private float VelocidadVuelo;
    public Aguila(){}
    public Aguila(String Nombre, byte Edad, float Peso,
                  String Dieta, String HorarioAlimentacion, String Sonido,
                  float EnvergaduraAlas,
                  float AgudezaVisual, float VelocidadVuelo) {
        super(Nombre, Edad, Peso, Dieta, HorarioAlimentacion, Sonido, EnvergaduraAlas);
        this.AgudezaVisual = AgudezaVisual;
        this.VelocidadVuelo = VelocidadVuelo;}
    public float getAgudezaVisual(){return AgudezaVisual;}
    public void setAgudezaVisual(float AgudezaVisual){this.AgudezaVisual = AgudezaVisual;}
    public float getVelocidadVuelo(){return VelocidadVuelo;}
    public void setVelocidadVuelo(float VelocidadVuelo){this.VelocidadVuelo = VelocidadVuelo;}
    @Override
    public String toString() {
        return "AGUILA\n" + super.toString() +
               "\nAgudezaVisual=" + AgudezaVisual +
               "\nVelocidadVuelo=" + VelocidadVuelo + "\n";
    }
}
