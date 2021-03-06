package code.programers.level.one;

public class Budget {
    
    int budgetSupport(int budget, int... priceArary)
    {
        int result = 0;
        
        for(int number: priceArary)
        {
            if(number > budget)
                break;

                budget -= number;

                result++;
        }

        return result;
    }
}