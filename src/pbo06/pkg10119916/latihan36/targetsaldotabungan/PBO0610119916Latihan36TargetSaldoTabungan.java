/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo06.pkg10119916.latihan36.targetsaldotabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : DIAN ARPIAN
 * NIM      : 10119916
 * KELAS    : IF10K
 * Deskripsi Program : Target Saldo Tabungan
 */

public class PBO0610119916Latihan36TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        Saldo sld = new Saldo();
        
        
        for (int i = 1; i <= i; i++){
            sld.hitung(sld.saldo,sld.bunga);
            System.out.println("Saldo di bulan ke-"+i+" " + kursIndonesia.format(sld.saldoAkhir));
            sld.saldo = sld.saldoAkhir;
         if(sld.saldoAkhir >= sld.target)
             break;
        }
    }
    
}
