package Herencia;

public class Triangulo extends Poligono {

    public Triangulo() {
    }

    public Triangulo(float Base, float Altura, String Color) {
        super(Base, Altura, Color);
    }

    @Override
    public float CalcularArea() {
        return (float) (super.CalcularArea()*0.5); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
