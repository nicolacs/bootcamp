# bootcamp
Ctrl + shift + p -> Setting JSON 可開指定Files

Vincent 推薦 Online learning:
- ByteByteGo (高度推薦)
- CSDN

- static 冇extend效果

## Code Methods
# Primitive Types & Wapper class
E.g: int 包装类: Integer
方法: parseInt(String s), valueOf(int i), compareTo(Integer anotherInteger), toString()
方法: parseDouble(String s), valueOf(double d), compareTo(Double anotherDouble), toString()
方法: parseFloat(String s), valueOf(float f), compareTo(Float anotherFloat), toString()
方法: parseLong(String s), valueOf(long l), compareTo(Long anotherLong), toString()
方法: parseShort(String s), valueOf(short s), compareTo(Short anotherShort), toString()
方法: parseByte(String s), valueOf(byte b), compareTo(Byte anotherByte), toString()
char 包装类: Character
方法: isDigit(char ch), isLetter(char ch), valueOf(char c), toString()
boolean 包装类: Boolean
方法: parseBoolean(String s), valueOf(boolean b), toString()

# Reference Types
- String
    - length(), charAt(int index), substring(int beginIndex, int endIndex), indexOf(String str), toUpperCase(), toLowerCase(), trim(), split(String regex)

# Collection
- Collection
  - add(E e), remove(Object o), size(), isEmpty(), contains(Object o), clear(), iterator()
- Array
    - Array.get(), Array.set(), Arrays.sort(), Arrays.copyOf(), Arrays.toString(), Arrays.asList()
- List
    - ArrayList, LinkedList
        - add(E e), remove(int index), get(int index), size(), clear(), contains(Object o), isEmpty(), indexOf(Object o)
- Set
    - HashSet, TreeSet
        - add(E e), remove(Object o), contains(Object o), size(), isEmpty(), clear()
- Map 
    - HashMap, TreeMap
        -put(K key, V value), get(Object key), remove(Object key), size(), isEmpty(), keySet(), values()
- Queue
    - LinkedList, PriorityQueue
        - offer(E e), poll(), peek(), size(), isEmpty()
- Deque
  - ArrayDeque, LinkedList
    - addFirst(E e), addLast(E e), removeFirst(), removeLast(), getFirst(), getLast()
- Stack
    - push(E item), pop(), peek(), isEmpty(), search(Object o)
  - 
# 自定义类
自定义类可以根据需要定义属性和方法，常见的方法包括：
- 构造函数
 - toString()
 - equals(Object obj)
 - hashCode()
 - clone()
- 其他常用类
    - Math
        - abs(), max(), min(), sqrt(), pow(), random()
    - System
        - currentTimeMillis(), exit(int status), gc(), getProperty(String key)
    - Thread
        - start(), run(), sleep(long millis), join(), interrupt(), isAlive()

### MYSQL
# 我地寫 Queries 
SELECT  * // * = all
    -DISTINCT (概念唔係remove duplicate, 係show all 獨特種類既values)
    -SUM(), MAX(), COUNT(), AVG(), MIN()
    -CONCAT(), SUBSTRING(), LENGTH(), UPPER(), LOWER(), TRIM(), REPLACE()
    - STR_TO_DATE('2024-09-20', '%Y-%m-%d')
FROM
GROUP BY
ORDER BY  XXX DESC/ASC
LIMIT 2; (ORDER BY + LIMIT 配合用, FIRST 2 ROWS OF THE RESULT SET)
WHERE : AND, OR, BETWEEN, EXISTS,IN, LIKE, (唔好用:ALL, ANY, NOT, SOME);

-   DELETE FROM "TABLE NAME"
    WHERE  // delete 可以寫where

-   INSERT INTO()
    VALUES()

-   UPDATE
    SET

-  SELECT CASE  //用黎define column
        WHEN THEN
        ELSE
    END AS 'new filed's name'
    , other column, you want
    FROM ;

- != -> <>
- IS NULL / IS NOT NULL (sql 冇 ==0/ ==)

-ALTER TABLE XXX MODIFY COLUMN/ DROP COLUMN

- 永遠唔會改FILED名, 會影響後面做野.所以day 1 建立時成條team就應該check清楚d名.
  - 之後發現錯左就由得佢, 串錯字就10年都串錯字, 用到計岩就冇問題

# JOIN
-只影響ROW

### Week 10
local host -> 127.0.0.1
POP -> 
