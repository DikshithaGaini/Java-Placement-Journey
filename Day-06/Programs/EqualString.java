import java.util.Scanner;

public class EqualString {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.next().toLowerCase();
        String res=sc.next().toLowerCase();
        if(str.equals(res)){
            System.out.println("2 strings are equal");
        }
        sc.close();
    }
}
