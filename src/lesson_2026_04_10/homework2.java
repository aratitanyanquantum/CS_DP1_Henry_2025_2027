package lesson_2026_04_10;

import java.util.*;

public class homework2 {

    static class Employee {
        private String firstName;
        private String lastName;
        private int age;
        private double weight;
        private double salary;
        private String country;
        private int exp;
        private String gender;
        private String gmail;
        private String address;

        public Employee(String firstName, String lastName, int age, double weight, double salary, String country, int exp, String gender, String gmail, String address) {
            this.firstName = firstName;
            this.lastName = lastName;
            setAge(age);
            this.weight = weight;
            this.salary = salary;
            this.country = country;
            this.exp = exp;
            this.gender = gender;
            this.gmail = gmail;
            this.address = address;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age >= 0 && age <= 150) {
                this.age = age;
            } else {
                this.age = 0;
            }
        }

        public String getGmail() {
            return gmail;
        }

        public void setGmail(String gmail) {
            this.gmail = gmail;
        }

        public boolean checkGmail() {
            if (gmail.contains("@") && gmail.contains(".")) {
                return true;
            }
            return false;
        }

        public String basicInfo() {
            return firstName + " " + lastName + " " + country;
        }

        public void printInfo() {
            System.out.println(firstName + " " + lastName + " " + age + " " + weight + " " + salary + " " + country + " " + exp + " " + gender + " " + gmail + " " + address);
        }
    }

    static class Sportsman extends Employee {
        private int titles;
        private String team;

        public Sportsman(String firstName, String lastName, int age, double weight, double salary, String country, int exp, String gender, String gmail, String address, int titles, String team) {
            super(firstName, lastName, age, weight, salary, country, exp, gender, gmail, address);
            this.titles = titles;
            this.team = team;
        }

        public int getTitles() {
            return titles;
        }

        public void setTitles(int titles) {
            this.titles = titles;
        }

        public void printAll() {
            printInfo();
            System.out.println(titles + " " + team);
        }
    }

    public static void main(String[] args) {

        Sportsman s1 = new Sportsman(
                "Lionel",
                "Messi",
                38,
                67,
                75000000,
                "Argentina",
                20,
                "M",
                "leo@gmail.com",
                "Miami",
                100,
                "Inter Miami"
        );

        Sportsman s2 = new Sportsman(
                "Cristiano",
                "Ronaldo",
                41,
                83,
                200000000,
                "Portugal",
                22,
                "M",
                "ronaldo@gmail.com",
                "Riyadh",
                120,
                "Al Nassr"
        );

        Sportsman s3 = new Sportsman(
                "Neymar",
                "Junior",
                34,
                75,
                100000000,
                "Brazil",
                15,
                "M",
                "neymar@gmail.com",
                "Santos",
                80,
                "Santos FC"
        );


        s1.printAll();
        s2.printAll();
        s3.printAll();

        System.out.println(s1.basicInfo());
        System.out.println(s2.checkGmail());
    }
}