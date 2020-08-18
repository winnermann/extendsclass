package org.example.extender;

public class Lesson25 {
    public static void main(String[] args) {

        Dog dog = new Dog();

        //Вызываем из класса Dog объекты класса Animal
        //class Dog унаследовал все методы и все поля класса Animal
        dog.eat();
        dog.sleep();

        //Вызываем из класса Dog объекты класса Dog
        //этот метод вызывается из class Dog, т.к. его нет в классе Animal
        dog.bark();

        //Вызываем из класса Dog поля класса Animal
        dog.showName();
    }
}
