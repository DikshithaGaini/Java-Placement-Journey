import java.util.Scanner;

public class DuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count > 1) {
                boolean printed = false;

                for (int k = 0; k < i; k++) {
                    if (str.charAt(k) == str.charAt(i)) {
                        printed = true;
                        break;
                    }
                }

                if (!printed) {
                    System.out.println(str.charAt(i));
                }
            }
        }
        sc.close();
    }
}