package com.team.test.thread;

/**
 * @Author: 韩汪洋
 * @BelongsProject: test
 * @BelongsPackage: com.team.test.thread
 * @CreateTime: 2020年02月23日11:02
 * @Description: ${Description}
 */
public class Test {
    public static void main(String[] args){
        //注意实现Runable接口,创建的是任务对象而不是线程
        //创建线程任务对象,而不是线程,还要创建线程把任务放在线程里面让他执行
        myThread myThread1=new myThread();
        myThread myThread2=new myThread();
        //创建线程
        Thread thread1=new Thread(myThread1);
        Thread thread2=new Thread(myThread2);
        //给线程名字赋值
        thread1.setName("线程A");
        thread2.setName("线程B");
        thread1.start();
        thread2.start();
    }
}
