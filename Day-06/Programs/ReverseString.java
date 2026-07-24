public class ReverseString {
    public static void main(String[] args){
        String str="Dikshitha";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            //char ch=str.charAt(i);
            //System.out.println(ch);
            rev+=str.charAt(i);
        }
        System.out.print(rev);
        
    }
}
