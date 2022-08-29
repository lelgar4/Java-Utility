public class Math_Util
{

    public static boolean isPrime(int x)
    {
        if(x == 0 || x == 1)        return false;

        if(x == 2)                  return true;


        for(int i = 2; i <= x/2; i++)
        {
            if(x % i == 0)          return false;
        }

        return true;
    }



    public static long factorial(long x)
    {
        if(x == 1)                  return 1;

        else return (x * factorial(x - 1));
    }
}
