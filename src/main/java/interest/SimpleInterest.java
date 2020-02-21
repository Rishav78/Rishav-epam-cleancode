package interest;

import interest.Interest;

public class SimpleInterest
{
    public static void calculateInterest(Interest i)
    {
        i.interest=(i.principal*i.rate*i.time)/100;
    }
}