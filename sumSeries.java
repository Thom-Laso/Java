public class sumSeries{
    public static void main(String args[]){
        int a=2,sum=0;
        for(int i=1; i<=10;i++){
            sum+=i*a;
        }
        System.out.println("The Sum: "+ sum);
    }
}