package Herenciaequipo;
public class Tablet extends Dispositivo {
private float TamañoPantalla;
    public Tablet(String Marca, float PrecioBase, float TamañoPantalla) {
        super(Marca, PrecioBase);
        this.TamañoPantalla = TamañoPantalla;
    }
    public Tablet() {
    }
    public float getTamañoPantalla() {
        return TamañoPantalla;
    }
    public void setTamañoPantalla(float TamañoPantalla) {
        this.TamañoPantalla = TamañoPantalla;
    }

    @Override
    public String toString() {
        return "Tablet{" + "Marca=" + Marca + ",\n PrecioBase=" + PrecioBase +",\n Tama\u00f1oPantalla=" + TamañoPantalla + "\nPrecioFinal=" + CalcularPrecioFinal()+ '}';
    }
    public float CalcularPrecioFinal(){
    float PrecioFinal =super.CalcularPrecioFinal();
    if(TamañoPantalla >=10){PrecioFinal=(float) (PrecioFinal*1.09);}
    return PrecioFinal;
    }
}
