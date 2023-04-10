/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MoaathAlrajab
 */
public class Homework09 {

    public static void main(String[] args) {
        // generate first 10 triangle numbers
        int[] triangleNumbers = new int[10];
        for (int i = 1; i <= 10; i++) {
            int triangleNumber = i * (i + 1) / 2;
            triangleNumbers[i - 1] = triangleNumber;
        }

        // print triangle numbers
        System.out.println("Triangle Numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print(triangleNumbers[i] + " ");
        }
        System.out.println();

        // find factors of each triangle number
        for (int i = 0; i < 10; i++) {
            int number = triangleNumbers[i];
            System.out.print("Factors of " + number + ": ");
            for (int j = 1; j <= number; j++) {
                if (number % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
        int numDivisors = 0;
        int triangleNumber = 0;
        int i = 1;
        while (numDivisors <= 100) {
            triangleNumber += i;
            numDivisors = countDivisors(triangleNumber);
            i++;
        }
        System.out.println("The first triangle number to have over one hundred divisors is " + triangleNumber);
    }

    private static int countDivisors(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                count += 2;
            }
        }
        if (Math.sqrt(n) * Math.sqrt(n) == n) {
            count--;
        }
        return count;
    }
}
