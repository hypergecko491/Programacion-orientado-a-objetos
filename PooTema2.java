package com.mycompany.progratema2;
import Metodos.EntradaSalida;
import ArrayObjetos.ObjetoEstImc;
public class PooTema2 {
    static String unir = "Estudiantes registrados:\n\n";
    public static void main(String[] args) {
        MenuIMC();
    }
public static void MenuIMC() {
    
        String Menu = "Agregar, Consulta general, ordenar datos, Salir";
        byte tam=EntradaSalida.LecturaByte("cuantos estudiantes son?");
        ObjetoEstImc lista=new ObjetoEstImc(tam);
        byte op = EntradaSalida.BotonOpciones(Menu);
        while (op != 3) {
            switch (op) {
                case 0:
                    lista.AgregarEstudiante();
                    EntradaSalida.VerDatos("Estudiante agregado", unir + lista.VerObjetos());
                    break;
                case 1:
                    EntradaSalida.VerDatos("Calculo del Imc de estudiantes", unir + lista.VerObjetos());
                    break;
                case 2: String cad="Datos desordenados:\n"+lista.VerObjetos();
                lista.OrdenarBubble();
                cad+="Datos ordenados: \n "+lista.VerObjetos();
                EntradaSalida.VerDatos("calculo de imc de estudiante", cad);
                break;
                default:
                    EntradaSalida.VerDatos("Opción inválida", "");
            }
            op = EntradaSalida.BotonOpciones(Menu);
        }
    }
}
