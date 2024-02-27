package com.mycompany.login.logica;

import com.mycompany.login.enums.Roles;
import com.mycompany.login.persistencia.ControllerPersis;
import java.util.List;

public class Controller {
    
    ControllerPersis controllerPersis = new ControllerPersis();

    public void crearUsuario(String nomUsuario, String contraUsuario,String rolUsuario) {
        
        try {
        Usuario usuario;
        usuario = new Usuario(nomUsuario, contraUsuario, Enum.valueOf(Roles.class, rolUsuario));
        
        controllerPersis.create(usuario);
        } catch(IllegalArgumentException e){
            System.out.println("ERROR! ENUM NO ASOCIADO");
        }
    }

    public List<Usuario> findUsuario(String nomUsuario) {
        return controllerPersis.findUsuariosByNom(nomUsuario);
    }



    
    
    
    
    
}
