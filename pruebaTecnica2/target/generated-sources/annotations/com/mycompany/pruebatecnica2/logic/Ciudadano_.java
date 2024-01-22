package com.mycompany.pruebatecnica2.logic;

import com.mycompany.pruebatecnica2.logic.Turno;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2024-01-22T21:15:47")
@StaticMetamodel(Ciudadano.class)
public class Ciudadano_ { 

    public static volatile SingularAttribute<Ciudadano, String> apellidos;
    public static volatile SingularAttribute<Ciudadano, Integer> idCiudadano;
    public static volatile SingularAttribute<Ciudadano, String> nombre;
    public static volatile ListAttribute<Ciudadano, Turno> listaTurnos;

}