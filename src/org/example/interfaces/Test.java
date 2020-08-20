package org.example.interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");

        animal1.sleep();
        person1.sayHello();

        animal1.showInfo();
        person1.showInfo();

        //Другое представление
        Info info1 = new Animal(2);
        Info info2 = new Person("Tom");
        info1.showInfo();
        info2.showInfo();

        //Еще одно представление
        outputInfo(info1);
        outputInfo(info2);

        //Еще вариан
        outputInfo(animal1);
        outputInfo(person1);
    }

    //метод outputInfo(Info info) принимает на вход нечто, что реализует(имплементирует) interface Info
    public static void outputInfo(Info info){
        info.showInfo();
    }
}
