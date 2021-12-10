import java.util.*;
class Multiply{
    void mul(int i, int j){
        int a=i;
        int b=j;
        int c=a*b;
        System.out.println("The Product of two numbers are: "+c);
    }
}

class p2Multiply{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        Multiply ob=new Multiply();
        ob.mul(x, y);
    }
}