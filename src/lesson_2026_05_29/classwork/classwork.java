package lesson_2026_05_29.classwork;


public class classwork {

    public static void main(String[] args){
        Person p = new Person("Michael", "Madoyan", 16);

        System.out.println(p);

        int d,a;

        try{
            d = 0;
            a = 42/d;
            System.out.println("This will not be printed");
        }
        catch(Exception e){
            System.out.println("Division by zero");
        }

        System.out.println("After catch statement");


        try {
            a = args.length;
            System.out.println("a = " + a);
            int b = 42/a;
            int[] c = {1};
            c[42] = 99;
        }
        catch(ArithmeticException e){
            System.out.println("Divide by 0: " + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index oob: " + e);
        }
        System.out.println("After try/catch blocks.");



    }
}
