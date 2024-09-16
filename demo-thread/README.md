## Thread 
-有Multi-Thread 既系統其實幾Advance
-現實世界唔多用到

# Thread就好似互相不干預既main, 但同時run緊
-按run 只係test緊個main
-工人做野係3個 Steps
-好似10個工人行緊10件事
    -唔係行先個個就返黎先
    -放出去唔知幾時返, 但返左黎會話你知
    -大家各自攪緊既事唔一樣
    -大家都用緊heap memory
- 工人唔會有empty constructor
- Call 工人: OBJ.stard();
- 如果2個以上工人係share 緊同樣既資料(shae resource), 而一個工人既method會revise到共用value, 就唔應該咁share. 
  - 因為2個工人process 次次都唔一樣, A工人取B工人既result去做野, A未做曬, B已經攞左A未做完既數值去做B既野, 咁就次次run都唔一樣,而且係錯誤的.

# .join() = 不見不散
-一日未完都唔行main
-用.join() 一定放係try{OBJ.join()}catch(InterruptedException e){}入面

# Count++
-係3個動作組成
-atomic係不被入侵

-write, write 可以好錯
-write, read 就睇下點定義, load慢d唔一定錯

# StringBuffer 係atomic (原子性)
  -即係大家一齊read,write既時候冇人可以中途處理
  -由 3 steps 變左5個Steps

## 如果唔係read, write同一個resource既話
# StringBuilder is around 10 times faster then StringBuffer
-所以個個CASE唔同, 要睇case決定用邊樣
