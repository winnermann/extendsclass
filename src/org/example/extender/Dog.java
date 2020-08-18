//https://www.youtube.com/watch?v=28NP_V2yc60&list=PLAma_mKffTOSUkXp26rgdnC0PicnmnDak&index=26
package org.example.extender;

//class Dog наследует все методы и все поля класса Animal

public class Dog extends Animal {
    public void bark(){
        System.out.println("I am barking");
    }

    //переопределение метода eat()
    //метод eat() класса родителя Animal переопределен в классе потомке Dog
    //теперь из класса Dog вызывается метод eat() класса Dog и выводится "Dog is eating" вместо "I am eating"
    public void eat(){
        System.out.println("Dog is eating");
    }

    public void showName(){
        //поле name вызывается из класса Animal
        System.out.println(name);
    }

}
