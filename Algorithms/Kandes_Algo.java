package Algorithms;

public class Kandes_Algo {
    public static void main(String []  args){
        // to find the maximum sub array sum in an array

        int arr[] = {-2 , 1 , -3 , 4 , -1 , 2 , 1 , -5 , 4};
        int max_sum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            max_sum = Math.max(max_sum, sum);
            if(sum < 0){
                sum = 0;
            }
            
        }
        System.out.println(max_sum);
    }
}
