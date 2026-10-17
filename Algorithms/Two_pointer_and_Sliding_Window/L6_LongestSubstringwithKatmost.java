package Algorithms.Two_pointer_and_Sliding_Window;
import java.util.*;
public class L6_LongestSubstringwithKatmost {
    public static void main(String[] args) {
       String b="aaabbccd";
       int k=2,li=0,ri=0,max_length=0;
       HashMap<Character , Integer > map = new HashMap<>();

       while(ri < b.length()){
            map.put(b.charAt(ri), map.getOrDefault(b.charAt(ri) , 0) +1);
            while(map.size() > k){
               map.put(b.charAt(li) ,map.get(b.charAt(li))-1);
               if(map.get(b.charAt(li)) == 0) map.remove(b.charAt(li));
               li++;
            }
            max_length = Math.max(max_length, ri - li+1);
            ri++;

       }
       System.out.println(max_length);
    }
}
