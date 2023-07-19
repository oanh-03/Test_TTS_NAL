/**
 * @author Phuong Oanh
 */
public class App {
    public static void main(String[] args) {
        System.out.println(countNumberCharactor("hwfdawhwhcoomddfgwdc"));
    }

    private static int countNumberCharactor(String input) {
        int totalCharector = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'w') {
                totalCharector++;
            }

            if (i != input.length() - 1) {
                if (input.charAt(i) == 'a' && input.charAt(i + 1) == 'w') {
                    totalCharector++;
                    i++;
                }

                if (input.charAt(i) == 'o' && input.charAt(i + 1) == 'o') {
                    totalCharector++;
                    i++;
                }

                if (input.charAt(i) == 'd' && input.charAt(i + 1) == 'd') {
                    totalCharector++;
                    i++;
                }
            }
        }

        return totalCharector;
    }
}
