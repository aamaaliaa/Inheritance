/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author Lenovo
 */
public class Persegi extends BangunDatar {
    int panjang;
    int lebar;
    
    public Persegi(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    @Override
    public float luas() {
        return this.panjang * this.lebar;
    }
    @Override
    public float keliling() {
          return (2 * (this.panjang + this.lebar));
    }
}

