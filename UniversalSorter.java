import java.util.Arrays;

public class UniversalSorter<T> {

    private static <T extends Comparable<T>> T[] swap(T[] array, int low, int high) {
        T temp = array[low];
        array[low] = array[high];
        array[high] = temp;
        return array;
    }

    public static <T extends Comparable<T>> T[] bubbleSort(T[] input, int sortingOrder) {
        int j;
        boolean flag = true;   // set flag to true to begin first pass
        T temp;   //holding variable

        while (flag) {
            flag = false;    //set flag to false awaiting a possible swap
            for (j = 0; j < input.length - 1; j++) {
                switch (sortingOrder) {
                    case SortingOrder.ASCENDING:
                        if (input[j].compareTo(input[j + 1]) > 0)   // change to > for ascending sort
                        {
                            input = swap(input, j, j + 1);
                            flag = true;              //shows a swap occurred
                        }
                        break;
                    case SortingOrder.DESCENDING:
                        if (input[j].compareTo(input[j + 1]) < 0)   // change to > for ascending sort
                        {
                            input = swap(input, j, j + 1);
                            flag = true;              //shows a swap occurred
                        }
                        break;
                    default: //ascending
                        if (input[j].compareTo(input[j + 1]) > 0)   // change to > for ascending sort
                        {
                            input = swap(input, j, j + 1);
                            flag = true;              //shows a swap occurred
                        }
                        break;
                }
            }
        }
        return input;
    }

    public static <T extends Comparable<T>> T[] selectionSort(T[] input, int sortingOrder) {
        for (int i = 0; i < input.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < input.length; j++) {
                switch (sortingOrder) {
                    case SortingOrder.ASCENDING:
                        if (input[j].compareTo(input[index]) < 0) {
                            index = j;//searching for lowest index
                        }
                        break;
                    case SortingOrder.DESCENDING:
                        if (input[j].compareTo(input[index]) > 0) {
                            index = j;//searching for lowest index
                        }
                        break;
                    default:
                        if (input[j].compareTo(input[index]) < 0) {
                            index = j;//searching for lowest index
                        }
                }
            }
            T smallerNumber = input[index];
            input[index] = input[i];
            input[i] = smallerNumber;
        }
        return input;
    }

    public static <T extends Comparable<T>> T[] quickSort(T[] input, int sortingOrder) {
        return quickSortRecursive(input, 0, input.length - 1, sortingOrder);
    }

    private static <T extends Comparable<T>> T[] quickSortRecursive(T[] input, int low, int high, int sortingOrder) {
        int i = low; //lower index
        int j = high; //higher index
        // calculate pivot number
        T pivot = input[low + (high - low) / 2];
        // Divide into two arrays
        while (i <= j) {
            switch (sortingOrder) {
                case SortingOrder.ASCENDING:
                    while (input[i].compareTo(pivot) < 0) {
                        i++;
                    }
                    while (input[j].compareTo(pivot) > 0) {
                        j--;
                    }
                    break;
                case SortingOrder.DESCENDING:
                    while (input[i].compareTo(pivot) > 0) {
                        i++;
                    }
                    while (input[j].compareTo(pivot) < 0) {
                        j--;
                    }
                    break;
                default:
                    while (input[i].compareTo(pivot) < 0) {
                        i++;
                    }
                    while (input[j].compareTo(pivot) > 0) {
                        j--;
                    }
                    break;
            }
            if (i <= j) {
                input = swap(input, i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (low < j)
            input = quickSortRecursive(input, low, j, sortingOrder);
        if (i < high)
            input = quickSortRecursive(input, i, high, sortingOrder);
        return input;
    }

    private static <T extends Comparable<T>> T[] merge(T arr[], int beg, int mid, int end, int sortingOrder) {

        int l = mid - beg + 1;
        int r = end - mid;

        T leftArr[] = Arrays.copyOfRange(arr, beg, mid + 1);
        T rightArr[] = Arrays.copyOfRange(arr, mid + 1, end + 1);

        int i = 0, j = 0;
        int k = beg;

        while (i < l && j < r) {
            switch (sortingOrder) {
                case SortingOrder.ASCENDING:
                    if (leftArr[i].compareTo(rightArr[j]) <= 0) {
                        arr[k] = leftArr[i];
                        i++;
                    } else {
                        arr[k] = rightArr[j];
                        j++;
                    }
                    break;
                case SortingOrder.DESCENDING:
                    if (leftArr[i].compareTo(rightArr[j]) > 0) {
                        arr[k] = leftArr[i];
                        i++;
                    } else {
                        arr[k] = rightArr[j];
                        j++;
                    }
                    break;
                default:
                    if (leftArr[i].compareTo(rightArr[j]) <= 0) {
                        arr[k] = leftArr[i];
                        i++;
                    } else {
                        arr[k] = rightArr[j];
                        j++;
                    }
                    break;
            }
            k++;
        }
        while (i < l) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < r) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
        return arr;
    }

    private static <T extends Comparable<T>> T[] mergeSortRecursive(T arr[], int beg, int end, int sortingOrder) {
        if (beg < end) {
            int mid = (beg + end) / 2;
            arr = mergeSortRecursive(arr, beg, mid, sortingOrder);
            arr = mergeSortRecursive(arr, mid + 1, end, sortingOrder);
            arr = merge(arr, beg, mid, end, sortingOrder);
        }
        return arr;
    }

    public static <T extends Comparable<T>> T[] mergeSort(T input[], int sortingOrder) {
        return mergeSortRecursive(input, 0, input.length - 1, sortingOrder);
    }

    public static <T extends Comparable<T>> T[] insertionSort(T input[], int sortingOrder) {
        int n = input.length;
        for (int j = 1; j < n; j++) {
            T key = input[j];
            int i = j - 1;
            switch (sortingOrder) {
                case SortingOrder.ASCENDING:
                    while ((i > -1) && (input[i].compareTo(key) > 0)) {
                        input[i + 1] = input[i];
                        i--;
                    }
                    break;
                case SortingOrder.DESCENDING:
                    while ((i > -1) && (input[i].compareTo(key) < 0)) {
                        input[i + 1] = input[i];
                        i--;
                    }
                    break;
                default:
                    while ((i > -1) && (input[i].compareTo(key) > 0)) {
                        input[i + 1] = input[i];
                        i--;
                    }
                    break;
            }
            input[i + 1] = key;
        }
        return input;
    }
}
