package Herenciaequipo;
public class Leon extends Mamifero {
private boolean Melena;
private float FuerzaMordida;//en newtons
public Leon(){}
public Leon(boolean Melena, float FuerzaMordida, String TipoPelaje, String Nombre, byte Edad, float Peso, String Dieta, String HorarioAlimentacion, String Sonido) {
        super(TipoPelaje, Nombre, Edad, Peso, Dieta, HorarioAlimentacion, Sonido);
        this.Melena = Melena;
        this.FuerzaMordida = FuerzaMordida;}
public boolean isMelena(){return Melena;}
public void setMelena(boolean Melena){this.Melena = Melena;}
public float getFuerzaMordida(){return FuerzaMordida;}
public void setFuerzaMordida(float FuerzaMordida){this.FuerzaMordida = FuerzaMordida;}
    @Override
public String toString() {
        return "Leon{" +"Nombre=" + Nombre + ", \nEdad=" + Edad +
           ",\nPeso=" + Peso + ", \nDieta=" + Dieta +
           ",\nHorarioAlimentacion=" + HorarioAlimentacion+
           ",\nSonido"+Sonido + ",\nTipoPelaje=" + TipoPelaje+ 
           ",\nMelena=" + Melena + ",\nFuerzaMordida=" + FuerzaMordida + '}';
    }

}
