package com.rudra.Practice;

public class TextManipulator {
    public static void main(String[] args) {
        String s1="er";
        String s2="ey";

        String s3=s1.concat(s2);
        System.out.println(s3);

        System.out.println(s2.replace('y','w'));

        StringBuffer sf=new StringBuffer(s1);
        System.out.println(sf.reverse());

        if(Character.isUpperCase(s1.charAt(0))){
           System.out.println(s1.toLowerCase());
        }

        else if(Character.isLowerCase(s1.charAt(0))){
            System.out.println(s1.toUpperCase());
        }

        int num=343;
        int or=num;
        int rev=0;
        int sum=0;
        while(or!=0){
            rev=rev*10+or%10;
            or=or/10;
        }
       System.out.println(rev);

        int num2=343;
        int or1=num2;
        while(or1!=0){
            sum+=or1%10;
            or1=or1/10;
        }

        System.out.println(sum);

        int or2;
        int num3=3456;
        int count=0;
        or2=num3;

        while (or2!=0){
            count+=1;
            or2=or2/10;
        }

        System.out.println(count);


        String s4="evey";
        StringBuffer sbr1=new StringBuffer(s4);
        if(sbr1.reverse().toString().equals(s4)){
           System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

        System.out.println(s4.replace('e','i'));
        String s="Hdu djo djwi dwo djidj djwijw dijdwi";
        System.out.println(s.replaceAll("\\s",""));

    }
}
