/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.duleymi.algoritmos;

import java.util.List;
import net.duleymi.procesos.DefaultProceso;

/**
 *
 * @author USUARIO
 */
public interface IAlgoritmo {
   
    public void ejecutarAlgoritmo(List<DefaultProceso> memoria);
}
