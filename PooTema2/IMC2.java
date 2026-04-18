package Menus;
import ArrayObjetos.ObjetosEstDinamico;
import Metodos.EntradaSalida;
public class IMC2 {
    public static void MenuIMC2() {
     String unir = "Estudiantes registrados:\n\n";
        String Menu = "Agregar, Consulta general, ordenar datos, Salir";
        byte tam=EntradaSalida.LecturaByte("cuantos estudiantes son?");
        ObjetosEstDinamico lista=new ObjetosEstDinamico(tam);
        byte op = EntradaSalida.BotonOpciones(Menu);
        while (op != 3) {
            switch (op) {
                case 0:
                    lista.AgregarObjeto();
                    EntradaSalida.VerDatos2("Estudiante agregado", unir + lista.VerObjetos());
                    break;
                case 1:
                    EntradaSalida.VerDatos2("Calculo del Imc de estudiantes", unir + lista.VerObjetos());
                    break;
                case 2: String cad="Datos desordenados:\n"+lista.VerObjetos();
                lista.OrdenarBubble();
                cad+="Datos ordenados: \n "+lista.VerObjetos();
                EntradaSalida.VerDatos2("calculo de imc de estudiante", cad);
                break;
                default:
                    EntradaSalida.VerDatos2("Opción inválida", "");
            }
            op = EntradaSalida.BotonOpciones(Menu);
        }
    }

}
