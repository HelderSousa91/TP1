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
public class TP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();
        int inferior = 0, superior = 1456, pos = inferior;
        
        while (pos < superior) {
            if (pos + 1000 <= superior) {
                tarefas.add(new Tarefa(pos, pos + 1000));
                pos = pos + 1000;
            }else{
                int sub=superior-pos;
                if(sub>= 1000){
                    tarefas.add(new Tarefa(pos,sub));
                }else{
                tarefas.add(new Tarefa(pos,superior));
                }
                pos=pos+sub;
            }
        }
        
        for(Tarefa t:tarefas){
            System.out.println(t.getInferior()+"->"+t.getSuperior());
        }
    }

}
