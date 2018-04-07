package cn.cooper.uestc.controller;


/**
 * By GuPei 18-4-1
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        synchronized ("abc") {//synchronized关键字实施加锁的用法,括号中为任意的引用类型对象，即object类型对象
                            //对于每个线程来说这里的run方法都是完整的，但是第一个线程运行到synchronized这时候其他线程就会在
                            //这里阻塞，等第一个线程运行完这里的代码以后，第二个线程才能运行关键字里面的代码，然后第三第四其他线程依次运行
                            //关键字处的代码，这样子达到锁的目的不至于并发的目的。
                            //锁存在的目的就是想让锁住的代码区域不要并发执行而是按序执行。
        }                   //各个线程之间执行这个方法互相不干扰
        super.run();
    }

    //这是一种创建线程的方法，当线程调用start方法以后，线程便会运行run方法
    public static void main(String[] args) {

        new MyThread().start();
    }
}

