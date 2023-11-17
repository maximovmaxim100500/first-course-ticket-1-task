import java.util.Arrays;

public class Main {
    public static int[] invertedArray(int[] myArray) {
        int[] array2 = new int[myArray.length];
        for (int i = 0; i <= myArray.length - 1; i++) {
            array2[myArray.length - 1 - i] = myArray[i];
        }
        return array2;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(invertedArray(array)));
    }
}
