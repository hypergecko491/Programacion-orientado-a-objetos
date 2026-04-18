package Overload;
public class Metodos {
//sumar mismo tipo
public int suma(byte dato1, byte dato2){ return dato1 + dato2; }
public int suma(short dato1, short dato2){ return dato1 + dato2; }
public int suma(int dato1, int dato2){ return dato1 + dato2; }
public long suma(long dato1, long dato2){ return dato1 + dato2; }
public float suma(float dato1, float dato2){ return dato1 + dato2; }
public double suma(double dato1, double dato2){ return dato1 + dato2; }
//sumar distinto tipo
public double suma(double dato1, int dato2){ return dato1 + dato2; }
public double suma(int dato1, double dato2){ return dato1 + dato2; }
public double suma(float dato1, int dato2){ return dato1 + dato2; }
public double suma(int dato1, float dato2){ return dato1 + dato2; }
public long suma(long dato1, int dato2){ return dato1 + dato2; }
public long suma(int dato1, long dato2){ return dato1 + dato2; }
public double suma(double dato1, float dato2){ return dato1 + dato2; }
public double suma(float dato1, double dato2){ return dato1 + dato2; }
//suma arreglo
public int suma(int numeros[]){
    int sumar = 0;
    byte num = 0;
    do{
        sumar += numeros[num];
        num++;
    }while(num < numeros.length);
    return sumar;}
//suma matriz 2d
public int suma(int datos[][]){
    int res = 0;
    for(byte i = 0; i < datos.length; i++){
        for(byte j = 0; j < datos[0].length; j++){
            res += datos[i][j];}
    }return res;
}
//suma matriz 3d
public int suma(int datos[][][]){
    int res = 0;
    for(byte i = 0; i < datos.length; i++){
        for(byte j = 0; j < datos[i].length; j++){
            for(byte k = 0; k < datos[i][j].length; k++){
                res += datos[i][j][k];}
        }
    }return res;
}
public int multiplicar(int a,int b){ return a*b; }
public double multiplicar(double a,double b){ return a*b; }
public double multiplicar(double a,double b,double c){ return a*b*c; }
//areas
public double area(double base,double altura){return multiplicar(base,altura);}
public double area(double lado){return multiplicar(lado,lado);}
public double area(double B,double b,double h){return ((B+b)*h)/2;}
public double area(double D,float d){return (D*d)/2;}
public double area(float perimetro,float apotema){return (perimetro*apotema)/2;}
}
