package WTN;
import java.util.*;
public class UserIdGen{
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String firstname=sc.next();
    String Lastname = sc.next();

    String great,small;
    if(firstname.length() > Lastname.length()){
        great =  firstname;
        small = Lastname;
    }
    else if(firstname.length() < Lastname.length()){
        great =  Lastname;
        small = firstname;
    }
    else{
        if(firstname.compareToIgnoreCase(Lastname) <= 0){
        small = firstname;
        great = Lastname;
    } else {
        small = Lastname;
        great = firstname;
    }
    }
    String pin = sc.next();
    int n = sc.nextInt();
    String dup=""+great.charAt(great.length()-1)+small+pin.charAt(n-1)+pin.charAt(pin.length()-n);
    System.out.println(dup);

    StringBuilder fin = new StringBuilder();
    



    
 }
}