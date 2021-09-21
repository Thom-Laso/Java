public class fibonacci{
    public static void main(String args[]){
        int prev=0,curr=1,sum=0,Total=0;
        for (int i=0;i<10;i++){
            sum=prev+curr;
            Total+=sum;
            System.out.print(sum+" ");
            prev=curr;
            curr=sum;
        }
    System.out.println("\n The sum of 10 Fibonacci Series: "+Total);
    }
}