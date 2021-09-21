import java.util.Scanner;
public class days {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int d,days=0,nDays=0,nM=0, months,cMonths=0, y,oneYear=365,cYear=0,nd;
        System.out.print("Enter the Number of Days: ");
        d=sc.nextInt();
        sc.close();
        nd=d;//let the input d equal to nYear
        for(y=oneYear; y < d; y=y+oneYear){
            cYear++;//count the number of Years
            nd=nd-oneYear;//decrement by one Year
            nM=nd;
        }
            for(months=30;months<nd;months=months+30){
                cMonths++;
                nM=nM-30;
                days=nM;
            }
            
        System.out.println("The Number of Year is: "+ cYear+"\n");
        
        System.out.println("The Number of Month is: "+ cMonths+"\n");
        
        System.out.println("The Number of Days is: "+ days+"\n");
        }
    }

