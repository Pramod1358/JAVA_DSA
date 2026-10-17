package Algorithms.Two_pointer_and_Sliding_Window;

public class ConstantWindow {
     // fixed size
    public static void main(String[] args) {
        int a[] = {1 , 2 , 3 , 4 , 5 , -6};
        int k=4,l=0,r=k-1;
        int sum =0;
        if(a.length >= k){
            for(int i=0;i<k;i++){
                sum+=a[i];
            }
        }
        int maxsum = sum;
        while(r < a.length -1){
            sum = sum - a[l];
            l++;
            r++;
            sum = sum + a[r];
            maxsum = Math.max(maxsum, sum);
        }
        System.out.println(maxsum);
        
    }   
}
