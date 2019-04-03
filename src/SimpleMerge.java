/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
public class SimpleMerge {
    public static int[] simpleMerge(int[] array1, int[] array2) {
        int[] array3 = new int[array1.length+array2.length];

        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
            int x = 0;
            for (int j = array1.length; j < array3.length; j++) {
                array3[j] = array2[x];
                x++;
            }
        }
        bubbleSort(array3);
        return array3;
    }
    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void bubbleSort(int[] array) {
        int swaps = 1;
        while (swaps!=0) {
            swaps = 0;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    swap(array, i, i+1);
                    swaps++;
                }
            }
        }
    }

}
