package lesson_2026_04_03;

class Employee {
    int ID;
    String name;
    String lastName;
    int age;
    boolean gender;
    String department;
    double baseSalary;
    int yearsOfExperience;
    boolean isFullTime;

    Employee(int ID,String name,String lastName, int age, boolean gender, String department, double baseSalary, int yearsOfExperience, boolean isFullTime){
        this.ID = ID;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.baseSalary = baseSalary;
        this.yearsOfExperience = yearsOfExperience;
        this.isFullTime = isFullTime;

        setAge(age);
        setBaseSalary(baseSalary);
    }

    void setAge(int a){
        if(a<16 || a > 70){
            System.out.println("Not Eligible for work");
        }
        else {
            System.out.println("Eligible for work");
            age = a;
        }
    }

    void setBaseSalary(double salary){
        if(salary<24000)
            System.out.println("Salary is too low or invalid");
        else
            baseSalary = salary;
    }

    void setYearsOfExperience(int y){
        if(y<=1)
            System.out.println("Not enough experience");
        else
            yearsOfExperience = y;
    }

    void printInfo(){
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Last Name: " + lastName);
    }

    void printFullInfo(){
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Last Name: " + lastName);
        System.out.println("department: " + department);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Years of experience: " + yearsOfExperience);
        System.out.println("Is Full Time?: " + isFullTime);
    }

    double calculateSalary(){
        double salary = baseSalary * yearsOfExperience;
        if(!isFullTime)
            salary = salary/2;
        return salary;
    }

    boolean isEligibleForPromotion(){
        if(yearsOfExperience > 5){
            System.out.println("Employee is Available for promotion");
            return true;
        }
        else{
            return false;
        }
    }
}

class Company{
    String companyName;
    int yearCreated;
    String industry;
    Employee[] employees;
    int count;

    Company(){
        companyName = "SixSeven";
        yearCreated = 1967;
        industry = "Tech";
        count = 0;
        employees = new Employee[10];
    }

    void addEmployee(Employee e){
        if(count<10){
            employees[count] = e;
            count++;
        }
        else
            System.out.println("Full amount of employees");
    }

    void listAllEmployees(){
        for (int i = 0; i < count; i++) {
            employees[i].printFullInfo();
        }
    }

    int findHighestPaidEmployee(){
        if(count == 0)
            return -1;

        double maxsalary = employees[0].baseSalary;
        int maxindex = 0;
        for (int i = 1; i < count; i++) {
            if(employees[i].baseSalary > maxsalary) {
                maxsalary = employees[i].baseSalary;
                maxindex = i;
            }
        }

        return employees[maxindex].ID;
    }

    void printPromotionEligibleEmployees(){
        for (int i = 0; i < count; i++) {
            if(employees[i].isEligibleForPromotion())
                System.out.println(employees[i].ID);
        }
    }

    void deleteEmployee(int id){
        boolean found  = false;
        for (int i = 0; i < count; i++) {
            if(employees[i].ID == id){
                found = true;
                continue;
            }
            if(found){
                employees[i-1] = employees[i];
            }
        }
        if(found)
            count--;
    }
}
