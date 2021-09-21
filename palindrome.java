import java.util.*;

public class palindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num,num2,sum=0;
        System.out.println("Enter any Number");
        num=sc.nextInt();
        num2=num;
        while(num>0){
            int r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if(num2==sum)
            System.out.println(num2+" is a Palindrome");
        else
            System.out.println(num2+" is not a Palindrome");
    }
}
