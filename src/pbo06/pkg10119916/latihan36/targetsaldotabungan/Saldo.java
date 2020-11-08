/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo06.pkg10119916.latihan36.targetsaldotabungan;

/**
 *
 * @author Thinkpad
 */
public class Saldo {
    
    public int saldoAkhir;
     public int saldo = 3500000;
     public int bunga = 8;
     public int target = 6000000;

public void hitung(int a, int b){
     saldoAkhir = (a + (a*b/100));
    }
}
