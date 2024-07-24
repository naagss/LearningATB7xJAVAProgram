package ex_07072024;
import java.util.Scanner;


public class Lab003_isPrime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        boolean isPrime=true;

        for(int i=2;i<N-1;i++)
        {
            if(N%i==0)
            {
                isPrime = false;
                System.out.println("Not a Prime number");
                break;

            }
            else
            {
                System.out.println("Prime number");
                break;
            }
        }
    }
}
