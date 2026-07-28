import java.util.Scanner;

public class Replacechar {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.next();
        String res="";
        res+=str.replace('a','o');
        System.out.println(res);
        sc.close();
    }
}
