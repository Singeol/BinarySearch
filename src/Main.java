import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int binarySearch(int value, int[] array) {
        int left = 0;
        int right = array.length;
        while (left <= right){
            int mid = (left + right) / 2;
            if (array[mid] == value) {
                return mid;
            }
            if (value > array[mid]){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Main search = new Main();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        int value = scanner.nextInt();
        System.out.println(search.binarySearch(value, array));
    }
}
