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
Accepts any premitive or object type in an array.

#### Example (Bubble-Sort with Ascending order using String array):
```java
        String[] words = new String[]{"Cake", "Cage", "Orange", "Flora"};
        String[] sorted = UniverselSorter.bubbleSort(words, SortingOrder.ASCENDING);
```
##### Output Array
```java
        {"Cage", "Cake", "Flora", "Orange"}
```

#### Example (Insertion-Sort with Descending order using int array; inline):
```java
        String[] sorted = UniverselSorter.insertionSort(new Integer[]{3, 7, 1, 2, 0, 4}, SortingOrder.DESCENDING);
```
##### Output Array
```java
        {7, 4, 3, 2, 1, 0}
```

### More examples with different algorithms

* Insertion Sort:
```java
        String[] words = new String[]{"Cake", "Cage", "Orange", "Flora"};
        String[] sorted = UniverselSorter.insertionSort(words, SortingOrder.ASCENDING);
```

* Selection Sort:
```java
        String[] words = new String[]{"Cake", "Cage", "Orange", "Flora"};
        String[] sorted = UniverselSorter.selectionSort(words, SortingOrder.ASCENDING);
```

* Quick Sort:
```java
        String[] words = new String[]{"Cake", "Cage", "Orange", "Flora"};
        String[] sorted = UniverselSorter.quickSort(words, SortingOrder.ASCENDING);
```

* Merge Sort:
```java
        String[] words = new String[]{"Cake", "Cage", "Orange", "Flora"};
        String[] sorted = UniverselSorter.mergeSort(words, SortingOrder.ASCENDING);
```
