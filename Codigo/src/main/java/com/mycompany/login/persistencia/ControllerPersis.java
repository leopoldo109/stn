package com.mycompany.login.persistencia;

import com.mycompany.login.logica.Usuario;
import java.util.List;

public class ControllerPersis {

    UsuarioJpaController usuarioJpaController = new UsuarioJpaController();
    
    public void create(Usuario usuario) {
        usuarioJpaController.create(usuario);
    }

    public List<Usuario> findUsuariosByNom(String nomUsuario) {
        return usuarioJpaController.findUsuariosByNombre(nomUsuario);
    }

    
    
}
