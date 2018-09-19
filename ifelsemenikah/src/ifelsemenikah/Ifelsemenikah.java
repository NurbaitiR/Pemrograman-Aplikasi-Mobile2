/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelsemenikah;

/**
 *
 * @author User
 */
public class Ifelsemenikah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        int umur = 21 ;
        String paras = "Gak Cantik";
        String otak = "Gak Pintar";
        
        if (umur >=20 && umur <=23 && paras == "Cantik" && otak == "Pintar"){
            System.out.println("Pasti Mau Dong!");
        }
        else if ((umur >=20 && umur <=23) && (paras == "Cantik" && otak == "Gak Pintar")){
            System.out.println("OK LAH");
        }
        else if (umur > 23 && (paras == "Cantik" && otak == "Gak Pintar")){
            System.out.println("Saya Pikir Dulu Deh");
        }
        
        else {
            System.out.println("NO WAY!!");
        }
    }
}
