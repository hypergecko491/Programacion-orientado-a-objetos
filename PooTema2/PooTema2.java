package com.mycompany.progratema2;
import Metodos.EntradaSalida;
import Menus.Areas;
import Menus.IMC;
import Menus.IMC2;
import Menus.MetodosSobrecargados;
import Menus.Suma;
public class PooTema2 {
public static void main(String[] args) {
    SelectorMenus();
}
public static void SelectorMenus(){
    String Menu = "Menu IMC estatico, Menu IMC dinamico, Metodos sobrecargados, Menu sumas, Menu areas, Salir";
    byte op = EntradaSalida.BotonOpciones(Menu);
    while(op != 5){
        switch(op){
            case 0:
                IMC.MenuIMC();
            break;
            case 1:
                IMC2.MenuIMC2();
            break;
            case 2:
                MetodosSobrecargados.MetodosSobrecargados();
            break;
            case 3:
                Suma.MenuSuma();
            break;
            case 4:
                Areas.MenuAreas();
            break;
            default:
                EntradaSalida.VerDatos2("Opción inválida","");
        }
        op = EntradaSalida.BotonOpciones(Menu);
    }
}
}
