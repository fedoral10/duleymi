/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.duleymi.algoritmos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import net.duleymi.procesos.DefaultProceso;

/**
 *
 * @author USUARIO
 */
public class PrioridadAlMasCorto implements IAlgoritmo {

    @Override
    public String ejecutarAlgoritmo(List<DefaultProceso> memoria) {
        StringBuilder builder = new StringBuilder();
        List<DefaultProceso> memoriaOrdenada = ordenar(memoria);
        
        FIFO fifo = new FIFO();
        
        builder.append(fifo.ejecutarAlgoritmo(memoriaOrdenada));
        
        return builder.toString();
    }

    private List<DefaultProceso> ordenar(List<DefaultProceso> memoria) {
        
        List<DefaultProceso> lista = 
                memoria.stream().sorted((x1,x2) -> {
            return x1.getTiempoEjecucion() < x2.getTiempoEjecucion() ? -1 :1;
        }).collect(Collectors.toList());
        
        /*memoria.sort( (x1,x2) -> {
            return x1.getTiempoEjecucion() < x2.getTiempoEjecucion() ? -1 :1;
        } );*/
                
        
        return lista;
    }

}
