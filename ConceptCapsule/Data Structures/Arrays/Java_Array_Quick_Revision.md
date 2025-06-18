
# 📚 Java Arrays: From Basics to Advanced 

This document is a comprehensive and quick revision guide for **Arrays in Java**, designed to help you revise before interviews or coding rounds. It includes everything from declaration to in-built methods, and multi-dimensional arrays (2D & 3D).

---

## 🧩 1. Introduction to Arrays
- Arrays are **containers** that hold a fixed number of elements of the **same data type**.
- Stored in **contiguous memory**.

```java
int[] arr;            // Declaration
arr = new int[5];     // Memory allocation

// Or
int[] arr = new int[5]; // Declaration + Allocation

// Initialization
arr[0] = 10;
arr[1] = 20;
```

---

## ✏️ 2. Array Initialization Methods
```java
int[] arr = {10, 20, 30, 40, 50};         // Direct initialization
String[] names = new String[]{"A", "B"};  // Object array
```

---

## 🧮 3. Traversing Arrays
```java
// Traditional For Loop
for (int i = 0; i < arr.length; i++) {
    System.out.println(arr[i]);
}

// Enhanced For Loop
for (int value : arr) {
    System.out.println(value);
}
```

---

## 🛠️ 4. Common In-Built Methods (Using `Arrays` Class)
```java
import java.util.Arrays;

int[] a = {3, 5, 1, 4};
Arrays.sort(a);                   // Sort array
System.out.println(Arrays.toString(a));  // Print array
int idx = Arrays.binarySearch(a, 5);     // Binary search
int[] copy = Arrays.copyOf(a, a.length); // Copy array
Arrays.fill(a, 100);             // Fill with a value
```

---

## 🔁 5. Array Operations (Important for Coding Interviews)
- Reverse array
- Rotate array (left/right)
- Find max/min
- Frequency count using Map
- Prefix sum array
- Sliding window problems
- Two-pointer technique

---

## 🔷 6. 2D Arrays (Matrix)
```java
int[][] matrix = new int[3][3];             // Declaration
int[][] matrix = { {1, 2}, {3, 4} };        // Initialization

// Traversal
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
}
```

### Useful Concepts
- Row-wise and column-wise traversal
- Matrix Transpose
- Matrix Rotation (90°, 180°)
- Spiral order traversal
- Diagonal traversal

---

## 🔶 7. 3D Arrays
```java
int[][][] arr = new int[2][2][2];

// Initialization
arr[0][0][0] = 1;

// Traversal
for (int i = 0; i < arr.length; i++)
    for (int j = 0; j < arr[i].length; j++)
        for (int k = 0; k < arr[i][j].length; k++)
            System.out.print(arr[i][j][k] + " ");
```

---

## 🚀 8. Advanced Interview Problems
- Kadane’s Algorithm (Max Subarray Sum)
- Trapping Rain Water
- Merge Intervals (1D)
- Matrix Chain Multiplication (2D)
- Rotating Matrix in-place (2D)
- Maximum sum rectangle in 2D matrix
- Sparse Matrix representation

---

## 🧠 9. Tips & Tricks
- Use `Arrays.toString()` and `Arrays.deepToString()` for printing.
- Practice with edge cases: empty arrays, all same elements, sorted vs unsorted.
- Use `ArrayList` when size isn't fixed.

---

## 📌 Final Notes
- Arrays are **fixed-size** and zero-indexed.
- Always check for `IndexOutOfBoundsException`.
- Master traversal and in-place algorithms for interviews.

---
