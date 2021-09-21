import java.util.Scanner;
public class sum_avg {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        long sum;
        float avg;
        System.out.println("Enter the First Number");
        a=sc.nextInt();
        System.out.println("Enter the Second Number");
        b=sc.nextInt();
        System.out.println("Enter the Third Number");
        c=sc.nextInt();
        sc.close();
        sum=a+b+c;   
        System.out.println("Sum = "+ sum);
        avg=sum/3;
        System.out.println("Average = "+ avg);     
    }
       
}
