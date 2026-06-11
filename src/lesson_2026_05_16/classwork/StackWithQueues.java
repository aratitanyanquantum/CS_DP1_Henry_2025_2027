package lesson_2026_05_16.classwork;

import java.util.PriorityQueue;

class Stack{
    java.util.Queue queue1;
    java.util.Queue queue2;


    Stack(int size){
        queue1= new PriorityQueue<>();;
        queue2= new PriorityQueue<>();
    }




    public void push(int x){
        queue1.add(x);
    }

    public int pop(){
        int x=0;
        while(!queue1.isEmpty()){
            queue2.add(queue1.remove());
            x++;
        }
        for(int i=0; i<x-1;i++){
            queue1.add(queue2.remove());
        }
        return (int) queue2.remove();
    }


}

public class StackWithQueues {
    public static void main(String[] args) {
        Stack s1=new Stack(5);

        s1.push(4);
        s1.push(16);
        s1.push(32);
        s1.push(64);
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());

    }

}

