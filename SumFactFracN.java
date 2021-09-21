public class SumFactFracN{
    public static void main(String args[]){
        int fact=1,sum=0,num,frac,n=5;
            for(num=1;num<=n;num++){
                fact*=num;
                frac=1/fact;
                System.out.println("The factorial of "+num+" is "+frac);
                sum+=frac;
            }
          //System.out.println("Sum of the factorial of 1 to 10: "+sum);  
    }
}
