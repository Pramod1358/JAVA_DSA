package WTN;

class CountDigits {
    public static void main(String[] args) {
        int n=6928099;
        int digits=(int)Math.log10(Math.abs(n))+1;
        int a[]=new int[digits];
        for(int i=digits-1;i>=0;i--){
            int m=n%10;
            a[i]=m;
            n=n/10;
            
        }
        for(int i=0;i<a.length-1;i++){
            System.out.print(Math.abs(a[i]-a[i+1]));
        }
        
    }
}