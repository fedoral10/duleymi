/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.duleymi.algoritmos;

/**
 *
 * @author USUARIO
 */
public class DefaultAlgoritmo implements IAlgoritmo{


    protected String nombre=null;
    protected int tiempoEjecucion=0;
    
    @Override
    public void ejecutarProceso() {
        return;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempoEjecucion() {
        return tiempoEjecucion;
    }

    public void setTiempoEjecucion(int tiempoEjecucion) {
        this.tiempoEjecucion = tiempoEjecucion;
    }
    
}
