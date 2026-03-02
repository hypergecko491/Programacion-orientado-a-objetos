package Metodos;
import javax.swing.JOptionPane;
public class JOption {
public static byte LecturaByte(String msje){
    byte dato;
    while(true){
        String entrada=JOptionPane.showInputDialog(null,msje,"Campo obligatorio",JOptionPane.INFORMATION_MESSAGE);
        if(entrada==null){
            continue;}
        try{
            if(entrada.trim().isEmpty()){
                MostrarError("El campo no puede  quedar vacio, intente de nuevo!");
                continue;}
            dato = Byte.parseByte(entrada.trim());
            return dato;}
        catch(NumberFormatException e){
            MostrarError("Fuera de rango: "+Byte.MIN_VALUE+".."+Byte.MAX_VALUE);}
    }
//return  Byte.parseByte(JOptionPane.showInputDialog(null,msje,"byte",JOptionPane.INFORMATION_MESSAGE));
}
public static short LecturaShort(String msje){
    Short dato;
    while(true){
        String entrada=JOptionPane.showInputDialog(null,msje,"Campo obligatorio",JOptionPane.INFORMATION_MESSAGE);
        if(entrada==null){
            continue;}
        try{
            if(entrada.trim().isEmpty()){
                MostrarError("El campo no puede  quedar vacio, intente de nuevo!");
                continue;}
            dato = Short.valueOf(entrada.trim());
            return dato;}
        catch(NumberFormatException e){
            MostrarError("Fuera de rango: "+Short.MIN_VALUE+".."+Short.MAX_VALUE);
        }
    }
//return Short.parseShort(JOptionPane.showInputDialog(null,msje,"short",JOptionPane.INFORMATION_MESSAGE));
}
public static int LecturaInt(String msje){
    int dato;
    while(true){
        String entrada=JOptionPane.showInputDialog(null,msje,"Campo obligatorio",JOptionPane.INFORMATION_MESSAGE);
        if(entrada==null){
            continue;}
        try{
            if(entrada.trim().isEmpty()){
                MostrarError("El campo no puede  quedar vacio, intente de nuevo!");
                continue;}
            dato = Integer.parseInt(entrada.trim());
            return dato;}
        catch(NumberFormatException e){
            MostrarError("Fuera de rango: "+Integer.MIN_VALUE+".."+Integer.MAX_VALUE);}
    }
//return Integer.parseInt(JOptionPane.showInputDialog(null,msje,"int",JOptionPane.INFORMATION_MESSAGE));
}
public static long LecturaLong(String msje){
    long dato;
    while(true){
        String entrada=JOptionPane.showInputDialog(null,msje,"Campo obligatorio",JOptionPane.INFORMATION_MESSAGE);
        if(entrada==null){
            continue;}
        try{
            if(entrada.trim().isEmpty()){
                MostrarError("El campo no puede  quedar vacio, intente de nuevo!");
                continue;}
            dato = Long.parseLong(entrada.trim());
            return dato;}
        catch(NumberFormatException e){
            MostrarError("Fuera de rango: "+Long.MIN_VALUE+".."+Long.MAX_VALUE);}
//return Long.parseLong(JOptionPane.showInputDialog(null,msje,"long",JOptionPane.INFORMATION_MESSAGE));
}
}
public static float LecturaFloat(String msje){
    float dato;
    while(true){
        String entrada=JOptionPane.showInputDialog(null,msje,"Campo obligatorio",JOptionPane.INFORMATION_MESSAGE);
        if(entrada==null){
            continue;}
        try{
            if(entrada.trim().isEmpty()){
                MostrarError("El campo no puede  quedar vacio, intente de nuevo!");
                continue;}
            dato = Float.parseFloat(entrada.trim());
            return dato;}
        catch(NumberFormatException e){
            MostrarError("Fuera de rango: "+Float.MIN_VALUE+".."+Float.MAX_VALUE);
        }
    }
//return Float.parseFloat(JOptionPane.showInputDialog(null,msje,"float",JOptionPane.INFORMATION_MESSAGE));
}
public static double LecturaDouble(String msje){
double dato;
    while(true){
        String entrada=JOptionPane.showInputDialog(null,msje,"Campo obligatorio",JOptionPane.INFORMATION_MESSAGE);
        if(entrada==null){continue;}
        try{
            if(entrada.trim().isEmpty()){
                MostrarError("El campo no puede  quedar vacio, intente de nuevo!");
                continue;}
            dato = Double.parseDouble(entrada.trim());
            return dato;}
        catch(NumberFormatException e){
            MostrarError("Fuera de rango: "+Double.MIN_VALUE+".."+Double.MAX_VALUE);}
    }
//return Double.parseDouble(JOptionPane.showInputDialog(null,msje,"double",JOptionPane.INFORMATION_MESSAGE));
}
public static void MostrarError(String msje){
    JOptionPane.showMessageDialog(null,msje,"Error, cuidado!!",JOptionPane.ERROR_MESSAGE);}
public static char LecturaChar(String msje){
    while(true){
        String caracter=JOptionPane.showInputDialog(null,msje,"Campo Obligatorio",JOptionPane.INFORMATION_MESSAGE);
        if(caracter.isEmpty() && caracter.isBlank()){
            MostrarError("El campo no puede quedar vacio,intente de nuevo!!");
            continue;}
        if(caracter.length()>1){
            MostrarError("Ingreso mas de un caracter,intente de nuevo!!");
            continue;}
        return caracter.charAt(0);}
}
public static String LecturaString(String msje){
while(true){
String caracter=JOptionPane.showInputDialog(null,msje,"Campo Obligatorio",JOptionPane.INFORMATION_MESSAGE);
if(caracter==null){continue;}
try{if(caracter.trim().isEmpty()){
MostrarError("El campo no puede quedar vacio,intente de nuevo!!");
continue;
}return caracter;   
}catch(Exception e){MostrarError("ERROR! Entrada invalida.\n"+ e);}
}
}
public static void VerDatos(String titulo, String mensaje){
    JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);}
public static byte BotonOpciones(String Menu){
String Valores[]=Menu.split(",");
byte n;
n= (byte) JOptionPane.showOptionDialog(null,"selecciona "+" click","menu",JOptionPane.NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,Valores,Valores[0]);
return n;}
public static String SeleCatego(String msje,String datos){
String Categorias[]=datos.split(",");
String Categoria=(String)JOptionPane.showInputDialog(null,msje,"Nuevo Contacto",JOptionPane.INFORMATION_MESSAGE,null,Categorias,Categorias[0]);
return Categoria;}
public static byte Sino(String msje){
byte resp=(byte)JOptionPane.showConfirmDialog(null,msje,"Selecciona:",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
return resp;}
public static String ValidaEmail(){
String Lista[]={"@orizaba.tecnm.mx","@gmail.com","@outlook.com","@microsoft.com","@hotmail.com","@outlook.net","@yahoo.com"};
String Opcion=(String)JOptionPane.showInputDialog(null,"Selecciona","Dominio de email:",JOptionPane.QUESTION_MESSAGE,null,Lista,Lista[0]);
String Nom=JOption.LecturaString("Email(sindominio)");
return Nom+Opcion;}
}
