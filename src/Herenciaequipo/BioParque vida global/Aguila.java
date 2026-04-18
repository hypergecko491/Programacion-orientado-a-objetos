package Herenciaequipo;

public class Aguila extends Ave {

    private float VelocidadVuelo;
    private float AgudezaVisual;

    public Aguila(float EnvergaduraAlas,
                  String Nombre, byte Edad, float Peso,
                  String Dieta, String HorarioAlimentacion, String Sonido,
                  float VelocidadVuelo, float AgudezaVisual) {

        super(EnvergaduraAlas, Nombre, Edad, Peso, Dieta, HorarioAlimentacion, Sonido);

        this.VelocidadVuelo = VelocidadVuelo;
        this.AgudezaVisual = AgudezaVisual;
    }

    @Override
    public String toString() {
        return "AGUILA\n" + super.toString() +
               "\nVelocidadVuelo=" + VelocidadVuelo +
               "\nAgudezaVisual=" + AgudezaVisual + "\n";
    }
}
