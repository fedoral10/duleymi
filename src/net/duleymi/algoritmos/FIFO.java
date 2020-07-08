/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.duleymi.algoritmos;

import java.util.Iterator;
import java.util.List;
import net.duleymi.procesos.DefaultProceso;

/**
 *
 * @author USUARIO
 */
public class FIFO implements IAlgoritmo {
    
    @Override
    public String ejecutarAlgoritmo(List<DefaultProceso> memoria) {
        
        StringBuilder builder = new StringBuilder();
        
        if(memoria !=null && !memoria.isEmpty()){
            /*En este algoritmo el primero proceso en entrar es el primero en ejecutarse es una cola, por ende se ejecutan recorriendo el List*/
            
            Iterator<DefaultProceso> i = memoria.iterator();
            while(i.hasNext()){
                DefaultProceso proceso = i.next();
                
                System.out.println("Se ejecuto el proceso-> "+ proceso.toString());
                builder.append(proceso.toString()+"\n");
            }
            
        }
        return builder.toString();
    }
    
}
