package com.rudra.Threads;

class Z implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("hii");
            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class Y implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("hello");
            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class Demo2 {
    public static void main(String[] args) {
        Runnable obj1=new Z();
        Runnable obj2=new Y();

        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);

        t1.start();

        t2.start();

    }
}
