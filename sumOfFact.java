public class sumOfFact{
    public static void main(String args[]){
        int fact=1,sum=0,num;
            for(num=1;num<=10;num++){
                fact*=num;
                System.out.println("The factorial of "+num+" is "+fact);
                sum+=fact;
            }
          System.out.println("Sum of the factorial of 1 to 10: "+sum);  
    }
}
