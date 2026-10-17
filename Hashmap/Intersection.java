import java.util.*;

public class Intersection {

    public static int size(int arr1[] , int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        for(int n : arr1){
            set.add(n);
        }
        int count =0;
        for(int n : arr2){
            if(set.contains(n)){
                count++;
                set.remove(n);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr1[] = {1 , 2 , 3};
        int arr2[]= {4 , 5 , 6 , 1};
        int n = size(arr1, arr2);
        System.out.println(n);
    }
}
