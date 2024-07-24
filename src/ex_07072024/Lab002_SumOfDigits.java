package ex_07072024;
import java.util.Scanner;

public class Lab002_SumOfDigits {
    public static void main(String[] args) {

        System.out.println("Enter the target count");
        Scanner sc = new Scanner(System.in);
        int target_count= sc.nextInt();

        System.out.println("Enter the target sum of digit to be used");
        int target_sum= sc.nextInt();

        int  cur_num=1, count =0;


        while(count<target_count)
        {
           int cur_sum=0;
            for (int num=cur_num;num>0;num/=10)
                cur_sum+=(num%10);
            if(cur_sum==target_sum)
                {
                    System.out.println(cur_num);
                    count++;
                }

            cur_num++;

        }
    }
}
