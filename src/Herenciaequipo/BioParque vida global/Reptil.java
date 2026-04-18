package Herenciaequipo;
public class Reptil extends Animal {
protected String TipoEscamas;
    public Reptil() {}
    public Reptil(String TipoEscamas, String Nombre, byte Edad, float Peso, String Dieta, String HorarioAlimentacion, String Sonido) {
        super(Nombre, Edad, Peso, Dieta, HorarioAlimentacion, Sonido);
        this.TipoEscamas = TipoEscamas;}
    public String getTipoEscamas(){return TipoEscamas;}
    public void setTipoEscamas(String TipoEscamas) {
        this.TipoEscamas = TipoEscamas;}
    @Override
    public String toString() {
        return "Reptil{" +"Nombre=" + Nombre + ", \nEdad=" + Edad + ", "
                + "\nPeso=" + Peso + ", \nDieta=" + Dieta + ", "
                + "\nHorarioAlimentacion=" + HorarioAlimentacion + ","
                + "\nSonido:"+Sonido+ ",\nTipoEscamas=" + TipoEscamas + '}';
    }

}
