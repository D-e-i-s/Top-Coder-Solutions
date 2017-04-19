/* Summary for TopCoder

First we concatenate our x1 and x2 values k1 and k2 times, respectively.  We then pass the strings as arguments to BigInteger, allowing us to store the potentially huge numbers.  We can then use compareTo() to return -1, 0, or 1, depending on whether v1 is less than, equal to, or greater than v2, respectively.  From there we check our result, returning the correct string.

*/

import java.math.BigInteger;

public class RepeatNumberCompare 
{
    public static String compare(int x1, int k1, int x2, int k2)
    {
        String temp1 = "";
        String temp2 = "";
        
        for(int i = 0; i < k1; i++)
        {
            temp1 += Integer.toString(x1);
        }
        for(int j =  0; j < k2; j++)
        {
            temp2 += Integer.toString(x2);
        }
        
        BigInteger v1 = new BigInteger(temp1);
        BigInteger v2 = new BigInteger(temp2);
        
        int result = v1.compareTo(v2);
        
        if(result == -1)
        {
            return "Less";
        }
        if(result == 1)
        {
            return "Greater";
        }
        else
        {
            return "Equal";
        }
    }
}
