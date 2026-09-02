public class FrequencyCount {
    //[1,1,2,2,3,4,5,3,4,5]
    public void countFrequency(int[] array){
        boolean[] visited = new boolean[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (visited[i]) {
                continue;
            }
            count = 1;
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    visited[j] = true;                
                }
            }
            System.out.println(array[i] + " " + count);
        }
    }  

    public static void main(String[] args) {
        FrequencyCount fc = new FrequencyCount();
        int[] ar = {1,1,1,2,3,4,4,5,3,4,5};
        fc.countFrequency(ar);
    }
}
