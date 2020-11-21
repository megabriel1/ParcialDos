package com.mycompany.parcial.clases;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Motocicletas_1.class)
public abstract class Motocicletas_1_ {

	public static volatile SingularAttribute<Motocicletas_1, Integer> motocicletasId;
	public static volatile CollectionAttribute<Motocicletas_1, Proveedor> proveedorCollection;
	public static volatile SingularAttribute<Motocicletas_1, String> codigoBarras;

	public static final String MOTOCICLETAS_ID = "motocicletasId";
	public static final String PROVEEDOR_COLLECTION = "proveedorCollection";
	public static final String CODIGO_BARRAS = "codigoBarras";

}

