public class LargestSmallest {
    public void largestSeclargest(int[] array){
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secSmallest = Integer.MIN_VALUE;


        for (int i = 0; i <= array.length - 1; i++) {
            if(array[i] > largest){
                secLargest = largest;
                largest = array[i];
            }else if(array[i]> secLargest && array[i]!=largest){
                secLargest = array[i];
            }else if(array[i] < smallest){
                secSmallest = smallest;
                smallest = array[i];
            }else if (array[i] > secSmallest && array[i]!=smallest) {
                secSmallest = array[i];
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secLargest);
        System.out.println("Smallest: " + smallest);
        System.out.println("Second Smallest: " + secSmallest);
    }

    public static void main(String[] args) {
        LargestSmallest lSmallest = new LargestSmallest();
        int[] arr = {5,6,3,7,9,2,23};
        lSmallest.largestSeclargest(arr);
    }
}
