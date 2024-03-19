/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author Lenovo
 */
public class Segitiga extends BangunDatar{
    int alas;
    int tinggi;
    
    
    public Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
        
    }

    @Override
    public float luas(){
    return (float)(0.5 * alas * tinggi);
    }
   
}