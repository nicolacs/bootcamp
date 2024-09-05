### Week 4 溫書
- 左邊決定function (compile time)What to do, 右邊係implementation(run-time) How to do the method既內容
- 經常要get , 要用array
- Simple is the Best
- Collections係冇OBJ的

## 黎個世界唔係Arraylist 就係LinkedList
#  同埋 add, remove, searching
- APIE
- CharSequence
- OBJ instanceof class (check class係唔係一樣, return true false)
  
# ArrayList ~5*
- Cannot use ArrayList together with primitive
  - xxx.add(value)
  - xxx.set(place, value)
  - xxx.get()   ->can access the middle element DIRECTLY
  - xxx.remove(value) / xxx.removeAll()
  - xxx.size()
  - xxx.contains(value) / xxx.containsAll() ->return true / false
  - Arrays.asList( ,  , ...value )
  - xxx.isEmpty()
  - xxx.hashCode()
  - xxx.indexOf('a') -> return the first matched element
  - xxx.lastIndexOf('a') -> return the last matched element
  個圖https://javahongkong.larksuite.com/wiki/TtwVwENUaiJnbcknS0CunQdAskb

# LinkedList 最強 ~3*
- 一般要用Queue, Deque都開LinkedList
- LinkedList 可以著好多件衫, ArrayList著一件
- 要了解 CustomerLinkedList.java in /demo-data-structure
- 符合Deque用法, 又可.get

## Queue同Deque ~1*
- 要體現公平先會用到, 實際好少用到
- 係用黎消耗的, 用完睇完就可delete
- 多數用while loop
- 整左queue用for-loop係攪事
# Queue (先到先得, first come first serve)
- cannot access the middle element DIRECTLY
- xxx.add() 自動add係尾
- xxx.remove() del隊頭第一個, 亦可寫明remove 咩"value"
- xxx.poll()  similar to "remove". 攞第一個出黎, 睇完, del左佢


# Deque (先到先得)  
Example: /TextEditor.java
- cannot access the middle element DIRECTLY
- Two-ways (both head & tail) can add & remove
- 用Deque Java係期望你條queue一定有野.
  - xxx.addLast("aaa");
  - xxx.addFirst("bbb");
  - xxx.remove();
  - xxx.removeFirst();
  - xxx.removeLast();
    - xxx.push(new data);  -> add element at the head
    - xxx.pop();  ->都係處理個頭, 條queue冇野既話, 會爆炸
  - xxx.peekFirst();
  - xxx.peekLast();
  - xxx.peek() look up the head element

# ArrayDeque ~0*
-頭尾remove都係開緊新array, 好慢
-冇咩強項
-冇 point用arraydeque
-知道difference就ok

# PriorityQueue 
- 跟nature ordering -> abcde
- .add, add既時候唔決定排序. 任add曬入去先
- .poll() 先會排左第一個出黎, !!!但入面D野都仲係亂的, 冇sorting
- Override compareTo 愈多rules loading愈慢

## Comparable ~4*
Complier 冇咁勁去check你內容, 只能用signature去俾佢知你有冇黎個能力, 有冇簽份合約(implements interface) 去獲得個能力去用.
- 得一條formula

# Comparator
- 可以新增formula

## HashMap  (List有retain, Map冇 -> e.g:我只想保留某D野)
- 可以用key去搵野, 平時其他方法要用index去搵, 但你點知個OBJ係第幾個位呢?
- 係自己一個世界 唔關Collection事, 冇.add黎D野
- 有相同既KEY會overwrite
  - xxx.put(valueA, valueB)
  - xxx.get(valueA)   ->return valueB
  - xxx.size()
  - xxx.getKey()
  - xxx.containsKey(value) -> return true false
  - xxx.remove(by key)  -> remove the entry
  - xxx.remove(key同value)  -> 2個都中曬先remove到
  - xxx.keySet()  攞全部野
  - xxx.clear()  -> .size() 歸0

# HashMap vs List(ArrayList, LinkedList)
 1. HashMap has no ordering
 2. HashMap get value by key (any type), List get value by index (int)
 3. Map's Key cannot be duplicated, List may contain duplicated value令Map既資料保留獨特性