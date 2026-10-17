package Algorithms.Two_pointer_and_Sliding_Window;
public class MaxPointsL2 {
    public static void main(String[] args) {
        int arr[]={6 , 2 , 3 ,4 , 7 , 2 , 1 , 7 , 1};
        int k=4,n=arr.length;
        int right_sum=0,left_sum =0;
        int ri=n-1;
        int li=k-1;
        for(int i=0;i<=k-1;i++){
            left_sum+=arr[i];
        }
        
        int max=left_sum;
        
        for(int i=k-1;i>=0;i--){
            left_sum-=arr[li];
            li--;
            right_sum+=arr[ri];
            ri--;
            max=Math.max(max, left_sum+right_sum);
        }
        System.out.println(max);
    }
}
