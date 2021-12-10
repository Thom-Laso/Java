class Profit_Loss{
    int cp;
    int sp;
    Profit_Loss(){
        cp=0;
        sp=0;
    }

    void input(int m, int n){
        cp=m;
        sp=n;
    }

    void display(){
        int pp,lp;
        if (sp>cp){
            pp=(sp-cp)/cp*100;
            System.out.println("Profit is: "+pp);
        }else
        {
            lp=(cp-sp)/cp*100;
            System.out.println("Loss is: "+lp);
        }
    }
}

class p2Profit{
    public static void main(String args[]){
        Profit_Loss ob= new Profit_Loss();
        ob.cp=89;
        ob.sp=376;
        ob.display();
       }
    }