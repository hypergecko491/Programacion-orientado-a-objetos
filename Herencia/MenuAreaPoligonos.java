package Testeo;
import EntradaSalida.JOption;
import Herencia.*;
public class MenuAreaPoligonos {
  public static void menuPoligonos() {
        String menu = "Rectangulo,Triangulo Isosceles,Triangulo Rectangulo,Consulta general, Contar, Salir";
        byte op = JOption.BotonOpciones(menu);
        GestorPoligonos gestor = new GestorPoligonos();
        while (op != 6) {
            switch (op) {
                case 0:
                    gestor.agregarPoligono(new Rectangulo(
                            JOption.LecturaFloat("Base: "),
                              JOption.LecturaFloat("Altura: "),
                              JOption.LecturaString("color: ")));
                    break;
                case 1:
                    gestor.agregarPoligono(new TrianguloIsosceles(
                            JOption.LecturaFloat("Base: "),
                              JOption.LecturaFloat("Altura: "),
                              JOption.LecturaString("color: ")));
                    break;
                case 2:
                    gestor.agregarPoligono(new TrianguloRectangulo(
                            JOption.LecturaFloat("Base: "),
                              JOption.LecturaFloat("Altura: "),
                              JOption.LecturaString("color: ")));
                    break;
                case 3:
                    JOption.VerDatos2("Bioparque Vida Global",
                            gestor.consultaGeneral());
                    break;
                case 4:
                    JOption.VerDatos2("Conteo de animales",
                            gestor.contarPoligonos());
                    break;
                default:
                    JOption.MostrarError("Opción inválida");
            }
            op = JOption.BotonOpciones(menu);
        }
    }   
}
