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
  
# ArrayList
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

# LinkedList 最強
- 一般要用Queue, Deque都開LinkedList
- LinkedList 可以著好多件衫, ArrayList著一件
- 要了解 CustomerLinkedList.java in /demo-data-structure
- 符合Deque用法, 又可.get

## Queue同Deque
- 要體現公平先會用到, 實際好少用到
- 係用黎消耗的, 用完睇完就可delete
- 多數用while loop
- 整左queue用for-loop係攪事
# Queue (先到先得, first come first serve)
- cannot access the middle element DIRECTLY
- xxx.add() 自動add係尾
- xxx.remove() del隊頭第一個, 亦可寫明remove 咩"value"
- xxx.poll()  similar to "remove"
- xxx.peek() look up the head element

# Deque (先到先得)
- cannot access the middle element DIRECTLY
- Two-ways (both head & tail) can add & remove
  - xxx.addLast("aaa");
  - xxx.addFirst("bbb");
  - xxx.remove();
  - xxx.removeFirst();
  - xxx.removeLast();

# ArrayDeque
-頭尾remove都係開緊新array, 好慢
-冇咩強項
-冇 point用arraydeque
-知道difference就ok

# PriorityQueue 
- 跟nature ordering -> abcde
- .add, add既時候唔決定排序. 任add曬入去先
- .poll() 先會排左第一個出黎, !!!但入面D野都仲係亂的, 冇sorting

## Compareble
Complier 冇咁勁去check你內容, 只能用signature去俾佢知你有冇黎個能力, 有冇簽份合約(implements interface) 去獲得個能力去用.