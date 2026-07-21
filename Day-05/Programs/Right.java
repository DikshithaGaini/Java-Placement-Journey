import java.util.Scanner;

public class Right {
     public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size:");
       int n=sc.nextInt();
       System.out.print("Enter arr ele:");
       int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int first=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=first;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
