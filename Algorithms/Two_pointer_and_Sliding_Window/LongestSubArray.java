package Algorithms.Two_pointer_and_Sliding_Window;

public class LongestSubArray {
    public static void main(String[] args) {
        int a[] = {1 , 5 , 6 , 7 , 8};
        int k=15;
        int l=0,r=0;
        int sum=0,maxlength=0,length =0;
        while(r < a.length){
            sum = a[r]+sum;
            while(sum > k){
                sum = sum - a[l];
                l++;
            }
            if(sum <= k){
                maxlength = Math.max(maxlength, r-l+1);
            }
            r++;

        }
        System.out.println(maxlength);
    }
}
