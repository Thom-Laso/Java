class thread1 extends Thread{
    public void run(){
        for(int i=0; i<5;i++){
            System.out.println("Thread 1:"+ i);
        }
    }
}
class thread2 extends Thread{
    public void run(){
        for(int i=0; i<5;i++){
            System.out.println("Thread 2:"+ i);
        }
    }
}

class ThreadExtends{
    public static void main(String args[]){
        thread1 t1=new thread1();
        thread2 t2=new thread2();
        t1.start();// in extends object can call the start directly without creating a Thread object
        t2.start();
    }
}