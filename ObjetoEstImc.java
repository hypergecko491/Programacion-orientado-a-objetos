package ArrayObjetos;
import Metodos.EntradaSalida;
import TDA.EstudianteIMC;
public class ObjetoEstImc {
    private EstudianteIMC datos[];
    private byte j;
    public ObjetoEstImc(int tam){
        datos = new EstudianteIMC[tam];
        j = 0;}
    public boolean arrayVacio(){
        return j == 0;}
    public EstudianteIMC AlmacenarEstudiante(){
        EstudianteIMC obj = new EstudianteIMC();
        obj.setNombre(EntradaSalida.LecturaString("Nombre del estudiante"));
        obj.setNacimiento(EntradaSalida.LecturaShort("Año de nacimiento"));
        obj.setPeso(EntradaSalida.LecturaFloat("Peso en kg"));
        obj.setAltura(EntradaSalida.LecturaFloat("Altura en metros"));
        return obj;}
    public void AgregarEstudiante(){
        if (j < datos.length){
            datos[j] = AlmacenarEstudiante();
            j++;
        }else{
            EntradaSalida.MostrarError("Ya no hay espacio");}
    }
    public String VerObjetos(){
        String cad="";
        for(byte k=0;k<j;k++)
            cad+= (k+1)+")"+datos[k].toString()+"\n";
        return cad;
    }
}
