/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

/**
 *
 * @author Emanuel
 */
import Clases.Nave;
import BasedeDatos.conexionBD;
import Clases.Lanzadera;
import java.util.ArrayList;
import java.util.List;
import Interfaces.InterfazNave;

public class controladorNave implements InterfazNave{
    private static controladorNave instancia;
    
    public static controladorNave getInstancia(){
        if(instancia == null)
            instancia=new controladorNave();
        return instancia;
    }
    
    public controladorNave(){
        
    }
    
    @Override
    public List<Nave> getAllNaves(){
        return conexionBD.getInstance().getAllNaves(); 
    }
 
    @Override
    public Nave getNave(int codigo){
         return conexionBD.getInstance().getNave(codigo);
    }
    
    @Override
    public boolean verificarNave(int codigo){
       List<Nave> naves=getAllNaves();
        for (Nave n : naves) {
            if(n.getCodigo() == (codigo)){
                return true;
            }
        }
        return false;
    }
    
    @Override
    public List<Nave> getNavesByName(String nombre,List<Nave> naves){
        List<Nave> retNaves=new ArrayList();
        
        naves.forEach((Nave n) -> {
            Nave Nav= new Nave() {};
            if(nombre.length()==0)
                retNaves.add(Nav);
            else if (n.getNombre().toLowerCase().contains(nombre)||n.toString().toLowerCase().contains(nombre)|| n.getCombustible().toLowerCase().contains(nombre)|| n.getEstado().toLowerCase().contains(nombre) || n.getTipo().toLowerCase().contains(nombre)) {
                Nav.setCodigo(n.getCodigo()); 
                Nav.setNombre(n.getNombre()); 
                Nav.setPeso(n.getPeso()); 
                Nav.setCombustible(n.getCombustible());
                Nav.setEstado(n.getEstado());
                Nav.setTipo(n.getTipo()); 
                retNaves.add(Nav);
            }
        });
        return retNaves;
    }
}