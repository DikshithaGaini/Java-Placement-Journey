public class SmallestOfThree {
    public static void main(String[] args){
        int a=10;
        int b=20;
        int c=3;
        if(a<b && a<c){
            System.out.println(a+"is the smallest num");
        }
        else if(b<a && b<c){
            System.out.println(b+"is the smallest num");
        }
        else{
            System.out.println(c+"is the smallest");
        }
    }
}
