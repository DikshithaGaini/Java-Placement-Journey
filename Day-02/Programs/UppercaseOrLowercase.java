public class UppercaseOrLowercase {
    public static void main(String[] args){
        char ch='A';
        if(ch>='A' && ch<='Z'){
            System.out.println("UpperCase");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println("LowerCase");
        }
        else{
            System.out.println("not a alphabet");
        }

    }
}
