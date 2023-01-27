package ru.kremenia.task_1;

import java.util.concurrent.atomic.AtomicInteger;

public class PingPong {

    static AtomicInteger i = new AtomicInteger(1);

    public static void main(String[] args) {

        Thread ping = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    if(i.compareAndSet(1, 1)){
                        System.out.println("ping");
                        i.set(2);
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }

                }
            }
        });

        Thread pong = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    if(i.compareAndSet(2, 2)){
                        System.out.println("pong");
                        i.set(1);
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }

                }
            }
        });

        ping.start();
        pong.start();

    }

}
