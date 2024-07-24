package ex_20072024;

import java.util.Scanner;

public class Lab011_ClasifyTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lenght of 3 sides");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if(side1 == side2 && side2 == side3)
        {
            System.out.println("Equilateral");
        }
        //else if(side1!=side2 || side2!=side3)

    }
}
