package Herenciaequipo;
public class Laptop extends Dispositivo {
private byte TamañoRam;
    public Laptop() {
    }
    public Laptop(String Marca, float PrecioBase, byte TamañoRam) {
        super(Marca, PrecioBase);
        this.TamañoRam = TamañoRam;
    }
    public byte getTamañoRam() {
        return TamañoRam;
    }
    public void setTamañoRam(byte TamañoRam) {
        this.TamañoRam = TamañoRam;
    }
    @Override
    public String toString() {
        return "Laptop{"+ "Marca=" + Marca + ",\n PrecioBase=" + PrecioBase + ",\nTama\u00f1oRam=" + TamañoRam + "\nPrecioFinal=" + CalcularPrecioFinal()+ '}';
    }
    public float CalcularPrecioFinal(){
    float PrecioFinal =super.CalcularPrecioFinal();
    if(TamañoRam >=16){PrecioFinal=(float) (PrecioFinal*1.15);}
    return PrecioFinal;
    }
}
