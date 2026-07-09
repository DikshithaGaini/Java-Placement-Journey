import java.util.*;

public class SumOfNaturalNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i);
        }
        sc.close();
    }
}
