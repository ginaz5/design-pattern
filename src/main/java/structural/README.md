This is notes about the course of pluralsight
https://app.pluralsight.com/library/courses/design-patterns-java-structural/table-of-contents

# Adapter Pattern
make new code compatible with legacy code

scenario:
Anytime we want to pull data from any disparate source that doesn't follow our conventions, we can create an adapter to wrap that
- multiple adapters
- integrate with legacy code

Java API example:
- Arrays -> Lists (collection)
- Streams

There are two types of adapters: class and object, but in java there is only object adapter.
class adapter requires multiple inheritance, which is not supported by Java.


# Facade
provide a simple interface to a complex or difficult-to-use system

- Easier API usage
- Simplified interface

Java API example:
- java.net.URL



# Decorator
add functionality without creating concrete objects for every feature that we want to implement.

Cons:
new class for every feature added

Java API example:
- InputStream

# Composite
Tree structure

Java API example:
- java.awt.Component
- RESTful service GETs 

# Proxy
Java API example:
- java.lang.reflect.Proxy
- java.rmi.*