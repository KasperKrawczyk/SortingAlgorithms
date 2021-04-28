import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionSort(int[] inputArray){
        int outerLoopIterations = 0;
        int innerLoopIterations = 0;

        int[] array = inputArray;
        int n = array.length;

        for(int index1 = 0; index1 <= n - 1; index1++){
            outerLoopIterations++;
            int minInd = index1; // the index of the smallest value

            for(int index2 = index1 + 1; index2 <= n - 1; index2++){
                innerLoopIterations++;
                if(array[index2] < array[minInd]){
                    minInd = index2;
                }
            }
            System.out.println("\nSwapping " + array[index1] + " at index " + index1 +
                    " with " + array[minInd] + " at index " + minInd);

            //swap
            int temp = array[index1];
            array[index1] = array[minInd];
            array[minInd] = temp;

            System.out.println("After the swap: " + Arrays.toString(array));
        }

        System.out.println("\nOUTER LOOP ITERATIONS: " + outerLoopIterations);
        System.out.println("INNER LOOP ITERATIONS: " + innerLoopIterations);

        return array;

    }

}
