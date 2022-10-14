/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Mision;
import java.util.List;

/**
 *
 * @author Emanuel
 */
public interface InterfazMision {
    public abstract List<Mision> getAllMisiones();
    public Mision getMision(int codigo);
    public boolean verificarMision(int codigo);
}
