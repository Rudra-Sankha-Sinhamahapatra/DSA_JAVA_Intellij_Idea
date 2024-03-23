package com.rudra.oops_lab.Lab7;
/*
Aim of the Program: Write a program
to create user defined exceptions called HrsException, MinException and
SecException. Create a class Time which contains data members hours, minutes,
seconds and a method to take a time from user which throws the user defined
exceptions if hours (>24 &<0),minutes(>60
&<0),seconds(>60 &<0).

Input:  Enter hours: 4
Enter minutes: 54
Enter seconds: 34
Output: Correct Time-> 4:54:34
Input:  Enter hours: 30
Enter minutes: 65
Enter seconds: 65
Output: Caught the exception
Exception occurred:  InvalidHourException:hour is not greater than 24
Exception occurred:  InvalidMinuteException:hour is not greater than 60
Exception occurred:  InvalidSecondException:hour is not greater than 60
 */
import java.util.*;

class HrsException extends Exception{
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception{
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception{
    public SecException(String message) {
        super(message);
    }
}

class Time{
    Scanner s=new Scanner(System.in);
    int hours,minutes,seconds;
    void setTime() throws HrsException, MinException,SecException{
        System.out.println("Enter Hours:");
        hours=s.nextInt();
        System.out.println("Enter Minutes:");
        minutes=s.nextInt();
        System.out.println("Enter Seconds:");
        seconds=s.nextInt();
        if(hours>24 || hours<0 || minutes>60 || minutes<0 || seconds>60 || seconds<0) {
            if (hours > 24 || hours < 0) {
                throw new HrsException("Hours should be on a range 0-24");
            }
            if (minutes > 60 || minutes < 0) {

                throw new MinException("Minutes  should be on a range of 0-60");
            }
            if (seconds > 60 || seconds < 0) {
                throw new SecException("Seconds  should be on a range of 0-60");
            }
        }
        else{
            System.out.println("Correct Time->"+hours+":"+minutes+":"+seconds);
        }

    }
}
public class Program4 {
    public static void main(String[] args) throws MinException, SecException, HrsException {
   Time time=new Time();
    time.setTime();
    }
}
