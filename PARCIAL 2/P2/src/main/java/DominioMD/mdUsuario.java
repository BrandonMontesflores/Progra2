/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DominioMD;

/**
 *
 * @author Usuario
 */
public class mdUsuario {
    
    @Override
    public String toString() {
        return "{" + "Id " + id + ", Usuario" + usuario + ", Contraseña" + contraseña + '}';
    }
    
    private int id;
    private String usuario;
    private String contraseña;
       
     public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getusuario() {
        return usuario;
    }

    public void setusuario(String usuario) {
        this.usuario = usuario;
    }

    public String getcontraseña() {
        return contraseña;
    }

    public void setcontraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
