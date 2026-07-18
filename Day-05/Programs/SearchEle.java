import java.util.Scanner;

public class SearchEle {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size:");
       int n=sc.nextInt();
       System.out.println("Enter the search ele:");
       int m=sc.nextInt();
       System.out.print("Enter arr ele:");
       int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]==m){
                System.out.println("Found element at index:"+i);
            }
        }
        sc.close();
    }
}
