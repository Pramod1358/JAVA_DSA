import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int arr [] = {1 , 1 ,2 , 3, 1};

        for(int n : arr){
            if(map.containsKey(n)){
                map.put(n , (map.get(n)+1));
            }
            else{
                map.put(n , 1);
            }
        }
        
        //  for( Map.Entry<Integer , Integer> e : map.entrySet() ){
        //     if(e.getValue() > arr.length/3){
        //         System.out.println(e.getKey());
        //     } 
        //  }

        for(int n : map.keySet()){
            if(map.get(n) > arr.length/3){
                System.out.println(n);
            }
        }
    }
}
