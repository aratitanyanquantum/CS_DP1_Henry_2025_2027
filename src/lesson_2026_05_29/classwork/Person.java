package lesson_2026_05_29.classwork;

public class Person{
    String name;
    String lastName;
    int age;
    int personID;

    Person(String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString(){
        return
                "name: " + name + '\'' +
                        "last name: "  + lastName + '\'' +
                        "age: " + age;
    }

    @Override
    public boolean equals(Object o){
        if(o == this){
            return true;
        }

        return ((Person) o).personID == this.personID;
    }
}
