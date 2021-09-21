import java.util.*;
public class yesOrno{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char q;
        System.out.print("Enter any number: ");
        int num=sc.nextInt();
        if(num%5==0)
            System.out.println(num+" can be divided by 5");
        else
            System.out.println(num+" cannot be divided by 5");
        do{
            System.out.println("Do you want to continue? (Y/N)");
            q=sc.next().charAt(0);
            if(q=='Y'){
                System.out.print("Enter any number: ");
                num=sc.nextInt();
                if(num%5==0)
                    System.out.println(num+" can be divided by 5");
                else
                    System.out.println(num+" cannot be divided by 5");
                }else
                {
                    break;
                }
            }while(q=='Y');
        
        
    }
}