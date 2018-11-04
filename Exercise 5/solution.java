// Hey, thank you for open this solution. If u want to contribute please
// send a request. Greetings, Breyner
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static java.lang.System.exit;
import java.util.Arrays;
import java.util.StringTokenizer;

public class YogurtOptimized {

    static int scanInt() throws IOException {
        return parseInt(scanString());
    }

    static long scanLong() throws IOException {
        return parseLong(scanString());
    }

    static String scanString() throws IOException {
        while (tok == null || !tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine());
        }
        return tok.nextToken();
    }

    static void printCase() {
        out.print("Case #" + test + ": ");
    }

    static void printlnCase() {
        out.println("Case #" + test + ":");
    }

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;
    static int test;

    public static void main(String[] args) {
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            int t = scanInt();
            for (test = 1; test <= t; ++test) {
                long ans = 0; 
                int n = scanInt();
                int k = scanInt();
                int expireDate[] = new int[n], limit = 0, day = 1;
                // we start reading the expire dates of each Yogurt.
                for (int i = 0; i < n; i++) {
                    expireDate[i] = scanInt();
                }
                // sort the expire dates from small to big because
                // we needs to consume first the yogurts which expire early
                Arrays.sort(expireDate);
                // for each yogurt
                for (int i = 0; i < n; i++) {
                    // if the expire date is not big than the day
                    // so can consume the Yogurt
                    if (day <= expireDate[i]) {
                        // one more yogurt to the list!
                        ans++;
                        // and the limit for each day increments
                        limit++;
                        // if the user reachs the limit so no more yogurt
                        // and we go to the next day
                        if (limit == k) {
                            limit = 0;
                            day++;
                        }
                    }
                }
                printCase();
                out.println(ans);
            }
            in.close();
            out.close();
        } catch (Throwable e) {
            e.printStackTrace();
            exit(1);
        }
    }
}
