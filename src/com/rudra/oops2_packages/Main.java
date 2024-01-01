package com.rudra.oops2_packages;

public class Main {
    public static void main(String[] args) {
        Human rudra=new Human(20,"Rudra",10000,false);
        Human rahul=new Human(34,"Rahul",45000,true);

        System.out.println(rudra.name);
        System.out.println(rahul.salary);
        System.out.println(Human.population);
        System.out.println(Human.population);

        Main fun=new Main();
        fun.fun2();
//        greeting();
    }

    static  void fun(){
//        greeting(); //you cant use it because it requires an instance but the function
        //you are using it in does not depend on instances

        //you cannot access non static stuff without referencing their instances in a static
        //context,hence i am referencing it
        Main obj=new Main();
        obj.greeting();
    }

    void fun2(){
        greeting();
    }
    //we know that something that is not static ,belongs to an object
   void greeting(){
//        fun();
        System.out.println("Hello world!");
    }
}
