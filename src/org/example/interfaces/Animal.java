package org.example.interfaces;

//class Animal обязан реализовывать (implements) в себе все методы интерфейса Info
public class Animal implements Info {
    public int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep(){
        System.out.println("I am sleeping");
    }

    //реализация метода public void showInfo() в interface Info
    public void showInfo(){
        System.out.println("id is " + this.id);

    }
}
