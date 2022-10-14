/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import BasedeDatos.conexionBD;
import Clases.PlanetaDestino;
import Interfaces.InterfazPlaneta;

import java.util.List;

/**
 *
 * @author Emanuel
 */
public class controladorPlaneta implements InterfazPlaneta{
    private static controladorPlaneta instancia;
    
    public static controladorPlaneta getInstancia(){
        if(instancia == null)
            instancia=new controladorPlaneta();
        return instancia;
    }
    
    public controladorPlaneta(){
        
    }
    
    @Override
    public List<PlanetaDestino> getAllPlanetas(){
        return conexionBD.getInstance().getAllPlanetas(); 
    }
    
    @Override
    public PlanetaDestino getPlaneta(int codigo){
         return conexionBD.getInstance().getPlaneta(codigo);
    }
    
    @Override
    public boolean verificarPlaneta(int codigo){
       List<PlanetaDestino> planetas=getAllPlanetas();
        for (PlanetaDestino p : planetas) {
            if(p.getCodigo() == (codigo)){
                return true;
            }
        }
        return false;
    }
}
