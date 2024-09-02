## Week 4
- Java APIE:  Abstraction (Interface), Polymorphism, Inheritance, Encapsulation
### Interface (100% Abstraction) vs Inheritance (extends Parent Class)
- Differences:
  - No Attribute vs Have attribute(s)
  - No Constructor vs Have Constructor(s)
  - Implements >= 1 Interfaces vs Extends ONLY 1 Parent Class
  - Methods are all abstract (before Java 8) vs Contains both abstract & concrete method
  - Not support static variable vs Support ...
- Same: 
  - Support Static Final Variable(公家既變量)
  - Support Static methods (After Java 8)
  - Suport Default/Inherit instance method (After Java 8)


# Encapsulation
-唔係簡單GETTER, SETTER
  - 我提供我既方式俾你去用我既data
  - 我提供我既方式俾你去放data入黎

- Interface has to override
- Inheritance by default inherit 

String s10 ="ABC";
char[] apple = s10.toCharArray();