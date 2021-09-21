public class expression {
    public static void main(String arg[]){
        int a=10,b=5,c=2;
        float avg1,avg2;
        avg1=(a+b)*(a+b)/(a*b);
        System.out.println("(a) (a+b)(a+b)/ab: "+ avg1);
        avg2=((a*b)+(b*c)+(c*a))/(a+b+c);
        System.out.println("(b) ((a*b)+(b*c)+(c*a))/(a+b+c): "+ avg2);

    }
}
