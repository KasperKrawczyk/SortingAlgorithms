public class BubbleSort {

    public static void bubbleSort(int[] dataParam){
        int totalComparisons = 0;
        int totalExchanges = 0;
        int passes = 0;
        int[] data = dataParam;
        int first = 0;
        int comparisons = 0;
        boolean exchange = true;
        while(exchange){
            passes++;
            comparisons = 0;
            int exchanges = 0;
            exchange = false;
            int index = data.length - 1;

            while(index >= first + 1){
                comparisons++;
                if(data[index] < data[index - 1]){
                    exchange = true;
                    exchanges++;
                    int temp = data[index];
                    data[index] = data[index - 1];
                    data[index - 1] = temp;
                }
                index = index - 1;
            }
            first = first + 1;
            for(int i : data) {
                System.out.print(i + ", ");
            }
            System.out.println("\nPass " + passes + "; Exchanges = " + exchanges + "; Comparisons = " + comparisons + "\n");
            totalComparisons += comparisons;
            totalExchanges += exchanges;

        }
        System.out.println("\nPasses = " + passes +
                "; Total exchanges = " + totalExchanges +
                "; Total comparisons = " + totalComparisons);
    }

}
