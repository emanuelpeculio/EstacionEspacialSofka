/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Controladores.controladorMision;
import Controladores.controladorNave;
import Controladores.controladorPlaneta;

/**
 *
 * @author Emanuel
 */
public class Fabrica {
    private static Fabrica instancia;
    
    public static Fabrica getInstancia(){
        if(instancia==null)
            instancia=new Fabrica();
        return instancia;
    }
    
    private Fabrica(){
    }
    
    public InterfazNave getInterfazNave(){
        InterfazNave IN=controladorNave.getInstancia();
        return IN;
    }
    
        public InterfazPlaneta getInterfazPlaneta(){
        InterfazPlaneta IP= controladorPlaneta.getInstancia();
        return IP;
    }
        public InterfazMision getInterfazMision(){
        InterfazMision IM= controladorMision.getInstancia();
        return IM;
    }
}
