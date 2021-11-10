class Callme{
    void call(String msg){//if we put synchronized here ie., synchronized void call String msg){... is known as "Synchronized method"
        System.out.print("["+msg);
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable{
    String msg;
    Callme target;
    Thread t;
    public Caller(Callme targ, String s){
        target=targ;
        msg=s;
        t=new Thread(this);
        t.start();
    }

    public void run(){
        synchronized(target){//if we put synchronized here is known as "Synchronized block/statement"
            target.call(msg);
        }
    }
}
class Synch{
    public static void main(String args[]){
        Callme target=new Callme();
        Caller ob1=new Caller(target, "Laso");
        Caller ob2=new Caller(target, "Store");
        Caller ob3=new Caller(target, "Seiborlang");

        try{
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
    }
}
