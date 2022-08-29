import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class Arrays_Util
{


//  TODO: FUNCTION DOCUMENTATION
    public static ArrayList<Integer> getSharedElements(int[] array1, int[] array2)
    {
        ArrayList<Integer> sharedElements = new ArrayList<>();

        OUTER:for(int e1 : array1)
        {                                           //  nested foreach loops to iterate both arrays
            for(int e2 : array2)
            {
                if(e1 == e2)                        //  if the current elements from each array are identical, add to sharedElements
                {
                    sharedElements.add(e1);
                    continue OUTER;                 // Prevent unnecessary duplicates in sharedElements
                }
            }
        }

        return sharedElements;
    }



//  TODO: FUNCTION DOCUMENTATION; overridden method
    public static ArrayList<Character> getSharedElements(String s1, String s2)
    {
        ArrayList<Character> sharedElements = new ArrayList<>();
        char[] charArr1 = s1.toCharArray();
        char[] charArr2 = s2.toCharArray();

        try
        {
            OUTER: for (char c1 : charArr1)
            {
                for (char c2 : charArr2)
                {
                    if (c1 == c2)
                    {
                        sharedElements.add(c1);
                        continue OUTER;
                    }
                }
            }

            if (sharedElements.size() == 0)
            {
                throw new NoSharedElementsException();
            }
        }

        catch (NoSharedElementsException e)
        {
            //TODO: EXCEPTION HANDLING
        }

        return sharedElements;
    }



    public static int[] shuffleArray(int[] ints)
    {
        if(ints.length == 1 || ints.length == 0)           {return ints;}

        int[] shuffledArray = ints;
        Random random = new Random();

        for (int i = 0; i < random.nextInt(11); i++)                //  outer foreach iterates b/n 1 and 10 times
        {

            for(int j = 0; j < shuffledArray.length; j++)                       //  inner foreach iterates elements of ints[]
            {
                int randomIndex = random.nextInt(shuffledArray.length);         //  randomly select an index to swap with current index
                int temp = shuffledArray[randomIndex];                          //  temporary var, holds value of randomly selected index

                shuffledArray[randomIndex] = shuffledArray[j];                  //  randomly selected index set to value of current index
                shuffledArray[j] = temp;                                        //  current index set to value of randomly selected index, via temporary var
            }
        }

        if(Arrays.equals(shuffledArray,ints))           //  TODO: testing
        {
            System.out.println("""
                    ===========================
                    arrays are still identical
                    ===========================""");
        }

        return shuffledArray;
    }



    public static char[] shuffleArray(char[] chars)
    {
        if(chars.length == 1 || chars.length == 0)           {return chars;}

        char[] shuffledArray = chars;
        Random random = new Random();

        for (int i = 0; i < random.nextInt(11); i++)                //  outer foreach iterates b/n 1 and 10 times
        {

            for(int j = 0; j < shuffledArray.length; j++)                       //  inner foreach iterates elements of ints[]
            {
                int randomIndex = random.nextInt(shuffledArray.length);         //  randomly select an index to swap with current index
                char temp = shuffledArray[randomIndex];                         //  temporary var, holds value of randomly selected index

                shuffledArray[randomIndex] = shuffledArray[j];                  //  randomly selected index set to value of current index
                shuffledArray[j] = temp;                                        //  current index set to value of randomly selected index, via temporary var
            }
        }

        return shuffledArray;
    }



    public static String[] shuffleArray(String[] strings)
    {
        if(strings.length == 1 || strings.length == 0)           {return strings;}

        String[] shuffledArray = strings;
        Random random = new Random();

        for (int i = 0; i < random.nextInt(11); i++)                //  outer foreach iterates b/n 1 and 10 times
        {

            for(int j = 0; j < shuffledArray.length; j++)                       //  inner foreach iterates elements of ints[]
            {
                int randomIndex = random.nextInt(shuffledArray.length);         //  randomly select an index to swap with current index
                String temp = shuffledArray[randomIndex];                       //  temporary var, holds value of randomly selected index

                shuffledArray[randomIndex] = shuffledArray[j];                  //  randomly selected index set to value of current index
                shuffledArray[j] = temp;                                        //  current index set to value of randomly selected index, via temporary var
            }
        }

        return shuffledArray;
    }





    /**     ---------------------------
     *              Exceptions
     *      ---------------------------
     */
    private static class NoSharedElementsException extends Exception
    {
        //TODO: EXCEPTION HANDLING
        //  --  notify user that no elements were shared b/n two passed objects  ??
        //  --  return nothing OR null object ??
    }

}
