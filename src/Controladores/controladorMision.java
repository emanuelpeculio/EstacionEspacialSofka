/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import BasedeDatos.conexionBD;
import Clases.Mision;
import Interfaces.InterfazMision;
import java.util.List;

/**
 *
 * @author Emanuel
 */

public class controladorMision implements InterfazMision{
    private static controladorMision instancia;
    
    public static controladorMision getInstancia(){
        if(instancia == null)
            instancia=new controladorMision();
        return instancia;
    }
    
    public controladorMision(){
        
    }
    
    @Override
    public List<Mision> getAllMisiones(){
        return conexionBD.getInstance().getAllMisiones(); 
    }
 
    @Override
    public Mision getMision(int codigo){
         return conexionBD.getInstance().getMision(codigo);
    }
       public boolean verificarMision(int codigo){
       List<Mision> misiones=getAllMisiones();
        for (Mision m : misiones) {
            if(m.getCodigo() == (codigo)){
                return true;
            }
        }
        return false;
    }
    
}
