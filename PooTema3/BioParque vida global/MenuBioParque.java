package Testeo;
import EntradaSalida.JOption;
import Herenciaequipo.*;
public class MenuBioparque {
    public static void menuBioparque() {
        String menu = "Leon, Jirafa, Aguila, Pinguino, Cocodrilo, Consulta general, Contar, Salir";
        byte op = JOption.BotonOpciones(menu);
        GestorAnimal gestor = new GestorAnimal();
        while (op != 7) {
            switch (op) {
                case 0:
                    gestor.agregarAnimal(new Leon(
                            JOption.LecturaString("Nombre: "),
                              JOption.LecturaByte("Edad: "),
                              JOption.LecturaFloat("Peso: "),
                             JOption.LecturaString("Dieta: "),
                             JOption.LecturaString("Horario: "),
                            JOption.LecturaString("Sonido: "),
                             JOption.LecturaString("Tipo de pelaje: "),
                              (JOption.Sino("¿Tiene melena?") == 0),
                            JOption.LecturaFloat("Fuerza de mordida: ")
));
                    break;
                case 1:
                    gestor.agregarAnimal(new Jirafa(
                            JOption.LecturaString("Nombre: "),
                            JOption.LecturaByte("Edad: "),
                            JOption.LecturaFloat("Peso: "),
                            JOption.LecturaString("Dieta: "),
                            JOption.LecturaString("Horario: "),
                            JOption.LecturaString("Sonido: "),
                            JOption.LecturaString("Tipo de pelaje: "),
                            JOption.LecturaFloat("Longitud del cuello: "),
                            JOption.LecturaFloat("Altura: ")
                    ));
                    break;
                case 2:
                    gestor.agregarAnimal(new Aguila(
                            JOption.LecturaString("Nombre: "),
                            JOption.LecturaByte("Edad: "),
                            JOption.LecturaFloat("Peso: "),
                            JOption.LecturaString("Dieta: "),
                            JOption.LecturaString("Horario: "),
                            JOption.LecturaString("Sonido: "),
                            JOption.LecturaFloat("Envergadura de alas: "),
                            JOption.LecturaFloat("Agudeza visual: "),
                            JOption.LecturaFloat("Velocidad de vuelo: ")
                    ));
                    break;
                case 3:
                    gestor.agregarAnimal(new Pinguino(
                            JOption.LecturaString("Nombre: "),
                            JOption.LecturaByte("Edad: "),
                            JOption.LecturaFloat("Peso: "),
                            JOption.LecturaString("Dieta: "),
                            JOption.LecturaString("Horario: "),
                            JOption.LecturaString("Sonido: "),
                            JOption.LecturaFloat("Envergadura de alas: "),
                            JOption.LecturaFloat("Velocidad de nado: "),
                            JOption.LecturaString("Tipo: ")
                    ));
                    break;

                case 4:
                    gestor.agregarAnimal(new Cocodrilo(
                            JOption.LecturaString("Nombre: "),
                            JOption.LecturaByte("Edad: "),
                            JOption.LecturaFloat("Peso: "),
                            JOption.LecturaString("Dieta: "),
                            JOption.LecturaString("Horario: "),
                            JOption.LecturaString("Sonido: "),
                            JOption.LecturaString("Tipo de escamas: "),
                            JOption.LecturaFloat("Fuerza de mordida: "),
                            JOption.LecturaFloat("Longitud: ")
                    ));
                    break;
                case 5:
                    JOption.VerDatos2("Bioparque Vida Global",
                            gestor.consultaGeneral());
                    break;
                case 6:
                    JOption.VerDatos2("Conteo de animales",
                            gestor.contarAnimales());
                    break;
                default:
                    JOption.MostrarError("Opción inválida");
            }
            op = JOption.BotonOpciones(menu);
        }
    }
}
