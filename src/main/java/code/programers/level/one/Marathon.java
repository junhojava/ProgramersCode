package code.programers.level.one;

class Marathon {
    public String solution(String[] participant, String[] completion) {
        String answer = "leo";
        return answer;
    }

    public String concatParticipant(String[] participant)
    {
        String result = "";

        for(String marathoner: participant)
        {
            result += (marathoner + ",");
        }

        return result;
    }
}