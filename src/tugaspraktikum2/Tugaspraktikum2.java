/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum2;

/**
 *
 * @author MOKLET-2
 */
public class Tugaspraktikum2 {
    public double jarijari = 20;
    public double diameter;
    public double luaspermukaan;
    public double volume;
    
    
    public void SetJarijari(){
        jarijari = 20;
        System.out.println("Jari-jari adalah = "+jarijari);
    }
    public void showDiameter(){
        diameter = 2*jarijari;
        System.out.println("Diameter = "+ diameter);
    }
    public void showLuaspermukaan(){
        luaspermukaan = 4*Math.PI*jarijari*jarijari;
        System.out.println("Luas Permukaan Bola = "+luaspermukaan);
    }
    public void showVolume(){
        volume = 4/3*Math.PI*jarijari*jarijari*jarijari;
        System.out.println("Volume bola = "+volume);
    }
}
