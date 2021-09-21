import java.util.*;
public class GrtSml{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int[] numbers=new int[25];
    int greatest;
    int smallest;

    //Input Elements
    for (int i = 0; i <10; i++)
    {
        System.out.println("Please enter number");
        numbers[i] = input.nextInt();
    }

//Display Elements
    for (int i = 0; i <10; i++)
    {
        System.out.println("The elements at index:"+i+"="+numbers[i]);
    }
        //Greatest Number
        greatest=numbers[0];
        for(int i=0; i<11; i++){
            if(numbers[i] > greatest){
                greatest=numbers[i];
            }
        }
    System.out.println("The Greatest among the Entered Numbers: "+greatest);

        
        //Smallest Number
        smallest=numbers[0];
         for(int i=0; i<10; i++){
            if(numbers[i] < smallest){
                smallest=numbers[i];
            }
        }
    System.out.println("The Smallest among the Entered Numbers: "+smallest);
    }
} 












