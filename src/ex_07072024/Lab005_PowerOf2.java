package ex_07072024;

import java.util.Scanner;

public class Lab005_PowerOf2 {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        boolean flag=true;
        while(N!=1)
        {
            if(N%2!=0) {
                flag = false;
                break;
            }
            N=N/2;
        }

        if(flag)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
