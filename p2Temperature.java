import java.util.*;
class Temperature{
    double max;
    double min;
    double maxF, minF;
    Temperature(double mn,double mx){
        max=mx;
        min=mn;
    }

    void compute(){
        maxF=(max*9/5)+32;
        minF=(min*9/5)+32;
    }

    void display(){
        System.out.println("The minimum temperature in Fahrenheit: "+minF);
        System.out.println("The maximum temperature in Fahrenheit: "+maxF);
    }
}


class p2Temperature{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a minimum temperature in Celsius: ");
        double n= sc.nextDouble();
        System.out.print("Enter a maximum temperature in Celsius: ");
        double x= sc.nextDouble();
        Temperature obj=new Temperature(n,x);
        obj.compute();
        obj.display();
    }
}