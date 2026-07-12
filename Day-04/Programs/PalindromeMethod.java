public class PalindromeMethod {
    static boolean palin(int n){
        int org=n;
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return org==rev;
    }
    public static void main(String[] args) {
        boolean res=palin(343);
        System.out.println(res);
    }
}
