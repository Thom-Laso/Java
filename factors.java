import java.util.*;
public class factors{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] f=new int[20];
        System.out.println("Enter a Number");
        int num=sc.nextInt();
        
         System.out.println("The Factors of "+num+" are:");
        for(int i=1;i<num;i++){
            if(num%i==0){
                 System.out.print(i+" ");
            }   
        }
    }
}
