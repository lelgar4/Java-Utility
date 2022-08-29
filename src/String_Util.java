//

public class String_Util
{
    /**         INDEX
     *      -------------
     *
     */

    /**
     *      ReverseString()     reverses the order of chars in a string.
     *
     *          @param s (String) - string to be reversed
     *          @return reverseString
     */

    public static String ReverseString(String s)
    {

//  if null String variable is passed, throw IllegalArgException
        if(s == null)
        {
            throw new IllegalArgumentException("Null String passed to function ReverseString");
        }

//  if length of String passed to function is 1, do nothing and return String; a String with only one char can't be reversed
        if(s.length() == 1)
        {
            return s;
        }

        StringBuilder reverseString = new StringBuilder();
        char[] sChars = s.toCharArray();

//  iterate chars in sChars in reverse order, appending each to reverseString
        for(int i = sChars.length - 1; i >= 0; i--)
        {
            reverseString.append(sChars[i]);
        }

        return reverseString.toString();
    }


}
