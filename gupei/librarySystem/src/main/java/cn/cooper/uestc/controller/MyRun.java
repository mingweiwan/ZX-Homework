package cn.cooper.uestc.controller;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
//多线程编程的使用
/**
 * By GuPei 18-4-1
 */
public class MyRun implements Runnable {
    public static int[] X = {0,1,2,3,4,5};//用于定位字符串的位置，以输出不同的字母如a,b,c,d,等
    public static String string = "abcdef";
    private static Lock lock = new ReentrantLock();//可重入锁
    //CountDownLatch名为一把倒计数锁，await方法表示参数中的5在其他线程每个线程执行后，计数就减1，减为0再开始从await往下执行，
    // 此前await线程一直处于等待状态(阻塞)，接着剩下的5个线程也继续开始执行，如下所示。
    //多线程编程的好处在于效率很高，多个同时运行
    //信号量锁Semphore可以保证同时有n个线程同时对一个变量进行操作，permits设置了同时操作一个变量允许的线程数量。
    private static Semaphore semaphore = new Semaphore(10);
    private static CountDownLatch[]  countDownLatch = {new CountDownLatch(5),new CountDownLatch(5),new CountDownLatch(5),
            new CountDownLatch(5),new CountDownLatch(5),new CountDownLatch(5)};


    @Override
    public void run() {//不加锁的话这个方法是可以同时被多个线程交互执行的,即所谓的并发同时执行，线程之间差距在纳秒级别。这样大家就都能同时修改静态变量，使得代码不按我们的要去进行运行
         //可认为一个线程只在cpu上面执行纳秒级别接着就进入等待状态等待下一次执行,接着就是下一个线程被执行。
        //加锁保证了在一段时间内只有一个线程在运行这个方法，其他线程处于等待状态不能运行此方法。
        //最后第一个线程继续向下运行，接着其他线程也纷纷开始向下运行。

        //run方法对于每一个线程执行都是一个完整的独立的执行，线程之间共享的受影响的是静态变量。
        for (int i = 0; i <6 ; i++) {
            //这把countDownLatch锁被我用完后我得换一把锁了，因为每次输出一个相同的5个字符串
            System.out.print(string.charAt(i));
            countDownLatch[i].countDown();
            try {
                countDownLatch[i].await();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }




    }


    public static void threadGenerated() {
        //synchronized (MyRun.class) //synchronize关键字被后来的conCurrent并发包中的锁逐渐代替
        Thread thread = new Thread(new MyRun());
        thread.start();


    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {//当前线程为main线程，所以for循环创建new Thread()线程不被影响，
            //因为是在main线程中创建的相当于相对于main栈多了很多栈出来，而当线程要去调用run方法的时候便会遭遇这个锁。
            //但是main线程不受其他线程去调用run方法所产生的阻塞的影响，只有当调用相同方法的时候才受锁的影响否则将继续自己的代码继续执行下去
            MyRun.threadGenerated();
        }


    }


}
