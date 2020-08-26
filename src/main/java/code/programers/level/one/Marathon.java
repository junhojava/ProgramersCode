package code.programers.level.one;

class Marathon {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        answer = "leo";

        return answer;
    }

    int half(int value)
    {
        int result = 0;

        if(isEven(value))
        {
            result= value/2;
        }else
        {
            result= value/2 +1;
        }

        return result;
    }

    boolean isEven(int value)
    {
        return (value%2) == 0;
    }
}