package rompejuegos.relacion_clases;
import EntradaSalida.JOption;
import Testeo.TestDulce;
import Agregacion.Dulce;
import Testeo.MenuAreaPoligonos;
import Testeo.TestBolsa;
import Testeo.TestTienda;
import Testeo.menuElectronicaZone;
import Testeo.MenuBioparque;
import Testeo.MenuInsituto;
import Testeo.MenuTemploDelSaber;
public class Relacion_Clases {
public static void main(String[] args){SelectorMenus();}
public static void SelectorMenus(){
String Menu = "Testeo Dulce,Testeo Tienda,"+ 
              "Testeo Bolsa,Testeo gestor libreria,"+ 
              "testeo electronicazone,testeo bio paerque,"+
              "testeo poligonos,testeo instituto,testeo templo, Salir";
    byte op = JOption.BotonOpciones(Menu);
    while(op != 9){
        switch(op){
            case 0:
            TestDulce.Menu();
            break;
            case 1:
              TestTienda.menuTienda();
            break;
            case 2:
                TestBolsa.menuBolsa();
            break;
            case 3:
               //TestGestorLibreria.MenuGestorLibreria();
            break;
            case 4:
                menuElectronicaZone.menuElectronicaZone();
            break;
            case 5:
               MenuBioparque.menuBioparque();
                break;
            case 6:
                MenuAreaPoligonos.menuPoligonos();
            case 7:
                MenuInsituto.programarExamenes();
            case 8:
                MenuTemploDelSaber.menuTemploDelSaber();
            default:
                JOption.VerDatos2("Opción inválida","");
        }
        op = JOption.BotonOpciones(Menu);
    }
}
}
