import java.util.*;

class Factorial{
    int fact(int n){
        int result;
        if(n==1)
            return 1;
        else
            result=fact(n-1)*n;
            return result;
    }
}

class p2Factorial{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int f=sc.nextInt();
        Factorial ob=new Factorial();
        if(f<=0)
            System.out.println("Enter a Positive Number");
        else
            System.out.println("The Factorial of a number is: "+ob.fact(f));
    }
}