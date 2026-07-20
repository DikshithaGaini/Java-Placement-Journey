import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size:");
       int n=sc.nextInt();
       System.out.print("Enter arr ele:");
       int[] arr=new int[n];
       int[] arr1=new int[n];
       int[] Marr=new int[n+n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         System.out.print("Enter arr1 ele:");
         for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
           Marr[i]=arr[i];
        }
         for(int i=0;i<n;i++){
           Marr[n+i]=arr1[i];
        }
        for(int i=0;i<n+n;i++){
            System.out.print(Marr[i]+" ");
        }
        sc.close();
    }
}
