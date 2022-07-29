package com.company;

public class Weapon {
    private String typeofWeapon;
    private String nameOfWeapon;

    public Weapon(String typeofWeapon, String nameOfWeapon) {
        this.typeofWeapon = typeofWeapon;
        this.nameOfWeapon = nameOfWeapon;
    }

    public String getTypeofWeapon() {
        return typeofWeapon;
    }

    public void setTypeofWeapon(String typeofWeapon) {
        this.typeofWeapon = typeofWeapon;
    }

    public String getNameOfWeapon() {
        return nameOfWeapon;
    }

    public void setNameOfWeapon(String nameOfWeapon) {
        this.nameOfWeapon = nameOfWeapon;
    }
}
