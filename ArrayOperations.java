public class ArrayOperations {
    public void insertBeginning(int[] array, int value){
        int[] newarr1 = new int[array.length +1];

        for (int i = 1; i < newarr1.length ; i++) {
            newarr1[i] = array[i-1];
        }
        newarr1[0] = value;

        for (int i = 0; i < newarr1.length ; i++) {
            System.out.print(newarr1[i] + " ");
        }

        System.out.println();
    }

    public void insertEnd(int[] array, int value){
        int[] newarr2 = new int[array.length +1];

        for (int i = 0; i < array.length; i++) {
            newarr2[i] = array[i];
        }

        newarr2[newarr2.length-1] = value;

        for (int i = 0; i < newarr2.length; i++) {
            System.out.print(newarr2[i] + " ");
        }

        System.out.println();
    }

    public void insertAtPos(int[] array, int position, int value){
        if (position<1 || position>array.length-1) {
            System.out.println("Invalid position");
            return;
        }

        int[] newArr3 = new int[array.length+1];

        int index = position - 1;

        for (int i = 0; i < index; i++) {
            newArr3[i] = array[i];
        }

        newArr3[index] = value;

        for (int i = index; i < array.length; i++) {
            newArr3[i+1] = array[i];
        }

        for (int i = 0; i < newArr3.length; i++) {
            System.out.print(newArr3[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        ArrayOperations arp = new ArrayOperations();
        int[] ar = {10,20,30,40,50};
        arp.insertBeginning(ar, 9);
        arp.insertEnd(ar, 60);
        arp.insertAtPos(ar, 3, 78 );
    }
}
