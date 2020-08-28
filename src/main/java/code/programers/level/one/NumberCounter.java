package code.programers.level.one;

public class NumberCounter {
    
    int number;

    NumberCounter(int number)
    {
        this.number = number;
    }

    @Override
    public boolean equals(Object object) {
        NumberCounter numberCounter = (NumberCounter) object;

        return number == numberCounter.number;
    }
}