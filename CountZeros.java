public class CountZeros {
    public int countTheZeroes(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountZeros cz = new CountZeros();
        int[] arr = {1,0,3,0,0,0,6,0,7,8,9,0,4,5,6,7,0};
        System.out.println(cz.countTheZeroes(arr));
    }
}
