## Getting Started

### Week4
- For "extends"
  - Attributes in Parent
    - if it is private, CANNOT inherit
    - if it is public, "this" is something like "alias", pointing back to "super"
  - Constructors in Parent
    - Even it is public, CANNOT inherit
    - Instead, child class calls parent constructor by "super"
  - Methods in Parent
    - if it is public, "this" is something like "alias", pointing back to "super"
    - if it is private, child class CANNOT access by "super"
    - Child class can "override" the same method in parent class

- Inheritance
  - Parent Class can hold its own attribute
  - Parent Class itself can create object

->>      copy not!!!!!!!!!!
-阿仔出資料唔想出OBJ 既地址, 想出所需內容, 要meaning not address


- 3劍俠shown in staff2.java
- !!! 如Parent 同Child都有同一個attribute, 阿仔係必定用左自己先
- !!! constructor係冇INHERITE
- !!! 可INHERITE PUBLIC METHOD NOT PRIVATE
