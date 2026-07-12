public class FactorialMethod {
    
    static int fact(int a){
        int fact=1;
        while(a>0){
            fact=fact*a;
            a=a-1;
        }
        return fact;
    }
    public static void main(String[] args){
        int res=fact(4);
        System.out.println(res);
    }
}
