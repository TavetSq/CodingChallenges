// Hey, thank you for open this solution. If u want to contribute please
// send a request. Greetings, Breyner
import java.util.*;
public class KaprekarsConstant {
    public static int KaprekarsConstant(String num) {
        int times = 0, result;
        do {
            // Create two arrays with num length to store each number
            int[] n1 = new int[num.length()];
            int[] n2 = new int[num.length()];
            // Parse in a field of the array each number of "num"
            for (int i = 0; i < num.length(); i++) {
                n1[i] = Integer.parseInt(String.valueOf(num.charAt(i)));
            }
            // Sort the array
            Arrays.sort(n1);
            // We copy in the array "n2" the array "n1" but in reverse order
            for (int i = 0; i < n1.length; i++) {
                n2[i] = n1[n1.length - 1 - i];
            }
            // Convert the arrays sorted into integers
            int nn1 = arrayToInt(n1), nn2 = arrayToInt(n2);
            // Make a substraction BIGNUMBER - SMALLNUMBER
            if (nn1 > nn2) {
                result = arrayToInt(n1) - arrayToInt(n2);
            } else {
                result = arrayToInt(n2) - arrayToInt(n1);
            }
            // If the result has 3 or less digits we need to add 0 until it
            // comes to 4
             while (result < 1000)
             {
                 result *= 10;
             }
             // we pass to num the value of result to make the same process
             // with the new numbers
            num = String.valueOf(result);
            times++;
        } while (result != 6174);
        return times;
    }

    static int arrayToInt(int[] arr) {
        StringBuilder s = new StringBuilder();
        for (int i : arr) {
            s.append(i);
        }
        return Integer.parseInt(s.toString());
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(KaprekarsConstant(s.nextLine()));
    }
}
