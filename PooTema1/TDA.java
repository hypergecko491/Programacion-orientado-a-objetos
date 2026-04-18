package TDA;
public class TDA {
private String NomContacto;
private String NumContacto;
private String Email;
private String CatContacto;
private boolean Fav;
private String FotoContacto;
public TDA() {}
public TDA(String NomContacto, String NumContacto) {
this.NomContacto = NomContacto;
this.NumContacto = NumContacto; 
}
public TDA(String NomContacto, String NumContacto, String Email, String CatContacto, boolean Fav, String FotoContacto) {
this.NomContacto = NomContacto;
this.NumContacto = NumContacto;
this.Email = Email;
this.CatContacto = CatContacto;
this.Fav = Fav;
this.FotoContacto = FotoContacto;
}
public void setNomContacto(String NomContacto) {this.NomContacto = NomContacto;}
public void setNumContacto(String NumContacto) {this.NumContacto = NumContacto;}
public void setEmail(String Email) {this.Email = Email;}
public void setCatContacto(String CatContacto) {this.CatContacto = CatContacto;}
public void setFav(boolean Fav) {this.Fav = Fav;}
public void setFotoContacto(String FotoContacto) {this.FotoContacto = FotoContacto;} 
@Override
public String toString() {
return "TDA{"+"Nombre de Contacto = "+NomContacto+",Numero de Contacto = "+NumContacto+",Email = "+
Email+",Categoria de Contacto = "+CatContacto+",Favorito = "+Fav+",Foto de Contacto = "+FotoContacto+'}';
}
public String getNomContacto() {return NomContacto;}
public String getNumContacto() {return NumContacto;}
public String getEmail() {return Email;}
public String getCatContacto() {return CatContacto;}
public boolean isFav() {return Fav;}
public String getFotoContacto() {return FotoContacto;}

}
