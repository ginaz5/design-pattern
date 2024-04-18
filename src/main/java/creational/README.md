# Creational Patterns
This is notes about the course of pluralsight
https://app.pluralsight.com/library/courses/java-se-17-creational-design-patterns/table-of-contents

## Singleton
- Only one instance created
- Needs to be thread safe
- usually lazily loaded
- static in nature
- private constructor
- No parameters required for construction

Examples:
- Runtime
- Logger
- Spring beans by default
- Graphic 

## Builder
Consider a builder when faced with many constructor parameters
- Immutability, force it to be immutable object once the construction is done
- typically static inner class
- call appropriate constructor
- code readability

Examples:
- StringBuilder
- DocumentBuilder
- Locale.Builder

Other examples:
https://www.blogbrb.com/posts/book/effective-java-item2/

![](/Users/ginalin/Dev/IDEA/design-pattern/src/main/java/creational/builder/Contrast of builder and prototype.png)

## Prototype 
- avoid costly creation
- typically doesn't use "new", because it's cloned
- copy, but each instance is unique, different memory address
- usually implemented with a registry
  - the original object is created and kept in registry, when another object is needed, a clone of the original object object will be created from the registry.
- deep copy require custom implementation when implementing cloneable as default is shallow copy
- CloneNotSupportedException. The exception would be thrown if you attempted to clone an object of a class that does not implement Cloneable and has not overridden the clone() method to handle cloning differently.

Example:
- java.lang.Object#clone()