package TemploDelSaber;
import java.util.ArrayList;
public class GestorPersonal {
private ArrayList<Personal> ListaPersonal;
public GestorPersonal(){ListaPersonal = new ArrayList<Personal>();}
public boolean ArrayVacio(){return ListaPersonal.isEmpty();}
public boolean agregarObjeto(Personal Personal){
    if(duplicado(Personal.getClave())){return false;}
    ListaPersonal.add(Personal);
    return true;}
public boolean duplicado(String clave){
    for(Personal p : ListaPersonal){
        if(p.getClave().equalsIgnoreCase(clave)){return true;}
    }return false;}
public String consultaGral(){
    String resultado="-".repeat(30)+"\n";
    for(Personal Personal:ListaPersonal){
        resultado +=Personal.toString()+"\n";
    }return resultado;}
public String ImprimirObj(){
    String cad="";
    for(byte k=0;k<ListaPersonal.size();k++){
        cad += k+ "]"+ ListaPersonal.get(k).toString()+"\n";
        cad += "-".repeat(50)+"\n";
    }return cad;}
public void OrdenarBubble(){
    Personal aux;
    byte i,k;
    for(i=0;i<ListaPersonal.size(); i++){
        for(k=(byte)(i+1); k<ListaPersonal.size(); k++){
            if(ListaPersonal.get(i).getEdad() > ListaPersonal.get(k).getEdad()){
                aux = ListaPersonal.get(i);
                ListaPersonal.set(i,ListaPersonal.get(k));
                ListaPersonal.set(k,aux);
            }
        }
    }
}
public String consultarPorTipo(byte tipo){
    String resultado = "-".repeat(40) + "\n";
    byte contador = 0;

    for(Personal p : ListaPersonal){
        if(p.esTipo(tipo)){
            resultado += p.toString() + "\n";
            resultado += "-".repeat(40) + "\n";
            contador++;
        }
    }
    if(contador == 0){
    return "No se encontraron registros.";}
    return "Total encontrados: " + contador + "\n\n" + resultado;
}     
}

