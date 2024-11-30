/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Usuarios;

/**
 *
 * @author chris
 */
public class UsuarioDTO {
      public static final String ROL_ADMINISTRADOR = "ADMINISTRADOR";
    public static final String ROL_ENTRENADOR = "ENTRENADOR";

    // Atributos privados
    private int id;
    private String username;
    private String password;
    private String nombre;
    private String email;
    private String rol;

   

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getRol() {
        return rol;
    }


    public UsuarioDTO(int id, String username, String password, String nombre, String email, String rol) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.email = email;
        this.rol = rol;
    }
  

   

    
}
