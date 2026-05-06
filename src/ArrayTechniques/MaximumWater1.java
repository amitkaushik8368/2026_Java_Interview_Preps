package ArrayTechniques;

import java.util.*;

public class MaximumWater1
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
        int maxArea = 0;
        while (i<j)
        {
            int width = j-i;
            int length = Math.min(height[i], height[j]);
            int area = width*length;
            maxArea = Math.max(maxArea, area);
            if (height[i]<height[j])
                i++;
            else
                j--;
        }
        System.out.println("Maximum water that can be contained : " + maxArea);
    }
}
