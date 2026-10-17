package WTN;
import java.util.*;
public class even_vs_odd_digit{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int a[]=new int[4];
        for(int i=0;i<4;i++){
            a[i]=sc.nextInt();
        }
        int ip=a[3];
        int even=0,odd=0;
        for(int i=0;i<4;i++){
            while(a[i]>0){
                int dup=a[i]%10;
                if(dup % 2 ==0){
                    even=even+dup;
                }
                else{
                    odd=odd+dup;
                }
                a[i]/=10;
            }
        }
        if(ip % 2== 0){
            System.out.print(even-odd);
        }
        else{
            System.out.print(odd-even);
        }
    }
}