## Generics
- Generics 只係一個工具for你寫少D Class
- 但係run-time既時候並冇產生任何變化, 因為create OBJ既時候都要定義返個value 既type.
- Generics 唔可以寫primitives
  
### Generic Type can written in class/object level 
- public class Box<T>
- the type of attribute be T
- instance method can be generic (public T getValue())
- At compile time, the generic type T must be aligned between Class, attribute and instance method.
- At run time, you have to define the exact type of T

### Generic Type can written in static method level
- You have to define the range of generic type in the method signature
- public static <T> Box<T> createBox(T value)

## extends & super in Generics -> refer to shape example