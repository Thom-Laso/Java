import java.util.*;

public class Armstrong {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num, n, remainder, result = 0;
        System.out.println("Enter a Number");
        num=sc.nextInt();
        n = num;

        while (n != 0)
        {
            remainder = n % 10;
            result += Math.pow(remainder, 3);
            n /= 10;
        }

        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}