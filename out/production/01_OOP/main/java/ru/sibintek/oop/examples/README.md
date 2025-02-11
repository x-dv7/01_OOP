# Object-Oriented-Programming-in-Java
🚀 Complete Java - A to Z.

References: [Geeksforgeeks](https://www.geeksforgeeks.org/java/) , [javabeginnerstutorial](https://javabeginnerstutorial.com/core-java-tutorial/)


**JAVA IS A PLATFORM-INDEPENDENT LANGUAGE**

The codes written in Java are converted into an intermediate level language called **bytecode**,after compilation which becomes a part of the java platform,independent of the machine on which the code runs.This makes Java highly portable as its bytecodes can be run on any machine by an interpreter called **Java Virtual Machine(JVM)**



# CLASS:

A class is a user defined blueprint or prototype from which objects are created.  It represents the set of properties or methods that are common to all objects of one type. In general, class declarations can include these components, in order:

    Modifiers : A class can be public or has default access.
    
    Class name: The name should begin with a initial letter (capitalized by convention).
    
    Superclass(if any): The name of the class’s parent (superclass), if any, preceded by the keyword extends. A class can only extend (subclass) one parent.
    
    Interfaces(if any): A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements. A class can implement more than one interface.
    
    Body: The class body surrounded by braces, { }.

# OBJECT:

An object is an instance of a class.Technically, Class is a template which describes what state and behavior of an instance this class can have. Object implements the state and behavior in the form of variables and methods and requires some memory allocated.An object consists of:

    State : It is represented by attributes of an object. It also reflects the properties of an object.
    
    Behavior : It is represented by methods of an object. It also reflects the response of an object with other objects.
    
    Identity : It gives a unique name to an object and enables one object to interact with other objects.
    
    
**Declaring Objects (Also called instantiating a class):**

When an object of a class is created, the class is said to be **instantiated**. All the instances share the attributes and the behavior of the class. But the values of those attributes, i.e. the state are unique for each object. A single class may have any number of instances.




# METHODS:

A method is a collection of statements that perform certain tasks upon calling and return the result to the caller. A method can perform certain tasks without even returning anything. Methods allow us to reuse the code without retyping the code.

**Method Declaration:**
Method delaration contains six components:

   1.**Modifier:** Defines access type of the method i.e. from where it can be accessed in your application. In Java, there 4 type of the access specifiers.
   
        public: accessible in all class in your application.
        protected: accessible within the class in which it is defined and in its subclass(es)
        private: accessible only within the class in which it is defined.
        default (declared/defined without using any modifier) : accessible within same class and package within which its class is defined.
  2.**The return type :** The data type of the value returned by the method or void if does not return a value.
   
  3.**Method Name :** the rules for field names apply to method names as well, but the convention is a little different.
   
  4.**Parameter list :** Comma separated list of the input parameters are defined, preceded with their data type, within the enclosed parenthesis. If there are no parameters,empty parentheses () are used.
  
  5.**Exception list :** The exceptions the method can throw can be specified.
  
  6.**Method body :** It is enclosed between braces {} and contains the code to be executed to perform the intended operations.

**Memory allocation for methods calls:**

Methods calls are implemented through stack. Whenever a method is called a stack frame is created within the stack area and after that the arguments passed to and the local variables and value to be returned by this called method are stored in this stack frame and when execution of the called method is finished, the allocated stack frame would be deleted. There is a stack pointer register that tracks the top of the stack which is adjusted accordingly.

t-Oriented-Programming-in-Java/blob/master/Methods/PassingObjects1.java):** A program to show that references are also passed by value. 

If we do not change the reference to refer some other object (or memory location), we can make changes to the members and these changes are reflected back.

When we pass a primitive type to a method, it is passed by value. But when we pass an object to a method, the situation changes dramatically, because objects are passed by what is effectively call-by-reference. Java does what’s sort of a hybrid between pass-by-value and pass-by-reference. Basically, a parameter cannot be changed by the function, but the function can ask the parameter to change itself via calling some method within it.

While creating a variable of a class type, we only create a reference to an object. Thus, when we pass this reference to a method, the parameter that receives it will refer to the same object as that referred to by the argument.This effectively means that objects act as if they are passed to methods by use of call-by-reference.Changes to the object inside the method do reflect in the object used as an argument.



### METHOD OVERLOADING:

In java,it is possible to define two or more methods within the same class that share the same name as long as their parameter declaration are different either in terms of number of parameters or type of the parameters or both.This process is called Method Overloading.
Priority wise, compiler take these steps when the exact Prototype doesnot match with the arguments:


1.Type Conversion but to higher type(in terms of range) in same family.
2.Type conversion to next higher family(suppose if there is no long data type available for an int data type, then it will search for the float data type).

We can overload two or more static methods with same name, but differences in input parameters.We cannot overload two methods in Java if they differ only by static keyword (number of parameters and types of parameters is same). 

The compiler does not consider the return type while differentiating the overloaded method. But two methods with the same signature and different return type can not be declared. It will throw a compile time error.

Hence Method overloading can be done by changing:

    1.The number of parameters in two methods.
    2.The data types of the parameters of methods.
    3.The Order of the parameters of methods.
    


### METHOD OVERRIDING:

When a method in a subclass has the same name, same parameters declaration and same return type(or sub-type) as a method in its super-class, then the method in the subclass is said to override the method in the super-class.
 The access modifier for an overriding method can allow more, but not less, access than the overridden method. For example, a protected instance method in the super-class can be made public, but not private, in the subclass. Doing so, will generate compile-time error.

Private methods cannot be overridden as they are bonded during compile time. Therefore we can’t even override private methods in a subclass.

It is possible to have different return type for a overriding method in child class, but child’s return type must be sub-type of parent class’ return type. This is known as covariant return type.


# CONSTRUCTORS:

Constructors are used for initializing new objects. Constructors does not return any values but implicitly it returns the object of the class. Fields are variables that provides the state of the class and its objects, and methods are used to implement the behavior of the class and its objects.



**Constructors cannot be Inherited:**

When a class extends another class,the child class inherits the variables ,methods and the behaviour of the super class but not the constructors.Constructors have same name as the class name. So if constructors were inherited in child class then child class would contain a parent class constructor which is against the constraint that constructor should have same name as class name.

**Default Constructors:**

Java creates a default constructor automatically if no default or parameterized constructor is created by user.The default constructor in java initializes the member data variables to default values


**Points to be noted:**

    1.The this() expression should always be the first line of the constructor.
    2.There should be at-least be one constructor without the this() keyword.
    3.Constructor chaining can be achieved in any order.

### PRIVATE CONSTRUCTORS AND SINGLETON CLASS:

We can provide access specifier to the constructor. If made private, then it can only be accessed inside the class.
We can use private constructors for 1. Internal Constructor Chaining 2. Singleton class design

A singleton class is a class that can have not more than a single object.
After first time, if we try to instantiate the Singleton class, the new variable also points to the first instance created. So whatever modifications we do to a variable inside the class through any instance, it affects the variable of the single instance created and is visible if we access that variable through any instance of that class.


To design a singleton class:

    1.Make constructor as private.
    2.Write a static method that has return type object of this singleton class. Here, the concept of Lazy initialization in used to write this static method.

## CONSTRUCTORS VS METHODS:

Constructors in Java can be seen as Methods in a Class. But there is a big difference be tween Constructors and Methods.

1.Constructors have only one purpose, to create an Instance of a Class. This instantiation includes memory allocation and member initialization (Optional).

By contrast, Methods cannot be used to create an Instance of a Class.

2.Constructors cannot have Non Access Modifiers while Methods can.

3.Constructors cannot have a return type(Including void) while Methods require it.

4.The Constructor name must be the same as the Class name while Methods are not restricted.

5.As per Java naming convention, Method names should be camelcase while Constructor names should start with capital letter.

### CONSTRUCTOR OVERLOADING:

In java,it is possible to define two or more constructor of the same class that obviously share the same name but their parameter declaration are different either in terms of number of parameters or type of the parameters or both.This process is called Constructor Overloading.



# ENCAPSULATION:

Encapsulation is the mechanism that binds together code and the data it manipulates.Other way to think about encapsulation is, it is a protective shield that prevents the data from being accessed by the code outside this shield.

    1.Technically in encapsulation, the variables or data of a class is hidden from any other class and can be accessed only through any member function of own class in which they are declared.
    2.As in encapsulation, the data in a class is hidden from other classes, so it is also known as data-hiding.
    3.Encapsulation can be achieved by: Declaring all the variables in the class as private and writing public methods in the class to set and get the values of variables.


#### Advantages of Encapsulation:

1.**Data Hiding:** The user will have no idea about the inner implementation of the class. It will not be visible to the user that how the class is storing values in the variables. He only knows that we are passing the values to a setter method and variables are getting initialized with that value.

2.**Increased Flexibility:** We can make the variables of the class as read-only or write-only depending on our requirement. If we wish to make the variables as read-only then we have to omit the setter methods like setName(), setAge() etc. from the above program or if we wish to make the variables as write-only then we have to omit the get methods like getName(), getAge() etc. from the above program.
  
3.**Reusability:** Encapsulation also improves the re-usability and the code becomes easy to change with new requirements.

4.**Testing code:** Encapsulated code is easy to test for unit testing.

# ABSTRACTION:

Data Abstraction is defined as the process of identifying only the required characteristics of an object ignoring the irrelevant details.The properties and behaviors of an object differentiate it from other objects of similar type and also help in classifying/grouping the objects.

Consider a real-life example of a man driving a car. The man only knows that pressing the accelerators will increase the speed of car or applying brakes will stop the car but he does not know about how on pressing the accelerator the speed is actually increasing, he does not know about the inner mechanism of the car or the implementation of accelerator, brakes etc in the car. This is what abstraction is. 
In java, abstraction is achieved by interfaces and abstract classes. We can achieve 100% abstraction using interfaces.


    An abstract class is a class that is declared with abstract keyword.
    An abstract method is a method that is declared without an implementation.
    An abstract class may or may not have all abstract methods. Some of them can be concrete methods
    A method defined abstract must always be redefined in the subclass,thus making overriding compulsory OR either make subclass itself abstract.
    Any class that contains one or more abstract methods must also be declared with abstract keyword.
    There can be no object of an abstract class.That is, an abstract class can not be directly instantiated with the new operator.
    An abstract class can have parametrized constructors and default constructor is always present in an abstract class.


**Points to be noted:**

    1.Every class is part of some package.
    2.If no package is specified, the classes in the file goes into a special unnamed package (the same unnamed package for all files).
    3.All classes/interfaces in a file are part of the same package. Multiple files can specify the same package name.
    4.If package name is specified, the file must be in a subdirectory called name (i.e., the directory name must match the package name).
    5.We can access public classes in another (named) package using: package-name.class-name

# INTERFACES:

Interface looks like a class and has variables and methods declaration like that of a class but it doesnot contain any method definition.


    1.Interfaces specify what a class must do and not how. It is the blueprint of the class.
    2.An Interface is about capabilities like a Player may be an interface and any class implementing Player must be able to (or must implement) move(). So it specifies a set of methods that the class has to implement.
    3.If a class implements an interface and does not provide method bodies for all functions specified in the interface, then class must be declared abstract.
    4.A Java library example is, Comparator Interface. If a class implements this interface, then it can be used to sort a collection.

**Use of Interface:**

  1.It is used to achieve total abstraction.
  
  2.Since java does not support multiple inheritance in case of class, but by using interface it can achieve multiple inheritance .
  
  3.It is also used to achieve loose coupling.
  
  4.It provides boundness to the program.
  
  5.Abstract classes may contain non-final variables, whereas variables in interface are final, public and static.
  
 
# Abstract class:
A class with a pure virtual function ie, an abstract method is termed as Abstract class.In java, however the class has to be declared with abstract keyword to make it Abstract.


### ABSTRACT CLASS VS INTERFACE:

|**PROPERTIES**|**ABSTRACT CLASS**|**INTERFACE**|
|:------------:|:----------------:|:-----------:|
|**Methods**|Abstract class can have abstract and non-abstract methods. From Java 8, it can have default and static methods also.|Interface can have only abstract methods.|
|**Variables**|An abstract class can have final,non-final,static,non-static variables.|Variables declared in a Java interface are by default final.Interface can have only static and final variables.|
|**Implementation**|Abstract class can provide the implementation of interface.|Interface can’t provide the implementation of abstract class.|
|**Inheritance vs Abstraction**|Abstract class can be extended using keyword “extends”.|A Java interface can be implemented using keyword “implements” |
|**Multiple implementation**|An abstract class can extend another Java class and implement multiple Java interfaces.|An interface can extend another Java interface only.|
|**Accessibility of Data Members**|A Java abstract class can have class members with access as private, protected, etc.|Members of a Java interface are public by default|

### NESTED INTERFACE:


# NESTED CLASSES:

When a class is defined within another class, such classes are known as nested classes.


    1.The scope of a nested class is bounded by the scope of its enclosing class. Thus in above example, class NestedClass does not exist independently of class OuterClass.
    2.A nested class has access to the members, including private members, of the class in which it is nested. However, reverse is not true i.e. the enclosing class does not have access to the members of the nested class.
    3.A nested class is also a member of its enclosing class.
    4.As a member of its enclosing class, a nested class can be declared private, public, protected, or package private(default).
    
Nested classes are divided into two categories:

        1.static nested class : Nested classes that are declared static are called static nested classes.A static nested class cannot refer directly to instance variables or methods defined in its enclosing class.It can use them only through an object reference.They are accessed using the enclosing class name.
        2.inner class : An inner class is a non-static nested class.Inner class has access to all members(static and non-static variables and methods, including private) of its outer class and may refer to them directly in the same way that other non-static members of the outer class do.
Inner class are of two categories:

        1.Local Inner class: When an inner class is defined inside a block generally the method of the Outer Class or sometimes a for loop or if clause then it becomes local inner class.Local inner classes cannot have any access modifiers associated with them. However, they can be marked as final or abstract. These class have access to the fields of the class enclosing it. Local inner class must be instantiated in the block they are defined in.

        2.Anonymous Inner class:It is an inner class without a name and for which only a single object is created.
        
**JAVA ACCESS MODIFIERS:**

|           | **PRIVATE**|**DEFAULT**|**PROTECTED**|**PUBLIC**|
|:---------:|:----------:|:---------:|:-----------:|:--------:|
|**WITHIN SAME CLASS**|YES|YES|YES|YES|
|**FROM ANY CLASS IN SAME PACKAGE**|NO|YES|YES|YES|
|**FROM ANY SUB CLASS IN SAME PACKAGE**|NO|YES|YES|YES|
|**FROM ANY NON-SUB CLASS IN SAME PACKAGE**|NO|YES|YES|YES|
|**FROM ANY SUB-CLASS FROM DIFFERENT PACKAGE**|NO|NO|YES|YES|
|**FROM ANY NON-SUB CLASS FROM DIFFERENT PACKAGE**|NO|NO|NO|YES|


# INHERITANCE:

Inheritance is an important pillar of OOP(Object Oriented Programming). It is the mechanism in java by which one class is allow to inherit the features(fields and methods) of another class.

    Super Class: The class whose features are inherited is known as super class(or a base class or a parent class).
    
    Sub Class: The class that inherits the other class is known as sub class(or a derived class, extended class, or child class). The subclass can add its own fields and methods in addition to the superclass fields and methods.
    
    Reusability: Inheritance supports the concept of “reusability”, i.e. when we want to create a new class and there is already a class that includes some of the code that we want, we can derive our new class from the existing class. By doing this, we are reusing the fields and methods of the existing class.

### Types Of Inheritence:

**1.Single Inheritence:** In single inheritance,one subclass inherit the features of one superclass.

**2.Multilevel Inheritence:**  In Multilevel Inheritance, a derived class will be inheriting a base class and as well as the derived class also act as the base class to other class.

**3.Hierarchical Inheritence:**  In Hierarchical Inheritance, one class serves as a superclass (base class) for more than one sub class.

**4.Multiple Inheritence:** In Multiple inheritance ,one class can have more than one superclass and inherit features from all parent classes.Java does not support multiple inheritance with classes. In java, we can achieve multiple inheritance only through Interfaces.
Multiple inheritance is not supported by Java using classes , handling the complexity that causes due to multiple inheritance is very complex. It creates problem during various operations like casting, constructor chaining etc 

# EXCEPTION HANDLING:

An exception is an unwanted or unexcepted event,which occurs during the execution of a program ie. at run-time that disrupts the normal-flow of the program's execution.


# MULTITHREADING:

Most programming languages do not enable programmers to specify concurrent activities.Java makes concurrency available to the programmers through APIs.The programmer specifies that applications contain thread of execution,where each thread designates a portion of a program that may execute concurrently with other threads.This capability of java is called multithreading.

**Example**:When programs download large files such as an audio file over the internet,users may not want to wait until entire lengthy file downloads before starting the playback.To solve this,we can put multiple threads to work-one thread downloads the clip and another plays it.

Java's garbage collection is also an example of multithreading. 

### Thread States :Life Cycle Of A Thread:


A thread lifecycle is divided into five different states, which a thread may go through in its lifetime. Each thread can be in one of the following five states. Let's understand each of these different states in the order in which they are mentioned below -:


    1.New State.
    2.Runnable State.
    3.Running State.
    4.Waiting or Blocked or Sleeping State.
    5.Dead State.

### New State:

A thread enters a new state when an object of Thread class is created but the start() method hasn't been called on it yet. In new state, a thread is not considered alive as it's not a thread of execution. Once the start() method is called on the thread, it leaves the new state and enters the next state but once it leaves new state, it's impossible for it to return back to new state in its lifetime.

### Runnable State:

A thread enters a runnable state when the **start()** method has been called on it. It means, that a thread is eligible to run, but it's not yet running, as the thread scheduler hasn't selected it to run. At one point of time, there could be multiple thread in a runnable state, it's always the choice of thread scheduler to decide on which thread to move to the next state from runnable state. A thread in runnable state is considered to be alive. A thread can return to a runnable state after coming back from a sleeping, waiting/blocked or running state.

### Running State:

A thread enters a running state when the thread schedular has selected it to run(out of all the threads in a thread pool). In this state, a thread starts executing the run() method and it is alive and kicking. From the running state, a thread can enter into waiting/blocked state, runnable or the final dead state.

### Waiting or Blocked or Sleeping State:

A thread enters a waiting state in three situations:

    When a thread has called wait() method on itself and it is waiting for the other thread to notify it or wake it up.
    When a thread code has called sleep() method on a thread, asking it to sleep for a duration.
    When a thread is waiting for an Input/Output resource to be free.

When a thread finds itself in any of the above mentioned three states, such events pushes the thread into a blocking/waiting or sleeping mode and the thread is no longer eligible to run. In any of these states, the thread is still considered to be alive. When thread gets out of waiting, blocking or sleeping state, it re-enters into runnable state.

### Dead State:

This is the last state in a thread's lifetime. A thread enters the dead state after it has successfully completed executing the run() method. At this situation, it is considered to be not alive and hence if you try to call start() method on a dead thread, it raises IllegalThreadStateException.

Threads can be created by using two mechanisms :
1. **Extending the Thread class**:We create a class that extends the java.lang.Thread class. This class overrides the run() method available in the Thread class. A thread begins its life inside run() method. We create an object of our new class and call start() method to start the execution of a thread. Start() invokes the run() method on the Thread object.

2. **Implementing the Runnable Interface**:We create a new class which implements java.lang.Runnable interface and override run() method. Then we instantiate a Thread object and call start() method on this object.

### Thread Class vs Runnable Interface

1. If we extend the Thread class, our class cannot extend any other class because Java doesn’t support multiple inheritance. But, if we implement the Runnable interface, our class can still extend other base classes.

2. We can achieve basic functionality of a thread by extending Thread class because it provides some inbuilt methods like yield(), interrupt() etc. that are not available in Runnable interface.

### THREAD PRIORITIES:

Every Java thread has a priority that helps the operating system determine the order in which threads are scheduled.Informally,threads with higher priority are more important to a program and should be allocated processor time before lower-priority threads.

        public static int MIN_PRIORITY: This is minimum priority that a thread can have. Value for this is 1.
        public static int NORM_PRIORITY: This is default priority of a thread if do not explicitly define it. Value for this is 5.
        public static int MAX_PRIORITY: This is maximum priority of a thread. Value for this is 10.

**public final int getPriority()**: java.lang.Thread.getPriority() method returns priority of given thread.

**public final void setPriority(int newPriority)**: java.lang.Thread.setPriority() method changes the priority of thread to the value newPriority. This method throws IllegalArgumentException if value of parameter newPriority goes beyond minimum(1) and maximum(10) limit.

**isAlive():** Returns true or false based on whether Thread is alive or not.
### SYNCHRONIZATION:

Multi-threaded programs may often come to a situation where multiple threads try to access the same resources and finally produce erroneous and unforeseen results.

So it needs to be made sure by some synchronization method that only one thread can access the resource at a given point of time.

Java provides a way of creating threads and synchronizing their task by using synchronized blocks. Synchronized blocks in Java are marked with the synchronized keyword. A synchronized block in Java is synchronized on some object. All synchronized blocks synchronized on the same object can only have one thread executing inside them at a time. All other threads attempting to enter the synchronized block are blocked until the thread inside the synchronized block exits the block.


