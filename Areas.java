package Menus;
import Metodos.EntradaSalida;
public class Areas {
public static void MenuAreas(){
String Menu="Rectangulo, Cuadrado, Trapecio, Rombo, Pentagono, Salir";
Overload.Metodos obj=new Overload.Metodos();
byte op=EntradaSalida.BotonOpciones(Menu);
while(op!=5){
switch(op){
case 0:
double base=EntradaSalida.LecturaDouble("Base");
double altura=EntradaSalida.LecturaDouble("Altura");
EntradaSalida.VerDatos2("Area Rectangulo",
"Area: "+obj.CalcularArea(base,altura));
break;
case 1:
double lado=EntradaSalida.LecturaDouble("Lado");
EntradaSalida.VerDatos2("Area Cuadrado",
"Area: "+obj.CalcularArea(lado));
break;
case 2:
double B=EntradaSalida.LecturaDouble("Base mayor");
double b=EntradaSalida.LecturaDouble("Base menor");
double h=EntradaSalida.LecturaDouble("Altura");
EntradaSalida.VerDatos2("Area Trapecio",
"Area: "+obj.CalcularArea(B,b,h));
break;
case 3:
double D=EntradaSalida.LecturaDouble("Diagonal mayor");
float d=EntradaSalida.LecturaFloat("Diagonal menor");
EntradaSalida.VerDatos2("Area Rombo",
"Area: "+obj.CalcularArea(D,d));
break;
case 4:
float p=EntradaSalida.LecturaFloat("Perimetro");
float a=EntradaSalida.LecturaFloat("Apotema");
EntradaSalida.VerDatos2("Area Pentagono",
"Area: "+obj.CalcularArea(p,a));
break;
default:
EntradaSalida.VerDatos2("Opcion invalida","");
}
op=EntradaSalida.BotonOpciones(Menu);
}
}    
}
