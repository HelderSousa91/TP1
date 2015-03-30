/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

/**
 *
 * @author fabio
 */
public class Tarefa {
    private int inferior;
    private int superior;
    private boolean estado;

    public Tarefa(int inferior, int superior) {
        this.inferior = inferior;
        this.superior = superior;
        this.estado=false;
    }

    /**
     * @return the inferior
     */
    public int getInferior() {
        return inferior;
    }

    /**
     * @return the superior
     */
    public int getSuperior() {
        return superior;
    }

    /**
     * @return the estado
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
    
    
    
    
}
