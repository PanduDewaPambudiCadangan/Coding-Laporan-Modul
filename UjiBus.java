/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujibus;

/**
 *
 * @author pdewa
 */
public class UjiBus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bus busMini=new Bus(10);
        busMini.getPassword(40);
        busMini.getPassword(90);
        busMini.cetak();
        
        busMini.pluspenumpang(3);
        
        busMini.cetak();
        
        busMini.pluspenumpang(1);
        
        busMini.cetak();
        
        busMini.pluspenumpang(1);
        
        busMini.cetak();
    }
    
}
