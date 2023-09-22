package ss14_sort.bai_tap;

public class InsertSortByStep {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};

        System.out.println("Your array:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("\nArray after sort:");
        printArray(arr);
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

            System.out.println("Step " + i + ":");
            printArray(arr);
            System.out.println("Change value at index "+ (j + 1) + " to " + key );
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

