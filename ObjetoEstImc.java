package ArrayObjetos;
import Metodos.JOption;
import TDA.EstudianteIMC;
public class ObjetoEstImc {
private EstudianteIMC datos;
private byte j;
public ObjetoEstImc(byte tam){
    datos = new EstudianteIMC[tam];
    j=0;
}
public boolean arrayVacio(){
  return datos==null;    
}
public EstudianteIMC AlmacenarEstudiante(){
        EstudianteIMC obj = new EstudianteIMC();
        obj.setNombre(JOption.LecturaString("Nombre del estudiante"));
        obj.setNacimiento(JOption.LecturaShort("Año de nacimiento"));
        obj.setPeso(JOption.LecturaFloat("Peso en kg"));
        obj.setAltura(JOption.LecturaFloat("Altura en metros"));
        return obj;
}
public void AgregarEstudiante(){
    if (j<datos.length-1){
        datos[j]=AlmacenarEstudiante();
        j++;
    }else JOption.MostrarError("ya no hay espacio ");
}
}
