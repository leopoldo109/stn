package com.mycompany.login.logica;

import com.mycompany.login.enums.Roles;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-03-03T22:11:30")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, Integer> id_usuario;
    public static volatile SingularAttribute<Usuario, Roles> rol;
    public static volatile SingularAttribute<Usuario, String> nom_usuario;
    public static volatile SingularAttribute<Usuario, String> contraseña;

}