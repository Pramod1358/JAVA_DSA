package WTN;
import java.util.*;
class FindKey {
    public static void main(String[] args) {
        int a=3521,b=2452,c=1352;
        int arr1[]={a,b,c};
        int sum1=0;
        int sum2=0;
        int i=2,n=0;
        while(i>=0){
        int lar=-1;
        int small=-1;
            n=0;
           while(arr1[i]!=0){
               n=arr1[i]%10;
               if(lar < n){
                   lar=n;
               }
               if(n!=lar && small < n){
                   small=n;
               }
               arr1[i]=arr1[i]/10;
           }
           sum1=sum1+lar;
           sum2=sum2+small;
           i--;   
        }
        System.out.print(sum1+sum2);
        
    }
}