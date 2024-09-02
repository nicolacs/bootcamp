### Week 4 溫書
- 左邊決定function (compile time)What to do, 右邊係implementation(run-time) How to do the method既內容
- 經常要get , 要用array
- Simple is the Best

## 黎個世界唔係Arraylist 就係LinkedList
- APIE
- CharSequence
  
# ArrayList
  - xxx.add(value)
  - xxx.set(place, value)
  - xxx.get()
  - xxx.remove(value) / xxx.removeAll()
  - xxx.size()
  - xxx.contains(value) / xxx.containsAll() ->return true / false
  - Arrays.asList( ,  , ...value )
  - xxx.isEmpty()
  - xxx.hashCode()
  - xxx.indexOf('a') -> return the first matched element
  - xxx.lastIndexOf('a') -> return the last matched element
  個圖https://javahongkong.larksuite.com/wiki/TtwVwENUaiJnbcknS0CunQdAskb

# LinkedList
- LinkedList 可以著好多件衫, ArrayList著一件
- 要了解 CustomerLinkedList.java in demo-data-structure

# Queue
- xxx.add() 自動add係尾
- xxx.remove() del隊頭第一個, 亦可寫明remove 咩"value"

# Deque
- Two-ways (both head & tail) can add & remove
  - xxx.addLast("aaa");
  - xxx.addFirst("bbb");
  - xxx.remove();
  - xxx.removeFirst();
  - xxx.removeLast();
- 