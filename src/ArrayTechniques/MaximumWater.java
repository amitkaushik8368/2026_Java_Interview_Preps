package ArrayTechniques;

import java.util.*;

public class MaximumWater
{
    public static void main(String[] args) {
        /**
         *  You are given an integer array height[].
         * Each element represents a vertical line.
         * Find two lines such that together with the x-axis they form a container that holds the maximum water.
         */
        int[] height = {1,8,6,2,5,4,8,3,7};

        /**
         * Things that I should have
         * Maximum distance at x-axis and out of two minimum height
         */
        int i=0 , j = height.length-1;
        Map<Integer, List<Integer>> map = new HashMap<>();
        while (i<j)
        {
            int width = j-i;
            int smallerSide = Math.min(height[i], height[j]);
            int area = width*smallerSide;
            map.put(area, List.of(height[i], height[j]));
            if (height[i]<height[j])
                i++;
            else
                j--;
        }
        Set<Integer> set = map.keySet();
        int maxArea = Collections.max(set);
        System.out.println(map.get(maxArea));
    }
}
