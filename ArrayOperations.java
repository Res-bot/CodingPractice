public class ArrayOperations {

    //insert array at first position 
    public int[] insertfirstPosition(int[] array, int value){
        int[] newArr = new int[array.length+1];

        //shifting elements to right
        for (int i = 0; i < array.length; i++) {
            newArr[i+1] = array[i];
        }

        newArr[0] = value;

        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }

        return newArr;
    }

    

    public static void main(String[] args) {
        ArrayOperations arop = new ArrayOperations();
        int arr[] = {10, 20, 30, 40, 50};
        arop.insertfirstPosition(arr, 4);
    }
}
