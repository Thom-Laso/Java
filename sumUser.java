import java.util.*;

public class sumUser{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int i,num,sum=0;
        for(i=1;i<=10;i++){
        System.out.println("Enter the "+i+" number");
        num=sc.nextInt();
        sum+=num;
        }
        System.out.println("The Sum of 10 Natural Numbers = "+ sum);
    }

}