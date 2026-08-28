//[2,3,4,5,6,7,8]

class AlternateElements{
    public void findAlternateElements(int[] array){
        for (int i = 0; i < array.length; i++) {
            if(i%2==0){
                continue;
            }else{
                System.out.println(array[i]);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        AlternateElements a = new AlternateElements();

        a.findAlternateElements(arr);
    }
}