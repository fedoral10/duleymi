/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.duleymi.algoritmos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.duleymi.procesos.DefaultProceso;

/**
 *
 * @author USUARIO
 */
public class MultiplesColas implements IAlgoritmo {

    //private int CANTIDAD_COLAS=2;
    @Override
    public String ejecutarAlgoritmo(List<DefaultProceso> memoria) {
        StringBuilder builder = new StringBuilder();

        List<List<DefaultProceso>> colas = obtenerColas(memoria);

        Iterator<List<DefaultProceso>> iColas = colas.iterator();

        int contador = 0;
        while (iColas.hasNext()) {
            List<DefaultProceso> cola = iColas.next();

            FIFO fifo = new FIFO();
            builder.append("Ejecución de cola " + (contador + 1) + "\n");
            builder.append(fifo.ejecutarAlgoritmo(cola));
            contador++;
        }

        return builder.toString();
    }

    private List<List<DefaultProceso>> obtenerColas(List<DefaultProceso> memoria) {
        List<List<DefaultProceso>> colas = new ArrayList<List<DefaultProceso>>();

        double promedio = obtenerPromedioDeTiempo(memoria);
        //int cantidadxlista = Math.round(memoria.size() /CANTIDAD_COLAS) ;

        Iterator<DefaultProceso> i = memoria.iterator();

        List<DefaultProceso> cola1 = new ArrayList<>();
        List<DefaultProceso> cola2 = new ArrayList<>();

        while (i.hasNext()) {
            DefaultProceso p = i.next();
            if (p.getTiempoEjecucion() < promedio) {
                cola1.add(p);
            } else {
                cola2.add(p);
            }
        }

        colas.add(cola1);
        colas.add(cola2);

        return colas;
    }

    private double obtenerPromedioDeTiempo(List<DefaultProceso> memoria) {
        Iterator<DefaultProceso> i = memoria.iterator();

        int acumulador = 0;
        int contador = 0;

        while (i.hasNext()) {
            DefaultProceso p = i.next();
            acumulador += p.getTiempoEjecucion();
            contador++;
        }

        return acumulador / contador;

    }

}
