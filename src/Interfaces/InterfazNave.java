/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import Clases.Nave;
import java.util.List;
/**
 *
 * @author Emanuel
 */
public interface InterfazNave {
    public abstract List<Nave> getAllNaves();
    public abstract Nave getNave(int codigo);
    public boolean verificarNave(int codigo);
    public abstract List<Nave> getNavesByName(String nombre,List<Nave> naves);
}
