package Herenciaequipo;
public class Leon extends Mamifero {
    private boolean Melena;
    private float FuerzaMordida; // en newtons
    public Leon() {}
    public Leon(String Nombre, byte Edad, float Peso,
                String Dieta, String HorarioAlimentacion, String Sonido,
                String TipoPelaje,
                boolean Melena, float FuerzaMordida) {
        super(Nombre, Edad, Peso, Dieta, HorarioAlimentacion, Sonido, TipoPelaje);
        this.Melena = Melena;
        this.FuerzaMordida = FuerzaMordida;
    }
    public boolean isMelena(){return Melena;}
    public void setMelena(boolean Melena){this.Melena = Melena;}
    public float getFuerzaMordida(){return FuerzaMordida;}
    public void setFuerzaMordida(float FuerzaMordida){this.FuerzaMordida = FuerzaMordida;}
    @Override
    public String toString() {
        return "LEON\n" + super.toString() +
               "\nMelena=" + Melena +
               "\nFuerzaMordida=" + FuerzaMordida + "\n";
    }
}
