public class mergeSort {
 
    public static void main(String[] args) {
        var array = new int[] {3, 9, 10, 1, 8, 7, 5, 2};
        mergeSort(array);
        for (int element: array) {
            System.out.print(element + " ");
        }
    }
 
    public static void mergeSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }
 
        // Break the array in two halves
        int mid = array.length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[array.length - mid];
 
        System.arraycopy(array, 0, leftArray, 0, mid);
 
        if (array.length - mid >= 0)
            System.arraycopy(array, mid, rightArray,
                              0, array.length - mid);
 
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }
 
    private static void merge(int[] leftArray,
                              int[] rightArray, int[] array) {
        int i = 0, j = 0, k = 0;
 
        // Effectively sorts left and right array
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] <= rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }
        while (i < leftArray.length) {
            array[k++] = leftArray[i++];
        }
        while (j < rightArray.length) {
            array[k++] = rightArray[j++];
        }
    }
}
