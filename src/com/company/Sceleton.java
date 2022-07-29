package com.company;

public class Sceleton extends Boss {
    private int counter;
    Weapon weapon = new Weapon(" 'Хищник'", " Лук");

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String info() {
        return super.info() + weapon.getNameOfWeapon() + weapon.getTypeofWeapon()+" "+", Стрелы: ["+getCounter()+"]";
    }

}