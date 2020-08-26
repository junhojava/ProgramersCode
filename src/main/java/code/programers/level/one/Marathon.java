package code.programers.level.one;

class Marathon {

    public String solution(String[] participant, String[] completion) {
        String answer = "leo";

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

    String[][] twoDimensionString(int index)
    {
        return new String[2][index];
    }

    boolean isTwoDimensionString(Object object)
    {
        String[][] array = {{}};

        return array.getClass().equals(object.getClass());
    }

    int linearFindIndex(String[] participant, String name)
    {
        for(int index= 0; index< participant.length; index++)
        {
            if(participant[index].equals(name))
            {
                return index;
            }
        }

        return 0;
    }

    String[] replaceString(String[] participant, int index, String replace_character)
    {
        participant[index] = replace_character;

        return participant;
    }

    int isNotEmptyString(String[] participant)
    {
        int index = 0;

        for(; index< participant.length; index++)
        {
            if(!participant[index].equals(""))
            {
                return index;
            }
        }

        return index;
    }

    public String linearSearch(String[] participant, String[] completion) {
        String answer = "";

        for(String name: completion)
        {
            int number = linearFindIndex(participant, name);
            participant = replaceString(participant, number, "");
        }

        int last_number = isNotEmptyString(participant);

        answer = participant[last_number];

        return answer;
    }

    public String linearSearchInSort(String[] participant, String[] completion)
    {
        participant = bubleSort(participant);

        String answer = "";

        for(String name: completion)
        {
            int number = linearFindIndex(participant, name);
            participant = replaceString(participant, number, "");
        }

        int last_number = isNotEmptyString(participant);

        answer = participant[last_number];

        return answer;
    }

    public String[] bubleSort(String[] participant)
    {
        /**
         * 이렇게 작동하는 정렬을 할 것입니다.
         * 스캔 = 1
         *   ↓
         * [leo, kiki, eden]
         *   ↓
         * [kiki, leo, eden]
         *         ↓
         * [kiki, leo, eden]
         *         ↓
         * [kiki, eden, leo]
         * 
         * 스캔 = 2
         *   ↓
         * [kiki, eden, leo]
         *   ↓
         * [eden, kiki, leo]
         *         ↓
         * [eden, kiki, leo]
         *               ↓
         * [eden, kiki, leo]
         * * 스캔 = 3
         *   ↓
         * [eden, kiki, leo]
         *   ↓
         * [eden, kiki, leo]
         *         ↓
         * [eden, kiki, leo]
         * *             ↓
         * [eden, kiki, leo]
         */
        String buffer = "";
        boolean isChanged = true;

        while(isChanged)
        {
            isChanged = false;
            for(int index=0; index < participant.length-1; index++)
            {
                if(participant[index].compareTo(participant[index+1]) > 0)
                {
                    buffer= participant[index];
                    participant[index] = participant[index+1];
                    participant[index+1] = buffer;
                    isChanged = true;
                }
            }
        }
        return participant;
    }
}