class thread1 implements Runnable{
    public void run(){
        for(int i=0; i<5;i++){
            System.out.println("Thread 1:"+ i);
        }
    }
}

class thread2 implements Runnable{
    public void run(){
        for(int j =0; j<5;j++){
            System.out.println("Thread 2:"+ j);
        }
    }
}

class firstThreadImplementsRunnable{
    public static void main(String args[]){
        thread1 t1=new thread1();
        thread2 t2=new thread2();
        Thread objT1=new Thread(t1);// in extends object can call the start directly without creating a Thread object
        Thread objT2=new Thread(t2);
        objT1.start();
        objT2.start();
    }
}