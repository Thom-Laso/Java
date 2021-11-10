class Box{
    double h;
    double w;
    double d;

    Box(double height, double width, double depth){
        h=height;
        w=width;
        d=depth;
    }

    double volume(){
        return h*w*d;
        //System.out.println("Volume of Box: "+v);
    }
}

class p2Box{
    public static void main(String args[]){
        Box mybox1=new Box(10,20,30);
        Box mybox2=new Box(20,30,40);
        //double vol=mybox1.volume();
        System.out.println("Volume is: "+mybox1.volume());
        System.out.println("Volume is: "+mybox2.volume());
    }
}