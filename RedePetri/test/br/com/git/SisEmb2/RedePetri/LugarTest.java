/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.git.SisEmb2.RedePetri;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author brunosales
 */
public class LugarTest {
    private Lugar lugar;
    private String valor_esperado, valor_encontrado;
    private int vlr_esp, vlr_enc;
    
    public LugarTest() {
        lugar = new Lugar("Inicio fila");
    }

    /**
     * Test of getDesc_lugar method, of class Lugar.
     */
    @Test
    public void testGetDesc_lugar() {
        valor_esperado = "Inicio fila";
        valor_encontrado = lugar.getDesc_lugar();
        assertEquals(valor_esperado, valor_encontrado);
    }

    /**
     * Test of setDesc_lugar method, of class Lugar.
     */
    @Test
    public void testSetDesc_lugar() {
        valor_esperado = "teste";
        lugar.setDesc_lugar(valor_esperado);
        valor_encontrado = lugar.getDesc_lugar();
        assertEquals(valor_esperado, valor_encontrado);
    }

    /**
     * Test of getNum_ficha method, of class Lugar.
     */
    @Test
    public void testGetNum_ficha() {
        vlr_esp = 0;
        vlr_enc = lugar.getNum_ficha();
        assertEquals(vlr_esp, vlr_enc);
    }

    /**
     * Test of setNum_ficha method, of class Lugar.
     */
    @Test
    public void testSetNum_ficha() {
        vlr_esp = 3;
        lugar.setNum_ficha(vlr_esp);
        vlr_enc = lugar.getNum_ficha();
        assertEquals(vlr_esp, vlr_enc);
    }
}