/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author Emanuel
 */
@Entity
public class NoTripulado extends Nave implements Serializable {
    
    //Atributos
    private String orbita;

    public String getOrbita() {
        return orbita;
    }

    public void setOrbita(String orbita) {
        this.orbita = orbita;
    }
    
}
