import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size:");
       int n=sc.nextInt();
       System.out.print("Enter arr ele:");
       int[] arr=new int[n];
       int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Copy array is:");
        for(int i=0;i<n;i++){
            arr1[i]=arr[i];
        System.out.print(arr1[i]+" ");
        }
        sc.close();
    }
}
