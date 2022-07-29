package com.company;

public class GameEntity {
    private int health;
    private int damage;
    private String typeOfDefence;
    private Weapon weapon;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTypeOfDefence() {
        return typeOfDefence;
    }

    public void setTypeOfDefence(String typeOfDefence) {
        this.typeOfDefence = typeOfDefence;
    }
    public String info(){
        return "Здоровье равна: ["+this.health+
                "],Урон равен : ["+this.damage+
                "], Тип защита : ["+this.typeOfDefence+"]";
    }
}
