import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.next();
        String org=str.toLowerCase();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            //char ch=str.charAt(i);
            //System.out.println(ch);
            rev+=str.charAt(i);
        }
        rev=rev.toLowerCase();
        if(rev.equals(org)){
            System.out.println("Its a palindrome String");
        }
        else{
            System.out.println("Its not a palindrome");
        }
        sc.close();
    }
}
