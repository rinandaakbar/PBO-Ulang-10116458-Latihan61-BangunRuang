/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116458.latihan61.bangunruang;

/**
 *
 * @author
 * NAMA     : Rinanda Al Qorrie Akbar
 * NIM      : 10116458
 */
public class PBOUlang10116458Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bola bol = new Bola();
        Tabung tb = new Tabung();
        Kerucut kc = new Kerucut();
        
        bol.setJari(7);
        System.out.println("\tHitung Volume Bola Basket");
        System.out.println("-----------------------------------");
        System.out.println("Jari-jari bola basket : " + bol.getJari());
        System.out.println("=====================");
        System.out.println("Volume bola basket : " + bol.hitungVolume());
        
        tb.setJari2(10);
        tb.setTinggi(21);
        System.out.println("\n\tHitung Volume Tabung");
        System.out.println("-----------------------------------");
        System.out.println("Jari-jari Tabung : " + tb.getJari2());
        System.out.println("Tinggi Tabung : " + tb.getTinggi());
        System.out.println("=====================");
        System.out.println("Volume Tabung : " + tb.hitungVolume());
        
        kc.setJari(14);
        kc.setTinggi(9);
        System.out.println("\n\tHitung Volume Kerucut");
        System.out.println("-----------------------------------");
        System.out.println("Jari-jari Kerucut : " + kc.getJari());
        System.out.println("Tinggi Kerucut : " + kc.getTinggi());
        System.out.println("=====================");
        System.out.println("Volume Kerucut : " + kc.hitungVolume());
    }
    
}
