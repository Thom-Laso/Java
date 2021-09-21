import java.util.Iterator;
import java.util.Scanner;

public class area_diagonal_Sqaure {
    public static void main(String arg[]) {
        int num, area;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of a square: ");
        num = sc.nextInt();
        sc.close();
        area = num * num;
        System.out.println("Area of a Square is : " + area);
        double diag = Math.sqrt(2) * num;
        System.out.println("Diagonal of a Square is : " + diag);
    }
}
