package com.mycompany.l25011819poo09022026;
import Metodos.JOption;
import TDA.TDA;
import TDA.Mascota;
import TDA.Automovil;
public class L25011819Poo09022026 {
//static String unir = "Contacto Agregado Exitosamente!\n\n";
static String unir = "Automovil Agregado Exitosamente!\n\n";
// static String unir = "Mascota Agregado Exitosamente!\n\n";
public static void main(String[] args) {
        //MenuContactos();
        //MenuMascotas();
       AgregarAutomovilCompleto();
       JOption.VerDatos(unir, unir);
    }
public static void MenuContactos(){
        String Menu = "Agregar Rapido,Agregar Datos Completos,Visualizar,Salir";
        byte op = JOption.BotonOpciones(Menu);
        while(op != 3){
            switch(op){
                case 0:
                    AgregarRapido();
                    JOption.VerDatos("Contacto Rapido", unir);
                    break;

                case 1:
                    AgregarCompleto();
                    JOption.VerDatos("Contacto Completo", unir);
                    break;

                case 2:
                    JOption.VerDatos("Visualizar Datos", unir);
                    break;

                default:
                    JOption.VerDatos("Opcion invalida", "");
            }
            op = JOption.BotonOpciones(Menu);
        }
    }
public static void AgregarRapido(){
        TDA obj = new TDA();
        obj.setNomContacto(JOption.LecturaString("Nombre del Contacto"));
        obj.setNumContacto(JOption.LecturaString("Numero del Contacto"));
        unir += "\n Nombre: " + obj.getNomContacto() +
                "\n Numero de Telefono: " + obj.getNumContacto() +
                "\n----------------------------------";
    }
public static void AgregarCompleto(){
        TDA obj = new TDA();
        obj.setNomContacto(JOption.LecturaString("Nombre del Contacto"));
        obj.setNumContacto(JOption.LecturaString("Numero del Contacto"));
        obj.setEmail(JOption.ValidaEmail());
        obj.setFav(JOption.Sino("Favorito?")==0);
        unir += "\n Nombre: " + obj.getNomContacto() +
                "\n Numero de Telefono: " + obj.getNumContacto() +
                "\n Email: " + obj.getEmail() +
                "\n Favorito: "+ obj.isFav()+
                "\n----------------------------------";
    }
public static void MenuMascotas(){
    String Menu = "Agregar Completo,Agregar Tipo 1,Agregar Tipo 2,Visualizar,Salir";
    byte op = JOption.BotonOpciones(Menu);
    while(op != 4){
        switch(op){
            case 0:
                AgregarMascotaCompleta();
                JOption.VerDatos("Mascota Completa", unir);
                break;
            case 1:
                AgregarMascotaTipo1();
                JOption.VerDatos("Mascota Tipo 1", unir);
                break;
            case 2:
                AgregarMascotaTipo2();
                JOption.VerDatos("Mascota Tipo 2", unir);
                break;
            case 3:
                JOption.VerDatos("Mascotas Registradas", unir);
                break;
            default:
                JOption.VerDatos("Opcion invalida", "");
        }
        op = JOption.BotonOpciones(Menu);
    }
}
public static void AgregarMascotaCompleta(){
    Mascota m = new Mascota();
    m.setNMascota(JOption.LecturaString("Nombre de la mascota"));
    m.setEMascota(JOption.LecturaString("Especie"));
    m.setFNMascota(JOption.LecturaShort("Fecha de nacimiento (ej: 2020)"));
    m.setGMascota(JOption.LecturaString("Genero"));
    m.setPMascota(JOption.LecturaFloat("Peso"));
    m.setCPMascota(JOption.LecturaString("Color de pelaje"));
    m.setVacunado(JOption.Sino("¿Está vacunado?")==0);
    m.setDesparasitado(JOption.Sino("¿Está desparasitado?")==0);
    m.setEsterilizado(JOption.Sino("¿Está esterilizado?")==0);
    m.setSaludMascota(JOption.LecturaString("Estado de salud"));
    m.setPCompraMascota(JOption.LecturaFloat("Precio de compra"));
    m.setPVentaMascota(JOption.LecturaFloat("Precio de venta"));
    unir += "\n Mascota: " + m.getNMascota() +
            "\n Especie: " + m.getEMascota() +
            "\n Genero: " + m.getGMascota() +
            "\n Peso: " + m.getPMascota() +
            "\n Vacunado: " + m.isVacunado() +
            "\n Desparasitado: "+m.isDesparasitado() +
            "\n Esterilizado: "+m.isEsterilizado()+
            "\n Estado de salud "+m.getSaludMascota()   +
            "\n Precio de compra "+m.getPCompraMascota() +
            "\n Precio de venta "+m.getPVentaMascota() +
            "\n----------------------------------";
}
public static void AgregarMascotaTipo1(){
    Mascota m = new Mascota();
    m.setNMascota(JOption.LecturaString("Nombre de la mascota"));
    m.setEMascota(JOption.LecturaString("Especie"));
    m.setFNMascota(JOption.LecturaShort("Fecha de nacimiento"));
    m.setGMascota(JOption.LecturaString("Genero"));
    m.setPMascota(JOption.LecturaFloat("Peso"));
    m.setVacunado(JOption.Sino("¿Está vacunado?")==0);
    m.setDesparasitado(JOption.Sino("¿Está desparasitado?")==0);
    m.setEsterilizado(JOption.Sino("¿Está esterilizado?")==0);
    m.setSaludMascota(JOption.LecturaString("Estado de salud"));

    unir += "\n Mascota: " + m.getNMascota() +
            "\n Especie: " + m.getEMascota() +
            "\n Peso: " + m.getPMascota() +
            "\n Salud: " + m.getSaludMascota() +
            "\n----------------------------------";
}
public static void AgregarMascotaTipo2(){
    Mascota m = new Mascota();
    m.setNMascota(JOption.LecturaString("Nombre de la mascota"));
    m.setEMascota(JOption.LecturaString("Especie"));
    m.setFNMascota(JOption.LecturaShort("Fecha de nacimiento"));
    m.setGMascota(JOption.LecturaString("Genero"));
    m.setCPMascota(JOption.LecturaString("Color de pelaje"));
    m.setPMascota(JOption.LecturaFloat("Peso"));
    m.setVacunado(JOption.Sino("¿Está vacunado?")==0);

    unir += "\n Mascota: " + m.getNMascota() +
            "\n Especie: " + m.getEMascota() +
            "\n Color: " + m.getCPMascota() +
            "\n Peso: " + m.getPMascota() +
            "\n Vacunado: " + m.isVacunado() +
            "\n----------------------------------";
}
public static void AgregarAutomovilCompleto(){
    Automovil obj = new Automovil();
    obj.setMarca(JOption.LecturaString("Marca del automovil"));
    obj.setModelo(JOption.LecturaString("Modelo del automovil"));
    obj.setAFabrica(JOption.LecturaShort("Año de fabricacion"));
    obj.setMotor(JOption.LecturaString("Motor del automovil"));
    obj.setTCombustible(JOption.LecturaString("Tipo de Combustible"));
    obj.setTAuto(JOption.LecturaString("Tipo del automovil"));
    obj.setNPuertas(JOption.LecturaByte("Numero de puertas"));
    obj.setColor(JOption.LecturaString("Color del automovil"));
    unir += "\n Marca: " + obj.getMarca()+
            "\n Modelo: " + obj.getModelo()+
            "\n Año de fabricacion: "+ obj.getAFabrica() +
            "\n Motor: "+ obj.getMotor()+
            "\n Tipo de Combustible:"+ obj.getTCombustible()+
            "\n Tipo de Automovil: "+ obj.getTAuto()+
            "\n Numero de puertas: "+ obj.getNPuertas()+
            "\n Color del automovil: "+ obj.getColor()+
            "\n -------------------------------------------------";
}
}
