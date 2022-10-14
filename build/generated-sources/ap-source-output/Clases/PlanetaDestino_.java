package Clases;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(PlanetaDestino.class)
public abstract class PlanetaDestino_ {

	public static volatile SingularAttribute<PlanetaDestino, String> descripcion;
	public static volatile SingularAttribute<PlanetaDestino, Integer> codigo;
	public static volatile SingularAttribute<PlanetaDestino, String> tamanio;
	public static volatile ListAttribute<PlanetaDestino, Mision> misiones;
	public static volatile SingularAttribute<PlanetaDestino, String> nombre;
	public static volatile SingularAttribute<PlanetaDestino, Integer> activo;

}

