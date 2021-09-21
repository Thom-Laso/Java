import java.util.Scanner;

public class even_odd {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter any number");
        num = sc.nextInt();
        sc.close();
        if (num % 2 == 0)
            System.out.println(num + " is an even number");
        else
            System.out.println(num + " is an odd number");
    }
}
