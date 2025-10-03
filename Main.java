package krmu;

class Animal{
    void sound(){
        System.out.println("animal make sound");
    }
}

class Dog extends Animal{
    void sound(){
        super.sound();
        System.out.println("bark");
    }
}

class Cat extends Animal{

    void sound() {
        super.sound();
        System.out.println("meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();
    }
}