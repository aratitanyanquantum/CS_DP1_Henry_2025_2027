package lesson_2026_05_16.classwork;

interface AnimalFunc{
    void run();
}

class Cat implements AnimalFunc{
    public void run(){
        System.out.println("50");
    }
}

class Dog implements AnimalFunc{
    public void run(){
        System.out.println("60");
    }
}

public class demoInter{
    public static void main(String[] args){
        AnimalFunc animal = new Dog();
        animal.run();
        animal = new Cat();
        animal.run();
    }
}
