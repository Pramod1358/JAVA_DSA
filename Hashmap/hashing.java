import java.util.*;
public class hashing{
    public static class HashMap<K,V>{
        public class node{
        private K key;
        private V value;
        node(K key,V value){
            this.key=key;
            this.value=value;
        }
        }
        private int n;
        private int N;
        private LinkedList<node> buckets[]; 

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4;
            this.buckets=new LinkedList[N];
            for(int i=0;i<N;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }
        private int HashFunction(K key){
            int bi=key.hashCode();
            return Math.abs(bi) % N;
        }
        private int SearchInLL(K key,int bi){
            LinkedList<node> ll =buckets[bi];
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }
        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<node> ob[] = buckets;
            buckets=new LinkedList[N*2];
            for(int i=0;i<N*2;i++){
            buckets[i]=new LinkedList<>();
        }
        for(int i=0;i<ob.length;i++){
            LinkedList<node> ll= ob[i];
            for(int j=0;j<ll.size();j++){
             node nn=ll.get(j);
             put(nn.key,nn.value);
            }
        }
        }
        
        public void put(K key,V value){
            int bi=HashFunction(key);
            int di=SearchInLL(key,bi);

            if(di ==-1){
                buckets[bi].add(new node(key, value));
                n++;
            }
            else{
                node nn=buckets[bi].get(di);
                nn.value=value;
            }
            double lambda=(double)n/N;
            if(lambda > 2.0){
                rehash();
            }
        }
        public boolean containsKey(K key){
            int bi=HashFunction(key);
            int di=SearchInLL(key,bi);

            if(di ==-1){
                return false;
            }
            else{
                return true;
            }
        }
        public V remove(K key){
            int bi=HashFunction(key);
            int di=SearchInLL(key,bi);

            if(di ==-1){
                return null;
            }
            else{
                node nn=buckets[bi].remove(di);
                n--;
                return nn.value; 
            }
        }
        public V get(K key){
            int bi=HashFunction(key);
            int di=SearchInLL(key,bi);

            if(di ==-1){
                return null;
            }
            else{
                node nn=buckets[bi].get(di);
                return nn.value;
            }
        }
        public ArrayList<K> keySet(){
            ArrayList<K> keys=new ArrayList<>();
            for(int i=0;i<buckets.length;i++){
                LinkedList<node> ll=buckets[i];
                for(int j=0;j<ll.size();j++){
                    node nn=ll.get(j);
                    keys.add(nn.key);
                }
            }
            return keys;
        }
        public boolean isEmpty(){
            return n==0;
        }
        
    }
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("pramod",1);
        map.put("Manoj",2);
        ArrayList<String> keys=map.keySet();//
        for(int i=0;i<keys.size();i++){
            System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
        }
        map.remove("Manoj");
        System.out.println(map.get("Manoj"));
    }
}