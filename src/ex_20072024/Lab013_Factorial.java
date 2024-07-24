package ex_20072024;

import java.util.Scanner;

public class Lab013_Factorial {
    public static void main(String[] args) {
        System.out.println("Enter N");
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int fact=1;

        for(int i=1;i<=N;i++){

            fact*=i;

        }

        System.out.println("Factorial of N: " +fact);

    }
}
