package com.tnsif.oopsconcepts;
class Animals {
    void eat() {
        System.out.println("every animal eats");
    }
}

class Dog extends Animals {
    void bark() {
        System.out.println("dog barks");
    }
}

public class Animal {
    public static void main(String[] args) {
        Dog ob = new Dog();
        ob.eat();  // inherited method
        ob.bark(); // Dog's own method
    }
}
