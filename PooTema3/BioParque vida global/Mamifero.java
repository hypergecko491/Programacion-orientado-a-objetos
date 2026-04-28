package Herenciaequipo;
public class Mamifero extends Animal {
    protected String TipoPelaje;
    public Mamifero() {}
    public Mamifero(String Nombre, byte Edad, float Peso,String Dieta, String HorarioAlimentacion, String Sonido,String TipoPelaje) {
        super(Nombre, Edad, Peso, Dieta, HorarioAlimentacion, Sonido);
        this.TipoPelaje = TipoPelaje;
    }
    public String getTipoPelaje(){return TipoPelaje;}
    public void setTipoPelaje(String TipoPelaje){this.TipoPelaje = TipoPelaje;}
    @Override
    public String toString() {
        return super.toString() +
               "\nTipoPelaje=" + TipoPelaje;
    }
}
