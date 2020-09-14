package code.programers.level.one;

public class SortString {
    
    String[] substring(String[] list, int position)
    {
        for(int index=0; index<list.length;index++)
        {
            list[index] = list[index].substring(position);
        }

        return list;
    }
}