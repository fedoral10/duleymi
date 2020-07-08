/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.duleymi;

import java.util.ArrayList;
import java.util.List;
import net.duleymi.interfaces.frmMain;
import net.duleymi.procesos.DefaultProceso;

/**
 *
 * @author USUARIO
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmMain frm = new frmMain();
        frm.setVisible(true);
    }

    public static List<DefaultProceso> getMemoria() {
        /**
         * ******************* Creacion de Objetos Procesos ************************
         */
        /*List<DefaultProceso> memoria = new ArrayList<>();
        DefaultProceso p1 = new DefaultProceso();
        p1.setNombre("Proceso 1");
        p1.setPrioridad(DefaultProceso.Prioridad.BAJA);
        p1.setTiempoEjecucion(90);

        DefaultProceso p2 = new DefaultProceso();
        p2.setNombre("Proceso 2");
        p2.setPrioridad(DefaultProceso.Prioridad.ALTA);
        p2.setTiempoEjecucion(100);

        DefaultProceso p3 = new DefaultProceso();
        p3.setNombre("Proceso 3");
        p3.setPrioridad(DefaultProceso.Prioridad.MEDIA);
        p3.setTiempoEjecucion(10);*/

        /**
         * *************** Agregarlos a memoria ******************
         */
        /*memoria.add(p1);
        memoria.add(p2);
        memoria.add(p3);

        return memoria;*/
        return generarProcesosAleatorios(10);
    }

    private  static DefaultProceso.Prioridad prioridaRandom(){
        int numeroAleatorio = (int) (1 + Math.random() * (3 - 1));
        
        switch(numeroAleatorio){
            case 1:
                return DefaultProceso.Prioridad.BAJA;
                
            case 2:
                return DefaultProceso.Prioridad.MEDIA;
                
            case 3:
                return DefaultProceso.Prioridad.MEDIA;
        }
        System.out.println("XXXX");
        return DefaultProceso.Prioridad.BAJA;
    }
    
    private static List<DefaultProceso> generarProcesosAleatorios(int cantidad) {
        List<DefaultProceso> memoria = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            
            DefaultProceso p = new DefaultProceso();
            
            p.setNombre("Proceso "+ (i+1));
            p.setPrioridad(prioridaRandom());
            
            p.setTiempoEjecucion((int) (1 + Math.random() * (100 - 1)) );
            
            memoria.add(p);
            
        }
        
        return memoria;
    }

}
