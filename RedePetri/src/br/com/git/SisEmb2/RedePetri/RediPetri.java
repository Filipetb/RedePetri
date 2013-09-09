/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.git.SisEmb2.RedePetri;

/**
 *
 * @author Filipe
 */
public class RediPetri {
    
    public int[][] matrizpre;
    public int[][] matrizpos;
    public int[] minicial;

    public RediPetri(int[][] matrizpre, int[][] matrizpos, int[] minicial) {
        this.matrizpre = matrizpre;
        this.matrizpos = matrizpos;
        this.minicial = minicial;
    }
    
    
    
}
