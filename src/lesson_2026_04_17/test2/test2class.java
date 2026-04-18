package lesson_2026_04_17.test2;

import lesson_2026_04_17.test1.A1;

class B1 extends A1{
    B1(){
        System.out.println(this.z);
        System.out.println(this.w);
    }
}

public class test2class {
    public static void main(String[] args){
        A1 a1 = new A1();

        System.out.println(a1.w);

        B1 b1 = new B1();

    }
}
