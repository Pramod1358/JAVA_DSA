package Algorithms.Two_pointer_and_Sliding_Window;
import java.util.*;
public class Longest_Substring {
    public static void main(String[] args) {
        String  a = "cadbzabcd";
        HashMap<Character , Integer>  map = new HashMap<>();
        int n=a.length();

        int li=0,ri=0,maxlength=0;
        while(ri < n){
            char b = (char)a.charAt(ri);
            if(!map.containsKey(b)){
                map.put(b , ri);
                ri++;
                maxlength = Math.max(maxlength , ri - li );
            }
            else{
                li =  map.get(b)+1;
                map.put(b , ri);
                ri++;
            }
        }
        System.out.print(maxlength);

        }

    }

