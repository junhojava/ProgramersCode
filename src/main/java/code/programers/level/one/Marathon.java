package code.programers.level.one;

import java.util.HashMap;
import java.util.Map;

class Marathon {

    public String solution(String[] participant, String[] completion) {
        String answer = "";

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

    int compareName(String left, String right)
    {
        // equal
        if(left.compareTo(right) == 0)
        {
            return 0;
        }
        // left > right
        else if(left.compareTo(right) > 0)
        {
            return -1;
        }
        // left < right
        else
        {
            return 1;
        }
    }

    int binarySearch(String[] participant, String name, int low, int high)
    {
        int middle;

        while(low <= high)
        {
            middle = (low+high)/2;
            int sign = compareName(participant[middle], name);

            if(sign == 0) // 탐색 성공
            {
                return middle;
            }
            else if(sign == -1) // 왼쪽부분 리스트 탐색
            {
                high = middle-1;
            }
            else // 오른쪽 부분 리스트 탐색
            {
                low = middle+1;
            }
        }
        return -1;
    }

    public String binarySolution(String[] participant, String[] completion) {
        participant = bubleSort(participant);
        for(String runner : completion)
        {
            int index = binarySearch(participant, runner, 0, participant.length);
            participant[index] = "";
            participant = bubleSort(participant);
        }

        return participant[participant.length-1];
    }

    Map<String, Integer> addCountName(String[] name_list)
    {
        Map<String, Integer> result = new HashMap<String, Integer>();
        for(String name:name_list)
        {
            if(result.get(name)==(null))
            {
                result.put(name, 1);
            }
            else
            {
                result.put(name, result.get(name)+1);
            }
        }
        return result;
    }

    void subCountName(Map<String, Integer> participant_map, String name)
    {
        int count = participant_map.get(name);
        if(count == 1)
        {
            participant_map.remove(name);
        }else
        {
            participant_map.put(name, count-1);
        }
    }
}