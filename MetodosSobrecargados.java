package Menus;
import Metodos.EntradaSalida;
import Overload.Metodos;
public class MetodosSobrecargados {
public static void MetodosSobrecargados(){
Metodos oper=new Metodos();
int datos[]={24,168,1756,-457,8753};
int tabla[][]={{345,567,789},{-234,56,78},{167,789,89},{45,78,12},{47,89,12}};
String unir="Sumar datos de un vector"+oper.suma(datos);
unir+="\n "+ "-".repeat(50);
unir+="\nSumar datos de una  matriz:"+oper.suma(tabla);
unir+="\n "+ "-".repeat(50);
unir+="\nSuma 2 datos de tipo double:"+oper.suma(EntradaSalida.LecturaDouble("Escribe un valor con punto decimal"),EntradaSalida.LecturaDouble("Escribe otro valor con punto decimal"));
unir+="\n "+ "-".repeat(50);
EntradaSalida.VerDatos2("sobrecarga de metodos",unir);
}
}
