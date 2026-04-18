package Herenciaequipo;
import java.util.ArrayList;
public class GestorAnimal {
    private ArrayList<Animal> listaAnimales;
    public GestorAnimal() {
        listaAnimales = new ArrayList<>();
    }
    public void agregarAnimal(Animal animal) {
        listaAnimales.add(animal);
    }
    public String consultaGeneral() {
        String resultado = "-".repeat(30) + "\n";
        for (Animal a : listaAnimales) {
            resultado += a.toString() + "\n";
        }
        return resultado;
    }
    public String contarAnimales() {
        byte leones = 0, jirafas = 0, aguilas = 0, pinguinos = 0, cocodrilos = 0;
        for (Animal a : listaAnimales) {
            if (a instanceof Leon) leones++;
            else if (a instanceof Jirafa) jirafas++;
            else if (a instanceof Aguila) aguilas++;
            else if (a instanceof Pinguino) pinguinos++;
            else if (a instanceof Cocodrilo) cocodrilos++;
        }
        return "\nLeones: " + leones +
               "\nJirafas: " + jirafas +
               "\nAguilas: " + aguilas +
               "\nPinguinos: " + pinguinos +
               "\nCocodrilos: " + cocodrilos;
    }
}
