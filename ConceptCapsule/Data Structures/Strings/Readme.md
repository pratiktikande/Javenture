
# 📚 Java Strings: From Basics to Advanced

This document is a comprehensive and quick revision guide for **Strings in Java**, It covers declaration, methods, comparison, immutability, and common string interview problems.

---

## 🧩 1. Introduction to Strings

- Strings in Java are objects that represent sequences of characters.
- Defined in `java.lang.String` class.
- Strings are **immutable**.

```java
String str = "Hello";             // String literal
String str2 = new String("Hi");   // Using constructor
```

---

## ✏️ 2. Common String Operations

```java
String s = "Java Programming";

int len = s.length();                // Get length
char ch = s.charAt(2);              // Get character at index
String sub = s.substring(5);        // Substring from index
String sub2 = s.substring(5, 10);   // Substring from index to index

String lower = s.toLowerCase();     // Convert to lowercase
String upper = s.toUpperCase();     // Convert to uppercase
boolean b = s.contains("Java");     // Check if contains
String[] parts = s.split(" ");      // Split by space
```

---

## 🪞 3. String Comparison

```java
String a = "Hello";
String b = "Hello";
String c = new String("Hello");

System.out.println(a == b);        // true (both refer to same object in string pool)
System.out.println(a == c);        // false (different objects)
System.out.println(a.equals(c));   // true (content comparison)
```

Use `.equals()` for **content comparison**, not `==`.

---

## 🔁 4. StringBuilder and StringBuffer

- **StringBuilder**: Mutable, not thread-safe.
- **StringBuffer**: Mutable, thread-safe.

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");          // Append text
sb.insert(5, " Java");        // Insert text
sb.reverse();                 // Reverse string
```

Use `StringBuilder` when frequent modifications are needed.

---

## 🛠️ 5. Useful In-Built Methods

```java
String s = " Hello World ";

s.trim();                     // Removes leading/trailing spaces
s.replace("Hello", "Hi");     // Replace text
s.indexOf("World");           // Index of substring
s.startsWith(" H");           // Check prefix
s.endsWith("d ");             // Check suffix
```

---

## 💡 6. String Immutability

- Once created, the value of a String cannot be changed.
- All string operations return a **new string**.

```java
String s = "abc";
s.concat("def");     // New string created, old string unchanged
```

---

## 🚀 7. Advanced Interview Problems

- Reverse a string
- Check for palindrome
- Longest Palindromic Substring
- String Compression
- Anagram check
- Remove duplicates
- Longest substring without repeating characters
- Count and say problem
- Rabin-Karp / KMP for pattern matching

---

## 🧠 8. Tips & Tricks

- Use `StringBuilder` for string manipulation in loops.
- Learn regular expressions for pattern matching.
- Know `intern()` method for memory optimization.
- Master sliding window and hash map-based problems for string algorithms.

---

## 📌 Final Notes

- Strings are immutable and stored in the string pool.
- Prefer `StringBuilder` for performance.
- Always check for `null` to avoid `NullPointerException`.
