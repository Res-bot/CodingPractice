public class SeparateOddEven {
    public void separateOddEven(int[] array){
        int[] eve = new int[array.length];
        int[] odd = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0){
                eve[i] = array[i];
                System.out.print(eve[i]);
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odd[i] = array[i];
                System.out.print(odd[i]);
            }
        }
    }

    public static void main(String[] args) {
        SeparateOddEven sEven = new SeparateOddEven();
        int[] arr = {4,7,8,6,5,1,2,3};
        sEven.separateOddEven(arr);
    }
}
