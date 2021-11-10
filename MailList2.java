import java.util.*;
class Name{
    private String fname;
    private String lname;

    Name(String fn, String ln){
        fname=fn;
        lname=ln;
    }
    public String toString(){
        return fname+ "."+ lname;
    }   
}

class MailList2{
    public static void main(String args[]){
        LinkedList ml = new LinkedList();//if we replace "LinkedList" with "TreeSet" it cannot print because TreeSet automatically sort the elements.
        ml.add(new Name("James","West"));
        ml.add(new Name("Ralph","Baker"));
        ml.add(new Name("Tom", "Laso"));
        System.out.println(ml);
    }
}