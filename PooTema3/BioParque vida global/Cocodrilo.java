package Herenciaequipo;
public class Cocodrilo extends Reptil {
    private float FuerzaMordida;
    private float Longitud;
    public Cocodrilo() {}
    public Cocodrilo(String Nombre, byte Edad, float Peso,
                     String Dieta, String HorarioAlimentacion, String Sonido,
                     String TipoEscamas,
                     float FuerzaMordida, float Longitud) {
        super(Nombre, Edad, Peso, Dieta, HorarioAlimentacion, Sonido, TipoEscamas);
        this.FuerzaMordida = FuerzaMordida;
        this.Longitud = Longitud;
    }
    public float getFuerzaMordida(){return FuerzaMordida;}
    public void setFuerzaMordida(float FuerzaMordida){this.FuerzaMordida = FuerzaMordida;}
    public float getLongitud(){return Longitud;}
    public void setLongitud(float Longitud){this.Longitud = Longitud;}
    @Override
    public String toString() {
        return "COCODRILO\n" + super.toString() +
               "\nFuerzaMordida=" + FuerzaMordida +
               "\nLongitud=" + Longitud + "\n";
    }
}
