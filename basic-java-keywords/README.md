## package
A package is used to group related classes.
```java
package com.marcusbiel.lesson1.garage;
```

## import
Import a package, class or interface to be referred to later without including their package names in the reference.
```java
import com.marcusbiel.lesson1.car.Bmw; // import a single class
import com.marcusbiel.lesson1.car.*; // import all files of a package
```

## class
A class is a user defined blueprint or prototype from which objects are created.  It represents the set of properties or methods that are common to all objects of one type.

## method
Method is a collection of statements that are grouped together to perform an operation.

## variable
1) Local Variable
A variable **declared inside the body of the method** is called local variable. You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.

    **A local variable cannot be defined with "static" keyword.**

2) Instance Variable
A variable **declared inside the class but outside the body of the method**, is called an instance variable. It is not declared as static.

    It is called an instance variable because its value is **instance-specific and is not shared among instances**.

3) Static variable
A variable that is declared as static is called a static variable. It cannot be local. You can create a single copy of the static variable and share it among all the instances of the class. Memory allocation for static variables happens only once when the class is loaded in the memory.

## access modifiers
The access modifiers in Java specifies the accessibility or scope of a field, method, constructor, or class. We can change the access level of fields, constructors, methods, and class by applying the access modifier on it.


| Modifiers           | Class | Package | Sub-class | World |
|---------------------|-------|---------|-----------|-------|
| public              | Y     | Y       | Y         | Y     |
| protected           | Y     | Y       | Y         | N     |
| no modifier/default | Y     | Y       | N         | N     |
| private             | Y     | N       | N         | N     |

## void
The `void` keyword specifies that a method should not have a return value.


## annotations
Annotations, a form of metadata, provide data about a program that is not part of the program itself. Annotations have no direct effect on the operation of the code they annotate.

https://medium.com/@coolnewsgood/annotation-%E0%B9%81%E0%B8%A5%E0%B8%B0-%E0%B8%81%E0%B8%B2%E0%B8%A3%E0%B8%AA%E0%B8%A3%E0%B9%89%E0%B8%B2%E0%B8%87-annotation-%E0%B8%AA%E0%B8%B3%E0%B8%AB%E0%B8%A3%E0%B8%B1%E0%B8%9A-%E0%B8%A0%E0%B8%B2%E0%B8%A9%E0%B8%B2-java-e415cd05c345

## @Test
The @Before and @Test annotations are used to define unit tests for the Java JUnit testing framework. See http://junit.sourceforge.net/doc/cookbook/cookbook.htm for an introduction and examples of JUnit unit testing using these annotations.

## dot
The dot operator, also known as separator or period used to separate a variable or method from a reference variable

## colon
The colon is used to indicate the end of a statement.

## object
A Java object is a member (also called an instance) of a Java class. Each object has an identity, a behavior and a state. The state of an object is stored in fields (variables), while methods (functions) display the object's behavior.

## constructor
A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes.