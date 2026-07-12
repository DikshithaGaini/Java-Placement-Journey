public class LargestOfThreeMethod {
    static int num(int a,int b,int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>a && b>c){
           return b; 
        }
        else{
            return c;
        }
    }
    public static void main(String[] args){
     int res=num(5,8,9);
     System.out.println(res);
    }
}
