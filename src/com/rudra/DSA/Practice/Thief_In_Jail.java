package com.rudra.DSA.Practice;

public class Thief_In_Jail {
    public static void main(String[] args) {
        int heights[] = {11, 10, 9, 9};
        int x = 10, y = 1;
        int totalJumps = 0;

        for (int i = 0; i < heights.length; i++) {
            int height = heights[i];
            int jump = 0;

            while (height > 0) {
                jump++;
                height -= x;

                if (height > 0) {
                    height += y;
                }
            }

            totalJumps += jump;
            System.out.println("Wall " + (i+1) + ": " + jump + " jumps");
        }

        System.out.println("Total jumps required: " + totalJumps);
    }
}
