package com.tutorial;

class Character {
    String name;
    double HP;

    // Object member
    Lightcone lightcone;
    DeffCharacter deffCharacter;

    Character(String name, double HP) {
        this.name = name;
        this.HP = HP;
    }

    // Menyerang musuh
    void attack(Character opponent) {
        double attackPower = this.lightcone.attackPower;

        System.out.println(this.name + " attacking " + opponent.name + " with power " + attackPower);
        opponent.defence(attackPower);
    }

    // Perhitungan Damage
    void defence(double attackPower) {
        // Mengambil damage
        double damage;
        if (this.deffCharacter.deffPower < attackPower) {
            damage = attackPower - this.deffCharacter.deffPower;
        } else {
            damage = (attackPower - this.deffCharacter.deffPower) / -2;
        }
        this.HP -= damage;
        System.out.println(this.name + " Gets damage " + damage);
    }

    // Menyambungkan Lightcone dan deff ke karakter
    void equipLightcone(Lightcone lightcone) {
        this.lightcone = lightcone;
    }

    void equipDeff(DeffCharacter deffCharacter) {
        this.deffCharacter = deffCharacter;
    }

    // Display Status
    void display() {
        System.out.println("\nNama\t\t: " + this.name);
        System.out.println("Hp\t\t: " + this.HP + " hp");
        this.deffCharacter.display();
        this.lightcone.display();
    }
}

class Lightcone {
    String name;
    String type;
    double attackPower;

    Lightcone(String name, String type, double attackPower) {
        this.name = name;
        this.type = type;
        this.attackPower = attackPower;
    }

    void display() {
        System.out.println("Attack\t\t: " + this.attackPower);
        System.out.println("Lightcone\t: " + this.name);
        System.out.println("Type\t\t: " + this.type);
    }

}

class DeffCharacter {
    String name;
    double deffPower;

    DeffCharacter(String name, double deffPower) {
        this.name = name;
        this.deffPower = deffPower;
    }

    void display() {
        System.out.println("Deff\t\t: " + this.deffPower);
    }

}

public class Main {
    public static void main(String[] args) {
        // Karakter TIM
        Character player1 = new Character("Imbibitor Lunae", 3000);
        Character player2 = new Character("Sparkle", 4000);
        Character player3 = new Character("Ruan Mei", 3700);
        Character player4 = new Character("Huo huo", 6400);

        // Karakter MUSUH
        Character boss1 = new Character("Kafka", 18000);
        DeffCharacter deffBossKafka = new DeffCharacter("Deff Boss Kafka", 900);
        Lightcone attackBoss = new Lightcone("Attack", "Lightning", 950);
        boss1.equipLightcone(attackBoss);
        boss1.equipDeff(deffBossKafka);


        // Object senjata
        Lightcone BTS = new Lightcone("Bright Than the Sun", "Destruction", 1200);
        Lightcone ES = new Lightcone("Earthly Escapade", "Harmony", 1024);
        Lightcone PSM = new Lightcone("Pass Selzf in Mirror", "Harmony", 1024);
        Lightcone NF = new Lightcone("Night of Fright", "Abundance", 1024);

        // Deffence Character
        DeffCharacter deffDanil = new DeffCharacter("Deff Danil", 800);
        DeffCharacter deffSparkle = new DeffCharacter("Deff Sparkle", 800);
        DeffCharacter deffRM = new DeffCharacter("Deff Ruan Mei", 1100);
        DeffCharacter deffHuohuo = new DeffCharacter("Deff Huo huo", 800);

        // Equip Lightcone
        player1.equipLightcone(BTS);
        player2.equipLightcone(ES);
        player3.equipLightcone(PSM);
        player4.equipLightcone(NF);

        // Equip Deff
        player1.equipDeff(deffDanil);
        player2.equipDeff(deffSparkle);
        player3.equipDeff(deffRM);
        player4.equipDeff(deffHuohuo);

        // Tampilan
        System.out.println("Status Karakter\n");
        player1.display();
        player2.display();
        player3.display();
        player4.display();
        boss1.display();

        // Mekanisme Permainan
        System.out.println("\nBATTLE START");
        System.out.println("\nTurn - 1\n");
        player1.attack(boss1);
        player2.attack(boss1);
        player3.attack(boss1);
        player4.attack(boss1);
        System.out.println("\nStatus Musuh Saat Ini\n");
        boss1.display();
    }
}
