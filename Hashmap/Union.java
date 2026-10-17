import java.util.*;


public class Union {
    public static int Unionsize(int arr1[], int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        for(int n : arr1){
            set.add(n);
        }
        for(int n: arr2){
            set.add(n);
        }

        return set.size();
    }
    public static void main(String[] args) {
        int arr1[] = {1 , 2 ,3 };
        int arr2[] = {4 , 5 , 6};
        int size = Unionsize(arr1 , arr2);
        System.out.print(size);
    }
}
