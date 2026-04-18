package Herenciaequipo;
import java.util.ArrayList;
public class GestorDispositivo {
private ArrayList<Dispositivo> ListaDispositivos;
public GestorDispositivo(){ListaDispositivos = new ArrayList<Dispositivo>();}
public void agregarObjeto(Dispositivo Dispositivo){ListaDispositivos.add(Dispositivo);}
public float calcularTotal(){
float total=0;
for(Dispositivo Dispositivos:ListaDispositivos){total += Dispositivos.CalcularPrecioFinal();}
return total;}
public String cosultaGral(){
    String resultado="-".repeat(30)+"\n";
    for(Dispositivo Dispositivo:ListaDispositivos){
        resultado +=Dispositivo.toString()+"\n";
    }return resultado;}
public String contarObjetos(){
byte contarTelefonos=0;
byte contaTablet=0;
byte contaLaptop=0;
for(Dispositivo Dispositivo: ListaDispositivos){
    if(Dispositivo instanceof Telefono)contarTelefonos++;
    else if(Dispositivo instanceof Tablet)contaTablet++;
    else if(Dispositivo instanceof Laptop)contaLaptop++;}
 return("\t\n Tralaleros:"+contarTelefonos+"\t\n Tablets:"+contaTablet+"\t\n Laptops:"+contaLaptop);
}    
}
