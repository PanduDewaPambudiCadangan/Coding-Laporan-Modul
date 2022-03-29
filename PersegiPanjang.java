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
public class PersegiPanjang extends BangunDatar {
    float panjang,lebar;
    
    public void luas(){
        float luas=panjang*lebar;
        System.out.println("Luas persegi panjang = "+luas);
    }
    public void keliling(){
        float keliling=2*(panjang+lebar);
        System.out.println("Keliling persegi panjang = "+keliling);
    }
}
