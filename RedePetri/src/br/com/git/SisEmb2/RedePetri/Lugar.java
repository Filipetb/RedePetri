/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.git.SisEmb2.RedePetri;

/**
 *
 * @author brunosales
 */
public class Lugar {
    
    //Descrição do lugar(nome do lugar).
    private String desc_lugar;
    //Número de fichas do lugar.
    private int num_ficha;
    

    //Construtores
    public Lugar(String desc_lugar) {
        this.desc_lugar = desc_lugar;
        this.num_ficha = 0;
    }

    public Lugar(String desc_lugar, int fichas) {
        this.desc_lugar = desc_lugar;
        this.num_ficha = fichas;
    
    }
    
    
    //Metodos
    public String getDesc_lugar() {
        return desc_lugar;
    }

    public void setDesc_lugar(String desc_lugar) {
        this.desc_lugar = desc_lugar;
    }

    public int getNum_ficha() {
        return num_ficha;
    }

    public void setNum_ficha(int num_ficha) {
        this.num_ficha = num_ficha;
    }
    
}
