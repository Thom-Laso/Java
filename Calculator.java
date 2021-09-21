class Operation{
    int a, b;
    float z;

    void displaySum(int a, int b){
        int sum=a+b;
        System.out.println("value of a in Operation"+a);
        System.out.println("value of b in operation"+b);
        System.out.println(sum);
    }
}

class Calculator{
    public static void main(String args[]){
        Operation obj1=new Operation();
        Operation obj2=new Operation();
        obj1.displaySum(3,5);
        obj2.displaySum(10,10);
        obj1.a=9;
        obj1.b=1;
        obj1.z=6.98f;
        obj2.a=30;
        obj2.b=50;
        obj2.z=45.23f;
        int total;
        total=obj1.a + obj1.b;
        System.out.println("Instance value of a for object 1 are: " +obj1.a);
        System.out.println("Instance value of b for object 1 are: " +obj1.b);
        System.out.println("Instance value of z for object 1 are: " +obj1.z);
        System.out.println("Total of obj1.a and obj1.b: " +total);

        total=obj1.a+obj2.a;
        System.out.println("Total value of object 1 and object 2  of a: " +total);
    }
}