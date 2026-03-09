package TDA;
public class EstudianteIMC {
private String Nombre;
private short Nacimiento;
private float Peso;
private float Altura;
public EstudianteIMC() {}
public EstudianteIMC(String Nombre, short Nacimiento, float Peso, float Altura) {
        this.Nombre = Nombre;
        this.Nacimiento = Nacimiento;
        this.Peso = Peso;
        this.Altura = Altura;}
public String getNombre(){return Nombre;}
public void setNombre(String Nombre){this.Nombre=Nombre;}
public short getNacimiento(){return Nacimiento;}
public void setNacimiento(short Nacimiento) { this.Nacimiento = Nacimiento; }
public float getPeso(){return Peso;}
public void setPeso(float Peso){this.Peso = Peso;}
public float getAltura(){return Altura;}
public void setAltura(float Altura){ this.Altura = Altura;}
public float calcularIMC(){return (Peso /(Altura*Altura));}
public String clasificarIMC() {
        float imc = calcularIMC();
        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }
@Override
public String toString() {
        return "Nombre: " + Nombre +"\nNacimiento: " + Nacimiento +
               "\nPeso: " + Peso +"\nAltura: " + Altura +"\nIMC: "+ 
                String.format("%.2f", calcularIMC()) +
               "\nClasificación: " + clasificarIMC();
    }
}
