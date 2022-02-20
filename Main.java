/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class Main {
    static int C, pilih;
    public static int input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Data");
        System.out.println("----------");
        System.out.print("Suhu dalam Celcius  : ");
        C = sc.nextInt();
        return C;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Konversi k = new Konversi();
        System.out.println("=============================");
        System.out.println("| PROGRAM KONVERSI SUHU AIR |");
        System.out.println("=============================");
        input();
        
        do{
            System.out.println("\nOpsi");
            System.out.println("-----");
            System.out.println("1. Lihat Data Konversi");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("\n");
                    k.perhitungan(C);
                    break;
                case 2:
                    System.out.print("\n");
                    input();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("\nMaaf, opsi yang dipilih tidak tersedia. Silahkan pilih opsi yang tersedia");    
                    break;
            }
        }while(pilih != 3);
    }
}
