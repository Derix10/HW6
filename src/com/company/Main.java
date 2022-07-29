package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
    Boss boss = new Boss();
    Weapon weapon = new Weapon("ffrge","geg");
    Sceleton sceleton = new Sceleton();
    Weapon weapon2 = new Weapon("Пулемет "," M240");

    boss.setHealth(330);//Основа: Босс
    boss.setDamage(23);
    boss.setTypeOfDefence("Fire");
    System.out.println("Boss: "+boss.info()+weapon2.getTypeofWeapon() + weapon2.getNameOfWeapon());


    sceleton.setHealth(200);//Доп.: Скелет(номер 1)
    sceleton.setDamage(15);
    sceleton.setTypeOfDefence("Thunder Lightning");
    sceleton.setCounter(22);
    System.out.println("Sceleton(1): "+sceleton.info());

    sceleton.setHealth(250);//Скелет(номер 2)
    sceleton.setDamage(25);
    sceleton.setTypeOfDefence("Durability");
    sceleton.setCounter(34);
    System.out.println("Sceleton(2): "+sceleton.info());



    }
}
