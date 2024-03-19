/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author Lenovo
 */
public class Main {
   public static void main(String[] args) {
       BangunDatar bangunDatar= new BangunDatar();
       Persegi persegi = new Persegi(2, 3);
       Segitiga segitiga = new Segitiga(6, 3);
       Lingkaran lingkaran = new Lingkaran (50);
       // memanggil methode luas dan keliling
       bangunDatar.luas();
       bangunDatar.keliling();
        System.out.println("Luas Persegi Panjang: " + persegi.luas());
        System.out.println("Keliling Persegi: " + persegi.keliling());
        System.out.println("=========================================");

        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling());
        System.out.println("=========================================");
        System.out.println("Luas Segitiga: " + segitiga.luas());
        System.out.println("=========================================");
    } 
}