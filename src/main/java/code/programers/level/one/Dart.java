package code.programers.level.one;

public class Dart {

    String area= "SDT";

    int[] numbers(String input)
    {
        int result[] = new int[3];
        int count = 0;
        for(String number:input.split("\\D"))
        {
            if(!number.equals(""))
            {
                result[count++] = Integer.parseInt(number);
            }
        }

        return result;
    }

    String[] character(String input)
    {
        String result[] = new String[3];
        int count = 0;

        for(String alphabet:input.split("\\d"))
        {
            if(!alphabet.equals(""))
            {
                result[count++] = alphabet;
            }
        }
        return result;
    }

    int calc(int number, String character)
    {
        int length = area.indexOf(character);

        for(int index=0, value = number; index<length; index++)
        {
            number *= value;
        }

        return number;
    }

    boolean isTwoCharacter(String character)
    {
        boolean result = false;
        if(character.length() == 2)
        {
            result =  true;
        }

        return result;
    }

    String splitTwoCharacter(String character, int begin, int end)
    {
        return character.substring(begin, end);
    }

    int asteriskCalc(int number)
    {
        return number*2;
    }

    int poundCalc(int number)
    {
        return number*-1;
    }
}