public class EvenOddMethod {
    static boolean evenOdd(int a){
        if(a%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        boolean res=evenOdd(66);
        System.out.println(res);
    }
}
