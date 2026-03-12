package ArrayObjetos;
import Metodos.EntradaSalida;
import TDA.EstudianteIMC;
import java.util.ArrayList;
public class ObjetosEstDinamico {
private ArrayList<EstudianteIMC> datos;
public ObjetosEstDinamico(byte tam) {datos=new ArrayList <EstudianteIMC>();}
public boolean ArrayVacio(){return datos.isEmpty();}
public EstudianteIMC AlmacenarEstudiante(){
        EstudianteIMC obj = new EstudianteIMC();
        obj.setNombre(EntradaSalida.LecturaString("Nombre del estudiante"));
        obj.setNacimiento(EntradaSalida.LecturaShort("Año de nacimiento"));
        obj.setPeso(EntradaSalida.LecturaFloat("Peso en kg"));
        obj.setAltura(EntradaSalida.LecturaFloat("Altura en metros"));
        return obj;}
public void AgregarObjeto(){datos.add(AlmacenarEstudiante());}
public String VerObjetos(){
    String cad="";
    for (byte k=0;k<datos.size();k++){
        cad+=k+")"+datos.get(k).toString()+"\n";
        cad+="-".repeat(50)+"\n";
}return cad;}
public void OrdenarBubble(){
    EstudianteIMC aux;
    byte i,k;
    for(i=0;i<datos.size(); i++){
        for(k=(byte)(i+1); k<datos.size(); k++){
            if(datos.get(i).getNacimiento() > datos.get(k).getNacimiento()){
                aux = datos.get(i);
                datos.set(i,datos.get(k));
                datos.set(k,aux);
            }
        }
    }
}
}
