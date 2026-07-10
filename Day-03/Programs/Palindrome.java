import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num=");
        int n=sc.nextInt();
        int org=n;
        int rev=0;
        while(n>0){
          int rem=n%10;
           rev=rev*10+rem;
           n=n/10;
        }
        if(rev==org){
         System.out.println(org+"is palindrome");
        }
        else{
            System.out.println("not a pallindrome");
        }
        sc.close();
    }
}
