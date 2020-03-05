package com.team.test.thread;

/**
 * @Author: 韩汪洋
 * @BelongsProject: test
 * @BelongsPackage: com.team.test.thread
 * @CreateTime: 2020年02月23日11:02
 * @Description: ${Description}
 */
public class Test2 {
    public static void main(String[] args){
        //因为myThread2继承的是thread,所以他本身就是线程
        myThread2 amyThread2=new myThread2();
        myThread2 bmyThread2=new myThread2();
        amyThread2.setName("线程A");
        bmyThread2.setName("线程B");
        amyThread2.start();
        bmyThread2.start();

    }
}
