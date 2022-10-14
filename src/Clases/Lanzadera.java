/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;
//import java.util.List;
import javax.persistence.Entity;
/**
 *
 * @author Emanuel
 */
@Entity
public class Lanzadera extends Nave implements Serializable {
    
    //Atributos
    private String propulsion;
    public String getPropulsion() {
        return propulsion;
    }

    public void setPropulsion(String propulsion) {
        this.propulsion = propulsion;
    }
    
}
