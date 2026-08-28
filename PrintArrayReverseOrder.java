public class PrintArrayReverseOrder {
    public void reverseTheArray(int[] array){
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }

    public static void main(String[] args) {
        PrintArrayReverseOrder pOrder = new PrintArrayReverseOrder();
        int[] arr = {6,5,4,3,2,1};
        pOrder.reverseTheArray(arr);
    }
}
