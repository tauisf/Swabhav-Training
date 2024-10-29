package com.aurionpro.oops_poc_test;

class Animal {  
    void eat() {
        System.out.println("eating...");  
    }  
}  

class Dog extends Animal {  
    void bark() {
        System.out.println("barking...");  
    }  
}

class Cat extends Animal {  
    void meow() {
        System.out.println("meowing...");  
    }  
}

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        Cat cat = new Cat();  
        cat.meow();  
        cat.eat();   
       
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
    }
}
