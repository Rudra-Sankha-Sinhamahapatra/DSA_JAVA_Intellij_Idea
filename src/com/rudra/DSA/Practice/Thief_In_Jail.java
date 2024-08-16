package com.rudra.DSA.Practice;

public class Thief_In_Jail {

    static void heightOptimal(){
                int heights[] = {11, 10, 9, 9};
                int x = 10, y = 1;
                int totalJumps = 0;

                for (int i = 0; i < heights.length; i++) {
                    int height = heights[i];
                    int effectiveClimb = x - y;

                    if (height <= x) {
                        // If the thief can jump over the wall in one go
                        totalJumps += 1;
                    } else {
                        // Calculate the number of full effective jumps required
                        int jumps = (height - x + effectiveClimb - 1) / effectiveClimb;
                        // Add one final jump to reach or exceed the top of the wall
                        totalJumps += jumps + 1;
                    }

                    System.out.println("Wall " + (i+1) + ": " + totalJumps + " jumps so far");
                }

                System.out.println("Total jumps required: " + totalJumps);
            }

        static void heightNormal () {
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

    public static void main(String[] args) {
     heightOptimal();
     heightNormal();
    }
}
