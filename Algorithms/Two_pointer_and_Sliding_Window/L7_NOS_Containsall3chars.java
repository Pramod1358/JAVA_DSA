package Algorithms.Two_pointer_and_Sliding_Window;
public class L7_NOS_Containsall3chars { 
    public static void main(String [] args){
        String a="bbaacca";
        int count=0;
        int arr[]={-1 , -1 , -1};

        for(int i=0;i<a.length();i++){
            arr[a.charAt(i) - 'a']=i;

            if(arr[0]!= -1 && arr[1]!=-1 && arr[2]!=-1){
                count = count + (1 + Math.min(Math.min(arr[0] , arr[1]) , arr[2]));
            }
        }
        System.out.println(count);
    }
}
