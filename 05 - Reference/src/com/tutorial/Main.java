// Kita akan menghindari hal semacam ini karena object yang kita ganti masih dalam 1 Address yang sama
// Sehingga kita akan menggunakan public dan private

package com.tutorial;

class Novel {
    String judul;
    String penulis;

    Novel(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    void display() {
        System.out.println("\nJudul\t: " + this.judul);
        System.out.println("Penulis\t: " + this.penulis);
    }
}

public class Main {
    public static void main(String[] args) {
        Novel novel1 = new Novel("Bumi", "Tere Liye");
        novel1.display();

        // menampilkan Address novel 1
        String addressNovel1 = Integer.toHexString(System.identityHashCode(novel1));
        System.out.println(addressNovel1);
        
        // Assignment object
        Novel novel2 = novel1;
        novel2.display();

        // menampilkan Address novel 2
        String addressNovel2 = Integer.toHexString(System.identityHashCode(novel2));
        System.out.println(addressNovel2);
        
        // Karena novel1 dan novel2 berada pada address yang sama
        novel1.judul = "Bulan";
        novel1.display();
        novel2.display();

        // Kita akan memasukkan object ke dalam methods
        fungsi(novel2);
        novel1.display();
        novel2.display();
    }
    
    public static void fungsi(Novel dataNovel){
        String addressDataNovel = Integer.toHexString(System.identityHashCode(dataNovel));
        System.out.println("Address data novel dalam fungsi : " + addressDataNovel);
        dataNovel.penulis = "Tere Lain";
    }
}
