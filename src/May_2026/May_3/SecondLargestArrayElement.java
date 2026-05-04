package May_2026.May_3;

public class SecondLargestArrayElement
{
    public static void main(String[] args) {
        int[] array = {5, 6, 8, 8, 8,  3, 1, 9, 9};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int element: array)
        {
            if (element>secondLargest && element != largest)
                secondLargest=element;
            //System.out.println("Second Largest 1st if = " + secondLargest );
            if (largest<secondLargest)
            {
                int temp = largest;
                largest = secondLargest;
                secondLargest = temp;
            }
           // System.out.println("Second Largest 2nd if = " + secondLargest);
           // System.out.println("Largest 2nd if = " + largest);
           // System.out.println("======================");

        }
        System.out.println("Second Largest : " + secondLargest);
        System.out.println("Largest : " + largest);
    }
}
