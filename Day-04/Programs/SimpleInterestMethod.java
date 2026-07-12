public class SimpleInterestMethod {
    static int simpleInterest(int p,int t,int r){
        int s=(p*r*t)/100;
        return s;
    }
    public static void main(String[] args){
        int res=simpleInterest(1000,2,5);
        System.out.println(res);
    }
}
