public class AverageOfArray {
    public static void main(String[] args){
    int[] arr={2,3,4,5,6};
    int sum=0;
    System.out.println("Array sum");
    for(int i=0;i<arr.length;i++){
        sum=sum+arr[i];
    }
    int avg=sum/5;
        System.out.print(avg);
}
}
