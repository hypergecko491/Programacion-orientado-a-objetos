package Herenciaequipo;
public class Cocodrilo extends Reptil {
private float FuerzaMordida;
private float Longitud;
public Cocodrilo(){}
public Cocodrilo(float FuerzaMordida, float Longitud, String TipoEscamas, String Nombre, byte Edad, float Peso, String Dieta, String HorarioAlimentacion, String Sonido) {
        super(TipoEscamas, Nombre, Edad, Peso, Dieta, HorarioAlimentacion, Sonido);
        this.FuerzaMordida = FuerzaMordida;
        this.Longitud = Longitud;
    }
public float getFuerzaMordida(){return FuerzaMordida;}
public void setFuerzaMordida(float FuerzaMordida){this.FuerzaMordida = FuerzaMordida;}
public float getLongitud(){return Longitud;}
public void setLongitud(float Longitud) {this.Longitud = Longitud;}
@Override
public String toString() {
        return "Cocodrilo{" +"Nombre=" + Nombre + ", \nEdad=" + Edad +
                ",\nPeso=" + Peso + ", \nDieta=" + Dieta +
                ",\nHorarioAlimentacion=" + HorarioAlimentacion +
                ",\nSonido:"+Sonido+ ",\nTipoEscamas=" + TipoEscamas+ 
                ",\nFuerzaMordida=" + FuerzaMordida + ",\nLongitud=" + Longitud + '}';
    }

}
