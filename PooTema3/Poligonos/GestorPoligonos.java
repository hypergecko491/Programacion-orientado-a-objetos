package Herencia;
import java.util.ArrayList;
public class GestorPoligonos {
    private ArrayList<Poligono> listaPoligonos;
    public GestorPoligonos() {
        listaPoligonos = new ArrayList<>();
    }
    public void agregarPoligono(Poligono Poligono) {
        listaPoligonos.add(Poligono);
    }
    public String consultaGeneral() {
        String resultado = "-".repeat(30) + "\n";
        for (Poligono a : listaPoligonos) {
            resultado += a.toString() + "\n";
        }
        return resultado;
    }
    public String contarPoligonos() {
        byte Rectangulo = 0, TrianguloIsosceles = 0, TrianguloRectangulo = 0;
        for (Poligono a : listaPoligonos) {
            if (a instanceof Rectangulo) Rectangulo++;
            else if (a instanceof TrianguloIsosceles) TrianguloIsosceles++;
            else if (a instanceof TrianguloRectangulo) TrianguloRectangulo++;
        }
        return "\nRectangulos: " + Rectangulo +
               "\nTriangulos isosceles: " + TrianguloIsosceles +
               "\nTriangulos Rectangulo: " + TrianguloRectangulo;
    }
}
