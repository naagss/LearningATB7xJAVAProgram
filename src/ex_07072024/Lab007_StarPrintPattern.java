package ex_07072024;

import java.util.Scanner;

public class Lab007_StarPrintPattern {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = n;i>=1;i--)
        {
            for(int j=n;j>=1;j--)
            {
                System.out.print("*");

            }

            System.out.print("\n");
        }
    }
}
