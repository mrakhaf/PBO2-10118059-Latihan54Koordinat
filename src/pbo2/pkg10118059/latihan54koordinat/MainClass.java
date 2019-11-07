/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan54koordinat;

/**
 *
 * @author 
 * Nama : Muhammad Rakha Firdaus
 * NIM : 10118059
 * Kelas : IF-2
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        Koordinat k = new Koordinat(0, 0);
        k.setX(10);
        k.setY(4);
        
        WarnaKoordinat WK = new WarnaKoordinat(k.getX(), k.getY(), "");
        WK.setNamaWarna("Jingga");
        
        System.out.println("Warna Koordinat : " + WK.getNamaWarna());
        System.out.println("Koordinat Sumbu x : " + WK.x + ", y : " + WK.y);
        
        
    }
    
}
