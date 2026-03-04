package ArrayObjetos;
import Metodos.JOption;
import TDA.EstudianteIMC;
public class ObjetoEstImc {
static String unir = "Estudiantes registrados:\n\n";
public static void MenuIMC() {
        String Menu = "Agregar Estudiante,Visualizar,Salir";
        byte op = JOption.BotonOpciones(Menu);
        while (op != 2) {
            switch (op) {
                case 0:
                    AgregarEstudiante();
                    JOption.VerDatos("Estudiante agregado", unir);
                    break;
                case 1:
                    JOption.VerDatos("Lista de estudiantes", unir);
                    break;
                default:
                    JOption.VerDatos("Opción inválida", "");
            }
            op = JOption.BotonOpciones(Menu);
        }
    }
    public static void AgregarEstudiante() {
        EstudianteIMC obj = new EstudianteIMC();
        obj.setNombre(JOption.LecturaString("Nombre del estudiante"));
        obj.setNacimiento(JOption.LecturaShort("Año de nacimiento"));
        obj.setPeso(JOption.LecturaFloat("Peso en kg"));
        obj.setAltura(JOption.LecturaFloat("Altura en metros"));
        unir += "\n Nombre: " + obj.getNombre()
              + "\n Año nacimiento: " + obj.getNacimiento()
              + "\n Peso: " + obj.getPeso()
              + "\n Altura: " + obj.getAltura()
              + "\n IMC: " + String.format("%.2f", obj.calcularIMC())
              + "\n Clasificación: " + obj.clasificarIMC()
              + "\n----------------------------------";
    }
}
