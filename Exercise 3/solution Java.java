// Hey, thank you for open this solution. If u want to contribute please
// send a request. Greetings, Breyner
// Thanks to Geeks 4 Geeks for FastReader class
// Link: https://www.geeksforgeeks.org/fast-io-in-java-in-competitive-programming/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class work {
  // ------------- Start FastReader class
	static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
            InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
    // ------------- Ends FastReader class

// -------------------------------------------- //
	public static void main(String[] args)
	{
		    FastReader s=new FastReader(); // The input scanner
        int n = 0,
        t = 0,
        bestSetting = 0; // We set as the best setting by default the element at position 0
        // Just read the N number with the requirements
        while(n < 2 || n > 10)
        {
            n = s.nextInt();
        }
        // Create the array H that will containing the Hi settings
        int H[] = new int[n];
        // Insert the Hi element with the requirements to array H
        for(int i = 0; i < n; i++)
        {
        	H[i] = 0;
        	while(H[i] < 1 || H[i] > 500)
        	{
        		H[i] = s.nextInt();
        	}
        }
        // Just read the height of the tree with the requirements
        while(t < 1 || t > 3000)
        {
            t = s.nextInt();
        }
        // OK the quantification of the exercise is HERE
        // The statment says we need the best setting in order to minimise loss
        int i = 0;
        while(i < n)
        {
          // The first condition (i < n) is if we have a NEXT ELEMENT OF CURRENT
          // to be able to continue with the second condition
          // The second condition (t%H[bestSetting] > t%H[i]) is comparing the
          // residue of best actually setting index with the residue of current iteration.
          // If the current iteration has a lower of wood so it's the bestSetting
        	if(i < n && t%H[bestSetting] > t%H[i])
        	{
        		bestSetting = i;
        	}
        	i++;
        }
        System.out.println(H[bestSetting]);
	}
}
