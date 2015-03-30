/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.util.ArrayList;

/**
 *
 * @author fabio
 */
public class Tarefas {
    private ArrayList<Tarefa> taredas;

    public Tarefas() {
        this.taredas = new ArrayList<Tarefa>();
    }
    
    public void addTarefa(Tarefa tarefa){
        this.taredas.add(tarefa);
    }
}
