package com.team.test.thread;

/**
 * @Author: 韩汪洋
 * @BelongsProject: test
 * @BelongsPackage: com.team.test.thread
 * @CreateTime: 2020年02月23日11:03
 * @Description: ${Description}
 */
public class myThread2 extends Thread {
    //继承Thread类要实现run方法
    @Override
    public void run() {
        String name=myThread2.currentThread().getName();
        for (int i = 0; i < 21; i++) {
            System.out.println(name+":"+i);
        }
    }
}
