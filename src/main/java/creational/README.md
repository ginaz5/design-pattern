This is notes about the course of pluralsight
https://app.pluralsight.com/library/courses/java-se-17-creational-design-patterns/table-of-contents

# Singleton Pattern
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

# Builder Pattern
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
