package ch08Interface.lecture;

import java.util.Objects;

public class C06Polymophism {
  public static void main(String[] args) {
    Hero06 hero = new Hero06();

    hero.setWeapon(new Gun());
    hero.attack();

    hero.setWeapon(new Bow());
    hero.attack();
  }
}

class Hero06 {
  private Weapon weapon;

  public void setWeapon(Weapon weapon) {
    this.weapon = weapon;
  }

  public void attack() {
    weapon.trigger();
  }
}

interface Weapon {
  void trigger();
}

class Gun implements Weapon {
  @Override
  public void trigger() {
    System.out.println("총을 쏩니다.");
  }
}

class Bow implements Weapon {
  @Override
  public void trigger() {
    System.out.println("활을 쏩니다.");
  }
}