
package biblioteca.modelo;


public class Usuario {
    private String nombre;
    private String usuario;
    private String clave;
    private String tipo; 

    
    public Usuario(String nombre, String usuario, String clave, String tipo) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.clave = clave;
        this.tipo = tipo;
    }

   
    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

    public String getTipo() {
        return tipo;
    }
}
