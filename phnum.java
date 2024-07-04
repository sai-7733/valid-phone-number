import java.util.regex.*;
import java.util.*;
class A{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Pattern p=Pattern.compile("[6789][0-9]{9}");
        Matcher m=p.matcher(sc.next());
        if(m.matches()){
            System.out.println("valid");
        }
        else{
            System.out.println("Not valid");
        }
    }
}