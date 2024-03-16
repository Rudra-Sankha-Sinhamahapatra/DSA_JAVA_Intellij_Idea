package com.rudra.oops_lab.Lab6;

import java.util.*;
import java.lang.*;

/*
Aim
of the program -Write a program to perform following
operations on user entered strings and a character –

i)Change the case of the string
ii)Reverse the string
iii)Compare two strings
iv)Insert one string into another string
v)Convert the string to upper case and lowercase
vi)Check whether the character is present in the string and at which position
vii)Check whether the string is palindrome or not.
viii) Check the number of word, vowel and consonant in the string

Input:  Enter a String : amit
Output: The string after changing the case is AMIT
The string after reversing is  tima

Input: Enter the second string for comparision : kumar
Output: The difference between ASCII value is 10

Input: Enter the string to be inserted into first string : thakur
Output: The string after insertion is : amit thakur


 Input:    Enter a String : Amit
Output: Uppercase: AMIT
Lowercase:amit
Input: Enter a String :Amitkumar
Enter a character : m

Output:
Position of entered character: 2
Input: Enter a String : Amitkumar

Enter a character : Y
Output: Entered character is not present

Input: Enter a String :  madam
Output: Entered string is palindrome

Input: Enter a String : muscle
Output: Entered string is not a palindrome

Input: Enter a String :Ram is going to school
Output: No. of words: 5

No. of vowels: 7
No. of consonants: 11
 */
public class Program2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String");
        String s1=scanner.nextLine();
        StringBuffer sbr=new StringBuffer(s1);
        String Changecase="";
        for(char c: s1.toCharArray()) {
            if(Character.isUpperCase(c)){
                Changecase+=Character.toLowerCase(c);
            }
            else{
                Changecase+=Character.toUpperCase(c);
            }
        }
        System.out.println("The String after changing it's case is "+Changecase);
        System.out.println("The String after reversing "+sbr.reverse());

        System.out.println("Enter the second string for comparison");
        String s2=scanner.nextLine();

        System.out.println("The difference between the ASCII value is:"+s1.compareTo(s2));

        System.out.println("Enter the string to be inserted into first string");
        String s3=scanner.nextLine();

        System.out.println("The string after insertion is :"+s1.concat(s3));

        System.out.println("Enter a string");
        String s4=scanner.nextLine();

        System.out.println("Uppercase:"+s4.toUpperCase()+"\n Lowercase:"+s4.toLowerCase());

        int i=0;

            System.out.println("Enter a string");
            String s5 = scanner.nextLine();
            System.out.println("Enter a character");
            char c1 = scanner.next().charAt(0);
            int position = s5.indexOf(c1);
            if (position < 0) {
                System.out.println("Character dosen't exist in the string");
            } else {
                System.out.println("Character present at index:" + position);
            }

            scanner.nextLine();
            System.out.println("Enter a String:");
            String s6=scanner.nextLine();
            StringBuffer sbr3 = new StringBuffer(s6);
            String rev_s6 = sbr3.reverse().toString();

            if (s6.compareTo(rev_s6) == 0) {
                System.out.println("The String is Palindrome");
            } else {
                System.out.println("The String is not Palindrome");

            }


        System.out.print("Enter a String : ");
        String str7 = scanner.nextLine();

        System.out.println("No. of words : " + str7.split(" ").length);

        int vowelCount = 0, consonantCount = 0;
        for (char c : str7.toLowerCase().toCharArray()) {
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("No. of vowels : " + vowelCount);
        System.out.println("No. of consonants : " + consonantCount);


    }
}
