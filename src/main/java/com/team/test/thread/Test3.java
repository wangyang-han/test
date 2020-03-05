package com.team.test.thread;

/**
 * @Author: 韩汪洋
 * @BelongsProject: test
 * @BelongsPackage: com.team.test.thread
 * @CreateTime: 2020年02月23日14:08
 * @Description: ${Description}
 */
public class Test3 {
    public static void main(String[] args) {
        //创建线程任务对象
        myThread3 amyThread3=new myThread3();

        //创建线程对象
        Thread t1=new Thread(amyThread3,"车站售票");
        Thread t2=new Thread(amyThread3,"网络售票");
        Thread t3=new Thread(amyThread3,"黄牛售票");
        t1.start();
        t2.start();
        t3.start();
    }
}
