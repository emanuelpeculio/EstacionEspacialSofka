package Clases;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Nave.class)
public abstract class Nave_ {

	public static volatile SingularAttribute<Nave, Integer> codigo;
	public static volatile SingularAttribute<Nave, String> estado;
	public static volatile SingularAttribute<Nave, String> tipo;
	public static volatile SingularAttribute<Nave, Double> peso;
	public static volatile ListAttribute<Nave, Mision> misiones;
	public static volatile SingularAttribute<Nave, String> nombre;
	public static volatile SingularAttribute<Nave, String> combustible;
	public static volatile SingularAttribute<Nave, Integer> activo;

}

