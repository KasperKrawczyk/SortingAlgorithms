public class BinarySearch {

    public static boolean binarySearch(int[] data, int target){
        int numOfPasses = 0;
        int lower = 0;
        int upper = data.length - 1;
        int middle = -1;
        boolean found = false;

        while(upper >= lower && !found){
            numOfPasses++;

            middle = (lower + upper) / 2;

            if(data[middle] == target){
                found = true;
            } else if(data[middle] > target){
                upper = middle - 1;
            } else {
                lower = middle + 1;
            }
            System.out.println("PASS " + numOfPasses +
                    "; LOWER = " + lower + "; UPPER = " + upper + "; MIDDLE = " + middle +
                    "; DATA[MIDDLE] = " + data[middle]);

        }
        return found;
    }

}
