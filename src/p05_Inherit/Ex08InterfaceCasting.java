package p05_Inherit;

import p05_Inherit.common.Utils;

public class Ex08InterfaceCasting {
  public static void main(String[] args) {
    Mammals[] mammals = {new Dog(), new Cat(), new Bat()};
    Birds[] birds = {new Chicken(), new Eagle(), new Parrot()};
    Flyable[] flyables = {new Bat(), new Eagle(), new Parrot()};
    IGround[] grounds = {new Dog(), new Cat(), new Chicken()};
    Object obj =10; //참조형 -> 기본형(Integer) 으로 형변환
    Utils.typeOf(obj); //Integer
    Integer i=100;
  }
}

interface Flyable {

}

interface IGround {

}

class Birds {
}

class Parrot extends Birds implements Flyable {
}

class Eagle extends Birds implements Flyable {
}

class Chicken extends Birds implements IGround {
}

class Mammals {
}

class Dog extends Mammals implements IGround {
}

class Cat extends Mammals implements IGround {
}

class Bat extends Mammals implements Flyable {
}
