package ex_07072024;

import java.util.Scanner;

public class Lab009_TrianglePattern {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();

        int num_stars=1;



            for (int row = 1; row <= N; row++) {

                for(int sp=(N-row);sp>=1;sp--)
                    System.out.print(" ");



                for (int st = 1; st <= num_stars; st++)
                    System.out.print("*");
                System.out.println("");
                num_stars += 2;
            }

        }

    }

