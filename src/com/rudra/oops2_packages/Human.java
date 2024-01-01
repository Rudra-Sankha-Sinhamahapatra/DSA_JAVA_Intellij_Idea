package com.rudra.oops2_packages;

public class Human {



        int age;
        String name;
        int salary;
        boolean married;
        static long population;

         static void message(){
                 System.out.println("Hello world!");
//                 System.out.println(this.age);
             //non static properties cant be used in a static function
         }
    public Human( int age, String name,int salary, boolean married){
            this.age = age;
            this.name = name;
            this.salary = salary;
            this.married = married;
            Human.population+=1;

//            Human.message();
        }



}
