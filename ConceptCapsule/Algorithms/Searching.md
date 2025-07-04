# 🔎 Searching Algorithms in Java

Welcome to the **Searching Algorithms** guide!
This README will help you understand the internal working of various searching algorithms from beginner to advanced level, explained **visually** and with Java code examples.

---

## 📚 Table of Contents

1. [Introduction to Searching](#-introduction-to-searching)
2. [Linear Search](#-linear-search)
3. [Binary Search](#-binary-search)
4. [Jump Search](#-jump-search)
5. [Interpolation Search](#-interpolation-search)
6. [Exponential Search](#-exponential-search)
7. [Fibonacci Search](#-fibonacci-search)
8. [Comparison Table](#-comparison-table)
9. [Practice Problems](#-practice-problems)
10. [Conclusion](#-conclusion)

---

## 📘 Introduction to Searching

Searching is the process of finding a particular item in a collection of data. Based on the data structure and data distribution, different searching techniques are used.

### 🔍 Why Learn Multiple Searching Algorithms?
Each algorithm has different trade-offs in **time complexity**, **space usage**, and **data requirements** (sorted/unsorted).

---

## 🔎 Linear Search

### ✅ Use When:
- Array is **unsorted**
- Simplicity is preferred over efficiency

### 🔧 Working:
Check each element one-by-one until the target is found.

```
[3, 5, 7, 9, 2]
 ↑
Target = 7
```

### 🧠 Java Code:
```java
public class LinearSearch {
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
}
```

### 📊 Time Complexity:
- Worst: O(n)
- Best: O(1)
- Space: O(1)

---

## ⚖️ Binary Search

### ✅ Use When:
- Array is **sorted**

### 🔧 Working:
Split the array in half, repeatedly, to locate the target.

```
[1, 3, 5, 7, 9]
     ↑
Target = 7
```

### 🧠 Java Code:
```java
public class BinarySearch {
    public static int search(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
```

### 📊 Time Complexity:
- Worst: O(log n)
- Best: O(1)
- Space: O(1)

---

## 📐 Jump Search

### ✅ Use When:
- Array is **sorted**
- Faster than linear, simpler than binary

### 🔧 Working:
Jump ahead by fixed steps, then perform linear search in the identified block.

```
[1, 3, 5, 7, 9]
  ↑    ↑
Step = √n
```

### 🧠 Java Code:
```java
public class JumpSearch {
    public static int search(int[] arr, int target) {
        int n = arr.length;
        int step = (int)Math.floor(Math.sqrt(n));
        int prev = 0;

        while (arr[Math.min(step, n) - 1] < target) {
            prev = step;
            step += (int)Math.floor(Math.sqrt(n));
            if (prev >= n) return -1;
        }

        while (arr[prev] < target) {
            prev++;
            if (prev == Math.min(step, n)) return -1;
        }

        if (arr[prev] == target) return prev;
        return -1;
    }
}
```

### 📊 Time Complexity:
- Worst: O(√n)
- Best: O(1)

---

## 📈 Interpolation Search

### ✅ Use When:
- Array is **uniformly distributed & sorted**

### 🔧 Working:
Predict the likely position of the target using linear interpolation.

```
position = low + [(target - arr[low]) × (high - low)] / (arr[high] - arr[low])
```

### 🧠 Java Code:
```java
public class InterpolationSearch {
    public static int search(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high && target >= arr[low] && target <= arr[high]) {
            int pos = low + ((target - arr[low]) * (high - low)) / (arr[high] - arr[low]);
            if (arr[pos] == target) return pos;
            if (arr[pos] < target) low = pos + 1;
            else high = pos - 1;
        }
        return -1;
    }
}
```

### 📊 Time Complexity:
- Best: O(log log n)
- Worst: O(n)

---

## 📡 Exponential Search

### ✅ Use When:
- **Unbounded or large sorted array**

### 🔧 Working:
Double index until range is found, then do binary search.

### 🧠 Java Code:
```java
import java.util.Arrays;

public class ExponentialSearch {
    public static int search(int[] arr, int target) {
        if (arr[0] == target) return 0;
        int i = 1;
        while (i < arr.length && arr[i] <= target) i *= 2;
        return Arrays.binarySearch(arr, i / 2, Math.min(i, arr.length), target);
    }
}
```

### 📊 Time Complexity:
- O(log i), where i is the index of target

---

## 🧮 Fibonacci Search

### ✅ Use When:
- Array is **sorted** and you want to minimize comparisons

### 🔧 Working:
Use Fibonacci numbers to divide array and reduce search space.

### 🧠 Java Code:
```java
public class FibonacciSearch {
    public static int search(int[] arr, int target) {
        int fibMMm2 = 0;
        int fibMMm1 = 1;
        int fibM = fibMMm2 + fibMMm1;

        while (fibM < arr.length) {
            fibMMm2 = fibMMm1;
            fibMMm1 = fibM;
            fibM = fibMMm2 + fibMMm1;
        }

        int offset = -1;
        while (fibM > 1) {
            int i = Math.min(offset + fibMMm2, arr.length - 1);
            if (arr[i] < target) {
                fibM = fibMMm1;
                fibMMm1 = fibMMm2;
                fibMMm2 = fibM - fibMMm1;
                offset = i;
            } else if (arr[i] > target) {
                fibM = fibMMm2;
                fibMMm1 -= fibMMm2;
                fibMMm2 = fibM - fibMMm1;
            } else return i;
        }

        if (fibMMm1 == 1 && offset + 1 < arr.length && arr[offset + 1] == target)
            return offset + 1;

        return -1;
    }
}
```

---

## 📊 Comparison Table

| Algorithm           | Time Complexity (Best) | Time Complexity (Worst) | Data Type    | Notes                            |
|---------------------|------------------------|---------------------------|--------------|----------------------------------|
| Linear Search        | O(1)                  | O(n)                     | Unsorted     | Simple but slow                  |
| Binary Search        | O(1)                  | O(log n)                 | Sorted        | Fast and efficient               |
| Jump Search          | O(1)                  | O(√n)                    | Sorted        | Good for mid-sized arrays        |
| Interpolation Search | O(log log n)          | O(n)                     | Sorted & Uniform | Predictive and fast          |
| Exponential Search   | O(log i)              | O(log i)                 | Sorted        | Useful for unbounded arrays      |
| Fibonacci Search     | O(log n)              | O(log n)                 | Sorted        | Less common, minimizes comparisons |

---

## 🧪 Practice Problems

1. Implement each search algorithm in Java
2. Find the first and last occurrence of a number using binary search
3. Search in rotated sorted array
4. Search in infinite sorted array (use exponential search)
5. Compare performance of search algorithms

---

## ✅ Conclusion

Each searching algorithm has its purpose and advantages. As a Java developer, knowing when and how to use them gives you a great edge in interviews and real-world applications.

---

### 👨‍💻 Author

**Pratik Tikande**  
Learning Java & Algorithms  
GitHub: [@pratiktikande](https://github.com/pratiktikande)
