public class SortingAlgorithms {
    // Implementasi Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Tukar elemen jika tidak dalam urutan yang benar
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Implementasi Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // Tukar elemen minimum yang ditemukan dengan elemen pertama
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    // Method untuk mencetak array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method untuk testing
    public static void main(String[] args) {
        // Test Bubble Sort
        int[] arr1 = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array sebelum Bubble Sort:");
        printArray(arr1);
        bubbleSort(arr1);
        System.out.println("Array setelah Bubble Sort:");
        printArray(arr1);

        // Test Selection Sort
        int[] arr2 = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("\nArray sebelum Selection Sort:");
        printArray(arr2);
        selectionSort(arr2);
        System.out.println("Array setelah Selection Sort:");
        printArray(arr2);
    }
}