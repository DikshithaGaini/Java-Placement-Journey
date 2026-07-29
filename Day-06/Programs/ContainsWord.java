import java.util.Scanner;

public class ContainsWord {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        String word=sc.next();
        if(str.contains(word)){
            System.out.println("The word is present");
        }
        else{
            System.out.println("The word is not present");
        }
        sc.close();
    }
}
