package farmaciadespertad;

public class Usuario {
    private String Usuario= "";
    private String Contrasenia = "";
    public Usuario(String Nombre, String Contrasenia){
        this.Usuario = Nombre;
        this.Contrasenia = Contrasenia;
    } 
    public String getUsuario(){
        return this.Usuario;
    }
    public String getContrasenia(){
        return this.Contrasenia;
    }    
}
