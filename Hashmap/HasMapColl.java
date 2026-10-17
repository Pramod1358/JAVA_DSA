import java.util.*;
public class HasMapColl{
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();

        // insertion into map
        map.put("India",120);
        map.put("china", 130);
        map.put("russia",123);
        System.out.println(map);

        // search in hash map
        if(map.containsKey("china")){
            System.out.println("Present");
        } else{
            System.out.println("Not present");
        }

        //iteration very imp
         for( Map.Entry<String , Integer> e : map.entrySet() ){
             System.out.println(e.getKey()+ " "+e.getValue());
        }

        //for only one set
        Set<String> keys =  map.keySet();
        for(String key : keys){
            System.out.println(key+ " " + map.get(key));

        }
        
        // for removing
        map.remove("china");

        System.out.println(map);
        
    }
}