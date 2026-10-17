package Trie;
public class Tries {
    static class node{
        node children[] = new node[26];
        boolean eow;
        public node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            eow=false;
        }
    }
    static node root=new node();
    public static void insert(String word){
        node curr = root;
        for(int i=0;i<word.length();i++){
         int idx=word.charAt(i)-'a';
         if(curr.children[idx] == null){
            curr.children[idx]=new node();
         }
         if(i == word.length()-1){
            curr.children[idx].eow=true;
         }
         curr=curr.children[idx];
        }
        
    }

    public static boolean search(String key){
        node curr=root;
        for(int i=0;i<key.length();i++){
            int idx=key.charAt(i)-'a';
            if(curr.children[idx] == null){
                return false;
            }
            if(i==key.length()-1 && curr.children[idx].eow==false){
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }
    public static boolean wordbreak(String key){
        if(key.length() == 0){
            return true;
        }
        for(int i=1;i<=key.length();i++){
            String first=key.substring(0,i);
            String secoString=key.substring(i);
            if(search(first) && wordbreak(secoString)){
                return true;
            }
        }
        return false;
    }
    public static boolean prefixsearch(String prefix){
        node curr = root;
        for(int i=0;i<prefix.length();i++){
            int idx=prefix.charAt(i)-'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr=curr.children[idx];
        }
        return true;

    }
    public static int countunqSubstrings(node root){
        if(root == null){
            return 0;
        }
        int count =0;
        for(int i=0;i<26;i++){
            if(root.children[i]!=null){
                count+=countunqSubstrings(root.children[i]);
            }
        }
         return count+1;
    }
    public static void main(String[] args) {
        String n="ababa";
        for(int i=0;i<n.length();i++){
            insert(n.substring(i));
        }
        System.out.print(countunqSubstrings(root));
    }
}
