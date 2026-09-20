class TwoSum{
    public void returnTheIndex(int[] array, int target){
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println(i + " , " + j);
                }

            }
        }
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        int[] arr = {2,7,11,15};
        ts.returnTheIndex(arr, 26);
    }
}