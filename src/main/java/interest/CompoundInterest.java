package interest;

import interest.Interest;

public class CompoundInterest
{
    public static void calculateInterest(Interest i)
    {
        double amount = i.principal * Math.pow(1 + (i.rate / 100),i.time);
        i.interest = amount-i.principal;
    }
}