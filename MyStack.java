import java.util.*;
class MyStack {
    static void showpush(Stack st, int a){
        st.push(a);
        System.out.println("Push(" + a + ")");
        System.out.println("Stack: "+ st);
    }

    static void showpop(Stack st){
        System.out.print("pop -> ");
        Integer a = st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
    }

    public static void main(String args[]){
        Stack st=new Stack();

        System.out.println("Stack: "+ st);
        showpush(st, 42);
        showpush(st, 66);
        showpush(st, 99);
        showpop(st);
        showpop(st);
        showpop(st);

        try{
            showpop(st);
        }catch (EmptyStackException e){
            System.out.println("Empty Stack");
        }
    }
}
        