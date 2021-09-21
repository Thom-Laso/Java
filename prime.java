import java.util.*;
public class prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num,num2,flag=0;
        System.out.println("Enter a Number");
        num=sc.nextInt();
        sc.close();
        num2=num;
        if(num==0||num==1){
            System.out.println(num+" is not a Prime Number");
        }
        for(int i=2;i<num2;i++){
            if(num%i==0){
            System.out.println(num+" is not a Prime Number");        
            flag=1;
            break;
            }
        }
        if(flag==0)
        System.out.println(num+" is a Prime Number");
    }
}