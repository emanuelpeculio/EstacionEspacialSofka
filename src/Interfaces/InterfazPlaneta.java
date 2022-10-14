/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.PlanetaDestino;
import java.util.List;

/**
 *
 * @author Emanuel
 */
public interface InterfazPlaneta {
    public abstract List<PlanetaDestino> getAllPlanetas();
    public PlanetaDestino getPlaneta(int codigo);
    public boolean verificarPlaneta(int codigo);
}
