package ex_07072024;

import java.util.Scanner;

public class Lab008_RhombusPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {

            for(int k =1; k<=(i-1);k++)
                System.out.print(" ");

            for (int j = 1; j <=n; j++) {

                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
}