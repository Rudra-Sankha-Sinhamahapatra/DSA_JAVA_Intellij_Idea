package com.rudra.oops1_introduction;
// import java.util.*;

public class oops1 {
    public static void main(String[] args) {
        // store 5 roll nos
        // int[]numbers=new int[5];

        // store 5 names
        // String[]names=new String[5];

        // data of 5 students : (roll no,name,marks)
        // int[]rno=new int[5];
        // String[]name=new String[5];
        // float[]marks=new float[5];

        // Student[] students = new Student[5];
        // System.out.println(Arrays.toString(students));
        // returns 5 students null
        //   Student Kunal;
        //   Kunal=new Student();

        Student Rudra = new Student(80,"Rudra Sankha Sinhamahapatra",100);
//        Rudra.rno=24;
//        Rudra.name="Rudra";
//        Rudra.marks=100;
//        Rudra.greeting();
//        Rudra.changeName("Erling Haaland");
//        System.out.println(Rudra);
        System.out.println(Rudra.rno);
        System.out.println(Rudra.name);
        System.out.println(Rudra.marks);

        Student christiano=new Student();
        System.out.println(christiano.rno);
        System.out.println(christiano.name);
        System.out.println(christiano.marks);

        Student random=new Student(Rudra);
        System.out.println(random.rno);
        System.out.println(random.name);
        System.out.println(random.marks);

        Student random1=new Student();
        System.out.println(random1.name);

        Student one= new Student();
        Student two=one;
        one.name="Something";

        System.out.println(two.name);

    }


}
// create a class
// for every single student
class Student {
    int rno;
    String name;
    float marks;

    //we need a way to add the values of the above properties object by object
    //we need one word to access every object

    void greeting(){
        System.out.println("Hello my name is " + this.name);
    }

    void changeName(String newName){
        this.name=newName;
    }

    Student (Student other){
        this.name=other.name;
        this.rno=other.rno;
        this.marks=other.marks;
    }
    Student(){
//        this.rno=7;
//        this.name="Christiano Ronaldo";
//        this.marks=99.5f;

        //this is how you call a constructor from another constructor
        //internally : new Student(7,"Christiano Ronaldo",99.5f);

        this(7,"Christiano Ronaldo",99.5f);
    }
    Student (int rno,String name,float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }
}