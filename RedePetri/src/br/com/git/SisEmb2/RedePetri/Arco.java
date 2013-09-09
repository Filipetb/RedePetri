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
    
    private int id; //Identificador do arco.
    private int peso; //Peso do arco.
    private Lugar lugar; //De qual Lugar o arco sai ou entra.
    private Transicao trans; //De qual Transiçao o arco sai ou entra.
    private boolean entradaT; // Variavel que define se o arco leva ou sai de uma transição.

    //Se et for falso significa que o Arco ta saindo de uma transição e entrando em um lugar e vice-versa.
    public Arco(int id, int peso, Lugar lugar, Transicao trans, boolean et) {
        this.id = id;
        this.peso = peso;
        this.lugar = lugar;
        this.trans = trans;
        this.entradaT = et;
    }

    public Arco(int id, Lugar lugar, Transicao trans, boolean et) {
        this.id = id;
        this.peso = 1;
        this.lugar = lugar;
        this.trans = trans;
        this.entradaT = et;
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

    public int getId() {
        return id;
    }

    public boolean isEntradaT() {
        return entradaT;
    }
    
    
    
    
    
}
