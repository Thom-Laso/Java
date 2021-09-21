public class primeOneToHundred{
    public static void main(String args[]){
        int num;
        String pN="";

        for (int i=1; i<=100; i++){
            int p=0;
            //if(i==0||i==1){
            //   // System.out.println(num+" is not a Prime Number");
            //   continue;
            //}
            for(num=i;num>=1;num--){
                if(i%num==0){
                    p=p+1;
                //System.out.println(num+" is not a Prime Number");        
               // flag=1;
               // continue;
                }
            }
            if(p==2){
                pN=pN+i+" ";
                //System.out.println(num+" is a Prime Number");

            }
        }
        System.out.println(pN);
    }
        
}