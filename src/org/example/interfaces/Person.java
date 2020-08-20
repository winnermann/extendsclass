package org.example.interfaces;

//class Person обязан реализовывать (implements) в себе все методы интерфейса Info
public class Person implements Info {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello!");
    }

    //эта аннотация обязывает чтобы имя метода showInfo() в class Person было равно имени метода showInfo() в interface Info
    @Override
    //реализация метода public void showInfo() в interface Info
    public void showInfo() {
        System.out.println("Name is "+this.name);

    }



}
