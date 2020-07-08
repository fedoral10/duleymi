/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.duleymi.procesos;

/**
 *
 * @author USUARIO
 */
public class DefaultProceso {

    protected String nombre = null;
    protected int tiempoEjecucion = 0;
    protected Prioridad prioridad;
    
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

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }
    
    public static enum Prioridad {
        BAJA,MEDIA,ALTA
    }
    
    
    @Override
    public String toString(){
        return "Nombre: " + this.getNombre() + " - " + "Tiempo de Ejecucion: " + this.getTiempoEjecucion() + " - " + " Prioridad: " + this.getPrioridad().name() ;
    }
}
