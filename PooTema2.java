package com.mycompany.progratema2;
import Metodos.EntradaSalida;
import ArrayObjetos.ObjetoEstImc;
import ArrayObjetos.ObjetosEstDinamico;
import Overload.Metodos;
public class PooTema2 {
public static void main(String[] args) {
SelectorMenus();
}
public static void MenuIMC(){
     String unir = "Estudiantes registrados:\n\n";
        String Menu = "Agregar, Consulta general, ordenar datos, Salir";
        byte tam=EntradaSalida.LecturaByte("cuantos estudiantes son?");
        ObjetoEstImc lista=new ObjetoEstImc(tam);
        byte op = EntradaSalida.BotonOpciones(Menu);
        while (op != 3) {
            switch (op) {
                case 0:
                    lista.AgregarEstudiante();
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
public static void MenuSuma() {
    String Menu = "Sumar enteros, Sumar decimales, Sumar arreglo, Sumar matriz 2D, Sumar matriz 3D, Salir";
    Metodos obj = new Metodos();
    byte op = EntradaSalida.BotonOpciones(Menu);
    while(op != 5){
        switch(op){
            case 0: //suma int
                int a = EntradaSalida.LecturaInt("Ingrese el primer numero entero");
                int b = EntradaSalida.LecturaInt("Ingrese el segundo numero entero");
                int res = obj.suma(a,b);
                EntradaSalida.VerDatos2("Resultado","La suma es: "+res);
            break;
            case 1: //suma double
                double x = EntradaSalida.LecturaDouble("Ingrese el primer numero decimal");
                double y = EntradaSalida.LecturaDouble("Ingrese el segundo numero decimal");
                double res2 = obj.suma(x,y);
                EntradaSalida.VerDatos2("Resultado","La suma es: "+res2);
            break;
            case 2: //arreglo
                byte n = EntradaSalida.LecturaByte("Cuantos numeros desea sumar?");
                int datos[] = new int[n];
                for(byte i=0;i<n;i++){
                    datos[i] = EntradaSalida.LecturaInt("Numero "+(i+1));
                }
                int res3 = obj.suma(datos);
                EntradaSalida.VerDatos2("Resultado","La suma del arreglo es: "+res3);
            break;
            case 3: //matriz 2D
                int matriz[][] = new int[3][3];
                for(byte i=0;i<3;i++){
                    for(byte j=0;j<3;j++){
                        matriz[i][j] = EntradaSalida.LecturaInt("Dato ["+i+"]["+j+"]");
                    }
                }
                int res4 = obj.suma(matriz);
                EntradaSalida.VerDatos2("Resultado","La suma de la matriz 3x3 es: "+res4);
            break;
            case 4: //matriz 3D
                int matriz3[][][] = new int[3][3][3];
                for(byte i=0;i<3;i++){
                    for(byte j=0;j<3;j++){
                        for(byte k=0;k<3;k++){
                            matriz3[i][j][k] = EntradaSalida.LecturaInt("Dato ["+i+"]["+j+"]["+k+"]");
                        }
                    }
                }
                int res5 = obj.suma(matriz3);
                EntradaSalida.VerDatos2("Resultado","La suma de la matriz 3x3x3 es: "+res5);
            break;
            default:
                EntradaSalida.VerDatos2("Opción inválida","");
        }op = EntradaSalida.BotonOpciones(Menu);
    }
}
public static void SelectorMenus(){
    String Menu = "Menu IMC estatico, Menu IMC dinamico, Metodos sobrecargados, Menu sumas, Salir";
    byte op = EntradaSalida.BotonOpciones(Menu);
    while(op != 4){
        switch(op){
            case 0:
                MenuIMC();
            break;
            case 1:
                MenuIMC2();
            break;
            case 2:
                MetodosSobrecargados();
            break;
            case 3:
                MenuSuma();
            break;
            default:
                EntradaSalida.VerDatos2("Opción inválida","");
        }
        op = EntradaSalida.BotonOpciones(Menu);
    }
}
}
