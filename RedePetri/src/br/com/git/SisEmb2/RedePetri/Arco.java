/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.git.SisEmb2.RedePetri;

/**
 *
 * @author brunosales
 */
public class Arco {
    
    private int peso;
    private Lugar lugar;
    private Transicao trans;

    public Arco(int peso, Lugar lugar, Transicao trans) {
        this.peso = peso;
        this.lugar = lugar;
        this.trans = trans;
    }

    public Arco(Lugar lugar, Transicao trans) {
        this.peso = 1;
        this.lugar = lugar;
        this.trans = trans;
    }
    
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public Transicao getTrans() {
        return trans;
    }

    public void setTrans(Transicao trans) {
        this.trans = trans;
    }
    
    
    
}
