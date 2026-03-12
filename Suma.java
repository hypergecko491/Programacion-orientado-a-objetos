package Menus;
import Metodos.EntradaSalida;
import Overload.Metodos;
public class Suma {
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
}
