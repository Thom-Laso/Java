import java.util.*;

public class sumUserForEach{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int sum=0;
        int[] num=new int[10];

        for(int i=0; i<10;i++){
        System.out.println("Enter the "+i+" number");
        num[i]=sc.nextInt();
        sum+=num[i];
        }

        //display with for-each loop
        System.out.println("The elements are:");
    for (int i: num)
    {
        System.out.print(num[i]+" ");
    }
    
    //sum
    System.out.println("\nThe sum of the array: "+sum);
    float avg=sum/10;
    System.out.println("\nThe average of the array: "+avg);
    }

}