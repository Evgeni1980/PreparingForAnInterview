package ru.kremenia.task_2;

import java.util.concurrent.locks.ReentrantLock;

public class CountThread implements Runnable{

    ReentrantLock locker;
    CommonResource res;

    public CountThread(ReentrantLock locker, CommonResource res) {
        this.locker = locker;
        this.res = res;
    }

    @Override
    public void run() {

        locker.lock();
        try{
            res.x = 1;
            for (int i = 1; i < 5; i++){
                System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
                res.x++;
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        finally{
            locker.unlock();
        }

    }
}
