package ex_07072024;
import java.util.Scanner;
import java.math.MathContext;

public class Lab006_HCF0f2Num {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int N1= sc.nextInt();
        int N2= sc.nextInt();
        int hcf=1;

        if(N1==0)
            hcf=N2;
        else
            hcf=N1;

        if(N1!=0&&N2!=0) {
            for (int i = 1; i <= Math.min(N1, N2); i++) {
                if (N1 % i == 0 && N2 % i == 0)
                    hcf = i;
            }
        }
        System.out.println(hcf);

    }



}
