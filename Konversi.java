/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author acer
 */
public class Konversi {
    int R, F;
    float K;
    void perhitungan(int C){
        R = (C*4)/5;
        F = (C*9)/5+32;
        K = (float) (C+273.15);
        System.out.println("Suhu Dalam Celcius      : " + C);
        System.out.println("Suhu Dalam Reamur       : " + R);
        System.out.println("Suhu Dalam Fahrenheit   : " + F);
        System.out.println("Suhu Dalam Kelvin       : " + K);
        if (C <= 0){
            System.out.println("Kondisi Air Beku");
        } else if (C > 0 && C < 100){
            System.out.println("Kondisi Air Normal");
        } else{
            System.out.println("Kondisi Air Mendidih");
        }
    }
}
