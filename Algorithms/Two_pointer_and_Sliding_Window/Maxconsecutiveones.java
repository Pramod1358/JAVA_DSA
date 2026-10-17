package Algorithms.Two_pointer_and_Sliding_Window;

public class Maxconsecutiveones {
    public static void main(String[] args) {
        int arr[] = {1 , 1 , 1 , 0 , 0 , 1, 1, 1, 1 , 0};
        int li=0,ri=0,n=arr.length,max_length = 0,zero=0,k=2;
        while(ri < n){
            if(arr[ri] !=0){
                ri++;
            }
            else{
                zero++;
                ri++;
                    while(zero > k){
                        if(arr[li] == 0) zero--;
                        li++;
                    }
                
            }
            max_length=Math.max(max_length, ri-li);
        }
        System.out.println(max_length);
    }
}
