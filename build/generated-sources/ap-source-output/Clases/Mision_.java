package Clases;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Mision.class)
public abstract class Mision_ {

	public static volatile SingularAttribute<Mision, String> descripcion;
	public static volatile SingularAttribute<Mision, Nave> nave;
	public static volatile SingularAttribute<Mision, Integer> codigo;
	public static volatile SingularAttribute<Mision, String> estado;
	public static volatile SingularAttribute<Mision, PlanetaDestino> planetadestino;
	public static volatile SingularAttribute<Mision, String> mision;
	public static volatile SingularAttribute<Mision, String> nombre;

}

