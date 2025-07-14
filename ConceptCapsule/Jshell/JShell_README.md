
# ⚡ JShell – Java Shell Tool

JShell (Java Shell) is an interactive tool introduced in **Java 9** that allows developers to quickly execute Java code snippets, test features, and learn Java without the need to write an entire class or method.

---

## 🚀 What is JShell?

JShell is a **REPL** (Read-Eval-Print Loop) for the Java programming language. It provides a command-line interface to evaluate Java code dynamically, making it great for:

- Learning Java interactively 🧠
- Testing code snippets without creating full classes 🚧
- Exploring Java APIs quickly 🧪

---

## 📦 Key Features

- ✅ Instant feedback loop
- ✅ No need for full class or method declarations
- ✅ Auto-completion and syntax highlighting
- ✅ Integrated documentation support (`/help`, `/list`, `/exit`, etc.)
- ✅ Suitable for beginners and professionals alike

---

## 🛠️ How to Start JShell ##

1. Make sure Java 9 or higher is installed.
2. Open terminal/command prompt.
3. Type the command:

```bash
jshell
```

You’ll enter the interactive shell:
```bash
|  Welcome to JShell -- Version 17
|  For an introduction type: /help intro
jshell> 
```

---

## ✍️ Basic Usage Examples

### ➕ Arithmetic Operations
```java
jshell> 5 + 3
$1 ==> 8
```

### 📄 Declare Variables
```java
jshell> String name = "JShell";
name ==> "JShell"
```

### 🧮 Create Methods
```java
jshell> int square(int x) { return x * x; }
jshell> square(5)
$2 ==> 25
```

---

## 🧰 Useful Commands

| Command         | Description                       |
|-----------------|-----------------------------------|
| `/help`         | Displays help options             |
| `/vars`         | Shows defined variables           |
| `/methods`      | Lists defined methods             |
| `/list`         | Shows command history             |
| `/reset`        | Clears the session                |
| `/exit`         | Exits the JShell prompt           |

---

## 🎯 Benefits of Using JShell

- 💡 Perfect for learning and experimenting
- 🧪 Test code before adding to production
- 📚 Quickly explore new Java APIs and libraries
- 💼 No IDE required – runs from terminal

---

## 📚 Resources

- [Official Java JShell Documentation](https://docs.oracle.com/javase/9/jshell/introduction-jshell.htm)
- [Oracle Blog on JShell](https://blogs.oracle.com/javamagazine/post/introduction-to-jshell)

> _“Experiment, Learn, and Build Faster with JShell!”_
