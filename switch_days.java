import java.util.Scanner;

public class switch_days {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter any number from 1 to 7");
        num = sc.nextInt();
        sc.close();
        switch (num) {
            case 1:
                System.out.println("1. is Monday");
                break;
            case 2:
                System.out.println("2. is Tuesday");
                break;
            case 3:
                System.out.println("3. is Wednesday");
                break;
            case 4:
                System.out.println("4. is Thursday");
                break;
            case 5:
                System.out.println("5. is Friday");
                break;
            case 6:
                System.out.println("6. is Saturday");
                break;
            case 7:
                System.out.println("7. is Sunday");
                break;
            default:
                System.out.println("Invalid Day 😂");

        }
    }
}
