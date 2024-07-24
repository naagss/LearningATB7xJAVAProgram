package ex_07072024;
import java.util.Scanner;


public class Lab004_PrintPrime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();


        for(int i=2;i<=N;i++)
        {
            boolean isPrime= true;
           //System.out.println("Hi");
            for(int j=2;j<i;j++) {
                if (i%j == 0) {
                     isPrime = false;
                    break;
                }


            }
            if(isPrime)
                System.out.println(i);


        }
    }
}
