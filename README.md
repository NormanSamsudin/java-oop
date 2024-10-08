# Common Java Interview Questions (Entry-Level)

## 1. Basic Java Concepts:
- **What is Java?**
  Java is a high-level, object-oriented programming language known for its platform independence.

- **Difference between JDK, JRE, and JVM?**
  - **JDK**: Java Development Kit (tools to develop Java applications).
  - **JRE**: Java Runtime Environment (libraries + JVM to run Java programs).
  - **JVM**: Java Virtual Machine (executes Java bytecode).

## 2. OOP Concepts:
- **What are the principles of Object-Oriented Programming (OOP)?**
  1. **Encapsulation**: Binding data and methods together.
  2. **Inheritance**: Reuse properties from one class to another.
  3. **Polymorphism**: One interface, many forms (e.g., method overloading/overriding).
  4. **Abstraction**: Hiding complex details and showing only essentials.

- **What is method overloading and method overriding?**
  - **Overloading**: Same method name with different parameters.
  - **Overriding**: Redefining a parent class method in a subclass.

## 3. Java Core Concepts:
- **What is a constructor, and how is it different from a method?**
  A constructor initializes an object, while a method defines the behavior of an object.

- **What are static methods and variables?**
  Static methods/variables belong to the class rather than instances.

# Java Data Structure Comparison

In Java, different data structures are used based on requirements such as data access speed, insert/delete operations, and thread safety. Below is a comparison of some commonly used data structures:

| **Data Structure** | **Underlying Structure**    | **Order**      | **Duplicates Allowed** | **Random Access** | **Insertion/Deletion Performance** | **Key Use Case**                                                               |
| ------------------ | --------------------------- | -------------- | ---------------------- | ----------------- | ---------------------------------- | ------------------------------------------------------------------------------ |
| **Array**          | Fixed-size array            | Ordered        | Yes                    | Fast (O(1))       | Insert/Delete: Slow (O(n))         | Static data storage with known size.                                           |
| **ArrayList**      | Resizable array             | Ordered        | Yes                    | Fast (O(1))       | Insert/Delete: Slow (O(n))         | Dynamic lists with fast access but infrequent modifications.                   |
| **LinkedList**     | Doubly linked list          | Ordered        | Yes                    | Slow (O(n))       | Insert/Delete: Fast (O(1) at ends) | Frequent insertions/deletions, especially in the middle of the list.           |
| **Queue**          | Linked list or array-backed | Ordered (FIFO) | Yes                    | Slow (O(n))       | Insert/Delete: Fast (O(1))         | First-In-First-Out (FIFO) operations, like task scheduling.                    |
| **HashMap**        | Hash table                  | Unordered      | No (Unique keys only)  | Fast (O(1))       | Insert/Delete: Fast (O(1))         | Key-value pairs with fast lookups, especially when key uniqueness is required. |
| **HashSet**        | Hash table                  | Unordered      | No                     | N/A               | Insert/Delete: Fast (O(1))         | Storing unique elements with fast access and no duplicates.                    |

### Detailed Comparison:

1. **Array**:
   - **Size**: Fixed, specified at creation.
   - **Use Case**: When the number of elements is known and unlikely to change.

2. **ArrayList**:
   - **Size**: Dynamic, grows as elements are added..
   - **Use Case**: When frequent access is required, but the size may change.

3. **LinkedList**:
   - **Size**: Dynamic, linked nodes.
   - **Use Case**: When frequent insertions or deletions are required, especially from the middle.

4. **Queue**:
   - **Order**: First-In-First-Out (FIFO).
   - **Use Case**: Task scheduling, process handling, and real-time message queues.

5. **HashMap**:
   - **Structure**: Key-value pairs with unique keys.
   - **Access Time**: Fast random access (O(1)).
   - **Use Case**: When you need to quickly find, add, or remove key-value pairs.

6. **HashSet**:
   - **Size**: A collection of unique elements.
   - **Access Time**: Fast random access (O(1)).
   - **Use Case**: When you need to store unique elements and ensure no duplicates.


## 5. Collections:
- **What is the difference between `ArrayList` and `LinkedList`?**
  - **ArrayList**: Fast random access, slower insertions/deletions.
  - **LinkedList**: Faster insertions/deletions, slower random access.

## 6. Exception Handling:
- **What is an exception?**
  An exception is an event that disrupts normal program flow.

- **Difference between checked and unchecked exceptions?**
  - **Checked**: Must be handled at compile-time (`IOException`).
  - **Unchecked**: Occur during runtime (`NullPointerException`).

## 7. Multithreading:
- **What is a thread in Java?**
  A thread is a lightweight process that allows multiple operations to occur simultaneously.

- **How to create a thread?**
  - By extending `Thread` class.
  - By implementing `Runnable` interface.

## 8. Java 8 Features:
- **What is a lambda expression?**
  A lambda expression is a concise way to represent a functional interface.

- **What is the Stream API?**
  The Stream API provides a way to process collections in a functional style.

## 9. Coding Questions:
- Write a Java program to check if a string is a palindrome.
- Write a Java program to find the largest number in an array.
- Implement a sorting algorithm (e.g., Bubble Sort, Selection Sort).

# Access Modifiers in Java

In Java, access modifiers determine the visibility or accessibility of classes, methods, and variables. There are four main types of access modifiers:

## 1. **Public**

- **Definition**: The `public` modifier allows a class, method, or variable to be accessible from any other class in any package.
  
- **Usage**: It is used when you want to make something available universally.

- **Example**:
    ```java
    public class MyClass {
        public int myVariable;

        public void myMethod() {
            // method logic
        }
    }
    ```

## 2. **Private**

- **Definition**: The `private` modifier restricts the visibility of a class member (method or variable) to the containing class only. No other class can access it, even if they are in the same package.

- **Usage**: It is used to encapsulate and protect the internal state of an object.

- **Example**:
    ```java
    public class MyClass {
        private int myVariable;

        private void myMethod() {
            // method logic
        }
    }
    ```

## 3. **Protected**

- **Definition**: The `protected` modifier allows visibility to classes in the same package and also to subclasses (even if they are in different packages).

- **Usage**: It is used when you want to allow a class's members to be accessible by subclasses and classes in the same package.

- **Example**:
    ```java
    public class MyClass {
        protected int myVariable;

        protected void myMethod() {
            // method logic
        }
    }
    ```

## 4. **Default (Package-Private)**

- **Definition**: When no access modifier is specified, it is considered default (also known as package-private). This means the class, method, or variable is accessible only within its own package.

- **Usage**: It is used when you want to limit access to classes within the same package without exposing them to classes in other packages.

- **Example**:
    ```java
    class MyClass { // Default access modifier
        int myVariable; // Default access

        void myMethod() {
            // method logic
        }
    }
    ```

## Summary

| Access Modifier | Accessible in the Same Package | Accessible in Subclasses | Accessible in Other Packages |
| --------------- | ------------------------------ | ------------------------ | ---------------------------- |
| Public          | Yes                            | Yes                      | Yes                          |
| Private         | No                             | No                       | No                           |
| Protected       | Yes                            | Yes                      | No                           |
| Default         | Yes                            | No                       | No                           |

Understanding these access modifiers is crucial for designing classes and managing visibility, encapsulation, and inheritance in Java.
