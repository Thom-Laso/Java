import java.util.Scanner;

public class switch_rect {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        Scanner l = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        int num;
        float length, breadth;
        System.out.println("Enter the length of a Rectangle");
        length = l.nextFloat();
        System.out.println("Enter the breadth of a Rectangle");
        breadth = b.nextFloat();
        System.out.println("Enter any one from the following");
        System.out.println("1.Area of a Rectangle");
        System.out.println("2.Perimeter of a Rectangle");
        System.out.println("3.Diagonal of a Rectangle");
        num = sc.nextInt();
        sc.close();
        switch (num) {
            case 1:
                double area = length * breadth;
                System.out.print("Area of a Rectangle = " + area + " sq.units");
                break;
            case 2:
                double peri = 2 * (length + breadth);
                System.out.print("Perimeter of a Rectangle = " + peri + " sq.units");
                break;
            case 3:
                double diag = Math.sqrt((length * length) + (breadth * breadth));
                System.out.print("Perimeter of a Rectangle = " + diag + " sq.units");
                break;
            default:
                System.out.println("Enter Vvalid Number");

        }

    }

}
