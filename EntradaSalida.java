package Metodos;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
public class EntradaSalida {
public static byte LecturaByte(String msje){
    byte dato;
    while(true){
        String entrada=JOptionPane.showInputDialog(null,msje,"Campo obligatorio",JOptionPane.INFORMATION_MESSAGE);
        if(entrada==null){continue;}
        try{if(entrada.trim().isEmpty()){MostrarError("El campo no puede  quedar vacio, intente de nuevo!");
                continue;}
            dato = Byte.parseByte(entrada.trim());
            return dato;}
        catch(NumberFormatException e){MostrarError("Fuera de rango: "+Byte.MIN_VALUE+".."+Byte.MAX_VALUE);}
    }
}
public static short LecturaShort(String msje){
    Short dato;
    while(true){
        String entrada=JOptionPane.showInputDialog(null,msje,"Campo obligatorio",JOptionPane.INFORMATION_MESSAGE);
        if(entrada==null){continue;}
        try{if(entrada.trim().isEmpty()){MostrarError("El campo no puede  quedar vacio, intente de nuevo!");
                continue;}
            dato = Short.valueOf(entrada.trim());
            return dato;}
        catch(NumberFormatException e){MostrarError("Fuera de rango: "+Short.MIN_VALUE+".."+Short.MAX_VALUE);}
    }
}
public static int LecturaInt(String msje){
    int dato;
    while(true){
        String entrada=JOptionPane.showInputDialog(null,msje,"Campo obligatorio",JOptionPane.INFORMATION_MESSAGE);
        if(entrada==null){continue;}
        try{if(entrada.trim().isEmpty()){MostrarError("El campo no puede  quedar vacio, intente de nuevo!");
                continue;}
            dato = Integer.parseInt(entrada.trim());
            return dato;}
        catch(NumberFormatException e){MostrarError("Fuera de rango: "+Integer.MIN_VALUE+".."+Integer.MAX_VALUE);}
    }
}
public static long LecturaLong(String msje){
    long dato;
    while(true){
        String entrada=JOptionPane.showInputDialog(null,msje,"Campo obligatorio",JOptionPane.INFORMATION_MESSAGE);
        if(entrada==null){continue;}
        try{if(entrada.trim().isEmpty()){MostrarError("El campo no puede  quedar vacio, intente de nuevo!");
                continue;}
            dato = Long.parseLong(entrada.trim());
            return dato;}
        catch(NumberFormatException e){MostrarError("Fuera de rango: "+Long.MIN_VALUE+".."+Long.MAX_VALUE);}
}
}
public static float LecturaFloat(String msje){
    float dato;
    while(true){
        String entrada=JOptionPane.showInputDialog(null,msje,"Campo obligatorio",JOptionPane.INFORMATION_MESSAGE);
        if(entrada==null){continue;}
        try{if(entrada.trim().isEmpty()){MostrarError("El campo no puede  quedar vacio, intente de nuevo!");
                continue;}
            dato = Float.parseFloat(entrada.trim());
            return dato;}
        catch(NumberFormatException e){MostrarError("Fuera de rango: "+Float.MIN_VALUE+".."+Float.MAX_VALUE);}
    }
}
public static double LecturaDouble(String msje){
double dato;
    while(true){
        String entrada=JOptionPane.showInputDialog(null,msje,"Campo obligatorio",JOptionPane.INFORMATION_MESSAGE);
        if(entrada==null){continue;}
        try{if(entrada.trim().isEmpty()){MostrarError("El campo no puede  quedar vacio, intente de nuevo!");
                continue;}
            dato = Double.parseDouble(entrada.trim());
            return dato;}
        catch(NumberFormatException e){MostrarError("Fuera de rango: "+Double.MIN_VALUE+".."+Double.MAX_VALUE);}
    }
}
public static void MostrarError(String msje){
    JOptionPane.showMessageDialog(null,msje,"Error, cuidado!!",JOptionPane.ERROR_MESSAGE);
}
public static char LecturaChar(String msje){
    while(true){
        String caracter=JOptionPane.showInputDialog(null,msje,"Campo Obligatorio",JOptionPane.INFORMATION_MESSAGE);
        if(caracter.isEmpty() && caracter.isBlank()){MostrarError("El campo no puede quedar vacio,intente de nuevo!!");
            continue;}
        if(caracter.length()>1){MostrarError("Ingreso mas de un caracter,intente de nuevo!!");
            continue;}
        return caracter.charAt(0);}
}
public static String LecturaString(String msje){
while(true){
String caracter=JOptionPane.showInputDialog(null,msje,"Campo Obligatorio",JOptionPane.INFORMATION_MESSAGE);
if(caracter==null){continue;}
try{if(caracter.trim().isEmpty()){MostrarError("El campo no puede quedar vacio,intente de nuevo!!");
continue;}
return caracter;}
catch(Exception e){MostrarError("ERROR! Entrada invalida.\n"+ e);}
}
}
public static void VerDatos(String titulo, String mensaje){
JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);}
public static void VerDatos2(String titulo,String datos){
    if(titulo==null||titulo.isBlank())titulo="sin titulo";
    if(datos==null||datos.isBlank())datos="sin datos disponibles";
    JTextArea AreaSalida=new JTextArea(15,80);
    JScrollPane Scroller=new JScrollPane(AreaSalida);
    Scroller.setBorder(BorderFactory.createCompoundBorder(BorderFactory.
    createEmptyBorder(5,5,5,5),BorderFactory.createLineBorder
    (new Color(0x3F51B5),2,true)));
    Scroller.setPreferredSize(new Dimension(500,300));
    Font font=new Font("Verdana",Font.BOLD,13);
    AreaSalida.setFont(font);
    AreaSalida.setForeground(Color.BLUE);
    AreaSalida.setBackground(Color.WHITE);
    AreaSalida.append("\n"+datos);
    AreaSalida.append("\n\nCopyRigth @Rompejuegos\n");
    JOptionPane.showMessageDialog(null,Scroller,titulo,JOptionPane.PLAIN_MESSAGE);
}
public static byte BotonOpciones(String Menu){
String Valores[]=Menu.split(",");
byte n;
n= (byte) JOptionPane.showOptionDialog(null,"selecciona "+" click"," menu",JOptionPane.NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,Valores,Valores[0]);
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

