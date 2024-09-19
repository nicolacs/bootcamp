## Thread 
-有Multi-Thread 既系統其實幾Advance
-現實世界唔多用到
- .start()先會開Thread

- 有Thread, task(可俾多個thread 去call), method(死物)
  - Static method 有機會有事, 有in有out, 雖然自己係METHOD內計算, 但如果in係pass by ref.入黎就有機會錯

# Thread就好似互相不干預既main, 但同時run緊
-按run 只係test緊個main
-工人做野係3個 Steps
-好似10個工人行緊10件事
    -唔係行先個個就返黎先
    -放出去唔知幾時返, 但返左黎會話你知
    -個工人放左出去, 速度係不受控制, 如果想等thread1 結果返黎就要.join()
    -大家各自攪緊既事唔一樣
    -大家都用緊heap memory
- 工人唔會有empty constructor
- Call 工人: OBJ.start();
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

# StringBuffer 係atomic (原子性) 不可入侵
  -即係大家一齊read,write既時候冇人可以中途處理
  -由 3 steps 變左5個Steps

## 如果唔係read, write同一個resource既話
# StringBuilder is around 10 times faster then StringBuffer
-所以個個CASE唔同, 要睇case決定用邊樣

# synchronized 都係LOCK
-會好慢
-write read 冇好明顯問題, 但write write 就錯曬
-人地係我做緊野時唔可以入黎read/write, 要等我做完曬先

# HashTable (基本上唔用, 舊野)
-底code基本上已全synchronized, 返唔到轉頭

# Vector (舊野)

# Volatile 係覆雜既系統有機會用, skip in bostcamp, can learn yourself
