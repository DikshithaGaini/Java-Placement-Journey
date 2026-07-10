import java.util.Scanner;

public class ArmStrongNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num=");
        int n=sc.nextInt();
        int org=n;
        int sum=0;
        while(n>0){
        int rem=n%10;
        sum=sum+(rem*rem*rem);
           n=n/10;
        }
        if(sum==org){
         System.out.println("ArmStrong num");
        }
        else{
        System.out.println(" not ArmStrong num");
        }
        sc.close();
    }
}
