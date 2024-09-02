package com.tutorial;

import javax.swing.*;

// Membuat class 
class contohClass{
    private int a;
    private String b;

    public contohClass(int a, String b){
        this.a = a;
        this.b = b;
    }

    public void display(){
        // int hasil = this.a + this.b;
        System.out.println("Hasil penjumlahan dari" +  a + "dan " + b + " adalah : " + (this.a + Integer.parseInt(b)));
    }
}

public class Ch2Sample1 {
    public static void main(String[] args) {

        // JFrame myWindow; // Deklarasi Class dan Object dalam main

        // // Membuat tampilan window
        // myWindow = new JFrame();
        // myWindow.setSize(300, 200);
        // myWindow.setTitle("My first Java Program");
        // myWindow.setVisible(true);

        // JFrame myWindow2 = new JFrame();
        // myWindow2.setSize(400, 200);
        // myWindow2.setTitle("My Second Java Program");
        // myWindow2.setVisible(true);

        // {Menampilkan Penjumlahan}
        contohClass Contoh1 = new contohClass(3,"9");
        Contoh1.display();
    }
}