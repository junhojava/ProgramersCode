package code.programers.level.two;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionDevelop {
    
    int sum(int left, int right)
    {
        return left+ right;
    }

    int count(List<Integer> progress_list) {
        int count = 0;

        for(int index= 0; index < progress_list.size(); index++)
            if(progress_list.get(index) > 100)
                count++;
            else
                break;

        return count;
    }

    List<Integer> asList(int[] arr)
    {
        return Arrays.stream(arr).boxed().collect(Collectors.toList());
    }

    int[] toArray(List<Integer> list)
    {
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}