package Herenciaequipo;
public class Mamifero extends Animal {
protected String TipoPelaje;
public Mamifero() {}
    public Mamifero(String TipoPelaje, String Nombre, byte Edad, float Peso, String Dieta, String HorarioAlimentacion, String Sonido) {
        super(Nombre, Edad, Peso, Dieta, HorarioAlimentacion, Sonido);
        this.TipoPelaje = TipoPelaje;
    }
public String getTipoPelaje(){return TipoPelaje;}
public void setTipoPelaje(String TipoPelaje) {this.TipoPelaje = TipoPelaje;}
@Override
public String toString() {
    return "Mamifero{" +"Nombre=" + Nombre + ", \nEdad=" + Edad +
           ",\nPeso=" + Peso + ", \nDieta=" + Dieta +
           ",\nHorarioAlimentacion=" + HorarioAlimentacion+
           ",\nSonido"+Sonido + ",\nTipoPelaje=" + TipoPelaje + '}';
    }
    
}
