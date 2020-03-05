package com.team.test.thread;

/**
 * @Author: 韩汪洋
 * @BelongsProject: test
 * @BelongsPackage: com.team.test.thread
 * @CreateTime: 2020年02月23日14:02
 * @Description: ${Description}
 */
public class myThread3 implements Runnable {
    int count=10;//总票数
    int sum=0;//第几张票
    @Override
    public void run() {
        while (true){
            synchronized (this){//解决抢到数据相同的问题(抢同一张票)
                if(count==0){
                    break;
                }
                String name=Thread.currentThread().getName();
                count--;
                sum++;
                System.out.println(name+":"+"抢到第"+sum+"张票,"+"还剩"+count+"张票");
                try {
                    Thread.sleep(500);//线程休眠:每隔半秒执行一次
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
