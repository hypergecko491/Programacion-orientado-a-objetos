package Herenciaequipo;
public class Jirafa extends Mamifero {
private float LongitudCuello;
private float Altura;
public Jirafa() {}
public Jirafa(float LongitudCuello, float Altura, String TipoPelaje, String Nombre, byte Edad, float Peso, String Dieta, String HorarioAlimentacion, String Sonido) {
        super(TipoPelaje, Nombre, Edad, Peso, Dieta, HorarioAlimentacion, Sonido);
        this.LongitudCuello = LongitudCuello;
        this.Altura = Altura;
    }
public float getLongitudCuello(){return LongitudCuello;}
public void setLongitudCuello(float LongitudCuello) {this.LongitudCuello = LongitudCuello;}
public float getAltura(){return Altura;}
public void setAltura(float Altura){this.Altura=Altura;}
@Override
public String toString() {
        return "Jirafa{"+"Nombre=" + Nombre + ", \nEdad=" + Edad +
           ",\nPeso=" + Peso + ", \nDieta=" + Dieta +
           ",\nHorarioAlimentacion=" + HorarioAlimentacion+
           ",\nSonido"+Sonido + ",\nTipoPelaje=" + TipoPelaje+
           ",\nLongitudCuello="+LongitudCuello+",\nAltura="+Altura+ '}';
    }

}
