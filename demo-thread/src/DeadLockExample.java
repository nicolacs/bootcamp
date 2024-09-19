public class DeadLockExample {
    private Object lock1 = new Object();
    private Object lock2 = new Object();

    //!!! this case:
    // 支Thread 一路keep住左條key不停infinity loop
    // 係同一個example到係同一個obj 攞著左同樣2條keys
    // DeadLock一定係multi-Threads, 因為要同人搶KEY
    // 而且要2個synchronized 先會KEEP住左條KEY 攪到DeadLock
    
    public void method1(){
        synchronized (lock1){
            System.out.println("Entering method1");
            System.out.println("Tring to invoke method2() from method1()");
            //method2();
        }
        method2();
    }

    public void method2(){
        synchronized (lock2){
            System.out.println("Entering method2");
            System.out.println("Tring to invoke method1() from method2()");
            //method1();
        }
        method1();
    }


public static void main(String[] args) {
    DeadLockExample example = new DeadLockExample();

    Thread thread1 = new Thread(() -> example.method1());
    Thread thread2 = new Thread(() -> example.method2());

    //thread1.start();
    thread2.start();
    System.out.println("Mains thread ends");
}
}
