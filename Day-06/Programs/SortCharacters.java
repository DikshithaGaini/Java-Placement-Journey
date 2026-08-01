
    import java.util.Scanner;

public class SortCharacters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] > ch[j]) {
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }

        System.out.print("Sorted String: ");

        for (char c : ch) {
            System.out.print(c);
        }
        sc.close();
        
    }
}

