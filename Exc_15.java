package Exc_15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exc_15
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<20;i++)
        {
            list.add((int)(Math.random()*10)+1);
        }
        System.out.println(list);
        System.out.println(maxOccurences(list));
    }

    public static int maxOccurences(List<Integer> list)
    {
        Map<Integer,Integer> map = new HashMap<>();
        int ret = 0;
        for(int i: list)
        {
            if(map.containsKey(i))
            {
                int count = map.get(i);
                map.put(i,count+1);
            } else
            {
                map.put(i,1);
            }
        }
        for(int i: map.keySet())
        {
            if(ret<map.get(i))
            {
                ret = map.get(i);
            }
        }
        System.out.println(map);
        return ret;
    }

}
