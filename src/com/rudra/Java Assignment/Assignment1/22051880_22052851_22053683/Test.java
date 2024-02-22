/*
    Roll No.        Name                        Section
    22051880        Rudra Sankha Sinhamahapatra CSE-21
    22052851        Sayak Gain                  CSE-21
    22053683        Dhruv Kumar                 CSE-21
 */

import java.lang.*;


// Task - 1
class myBinaryNumber {
    String bNum; // Binary number string

    // This initializes an all 0’s n-bit binary number.
    myBinaryNumber(int n) {
        this.bNum = new String(new char[n]).replace('\0', '0');
    }

    // This initializes a binary number represented by the string S.
    myBinaryNumber(String S) {
        this.bNum = S;
    }

    // This returns the size of the binary number.
    public int getSize() {
        return this.bNum.length();
    }

    // This returns the bit at position p from the least significant bit (LSB) side.
    public char getBit(int p) {
        return this.bNum.charAt(this.getSize() - p - 1);
    }

    // This method sets the bit at position p (from LSB side) as b.
    public void setBit(int p, int b) {
        try {
            if (p < 0 || p >= this.getSize() || (b != 0 && b != 1)) {
                throw new Exception("Invalid I/P");
            }

            char[] bNumArray = this.bNum.toCharArray();
            bNumArray[this.getSize() - p - 1] = (char) (b + '0');

            this.bNum = new String(bNumArray);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // This prints the binary number.
    public void printNumber() {
        System.out.println(this.bNum);
    }

    // This prints the decimal equivalent of the binary number.
    public void printDecimalNumber() {
        int decimalNumber = Integer.parseInt(this.bNum, 2);
        System.out.println(decimalNumber);
    }

}


// Task - 2
class binaryOperations {
    myBinaryNumber binaryAddition(myBinaryNumber a, myBinaryNumber b) {
        String sum = "";
        int bitA, bitB, sumofBits, carry = 0;

        // Ensuring that both binary numbers are of the same length
        while (a.getSize() < b.getSize()) {
            a = new myBinaryNumber("0" + a.bNum);
        }

        while (a.getSize() > b.getSize()) {
            b = new myBinaryNumber("0" + b.bNum);
        }

        // Binary addition operation
        for (int i = 0; i <= a.getSize() - 1; i++) {
            bitA = Character.getNumericValue(a.getBit(i));
            bitB = Character.getNumericValue(b.getBit(i));

            sumofBits = bitA + bitB + carry;

            sum = (sumofBits % 2) + sum;
            carry = sumofBits / 2;
        }

        if (carry != 0) {
            sum = carry + sum;
        }

        myBinaryNumber result = new myBinaryNumber(sum);
        return result;
    }
}


class Test {
    public static void main(String[] args) {
        myBinaryNumber num1 = new myBinaryNumber("1010");
        myBinaryNumber num2 = new myBinaryNumber("1111111");

        // Testing the printNumber() method
        System.out.print("Binary number 1 = ");
        num1.printNumber();
        System.out.print("Binary number 2 = ");
        num2.printNumber();

        // Testing the printDecimalNumber() method
        System.out.print("Decimal equivalent of binary number 1 = ");
        num1.printDecimalNumber();
        System.out.print("Decimal equivalent of binary number 2 = ");
        num2.printDecimalNumber();


        binaryOperations operations = new binaryOperations();

        // Testing the binaryAddition() method
        myBinaryNumber sum = operations.binaryAddition(num1, num2);

        System.out.print("Sum = ");
        sum.printNumber();

        System.out.print("Decimal equivalent of the sum = ");
        sum.printDecimalNumber();
    }
}

