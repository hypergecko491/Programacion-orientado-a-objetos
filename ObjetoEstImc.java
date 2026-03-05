package ArrayObjetos;
import Metodos.JOption;
import TDA.EstudianteIMC;
public class ObjetoEstImc {
    private EstudianteIMC[] datos;
    private byte j;
    public ObjetoEstImc(int tam){
        datos = new EstudianteIMC[tam];
        j = 0;}
    public boolean arrayVacio(){
        return j == 0;}
    public EstudianteIMC AlmacenarEstudiante(){
        EstudianteIMC obj = new EstudianteIMC();
        obj.setNombre(JOption.LecturaString("Nombre del estudiante"));
        obj.setNacimiento(JOption.LecturaShort("Año de nacimiento"));
        obj.setPeso(JOption.LecturaFloat("Peso en kg"));
        obj.setAltura(JOption.LecturaFloat("Altura en metros"));
        return obj;}
    public void AgregarEstudiante(){
        if (j < datos.length){
            datos[j] = AlmacenarEstudiante();
            j++;
        }else{
            JOption.MostrarError("Ya no hay espacio");}
    }
}
