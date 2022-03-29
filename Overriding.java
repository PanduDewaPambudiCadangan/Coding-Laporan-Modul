/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author pdewa
 */
public class Overriding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BangunDatar bangundatar=new BangunDatar();
        
        Persegi persegi=new Persegi();
        persegi.sisi=8;
        
        PersegiPanjang persegipanjang=new PersegiPanjang();
        persegipanjang.lebar=11;
        persegipanjang.panjang=2;
        
        bangundatar.luas();
        bangundatar.keliling();
        
        persegi.luas();
        persegi.keliling();
        
        persegipanjang.luas();
        persegipanjang.keliling();
    }
    
}
