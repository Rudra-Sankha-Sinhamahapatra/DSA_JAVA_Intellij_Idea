package com.rudra.oops5_interfaces.Abstract_demo;

public class Main {
    public static void main(String[] args) {
        Son son=new Son(30);
//        son.career();
//        Parent parent=new Parent() ;

        Parent daughter2=new Daughter(35);
//        daughter2.career();

        Daughter daughter=new Daughter(27);
//        daughter.career();
//        Parent.hello();
//        son.normal();
        Parent dad  = new Parent(32) {
            @Override
            void career() {

            }

            @Override
            void partner() {

            }

        };
    }
}
