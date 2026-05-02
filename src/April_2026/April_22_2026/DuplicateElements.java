package April_2026.April_22_2026;

import java.util.HashMap;
import java.util.Map;

public class DuplicateElements
{
    public static void main(String[] args)
    {
        //Approach 1
        int[] arr = {5, 8, 9, 34, 29, 8, 6, 5, 9, 29, 8, 34};
        Map<Integer, Integer> map = new HashMap<>();
        for(int a: arr)
            map.put(a, map.getOrDefault(a, 0) +1);
        System.out.println(map);

        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            if(entry.getValue() > 1)
                System.out.printf("%d ",entry.getKey());
        }

		/*
		Approach 2:

		int[] arr = {5, 8, 9, 34, 29, 8, 6, 5, 9, 29, 8, 34};
		//int[] duplicates = new int[arr.length];
		//int indexDuplicates = 0;
		List<Integer> duplicates = new ArrayList<>();
		boolean[] visited = new boolean[arr.length];
		for(int i=0; i < arr.length ; i++)
		{
			int count = 1;
			if(visited[i])
				continue;
			for(int j=i+1; j < arr.length ; j++)
			{
				if(arr[i] == arr[j])
				{
					visited[j] = true;
					count++;
				}
			}
			if(count>1)
			{
				duplicates.add(arr[i]);
				//duplicates[indexDuplicates++] = arr[i];
			}
		}
		//int[] newArray = Arrays.copyOf(duplicates, indexDuplicates);
		//System.out.println(Arrays.toString(newArray));
		System.out.println(duplicates);

	*/


	/*

	Approach 3:

		int[] arr = {5, 8, 9, 34, 29, 8, 6, 5, 9, 29, 8, 34};
		Set<Integer> filterDuplicates = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();
		for(int a: arr)
		{
			if(!filterDuplicates.add(a))
				duplicates.add(a);
		}
		System.out.println(duplicates);

	*/

    }
}
