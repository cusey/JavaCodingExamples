This is basic review of the fundamentals of the Java Language

1)EXCEPTION HANDLING

 An exception (or exceptional event) is a problem that arises during the execution of a program. When an Exception occurs the normal
 flow of the program is disrupted and the program/Application terminates abnormally, which is not recommended, therefore, these exceptions
 are to be handled.

2)POLYMORPHISM

 Polymorphism is the ability of an object to take on many forms. The most common use of polymorphism in OOP occurs when a parent class
 reference is used to refer to a child class object. Any Java object that can pass more than one IS-A test is considered to be
 polymorphic.

3)OVERRIDING

Method overriding, in object oriented programming, is a language feature that allows a subclass or child class to provide a specific
implementation of a method that is already provided by one of its superclasses or parent classes.

4)MODIFIER TYPES

Modifiers are keywords that you add to those definitions to change their meanings. Java language has a wide variety of modifiers,
including the following -

 a) Java Access Modifiers
  Java provides a number of access modifiers to set access levels for classes, variables, methods, and constructors. The four access
  levels are -

 -Visible to the package, the default. No modifiers are needed.
 -Visible to the class only (private).
 -Visible to the world (public).
 -Visible to the package and all subclasses (protected).

 b) Non Access Modifiers

 Java provides a number of non-access modifiers to achieve many other functionalities.

 -The static modifier for creating class methods and variables.
 -The final modifier for finalizing the implementations of classes, methods, and variables.
 -The abstract modifier for creating abstract classes and methods.
 -The synchronized and volatile modifiers, which are used for threads.


 5)ABSTRACT CLASSES

 Abstract classes are used to declare common characteristics of subclasses. An abstract class cannot be instantiated. It can only be
 used as a superclass for other classes that extend the abstract class. Abstract classes are declared with the abstract keyword.
 Abstract classes are used to provide a template or design for concrete subclasses down the inheritance tree.

6)INTERFACE CLASSES

 Interface can be used to define a generic template and then one or more abstract classes to define partial implementations
 of the interface. Interfaces just specify the method declaration (implicitly public and abstract) and can only contain fields
 (which are implicitly public static final). Interface definition begins with a keyword interface. An interface like that of an
 abstract class cannot be instantiated.

 7)GENERIC

 You can write a single generic method declaration that can be called with arguments of different types. Based on the types of
 the arguments passed to the generic method, the compiler handles each method call appropriately.

 8)SERIALIZATION

 Java provides a mechanism, called object serialization where an object can be represented as a sequence of bytes that includes the
 object's data as well as information about the object's type and the types of data stored in the object.

 9)DATE-TIME API

Java 8 introduces a new date-time API under the package java.time. Important classes introduced in this package is :

-Local - Simplified date-time with no complexity of time zone handling.

-Zoned - Deals with various time zones.


10)ENUMERATION

Enum in java is a data type that contains fixed set of constants.


