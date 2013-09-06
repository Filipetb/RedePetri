/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.git.SisEmb2.RedePetri;

import java.util.ArrayList;

/**
 *
 * @author brunosales
 */
public class Transicao {
    
    private String desc_trans;
    private ArrayList<Arco> entrada_arcos = new ArrayList<Arco>();
    private ArrayList<Arco> saida_arcos = new ArrayList<Arco>();

    public Transicao(String desc_trans) {
        this.desc_trans = desc_trans;
    }

    public void Adiciona_ArcoEntrada(Arco arco_entrada){
        this.entrada_arcos.add(arco_entrada);
    }
    
    public void Adiciona_ArcoSaida(Arco arco_saida){
        this.entrada_arcos.add(arco_saida);
    }
    
    public String getDesc_trans() {
        return desc_trans;
    }

    public void setDesc_trans(String desc_trans) {
        this.desc_trans = desc_trans;
    }
    
    
    
}
