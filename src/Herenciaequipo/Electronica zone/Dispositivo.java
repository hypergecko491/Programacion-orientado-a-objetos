
package Herenciaequipo;
public class Dispositivo {
protected String Marca;
protected float PrecioBase;
    public Dispositivo() {    }
    public Dispositivo(String Marca, float PrecioBase) {
        this.Marca = Marca;
        this.PrecioBase = PrecioBase;
    }
    public String getMarca() {
        return Marca;
    }
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }
    public float getPrecioBase() {
        return PrecioBase;
    }
    public void setPrecioBase(float PrecioBase) {
        this.PrecioBase = PrecioBase;
    }
    @Override
    public String toString() {
        return "Dispositivo{" + "Marca=" + Marca + ", PrecioBase=" + PrecioBase + '}';
    }
    public float CalcularPrecioFinal(){return (float) (PrecioBase*1.25);}
}
