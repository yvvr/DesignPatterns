# Singleton Design Pattern

The singleton pattern is a design pattern that restricts the instantiation of a class to one object.

![image](https://user-images.githubusercontent.com/15864420/155457717-7eade923-29cb-4de4-8cd5-261641be12af.png)

## Examples

- A single DB connection shared by multiple objects as creating a separate DB connection for every object may be costly.
- A single configuration/settings manager or error manager in an application that handles all problems instead of creating multiple managers.
- A single creation of multi-threading manager, to manage the multi-thread Pool.

## Forms of singleton pattern

- **Early Instantiation** :  creation of instance at load time.
- **Lazy Instantiation** :  creation of instance when required.

### Early Instantiation

```
public class SingletonPattern {

    private static SingletonPattern instance = new SingletonPattern();

    private SingletonPattern() {}
    
    public static SingletonPattern getInstance() {
        return instance;
    }
}
```

### Lazy Instantiation

```
public class SingletonPattern {

    private static SingletonPattern instance;

    private SingletonPattern() {}

    public static synchronized SingletonPattern getInstance() {
        if(instance == null) {
            instance = new SingletonPattern();
        }
        return instance;
    }
}
```

## Pros

> **Instance control**: Singleton prevents other objects from instantiating their own copies of the Singleton object, ensuring that all objects access the single instance.

> **Flexibility**: Since the class controls the instantiation process, the class has the flexibility to change the instantiation process.

> **Saving Memory**: It’s obvious that object creation of any class occupies space in memory, so creating many objects means more space is occupied. If single instance is reused again and again, it saves memory.

## Cons

> **Violation of Single Responsibility Principle**: A singleton class has the responsibility to create an instance of itself along with other business responsibilities.

> **Can’t be inherited** : Singleton classes cannot be sub classed.

> **Hiding dependencies**: Singletons can hide dependencies. Efficient architecture is minimizing dependencies between classes which help while unit tests and isolating any part of the program to a separate assembly.

> **Singletons hinder unit testing**:. A Singleton might cause issues for writing testable code if the object and the methods associated with it are so tightly coupled that it becomes impossible to test without writing a fully functional class dedicated to the Singleton.