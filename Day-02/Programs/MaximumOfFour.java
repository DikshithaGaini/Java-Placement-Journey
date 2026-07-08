public class MaximumOfFour {
    public static void main(String[] args){
        int a=10;
        int b=20;
        int c=30;
        int d=5;
        if(a>b && a>c &&a>d){
            System.out.println(a+" is max num");
        }
        else if(b>a && b>c && b>d){
            System.out.println(b+"is a max num");
        }
        else if(c>a && c>b && c>d){
            System.out.println(c+"is a max num");

        }
    }
}
