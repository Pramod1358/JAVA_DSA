package WTN;

import java.util.Scanner;
import java.util.*;
public class sumofprime {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int primes[]=new int[n];
    int p=0;
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
        int flag=0;
        for(int j=2;j*j<=a[i];j++){
            if(a[i] == 1){
                flag=1;
                break;
            }
            if(a[i] % j == 0){
                flag=1;
                break;
            }
        }
        if(flag == 0){
            primes[p++]=a[i];
        }
     }
     Arrays.sort(primes,0,p);
     for(int i=1;i<p;i++){
        System.out.println(primes[i]);
     }
    }
}
