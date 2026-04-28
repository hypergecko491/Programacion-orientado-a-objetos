package Herenciaequipo;
public class Jirafa extends Mamifero {
    private float LongitudCuello;
    private float Altura;
    public Jirafa() {}
    public Jirafa(String Nombre, byte Edad, float Peso,
                  String Dieta, String HorarioAlimentacion, String Sonido,
                  String TipoPelaje,
                  float LongitudCuello, float Altura) {
        super(Nombre, Edad, Peso, Dieta, HorarioAlimentacion, Sonido, TipoPelaje);
        this.LongitudCuello = LongitudCuello;
        this.Altura = Altura;
    }
    public float getLongitudCuello(){return LongitudCuello;}
    public void setLongitudCuello(float LongitudCuello){this.LongitudCuello = LongitudCuello;}
    public float getAltura(){return Altura;}
    public void setAltura(float Altura){this.Altura = Altura;}
    @Override
    public String toString() {
        return "JIRAFA\n" + super.toString() +
               "\nLongitudCuello=" + LongitudCuello +
               "\nAltura=" + Altura + "\n";
    }
}
