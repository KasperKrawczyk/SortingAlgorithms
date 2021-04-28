public class MergeSort{

    private static int iterations = 0;

    public static int[] mergeSort(int[] inputArray){
        int n = inputArray.length;
        if(n > 1){
            int midPoint = n / 2;

            int[] left = new int[midPoint];
            int[] right = new int[n - midPoint];

            for(int i = 0; i < midPoint; i++){
                left[i] = inputArray[i];
            }

            for(int i = midPoint; i < n; i++){
                right[i - midPoint] = inputArray[i];
            }

            mergeSort(left);
            mergeSort(right);
            merge(inputArray, left, right, midPoint, n - midPoint);
            iterations++;
        }

        return inputArray;
    }

    public static void merge(int[] inputArray, int[] left, int[] right, int leftN, int rightN){

        int i = 0;
        int l = 0;
        int r = 0;

        while(l < leftN && r < rightN) {
            if(left[l] <= right[r]){
                inputArray[i++] = left[l++];
            } else {
                inputArray[i++] = right[r++];
            }
        }
        while(l < leftN) {
            inputArray[i++] = left[l++];
        }
        while(r < rightN){
            inputArray[i++] = right[r++];
        }

    }

    public static void printIterations(){
        System.out.println("ITERATIONS: " + iterations);
    }

}