class Scope{
    public static void main(String arg[]){
        int x=5;
        {
            int y=10;
            x++;
            System.out.println("x = "+x+" y= "+y);
        }
        y--;
        System.out.println(" x = "+x);
        System.out.println(" y = "+y);
    }
}