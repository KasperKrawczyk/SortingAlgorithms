public class InsertionSort {

    public static void insertionSort(int[] data){
        int current = 1;
        int totalComp = 0;
        int totalEx = 0;

        while(current < data.length){



            int index = current;
            boolean placeFound = false;

            int curComp = 0;
            int curEx = 0;

            while(index > 0 && !placeFound){
                totalComp++;

                curComp++;

                if(data[index - 1] > data[index]){
                    swap(data, index);
                    totalEx++;
                    curEx++;
                    index--;
                } else {
                    placeFound = true;
                }
            }

            System.out.println("In pass num " + current + " >>>" + " comp = " + curComp + "; ex = " + curEx + "\n");

            current++;

        }
        System.out.println("Total comparisons = " + totalComp
                + "; Total exchanges = " + totalEx);
    }

    private static void swap(int[] data, int index){
        int temp = data[index - 1];
        data[index - 1] = data[index];
        data[index] = temp;
    }

}
