package com.mycompany.parcial.clases;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Proveedor.class)
public abstract class Proveedor_ {

	public static volatile CollectionAttribute<Proveedor, Motocicletas_1> motocicletasCollection;
	public static volatile SingularAttribute<Proveedor, Integer> proveedorId;
	public static volatile SingularAttribute<Proveedor, String> nit;
	public static volatile SingularAttribute<Proveedor, String> direccion;
	public static volatile SingularAttribute<Proveedor, String> nombre;

	public static final String MOTOCICLETAS_COLLECTION = "motocicletasCollection";
	public static final String PROVEEDOR_ID = "proveedorId";
	public static final String NIT = "nit";
	public static final String DIRECCION = "direccion";
	public static final String NOMBRE = "nombre";

}

