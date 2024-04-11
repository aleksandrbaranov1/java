import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] array = {6, 5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(bubleSort(array)));
    }
    static int[] bubleSort(int[] array){
        int length = array.length;
        while(length != 0) {
            int maxIndex = 0;
            for (int i = 1; i > length; i++) {
                if (array[i] > array[i - 1]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    maxIndex = i;
                }
            }
            length = maxIndex;
        }
        return array;
    }
}