import java.util.Scanner;

public class discount {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        float cost, costN;
        System.out.println("What is the total cost that you have to pay?");
        cost = sc.nextFloat();
        sc.close();
        ;
        if (cost <= 2000) {
            double five_dis = cost * 0.05;
            double Tc = cost - five_dis;
            System.out.println("Your discount is 5% and you have to pay " + Tc);
            System.out.println("You saved " + five_dis);
        } else if (cost >= 2001 & cost <= 5000) {
            double tnty_dis = cost * 0.25;
            double Tc = cost - tnty_dis;
            System.out.println("Your discount is 25% and you have to pay " + Tc);
            System.out.println("You saved " + tnty_dis);
        } else if (cost >= 5001 & cost <= 10000) {
            double trty_dis = cost * 0.35;
            double Tc = cost - trty_dis;
            System.out.println("Your discount is 35% and you have to pay " + Tc);
            System.out.println("You saved " + trty_dis);
        } else {
            double fvty_dis = cost * 0.50;
            double Tc = cost - fvty_dis;
            System.out.println("Your discount is 50% and you have to pay " + Tc);
            System.out.println("You saved " + fvty_dis);
        }

    }
}
