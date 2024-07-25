package com.tutorial;

class Data{
    public int intPublic;
    private int intPrivate;
    private double doublePrivate;

    public Data(){
        this.intPublic = 0;
        this.intPrivate = 100;
    }

    void display(){
        System.out.println("\nPublic\t: " + this.intPublic);
        System.out.println("int Private\t: " + this.intPrivate);
        System.out.println("double Private\t: " + this.doublePrivate);
    }

    // Getter {Read Only}
    public int getIntPrivate(){
        return this.intPrivate;
    }

    // Setter {Write Only}
    public void setDoublePrivate(double value){
        this.doublePrivate = value;
    }
}

class Lingkaran{
    private double diameter;

    Lingkaran(double diameter){
        this.diameter = diameter;
    }

    // Getter
    public double getJari2(){
        return this.diameter/2;
    }

    // Setter
    public void setJari2(double jari2){
        this.diameter = jari2*2;
    }

    // Getter
    public double getLuas(){
        return 3.14 *diameter*diameter/4;
    }
}

public class Main{
    public static void main(String[] args) {

        Data object = new Data();

        // Read dan Write menggunakan public
        object.intPublic = 4; // Write
        System.out.println("\nPublic\t: " + object.intPublic); // read

        // read only {kita bisa menggunakan GETTER}
        int angka = object.getIntPrivate();
        System.out.println("Getter\t: " + angka);
        
        // Write only {kita hanya bisa menulis}
        object.setDoublePrivate(66);
        object.display();

        // Menggabungkan SETTER dan GETTER
        Lingkaran object2 = new Lingkaran(8);
        System.out.println("\nJari-Jari\t: " + object2.getJari2());
        System.out.println("Luas\t\t: " + object2.getLuas());

        // Ubah jari-jari
        object2.setJari2(14);
        System.out.println("Jari-jari\t: " + object2.getJari2());
        System.out.println("Luas\t\t: " + object2.getLuas());

    }
}