package ArrayTechniques;

public class BruteForce
{
    public static void main(String[] args) {
        //This techniques tells to try all possible array element combinations
        int[] array = {5, 6, 8, 8, 8,  3, 1, 9, 9};
        int arrLength = array.length;
        for (int i = 0; i < arrLength; i++) {
            for (int j = i+1; j < arrLength; j++) {
                /**
                 * Here you can perform operations for instance:
                 * array[i] > array[j]
                 */
            }
        }
    }
}
