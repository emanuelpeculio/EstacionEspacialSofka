/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Emanuel
 */
@Entity
public class Mision implements Serializable {
    @Id
    //Atributos
    private Integer codigo;
    private String mision;
    private String nombre;
    private String descripcion;
    private String estado;
    
    //Relaciones
    @ManyToOne
    private Nave nave;

    @ManyToOne
    private PlanetaDestino planetadestino;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getMision() {
        return mision;
    }

    public void setMision(String mision) {
        this.mision = mision;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public Nave getNave() {
        return nave;
    }

    public void setNave(Nave nave) {
        this.nave = nave;
    }

    public PlanetaDestino getPlanetadestino() {
        return planetadestino;
    }

    public void setPlanetadestino(PlanetaDestino planetadestino) {
        this.planetadestino = planetadestino;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
