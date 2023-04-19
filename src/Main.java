import java.util.Scanner;

public class Main {
    // Метод binarySearch принимает на вход элемент value и массив array
    // и возвращает индекс элемента в массиве, если он найден, или -1 в противном случае
    public int binarySearch(int value, int[] array) {
        int left = 0; // Индекс первого элемента в массиве
        int right = array.length; // Индекс последнего элемента в массиве + 1
        while (left <= right){ // Пока левый индекс меньше или равен правому
            int mid = (left + right) / 2; // Середина массива
            if (array[mid] == value) { // Если средний элемент равен искомому значению
                return mid; // Возвращаем индекс среднего элемента
            }
            if (value > array[mid]){ // Если искомый элемент больше среднего
                left = mid + 1; // Устанавливаем левый индекс равным mid + 1
            }
            else {
                right = mid - 1; // Иначе устанавливаем правый индекс равным mid - 1
            }
        }
        return -1; // Если элемент не найден, возвращаем -1
    }

    public static void main(String[] args) {
        Main search = new Main(); // Создаем экземпляр класса Main
        Scanner scanner = new Scanner(System.in); // Создаем объект Scanner для чтения ввода с клавиатуры
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt(); // Читаем размер массива
        System.out.print("Введите элементы массива: ");
        int[] array = new int[size]; // Создаем массив заданного размера
        for (int i = 0; i < size; i++){ // Цикл для чтения элементов массива
            array[i] = scanner.nextInt(); // Читаем элемент массива
        }
        System.out.print("Введите значение, которое необходимо найти: ");
        int value = scanner.nextInt(); // Читаем искомый элемент
        System.out.println("Результат поиска: " + search.binarySearch(value, array)); // Выводим результат поиска
    }
}