/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatortest;

/**
 *
 * @author hanif
 */
import java.util.Scanner;
public class CalculatorTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TOcanner sc = new Scanner(System.in);
      Scanner sc = new Scanner(System.in);
      int pil;
        System.out.println("pilih menu");
        System.out.println("1.penjumlahan");
        System.out.println("2.pengurangan");
        System.out.println("3.perkalian");
        System.out.println("4.pembagian");
        System.out.println("5.akar");
        System.out.println("6.Pangkat");
        System.out.println("7.exit");
        System.out.println("pilihan : ");
        pil = sc.nextInt();
      KalkulatorBeras cal = new KalkulatorBeras();
      KalkulatorBagus cala = new KalkulatorBagus();
        switch (pil) {
            case 1:
                cal.Penjumlahan(1, 3);
                break;
            case 2:
                cal.Pengurangan(4, 2);
                break;
            case 3:
                cal.Perkalian(3, 3);
                break;
            case 4:
                cal.Pembagian(9, 4);
                break;
            case 5:
                cala.Akar(5);
                break;
            case 6:
                cala.Pangkat(2,3);
                break;
            case 7:
                System.exit(pil);
               
                break;
            default:
                throw new AssertionError();
        }
 
              
              
    }
    
}