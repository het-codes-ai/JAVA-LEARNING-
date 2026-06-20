import java.util.Arrays; 

public class Main {
    public static void reverse(int[] array) { 
        int start = 0;
        int end = (array.length - 1);

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int array1[] = {9, 3, 1, 3, 2, 8, 7, 0, 2, 1};
        reverse(array1);
        
        System.out.print(Arrays.toString(array1)); 
    }
}
