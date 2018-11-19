# Universal-Sorter---JAVA
Universal Sorter is a lightweight Utility class for sorting needs in JAVA. The utility class supports sorting any primitive type or object type (including String) in 5 different sorting algorithms.


## NOTE:
You're free to distribute, optimize.

## Installation:
Adding above java classes to your JAVA project is enough.

## Supported Operations:
#### Ordering:
```
Ascending, Descending
```
#### Algorithms
* Bubble-Sort (smaller size arrays preffered)
* Selection-Sort
* Insertion-Sort
* Quick-Sort (Optimized for large size arrays)
* Merge-Sort (Optimized for large size arrays)

## Usage:
Accepts any primitive or object type array.

#### Example (Bubble-Sort with Ascending order using String array):
```java
        String[] words = new String[]{"Cake", "Cage", "Orange", "Flora"};
        String[] sorted = UniversalSorter.bubbleSort(words, SortingOrder.ASCENDING);
```
##### Output Array
```java
        {"Cage", "Cake", "Flora", "Orange"}
```

#### Example (Insertion-Sort with Descending order using int array; inline):
```java
        int[] sorted = UniversalSorter.insertionSort(new Integer[]{3, 7, 1, 2, 0, 4}, SortingOrder.DESCENDING);
```
##### Output Array
```java
        {7, 4, 3, 2, 1, 0}
```

### More examples with different algorithms:

* Bubble Sort:
```java
        String[] words = new String[]{"Cake", "Cage", "Orange", "Flora"};
        String[] sorted = UniversalSorter.bubbleSort(words, SortingOrder.ASCENDING);
```

* Insertion Sort:
```java
        String[] words = new String[]{"Cake", "Cage", "Orange", "Flora"};
        String[] sorted = UniversalSorter.insertionSort(words, SortingOrder.ASCENDING);
```

* Selection Sort:
```java
        String[] words = new String[]{"Cake", "Cage", "Orange", "Flora"};
        String[] sorted = UniversalSorter.selectionSort(words, SortingOrder.ASCENDING);
```

* Quick Sort:
```java
        String[] words = new String[]{"Cake", "Cage", "Orange", "Flora"};
        String[] sorted = UniversalSorter.quickSort(words, SortingOrder.ASCENDING);
```

* Merge Sort:
```java
        String[] words = new String[]{"Cake", "Cage", "Orange", "Flora"};
        String[] sorted = UniversalSorter.mergeSort(words, SortingOrder.ASCENDING);
```
