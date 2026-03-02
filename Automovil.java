package TDA;
public class Automovil {
private String Marca;
private String Modelo;
private short AFabrica;
private String Motor;
private String TCombustible;
private String TAuto;
private byte NPuertas;
private String Color;
public Automovil() {}
public Automovil(String Marca, String Modelo, short AFabrica, String Motor, String TCombustible, String TAuto, byte NPuertas, String Color) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.AFabrica = AFabrica;
        this.Motor = Motor;
        this.TCombustible = TCombustible;
        this.TAuto = TAuto;
        this.NPuertas = NPuertas;
        this.Color = Color;
    }
public String getMarca() {return Marca;}
public void setMarca(String Marca) {this.Marca = Marca;}
public String getModelo() {return Modelo;}
public void setModelo(String Modelo) {this.Modelo = Modelo;}
public short getAFabrica() {return AFabrica;}
public void setAFabrica(short AFabrica) {this.AFabrica = AFabrica;}
public String getMotor() {return Motor;}
public void setMotor(String Motor) {this.Motor = Motor;}
public String getTCombustible() {return TCombustible;}
public void setTCombustible(String TCombustible) {this.TCombustible = TCombustible;}
public String getTAuto() {return TAuto;}
public void setTAuto(String TAuto) {this.TAuto = TAuto;}
public byte getNPuertas() {return NPuertas;}
public void setNPuertas(byte NPuertas) {this.NPuertas = NPuertas;}
public String getColor() {return Color;}
public void setColor(String Color) {this.Color = Color;}
@Override
public String toString() {
        return "Automovil{" + "Marca=" + Marca + ", Modelo=" + Modelo + ", AFabrica=" + AFabrica + ", Motor=" + Motor + ", TCombustible=" + TCombustible + ", TAuto=" + TAuto + ", NPuertas=" + NPuertas + ", Color=" + Color + '}';
    }
}
