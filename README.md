# ☕ Java Overview

## What is Java?
**Java** is a **high-level, object-oriented, platform-independent programming language** widely used to build web applications, mobile apps, desktop software, and enterprise systems.

Java follows the principle **“Write Once, Run Anywhere”**, meaning Java programs can run on any system that has a Java Virtual Machine (JVM).

---

## JVM, JRE, and JDK Explained

### 🧠 JVM (Java Virtual Machine)
- Executes Java **bytecode**
- Enables **platform independence**
- Manages memory, garbage collection, and security

> JVM is the heart of Java execution.

---

### ⚙️ JRE (Java Runtime Environment)
- Contains **JVM + core Java libraries**
- Required to **run Java applications**
- Does **not** include development tools

> Used by end users who only run Java programs.

---

### 🛠️ JDK (Java Development Kit)
- Contains **JRE + development tools**
- Includes `javac` compiler, debugger, and utilities
- Required to **develop and compile Java programs**

> Used by developers.

---

## How Java Code Works (Execution Flow)

1. Developer writes Java source code (`.java`)
2. **Compiler (`javac`)** converts source code into **bytecode (`.class`)**
3. **JVM** loads and verifies the bytecode
4. **JIT compiler** converts bytecode into machine code
5. Program runs on the operating system


## Key Features
- **Platform Independence**: Java code is first compiled into a platform-neutral format called bytecode. This bytecode can then run on any system that has a Java Virtual Machine (JVM) installed, allowing the same program to work on Windows, macOS, Linux, etc., without rewriting the code.
- **Object-Oriented (OOP)**: Java organizes code around classes and objects, enabling modular, reusable, and structured programming.
- **Robust and Secure**: It includes features like strong memory management (automatic garbage collection), exception handling, and array bounds checking to reduce common bugs found in languages like C++. Untrusted code runs in a secure, sandboxed environment.
- **Rich API and Libraries**: Java provides an extensive set of built-in libraries and Application Programming Interfaces (APIs) for tasks such as networking, database connectivity (JDBC), and file handling, which speeds up development.
- **High Performance**: While initially slower than fully compiled languages, the introduction of Just-In-Time (JIT) compilers in the JVM has significantly improved execution speed.
- **Multithreading**: Java has built-in support for handling multiple tasks concurrently, which is essential for efficient and interactive applications like games and real-time systems.
