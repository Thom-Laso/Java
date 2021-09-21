import java.util.Scanner;
public class temperature {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        float c,f;
        System.out.print("Enter the Temperature in Celcius: ");
        c=sc.nextFloat();
        sc.close();
        f=9*c/5+32;
        System.out.print("Converted Temperature in Farenheit is: "+ f);
    }
}
