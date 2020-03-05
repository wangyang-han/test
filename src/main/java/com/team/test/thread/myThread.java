package com.team.test.thread;

/**
 * @Author: 韩汪洋
 * @BelongsProject: test
 * @BelongsPackage: com.team.test.thread
 * @CreateTime: 2020年02月23日11:03
 * @Description: ${Description}
 */
//实现Runable接口创建线程任务
public class myThread implements Runnable {
    @Override
    public void run() {
        //获取线程名称
        String name=Thread.currentThread().getName();
        for (int i = 1; i <20 ; i++) {
            System.out.println(name+":"+i);
        }
    }
}
