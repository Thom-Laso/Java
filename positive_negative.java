import java.util.Scanner;

public class positive_negative {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter any number");
        num = sc.nextInt();
        sc.close();
        if (num > 0)
            System.out.println(num + " is a positive number");
        else
            System.out.println(num + " is a negative number");
    }
}
