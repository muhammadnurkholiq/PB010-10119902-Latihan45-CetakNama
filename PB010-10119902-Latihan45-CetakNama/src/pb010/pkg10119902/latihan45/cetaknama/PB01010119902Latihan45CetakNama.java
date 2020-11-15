/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb010.pkg10119902.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Muhammad Nurkholiq
 * KELAS    : IF10K
 * NIM      : 10119902
 * Deskripsi Program    : Program Ini Berisi Program Untuk Menampilkan Cetak Nama
 * 
 */

public class PB01010119902Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("===Aplikasi Pencetakkan Nama===");
        
        Scanner scn = new Scanner(System.in);
        Printer printer = new Printer();
        
        System.out.print("Masukkan nama anda : ");
        printer.setNama(scn.nextLine());
        System.out.print("Mau cetak nama berapa kali? : ");
        printer.setJmlCetak(scn.nextInt());
        
        printer.cetak(printer.getNama());
        printer.cetak(printer.getJmlCetak(), printer.getNama());
    }
    
}