/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116458.latihan61.bangunruang;

/**
 *
 * @author NAMA     : Rinanda Al Qorrie Akbar
 * NIM      : 10116458
 */
public class Tabung extends BangunRuang{
    private double jari2;
    private double tinggi;

    public double getJari2() {
        return jari2;
    }

    public void setJari2(double jari2) {
        this.jari2 = jari2;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume(){
        return 3.14*jari2*jari2*tinggi;
    }
}
