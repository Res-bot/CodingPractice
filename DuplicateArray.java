public class DuplicateArray {
    public void createDuplicateArray(int[] array){
        int[] arr = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }

    public static void main(String[] args) {
        DuplicateArray dArray = new DuplicateArray();
        int[] ar = {1,2,3,4,5,6};
        dArray.createDuplicateArray(ar);
    }
}
