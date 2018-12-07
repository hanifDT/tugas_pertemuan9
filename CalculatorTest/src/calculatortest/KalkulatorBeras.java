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
import java.lang.ArithmeticException;
import java.util.Scanner;
public class KalkulatorBeras implements CalculatorService{
        Scanner sc = new Scanner(System.in);

    @Override
    public void Perkalian(double x, double y) {
        int ang1 = (int) x;
        int ang2 = (int) y;
        double hasil;
        hasil = x * y;
        
        try {
            ang1 = 0;
            ang2 = 0;
        } catch (Exception e) {
            e.getStackTrace();
            System.out.println("Tidak boleh kali nol");
        }
        System.out.println("Hasil kali: "+hasil);
        
    }

    @Override
    public void Pembagian(double x, double y) {
        int ang1 = (int)x;
        int ang2 = (int)y;
        double hasil;
        hasil = x/y;
        try {
            ang1 = 0;
            hasil = x/y;
            
            ang2 = 0;
            hasil = x/y;
            
        } catch (Exception e) {
            e.getStackTrace();
            System.out.println("Tidak boleh bagi nol");
        }
        System.out.println("Hasil bagi: "+hasil);
    }

    @Override
    public void Penjumlahan(double x, double y) {
        int ang1 = (int)x;
        int ang2 = (int)y;
        float hasil;
        
        hasil = ang1 + ang2;
        System.out.println("Hasil jumlah: "+hasil);
        
    }

    @Override
    public void Pengurangan(double x, double y) {
        int ang1 = (int) x;
        int ang2 = (int) y;
        float hasil;
        
        hasil = ang1 - ang2;
        System.out.println("Hasil bagi: "+hasil);
    }
    
}