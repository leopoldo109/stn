package com.mycompany.login.logica;

import java.util.List;

public class LoginManager {

    Controller controller = new Controller();
    
    

    public Usuario autenticarUsuario(String nomUsuario, String contraUsuario) {
        List<Usuario> usuarios = controller.findUsuario(nomUsuario);
        
        for (Usuario usuario : usuarios) {
            if(usuario.getNom_usuario().equals(nomUsuario) && usuario.getContraseña().equals(contraUsuario)){
                return usuario;
            }
        }
        
        return null;
    }

    

   
    
}
