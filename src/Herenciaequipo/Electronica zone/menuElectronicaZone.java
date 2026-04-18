package Testeo;
import EntradaSalida.JOption;
import Herenciaequipo.GestorDispositivo;
import Herenciaequipo.Laptop;
import Herenciaequipo.Tablet;
import Herenciaequipo.Telefono;
public class menuElectronicaZone {
public static void menuElectronicaZone(){
        String menu="Telefono, Laptop, Tablet, Consulta general, Salir";
        byte op= JOption.BotonOpciones(menu);
        GestorDispositivo gestor= new GestorDispositivo();
        while (op!=4){
            switch (op)
            {
                case 0:
                    gestor.agregarObjeto(new Telefono(JOption.LecturaString("Marca: "),
                            JOption.LecturaFloat("Precio del dispositivo:"),
                            JOption.LecturaShort("Ingresa capacidad de almacenamiento: ")));

                    break;
                case 1:
                    gestor.agregarObjeto(new Laptop(JOption.LecturaString("Marca: "),
                            JOption.LecturaFloat("Precio del dispositivo:"),
                            JOption.LecturaByte("Ingresa tamaño de RAM: ")));
                    break;
                case 2:
                    gestor.agregarObjeto(new Tablet(JOption.LecturaString("Marca: "),
                            JOption.LecturaFloat("Precio del dispositivo:"),
                            JOption.LecturaShort("Ingresa pulgadas de la pantalla: ")));
                    break;
                case 3:
                    JOption.VerDatos2("Electronica Zone", gestor.cosultaGral()+ "\n");
                    break;
                            default:
                    JOption.MostrarError("Opción inválida");}
        op=JOption.BotonOpciones(menu);}    
}}
