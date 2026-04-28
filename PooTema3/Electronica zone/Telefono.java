package Herenciaequipo;
public class Telefono extends Dispositivo {
private short CapacidadAlmacenamiento;
    public Telefono() {
    }
    public Telefono(String Marca, float PrecioBase, short CapacidadAlmacenamiento) {
        super(Marca, PrecioBase);
        this.CapacidadAlmacenamiento = CapacidadAlmacenamiento;}
    public short getCapacidadAlmacenamiento(){return CapacidadAlmacenamiento;}
    public void setCapacidadAlmacenamiento(short CapacidadAlmacenamiento) {this.CapacidadAlmacenamiento = CapacidadAlmacenamiento;    }
    @Override
    public String toString() {
        return "Telefono{"+"Marca=" + Marca + ","
                + "\n PrecioBase=" + PrecioBase +","
                + "\nCapacidadAlmacenamiento=" + CapacidadAlmacenamiento + 
                "\nPrecioFinal=" + CalcularPrecioFinal()+ '}';
    }
    public float CalcularPrecioFinal(){
    float PrecioFinal =super.CalcularPrecioFinal();
    if(CapacidadAlmacenamiento >=128){PrecioFinal=(float) (PrecioFinal*1.1);}
    return PrecioFinal;
    }
}
