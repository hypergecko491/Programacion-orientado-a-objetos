package Herencia;
public class Poligono {
protected float Base;
protected float Altura;
protected String Color;
    public Poligono() {
    }
    public Poligono(float Base, float Altura, String Color) {
        this.Base = Base;
        this.Altura = Altura;
        this.Color = Color;
    }
    public void setBase(float Base) {
        this.Base = Base;
    }
    public void setAltura(float Altura) {
        this.Altura = Altura;
    }
    public void setColor(String Color) {
        this.Color = Color;
    }
   
    public float CalcularArea(){return Base*Altura;}
     @Override
    public String toString() {
        return "Poligono{" + "\nBase=" + Base +
               ", \nAltura=" + Altura +
               ", \nColor=" + Color +
               ", \nArea=" + CalcularArea()+'}';
    }
}
