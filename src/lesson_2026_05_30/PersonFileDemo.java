package lesson_2026_05_30;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Person{


    private int ID;
    private String name;
    private String lastName;
    private int age;
    private int salary;


    public Person(int ID, String name, String lastName, int age, int salary) {
        this.ID = ID;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Person{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}

public class PersonFileDemo {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner read = new Scanner(new File("C:\\Users\\Henry1\\Desktop\\Data.txt"));
        //passing Header
        read.nextLine();
        ArrayList<Person> pp = new ArrayList<>();


        Person[] person = new Person[10];
        int count = 0;

        while(read.hasNext()){
            int ID = read.nextInt();
            String name = read.next();
            String lastName = read.next();
            int age = read.nextInt();
            int salary = read.nextInt();

//            person[count] = new Person(ID,name,lastName,age,salary);
//            count++;

            pp.add(new Person(ID,name,lastName,age,salary));
        }

        for(Person temp:pp){
            temp.setSalary(temp.getSalary()+5000);
        }

        try {
            FileWriter out = new FileWriter("C:\\Users\\Henry1\\Desktop\\Data.txt");

            out.write("ID Name LastName Age Salary\n");

            for(Person temp : pp){
                out.write(
                        temp.getID() + " " +
                                temp.getName() + " " +
                                temp.getLastName() + " " +
                                temp.getAge() + " " +
                                temp.getSalary() + "\n"
                );
            }

            out.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }


        for(Person temp:pp){
            System.out.println(temp);
        }

        /*
        ID Name LastName Age Salary
        100001 Hranto Kapan 16 6767
        100002 Miqo Madoyan 16 121212
        100003 Anton Anthony 17 23131321
         */

    }
}
