package Algorithms.Two_pointer_and_Sliding_Window;
import java.util.*;
public class FruitIntoBaskets {
    public static void main(String[] args) {
        int arr[] = {3 ,3 , 3 , 1, 2 ,1 , 1, 2 , 3, 3 , 4};
        HashMap<Integer , Integer> map = new HashMap<>();
        int ri=0,li=0,max_length=0,n=arr.length;
        while (ri < n) {
            
                map.put( arr[ri], (map.getOrDefault(arr[ri],0)+1));
                ri++;
            
                while(map.size() > 2)
                {
                    map.put( arr[li], (map.getOrDefault(arr[li],0)-1));
                
                if(map.get(arr[li]) == 0){
                    map.remove(arr[li]);
                }
                  li++;
                
            }
            max_length = Math.max(max_length, ri - li);
        }
        System.out.println(max_length);
    }
}
